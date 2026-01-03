package com.cpns.lolos.data.repository

import com.cpns.lolos.data.local.dao.UserDao
import com.cpns.lolos.data.local.entity.UserEntity
import com.cpns.lolos.domain.model.User
import com.cpns.lolos.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import java.util.Calendar
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepositoryImpl @Inject constructor(
    private val userDao: UserDao
) : UserRepository {

    override fun getLocalUser(): Flow<User?> {
        return userDao.getLocalUser().map { it?.toDomain() }
    }

    override suspend fun createOrUpdateUser(user: User) {
        userDao.insertUser(user.toEntity())
    }

    override suspend fun updateUserName(name: String) {
        userDao.updateUserName(name)
    }

    override suspend fun updatePremiumStatus(isPremium: Boolean, expiresAt: Long?) {
        userDao.updatePremiumStatus(isPremium, expiresAt)
    }

    override suspend fun updateAiQueriesRemaining(remaining: Int) {
        userDao.updateAiQueriesRemaining(remaining)
    }

    override suspend fun decrementAiQueries() {
        val user = userDao.getUserById("local_user")
        if (user != null && !user.isPremium && user.aiQueriesRemaining > 0) {
            userDao.updateAiQueriesRemaining(user.aiQueriesRemaining - 1)
        }
    }

    override suspend fun resetAiQueriesIfNeeded() {
        val user = userDao.getUserById("local_user") ?: return

        val lastReset = Calendar.getInstance().apply {
            timeInMillis = user.aiQueriesResetAt
        }
        val now = Calendar.getInstance()

        // Reset if it's a new day
        if (now.get(Calendar.DAY_OF_YEAR) != lastReset.get(Calendar.DAY_OF_YEAR) ||
            now.get(Calendar.YEAR) != lastReset.get(Calendar.YEAR)
        ) {
            userDao.resetAiQueries(System.currentTimeMillis())
        }
    }

    override suspend fun updateStreak() {
        val user = userDao.getUserById("local_user") ?: return
        val today = Calendar.getInstance()
        val lastStudy = user.lastStudyDate?.let {
            Calendar.getInstance().apply { timeInMillis = it }
        }

        val newStreak = when {
            lastStudy == null -> 1
            isSameDay(today, lastStudy) -> user.currentStreak // Already studied today
            isYesterday(today, lastStudy) -> user.currentStreak + 1 // Consecutive day
            else -> 1 // Streak broken
        }

        userDao.updateStreak(newStreak, System.currentTimeMillis())
    }

    override suspend fun incrementQuestionsAnswered(count: Int) {
        userDao.incrementQuestionsAnswered(count)
    }

    override suspend fun updateTarget(formation: String?, institution: String?) {
        userDao.updateTarget(formation, institution)
    }

    override suspend fun initializeUserIfNeeded() {
        val existingUser = userDao.getUserById("local_user")
        if (existingUser == null) {
            val newUser = UserEntity(
                id = "local_user",
                name = "Pengguna",
                isPremium = false,
                aiQueriesRemaining = 5,
                createdAt = System.currentTimeMillis()
            )
            userDao.insertUser(newUser)
        }
    }

    private fun isSameDay(cal1: Calendar, cal2: Calendar): Boolean {
        return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
                cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR)
    }

    private fun isYesterday(today: Calendar, other: Calendar): Boolean {
        val yesterday = Calendar.getInstance().apply {
            timeInMillis = today.timeInMillis
            add(Calendar.DAY_OF_YEAR, -1)
        }
        return isSameDay(yesterday, other)
    }

    // Mapping functions
    private fun UserEntity.toDomain(): User {
        return User(
            id = id,
            name = name,
            email = email,
            targetFormation = targetFormation,
            targetInstitution = targetInstitution,
            isPremium = isPremium,
            premiumExpiresAt = premiumExpiresAt,
            aiQueriesRemaining = aiQueriesRemaining,
            currentStreak = currentStreak,
            longestStreak = longestStreak,
            lastStudyDate = lastStudyDate,
            totalQuestionsAnswered = totalQuestionsAnswered,
            createdAt = createdAt
        )
    }

    private fun User.toEntity(): UserEntity {
        return UserEntity(
            id = id,
            name = name,
            email = email,
            targetFormation = targetFormation,
            targetInstitution = targetInstitution,
            isPremium = isPremium,
            premiumExpiresAt = premiumExpiresAt,
            aiQueriesRemaining = aiQueriesRemaining,
            currentStreak = currentStreak,
            longestStreak = longestStreak,
            lastStudyDate = lastStudyDate,
            totalQuestionsAnswered = totalQuestionsAnswered,
            createdAt = createdAt
        )
    }
}
