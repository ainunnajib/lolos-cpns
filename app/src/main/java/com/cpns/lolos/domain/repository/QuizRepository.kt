package com.cpns.lolos.domain.repository

import com.cpns.lolos.domain.model.CategoryProgress
import com.cpns.lolos.domain.model.Question
import com.cpns.lolos.domain.model.QuestionCategory
import com.cpns.lolos.domain.model.QuizSession
import com.cpns.lolos.domain.model.QuizType
import com.cpns.lolos.domain.model.UserAnswer
import com.cpns.lolos.domain.model.UserStats
import kotlinx.coroutines.flow.Flow

interface QuizRepository {

    // Quiz Session Management
    suspend fun createQuizSession(type: QuizType, category: QuestionCategory? = null): QuizSession

    suspend fun getQuizSession(sessionId: String): QuizSession?

    suspend fun saveAnswer(sessionId: String, questionId: String, answer: UserAnswer)

    suspend fun finishQuizSession(sessionId: String)

    suspend fun abandonQuizSession(sessionId: String)

    suspend fun getInProgressSession(): QuizSession?

    // Progress & Stats
    fun getCompletedSessions(): Flow<List<QuizSession>>

    fun getRecentSessions(limit: Int = 10): Flow<List<QuizSession>>

    fun getTotalAttemptedCount(): Flow<Int>

    fun getTotalCorrectCount(): Flow<Int>

    fun getAttemptedCountByCategory(category: QuestionCategory): Flow<Int>

    fun getCorrectCountByCategory(category: QuestionCategory): Flow<Int>

    fun getAverageScore(): Flow<Float?>

    fun getHighestScore(): Flow<Int?>

    suspend fun getUserStats(): UserStats

    suspend fun getCategoryProgress(category: QuestionCategory): CategoryProgress

    // Answer History
    suspend fun hasAnsweredQuestion(questionId: String): Boolean

    suspend fun getLastAnswerForQuestion(questionId: String): UserAnswer?
}
