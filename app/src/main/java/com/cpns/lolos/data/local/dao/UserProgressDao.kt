package com.cpns.lolos.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.cpns.lolos.data.local.entity.CategoryStatsEntity
import com.cpns.lolos.data.local.entity.QuizSessionEntity
import com.cpns.lolos.data.local.entity.UserProgressEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface UserProgressDao {

    // User Progress
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProgress(progress: UserProgressEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProgressList(progressList: List<UserProgressEntity>)

    @Query("SELECT * FROM user_progress WHERE questionId = :questionId ORDER BY attemptedAt DESC LIMIT 1")
    suspend fun getLatestProgressForQuestion(questionId: String): UserProgressEntity?

    @Query("SELECT * FROM user_progress WHERE sessionId = :sessionId")
    fun getProgressBySession(sessionId: String): Flow<List<UserProgressEntity>>

    @Query("SELECT COUNT(*) FROM user_progress")
    fun getTotalAttemptedCount(): Flow<Int>

    @Query("SELECT COUNT(*) FROM user_progress WHERE isCorrect = 1")
    fun getTotalCorrectCount(): Flow<Int>

    @Query("""
        SELECT COUNT(DISTINCT questionId) FROM user_progress
        WHERE questionId IN (SELECT id FROM questions WHERE category = :category)
    """)
    fun getAttemptedCountByCategory(category: String): Flow<Int>

    @Query("""
        SELECT COUNT(*) FROM user_progress
        WHERE isCorrect = 1
        AND questionId IN (SELECT id FROM questions WHERE category = :category)
    """)
    fun getCorrectCountByCategory(category: String): Flow<Int>

    // Quiz Sessions
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSession(session: QuizSessionEntity)

    @Update
    suspend fun updateSession(session: QuizSessionEntity)

    @Query("SELECT * FROM quiz_sessions WHERE id = :id")
    suspend fun getSessionById(id: String): QuizSessionEntity?

    @Query("SELECT * FROM quiz_sessions WHERE status = 'in_progress' ORDER BY startedAt DESC LIMIT 1")
    suspend fun getInProgressSession(): QuizSessionEntity?

    @Query("SELECT * FROM quiz_sessions WHERE status = 'completed' ORDER BY finishedAt DESC")
    fun getCompletedSessions(): Flow<List<QuizSessionEntity>>

    @Query("SELECT * FROM quiz_sessions WHERE status = 'completed' ORDER BY finishedAt DESC LIMIT :limit")
    fun getRecentSessions(limit: Int): Flow<List<QuizSessionEntity>>

    @Query("SELECT AVG(scoreTotal) FROM quiz_sessions WHERE status = 'completed' AND type = 'tryout_full'")
    fun getAverageScore(): Flow<Float?>

    @Query("SELECT MAX(scoreTotal) FROM quiz_sessions WHERE status = 'completed' AND type = 'tryout_full'")
    fun getHighestScore(): Flow<Int?>

    // Category Stats
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCategoryStats(stats: CategoryStatsEntity)

    @Query("SELECT * FROM category_stats WHERE category = :category")
    fun getStatsByCategory(category: String): Flow<List<CategoryStatsEntity>>

    @Query("SELECT * FROM category_stats")
    fun getAllStats(): Flow<List<CategoryStatsEntity>>

    @Query("""
        UPDATE category_stats
        SET totalAttempted = totalAttempted + 1,
            totalCorrect = totalCorrect + CASE WHEN :isCorrect THEN 1 ELSE 0 END,
            accuracy = (totalCorrect + CASE WHEN :isCorrect THEN 1 ELSE 0 END) * 100.0 / (totalAttempted + 1),
            lastUpdated = :timestamp
        WHERE category = :category AND subCategory = :subCategory
    """)
    suspend fun updateCategoryStats(
        category: String,
        subCategory: String,
        isCorrect: Boolean,
        timestamp: Long = System.currentTimeMillis()
    )
}
