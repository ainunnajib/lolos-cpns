package com.cpns.lolos.data.repository

import com.cpns.lolos.data.local.SampleQuestions
import com.cpns.lolos.data.local.dao.QuestionDao
import com.cpns.lolos.data.local.entity.QuestionEntity
import com.cpns.lolos.domain.model.Difficulty
import com.cpns.lolos.domain.model.Question
import com.cpns.lolos.domain.model.QuestionCategory
import com.cpns.lolos.domain.repository.QuestionRepository
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class QuestionRepositoryImpl @Inject constructor(
    private val questionDao: QuestionDao,
    private val gson: Gson
) : QuestionRepository {

    override fun getQuestionsByCategory(category: QuestionCategory): Flow<List<Question>> {
        return questionDao.getQuestionsByCategory(category.name).map { entities ->
            entities.map { it.toDomain() }
        }
    }

    override fun getQuestionsBySubCategory(
        category: QuestionCategory,
        subCategory: String
    ): Flow<List<Question>> {
        return questionDao.getQuestionsBySubCategory(category.name, subCategory).map { entities ->
            entities.map { it.toDomain() }
        }
    }

    override suspend fun getQuestionById(id: String): Question? {
        return questionDao.getQuestionById(id)?.toDomain()
    }

    override suspend fun getRandomQuestions(category: QuestionCategory, limit: Int): List<Question> {
        return questionDao.getRandomQuestions(category.name, limit).map { it.toDomain() }
    }

    override suspend fun getRandomQuestionsForTryout(
        twkCount: Int,
        tiuCount: Int,
        tkpCount: Int
    ): List<Question> {
        val twkQuestions = questionDao.getRandomQuestions("TWK", twkCount)
        val tiuQuestions = questionDao.getRandomQuestions("TIU", tiuCount)
        val tkpQuestions = questionDao.getRandomQuestions("TKP", tkpCount)

        return (twkQuestions + tiuQuestions + tkpQuestions).map { it.toDomain() }
    }

    override suspend fun getUnansweredQuestions(
        category: QuestionCategory,
        limit: Int
    ): List<Question> {
        return questionDao.getUnansweredQuestions(category.name, limit).map { it.toDomain() }
    }

    override fun getTotalQuestionCount(): Flow<Int> {
        return questionDao.getTotalQuestionCount()
    }

    override fun getQuestionCountByCategory(category: QuestionCategory): Flow<Int> {
        return questionDao.getQuestionCountByCategory(category.name)
    }

    override fun getSubCategories(category: QuestionCategory): Flow<List<String>> {
        return questionDao.getSubCategories(category.name)
    }

    override suspend fun insertQuestions(questions: List<Question>) {
        val entities = questions.map { it.toEntity() }
        questionDao.insertQuestions(entities)
    }

    override suspend fun seedInitialQuestions() {
        // Check if database already has questions
        val existingCount = questionDao.getRandomQuestionsForTryout(1)
        if (existingCount.isEmpty()) {
            // Insert sample questions
            questionDao.insertQuestions(SampleQuestions.allQuestions)
        }
    }

    // Mapping functions
    private fun QuestionEntity.toDomain(): Question {
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

    private fun Question.toEntity(): QuestionEntity {
        return QuestionEntity(
            id = id,
            category = category.name,
            subCategory = subCategory,
            questionText = questionText,
            questionImage = questionImage,
            options = gson.toJson(options),
            correctAnswer = correctAnswer,
            explanation = explanation,
            source = source,
            difficulty = difficulty.name.lowercase(),
            year = year,
            isHots = isHots,
            tkpScores = tkpScores?.let { gson.toJson(it) }
        )
    }
}
