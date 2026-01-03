package com.cpns.lolos.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.cpns.lolos.data.local.entity.QuestionEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface QuestionDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertQuestions(questions: List<QuestionEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertQuestion(question: QuestionEntity)

    @Query("SELECT * FROM questions WHERE id = :id")
    suspend fun getQuestionById(id: String): QuestionEntity?

    @Query("SELECT * FROM questions WHERE category = :category")
    fun getQuestionsByCategory(category: String): Flow<List<QuestionEntity>>

    @Query("SELECT * FROM questions WHERE category = :category AND subCategory = :subCategory")
    fun getQuestionsBySubCategory(category: String, subCategory: String): Flow<List<QuestionEntity>>

    @Query("SELECT * FROM questions WHERE category = :category ORDER BY RANDOM() LIMIT :limit")
    suspend fun getRandomQuestions(category: String, limit: Int): List<QuestionEntity>

    @Query("""
        SELECT * FROM questions
        WHERE category IN ('TWK', 'TIU', 'TKP')
        ORDER BY RANDOM()
        LIMIT :limit
    """)
    suspend fun getRandomQuestionsForTryout(limit: Int): List<QuestionEntity>

    @Query("""
        SELECT * FROM questions
        WHERE id NOT IN (
            SELECT questionId FROM user_progress WHERE isCorrect = 1
        )
        AND category = :category
        ORDER BY RANDOM()
        LIMIT :limit
    """)
    suspend fun getUnansweredQuestions(category: String, limit: Int): List<QuestionEntity>

    @Query("SELECT COUNT(*) FROM questions")
    fun getTotalQuestionCount(): Flow<Int>

    @Query("SELECT COUNT(*) FROM questions WHERE category = :category")
    fun getQuestionCountByCategory(category: String): Flow<Int>

    @Query("SELECT DISTINCT subCategory FROM questions WHERE category = :category")
    fun getSubCategories(category: String): Flow<List<String>>

    @Query("DELETE FROM questions")
    suspend fun deleteAllQuestions()

    @Query("SELECT * FROM questions WHERE difficulty = :difficulty AND category = :category ORDER BY RANDOM() LIMIT :limit")
    suspend fun getQuestionsByDifficulty(category: String, difficulty: String, limit: Int): List<QuestionEntity>
}
