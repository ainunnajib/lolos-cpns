package com.cpns.lolos.domain.model

/**
 * Domain model untuk User
 */
data class User(
    val id: String = "local_user",
    val name: String = "Pengguna",
    val email: String? = null,
    val targetFormation: String? = null,
    val targetInstitution: String? = null,
    val isPremium: Boolean = false,
    val premiumExpiresAt: Long? = null,
    val aiQueriesRemaining: Int = 5,
    val currentStreak: Int = 0,
    val longestStreak: Int = 0,
    val lastStudyDate: Long? = null,
    val totalQuestionsAnswered: Int = 0,
    val createdAt: Long = System.currentTimeMillis()
) {
    val canUseAi: Boolean get() = isPremium || aiQueriesRemaining > 0

    fun isSubscriptionActive(): Boolean {
        if (!isPremium) return false
        val expiresAt = premiumExpiresAt ?: return false
        return System.currentTimeMillis() < expiresAt
    }
}

/**
 * Statistik progress user
 */
data class UserStats(
    val totalQuestionsAnswered: Int = 0,
    val totalCorrect: Int = 0,
    val overallAccuracy: Float = 0f,
    val twkAccuracy: Float = 0f,
    val tiuAccuracy: Float = 0f,
    val tkpAccuracy: Float = 0f,
    val averageScore: Float = 0f,
    val highestScore: Int = 0,
    val totalTryouts: Int = 0,
    val currentStreak: Int = 0
)

/**
 * Progress per kategori
 */
data class CategoryProgress(
    val category: QuestionCategory,
    val totalAttempted: Int,
    val totalCorrect: Int,
    val accuracy: Float,
    val subCategoryProgress: List<SubCategoryProgress>
)

data class SubCategoryProgress(
    val subCategory: String,
    val displayName: String,
    val totalAttempted: Int,
    val totalCorrect: Int,
    val accuracy: Float
)
