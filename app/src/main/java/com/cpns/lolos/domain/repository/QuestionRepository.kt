package com.cpns.lolos.domain.repository

import com.cpns.lolos.domain.model.Question
import com.cpns.lolos.domain.model.QuestionCategory
import kotlinx.coroutines.flow.Flow

interface QuestionRepository {

    fun getQuestionsByCategory(category: QuestionCategory): Flow<List<Question>>

    fun getQuestionsBySubCategory(category: QuestionCategory, subCategory: String): Flow<List<Question>>

    suspend fun getQuestionById(id: String): Question?

    suspend fun getRandomQuestions(category: QuestionCategory, limit: Int): List<Question>

    suspend fun getRandomQuestionsForTryout(
        twkCount: Int = 30,
        tiuCount: Int = 35,
        tkpCount: Int = 45
    ): List<Question>

    suspend fun getUnansweredQuestions(category: QuestionCategory, limit: Int): List<Question>

    fun getTotalQuestionCount(): Flow<Int>

    fun getQuestionCountByCategory(category: QuestionCategory): Flow<Int>

    fun getSubCategories(category: QuestionCategory): Flow<List<String>>

    suspend fun insertQuestions(questions: List<Question>)

    suspend fun seedInitialQuestions()
}
