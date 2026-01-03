package com.cpns.lolos.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.cpns.lolos.data.local.entity.UserEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(user: UserEntity)

    @Update
    suspend fun updateUser(user: UserEntity)

    @Query("SELECT * FROM users WHERE id = :id")
    suspend fun getUserById(id: String): UserEntity?

    @Query("SELECT * FROM users WHERE id = 'local_user'")
    fun getLocalUser(): Flow<UserEntity?>

    @Query("UPDATE users SET name = :name WHERE id = 'local_user'")
    suspend fun updateUserName(name: String)

    @Query("UPDATE users SET isPremium = :isPremium, premiumExpiresAt = :expiresAt WHERE id = 'local_user'")
    suspend fun updatePremiumStatus(isPremium: Boolean, expiresAt: Long?)

    @Query("UPDATE users SET aiQueriesRemaining = :remaining WHERE id = 'local_user'")
    suspend fun updateAiQueriesRemaining(remaining: Int)

    @Query("UPDATE users SET aiQueriesRemaining = 5, aiQueriesResetAt = :resetAt WHERE id = 'local_user'")
    suspend fun resetAiQueries(resetAt: Long = System.currentTimeMillis())

    @Query("""
        UPDATE users SET
            currentStreak = :streak,
            longestStreak = CASE WHEN :streak > longestStreak THEN :streak ELSE longestStreak END,
            lastStudyDate = :date
        WHERE id = 'local_user'
    """)
    suspend fun updateStreak(streak: Int, date: Long)

    @Query("UPDATE users SET totalQuestionsAnswered = totalQuestionsAnswered + :count WHERE id = 'local_user'")
    suspend fun incrementQuestionsAnswered(count: Int = 1)

    @Query("UPDATE users SET targetFormation = :formation, targetInstitution = :institution WHERE id = 'local_user'")
    suspend fun updateTarget(formation: String?, institution: String?)
}
