package com.cpns.lolos.data.repository

import com.cpns.lolos.data.local.dao.QuestionDao
import com.cpns.lolos.data.local.dao.UserProgressDao
import com.cpns.lolos.data.local.entity.QuizSessionEntity
import com.cpns.lolos.data.local.entity.UserProgressEntity
import com.cpns.lolos.domain.model.CategoryProgress
import com.cpns.lolos.domain.model.Difficulty
import com.cpns.lolos.domain.model.Question
import com.cpns.lolos.domain.model.QuestionCategory
import com.cpns.lolos.domain.model.QuizSession
import com.cpns.lolos.domain.model.QuizStatus
import com.cpns.lolos.domain.model.QuizType
import com.cpns.lolos.domain.model.SubCategoryProgress
import com.cpns.lolos.domain.model.UserAnswer
import com.cpns.lolos.domain.model.UserStats
import com.cpns.lolos.domain.repository.QuizRepository
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import java.util.UUID
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class QuizRepositoryImpl @Inject constructor(
    private val questionDao: QuestionDao,
    private val userProgressDao: UserProgressDao,
    private val gson: Gson
) : QuizRepository {

    // In-memory cache for active sessions
    private val activeSessions = mutableMapOf<String, QuizSession>()

    override suspend fun createQuizSession(type: QuizType, category: QuestionCategory?): QuizSession {
        val sessionId = UUID.randomUUID().toString()

        val questions = when (type) {
            QuizType.TRYOUT_FULL -> {
                val twk = questionDao.getRandomQuestions("TWK", 30)
                val tiu = questionDao.getRandomQuestions("TIU", 35)
                val tkp = questionDao.getRandomQuestions("TKP", 45)
                (twk + tiu + tkp).map { it.toDomain() }
            }
            QuizType.TRYOUT_MINI -> {
                val twk = questionDao.getRandomQuestions("TWK", 10)
                val tiu = questionDao.getRandomQuestions("TIU", 10)
                val tkp = questionDao.getRandomQuestions("TKP", 10)
                (twk + tiu + tkp).map { it.toDomain() }
            }
            QuizType.LATIHAN_TWK -> {
                questionDao.getRandomQuestions("TWK", 30).map { it.toDomain() }
            }
            QuizType.LATIHAN_TIU -> {
                questionDao.getRandomQuestions("TIU", 35).map { it.toDomain() }
            }
            QuizType.LATIHAN_TKP -> {
                questionDao.getRandomQuestions("TKP", 45).map { it.toDomain() }
            }
            QuizType.LATIHAN_CUSTOM -> {
                category?.let {
                    questionDao.getRandomQuestions(it.name, 20).map { q -> q.toDomain() }
                } ?: emptyList()
            }
        }

        val session = QuizSession(
            id = sessionId,
            type = type,
            category = category,
            questions = questions,
            startedAt = System.currentTimeMillis(),
            timeLimit = type.timeLimit,
            status = QuizStatus.IN_PROGRESS
        )

        // Save to database
        userProgressDao.insertSession(
            QuizSessionEntity(
                id = sessionId,
                type = type.name,
                category = category?.name,
                totalQuestions = questions.size,
                startedAt = session.startedAt,
                status = "in_progress"
            )
        )

        // Cache in memory
        activeSessions[sessionId] = session

        return session
    }

    override suspend fun getQuizSession(sessionId: String): QuizSession? {
        // Check cache first
        activeSessions[sessionId]?.let { return it }

        // Load from database
        val sessionEntity = userProgressDao.getSessionById(sessionId) ?: return null
        val progressList = userProgressDao.getProgressBySession(sessionId).first()

        // Reconstruct session
        val type = QuizType.valueOf(sessionEntity.type)
        val category = sessionEntity.category?.let { QuestionCategory.valueOf(it) }

        // Load questions (this is a simplified version - in production, store question IDs in session)
        val questions = when (type) {
            QuizType.TRYOUT_FULL -> {
                val twk = questionDao.getRandomQuestions("TWK", 30)
                val tiu = questionDao.getRandomQuestions("TIU", 35)
                val tkp = questionDao.getRandomQuestions("TKP", 45)
                (twk + tiu + tkp).map { it.toDomain() }
            }
            else -> emptyList()
        }

        val answers = progressList.associate {
            it.questionId to UserAnswer(
                questionId = it.questionId,
                selectedOption = it.userAnswer,
                timeSpent = it.timeSpent
            )
        }.toMutableMap()

        val session = QuizSession(
            id = sessionId,
            type = type,
            category = category,
            questions = questions,
            answers = answers,
            startedAt = sessionEntity.startedAt,
            finishedAt = sessionEntity.finishedAt,
            timeLimit = type.timeLimit,
            status = when (sessionEntity.status) {
                "completed" -> QuizStatus.COMPLETED
                "abandoned" -> QuizStatus.ABANDONED
                else -> QuizStatus.IN_PROGRESS
            }
        )

        activeSessions[sessionId] = session
        return session
    }

    override suspend fun saveAnswer(sessionId: String, questionId: String, answer: UserAnswer) {
        // Update cache
        activeSessions[sessionId]?.let { session ->
            session.answers[questionId] = answer
        }

        // Get question to determine if correct
        val question = questionDao.getQuestionById(questionId)
        val isCorrect = question?.correctAnswer == answer.selectedOption

        // Calculate score for TKP
        val score = if (question?.category == "TKP" && question.tkpScores != null) {
            val scores: List<Int> = gson.fromJson(
                question.tkpScores,
                object : TypeToken<List<Int>>() {}.type
            )
            scores.getOrElse(answer.selectedOption) { 1 }
        } else if (isCorrect) {
            5 // Standard score for correct answer
        } else {
            0
        }

        // Save to database
        userProgressDao.insertProgress(
            UserProgressEntity(
                id = UUID.randomUUID().toString(),
                questionId = questionId,
                userAnswer = answer.selectedOption,
                isCorrect = isCorrect,
                score = score,
                timeSpent = answer.timeSpent,
                sessionId = sessionId
            )
        )
    }

    override suspend fun finishQuizSession(sessionId: String) {
        val session = activeSessions[sessionId] ?: return
        val score = session.getScore()

        // Update database
        val sessionEntity = userProgressDao.getSessionById(sessionId) ?: return
        userProgressDao.updateSession(
            sessionEntity.copy(
                finishedAt = System.currentTimeMillis(),
                scoreTwk = score.twk,
                scoreTiu = score.tiu,
                scoreTkp = score.tkp,
                scoreTotal = score.total,
                status = "completed"
            )
        )

        // Remove from active sessions
        activeSessions.remove(sessionId)
    }

    override suspend fun abandonQuizSession(sessionId: String) {
        val sessionEntity = userProgressDao.getSessionById(sessionId) ?: return
        userProgressDao.updateSession(
            sessionEntity.copy(
                finishedAt = System.currentTimeMillis(),
                status = "abandoned"
            )
        )
        activeSessions.remove(sessionId)
    }

    override suspend fun getInProgressSession(): QuizSession? {
        val sessionEntity = userProgressDao.getInProgressSession() ?: return null
        return getQuizSession(sessionEntity.id)
    }

    override fun getCompletedSessions(): Flow<List<QuizSession>> {
        return userProgressDao.getCompletedSessions().map { entities ->
            entities.map { entity ->
                QuizSession(
                    id = entity.id,
                    type = QuizType.valueOf(entity.type),
                    category = entity.category?.let { QuestionCategory.valueOf(it) },
                    questions = emptyList(),
                    startedAt = entity.startedAt,
                    finishedAt = entity.finishedAt,
                    timeLimit = QuizType.valueOf(entity.type).timeLimit,
                    status = QuizStatus.COMPLETED
                )
            }
        }
    }

    override fun getRecentSessions(limit: Int): Flow<List<QuizSession>> {
        return userProgressDao.getRecentSessions(limit).map { entities ->
            entities.map { entity ->
                QuizSession(
                    id = entity.id,
                    type = QuizType.valueOf(entity.type),
                    category = entity.category?.let { QuestionCategory.valueOf(it) },
                    questions = emptyList(),
                    startedAt = entity.startedAt,
                    finishedAt = entity.finishedAt,
                    timeLimit = QuizType.valueOf(entity.type).timeLimit,
                    status = QuizStatus.COMPLETED
                )
            }
        }
    }

    override fun getTotalAttemptedCount(): Flow<Int> {
        return userProgressDao.getTotalAttemptedCount()
    }

    override fun getTotalCorrectCount(): Flow<Int> {
        return userProgressDao.getTotalCorrectCount()
    }

    override fun getAttemptedCountByCategory(category: QuestionCategory): Flow<Int> {
        return userProgressDao.getAttemptedCountByCategory(category.name)
    }

    override fun getCorrectCountByCategory(category: QuestionCategory): Flow<Int> {
        return userProgressDao.getCorrectCountByCategory(category.name)
    }

    override fun getAverageScore(): Flow<Float?> {
        return userProgressDao.getAverageScore()
    }

    override fun getHighestScore(): Flow<Int?> {
        return userProgressDao.getHighestScore()
    }

    override suspend fun getUserStats(): UserStats {
        val totalAttempted = userProgressDao.getTotalAttemptedCount().first()
        val totalCorrect = userProgressDao.getTotalCorrectCount().first()
        val avgScore = userProgressDao.getAverageScore().first() ?: 0f
        val highestScore = userProgressDao.getHighestScore().first() ?: 0

        val twkAttempted = userProgressDao.getAttemptedCountByCategory("TWK").first()
        val twkCorrect = userProgressDao.getCorrectCountByCategory("TWK").first()

        val tiuAttempted = userProgressDao.getAttemptedCountByCategory("TIU").first()
        val tiuCorrect = userProgressDao.getCorrectCountByCategory("TIU").first()

        val tkpAttempted = userProgressDao.getAttemptedCountByCategory("TKP").first()
        val tkpCorrect = userProgressDao.getCorrectCountByCategory("TKP").first()

        val completedSessions = userProgressDao.getCompletedSessions().first()

        return UserStats(
            totalQuestionsAnswered = totalAttempted,
            totalCorrect = totalCorrect,
            overallAccuracy = if (totalAttempted > 0) totalCorrect.toFloat() / totalAttempted * 100 else 0f,
            twkAccuracy = if (twkAttempted > 0) twkCorrect.toFloat() / twkAttempted * 100 else 0f,
            tiuAccuracy = if (tiuAttempted > 0) tiuCorrect.toFloat() / tiuAttempted * 100 else 0f,
            tkpAccuracy = if (tkpAttempted > 0) tkpCorrect.toFloat() / tkpAttempted * 100 else 0f,
            averageScore = avgScore,
            highestScore = highestScore,
            totalTryouts = completedSessions.size
        )
    }

    override suspend fun getCategoryProgress(category: QuestionCategory): CategoryProgress {
        val attempted = userProgressDao.getAttemptedCountByCategory(category.name).first()
        val correct = userProgressDao.getCorrectCountByCategory(category.name).first()

        // Get sub-category progress (simplified - would need more complex query in production)
        val subCategories = questionDao.getSubCategories(category.name).first()
        val subCategoryProgress = subCategories.map { subCat ->
            SubCategoryProgress(
                subCategory = subCat,
                displayName = subCat.replace("_", " ").replaceFirstChar { it.uppercase() },
                totalAttempted = 0, // Would need per-subcategory tracking
                totalCorrect = 0,
                accuracy = 0f
            )
        }

        return CategoryProgress(
            category = category,
            totalAttempted = attempted,
            totalCorrect = correct,
            accuracy = if (attempted > 0) correct.toFloat() / attempted * 100 else 0f,
            subCategoryProgress = subCategoryProgress
        )
    }

    override suspend fun hasAnsweredQuestion(questionId: String): Boolean {
        return userProgressDao.getLatestProgressForQuestion(questionId) != null
    }

    override suspend fun getLastAnswerForQuestion(questionId: String): UserAnswer? {
        val progress = userProgressDao.getLatestProgressForQuestion(questionId) ?: return null
        return UserAnswer(
            questionId = progress.questionId,
            selectedOption = progress.userAnswer,
            timeSpent = progress.timeSpent
        )
    }

    // Helper extension
    private fun com.cpns.lolos.data.local.entity.QuestionEntity.toDomain(): Question {
        val optionsList: List<String> = gson.fromJson(
            options,
            object : TypeToken<List<String>>() {}.type
        )
        val tkpScoresList: List<Int>? = tkpScores?.let {
            gson.fromJson(it, object : TypeToken<List<Int>>() {}.type)
        }

        return Question(
            id = id,
            category = QuestionCategory.valueOf(category),
            subCategory = subCategory,
            questionText = questionText,
            questionImage = questionImage,
            options = optionsList,
            correctAnswer = correctAnswer,
            explanation = explanation,
            source = source,
            difficulty = when (difficulty) {
                "easy" -> Difficulty.EASY
                "hard" -> Difficulty.HARD
                else -> Difficulty.MEDIUM
            },
            year = year,
            isHots = isHots,
            tkpScores = tkpScoresList
        )
    }
}
