package com.cpns.lolos.presentation.navigation

sealed class Screen(val route: String) {
    // Main tabs
    data object Home : Screen("home")
    data object Materi : Screen("materi")
    data object TryOut : Screen("tryout")
    data object Stats : Screen("stats")
    data object Profile : Screen("profile")

    // Quiz screens
    data object Quiz : Screen("quiz/{sessionId}") {
        fun createRoute(sessionId: String) = "quiz/$sessionId"
    }

    data object QuizResult : Screen("quiz_result/{sessionId}") {
        fun createRoute(sessionId: String) = "quiz_result/$sessionId"
    }

    data object QuizReview : Screen("quiz_review/{sessionId}") {
        fun createRoute(sessionId: String) = "quiz_review/$sessionId"
    }

    // Category screens
    data object CategoryDetail : Screen("category/{category}") {
        fun createRoute(category: String) = "category/$category"
    }

    data object SubCategoryDetail : Screen("category/{category}/{subCategory}") {
        fun createRoute(category: String, subCategory: String) = "category/$category/$subCategory"
    }

    // AI Tutor
    data object AiTutor : Screen("ai_tutor")

    // Premium
    data object Premium : Screen("premium")

    // Settings
    data object Settings : Screen("settings")
}

// Bottom navigation items
enum class BottomNavItem(
    val route: String,
    val title: String,
    val iconName: String
) {
    HOME("home", "Beranda", "home"),
    MATERI("materi", "Materi", "menu_book"),
    TRYOUT("tryout", "Try Out", "quiz"),
    STATS("stats", "Statistik", "bar_chart"),
    PROFILE("profile", "Profil", "person")
}
