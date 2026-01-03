package com.cpns.lolos.domain.repository

import com.cpns.lolos.domain.model.User
import kotlinx.coroutines.flow.Flow

interface UserRepository {

    fun getLocalUser(): Flow<User?>

    suspend fun createOrUpdateUser(user: User)

    suspend fun updateUserName(name: String)

    suspend fun updatePremiumStatus(isPremium: Boolean, expiresAt: Long?)

    suspend fun updateAiQueriesRemaining(remaining: Int)

    suspend fun decrementAiQueries()

    suspend fun resetAiQueriesIfNeeded()

    suspend fun updateStreak()

    suspend fun incrementQuestionsAnswered(count: Int = 1)

    suspend fun updateTarget(formation: String?, institution: String?)

    suspend fun initializeUserIfNeeded()
}
