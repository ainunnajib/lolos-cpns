package com.cpns.lolos.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.cpns.lolos.presentation.screens.aitutor.AiTutorScreen
import com.cpns.lolos.presentation.screens.home.HomeScreen
import com.cpns.lolos.presentation.screens.materi.MateriScreen
import com.cpns.lolos.presentation.screens.profile.ProfileScreen
import com.cpns.lolos.presentation.screens.quiz.QuizScreen
import com.cpns.lolos.presentation.screens.result.ResultScreen
import com.cpns.lolos.presentation.screens.stats.StatsScreen
import com.cpns.lolos.presentation.screens.tryout.TryOutScreen

@Composable
fun NavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = modifier
    ) {
        // Main tabs
        composable(Screen.Home.route) {
            HomeScreen(
                onNavigateToTryOut = { navController.navigate(Screen.TryOut.route) },
                onNavigateToCategory = { category ->
                    navController.navigate(Screen.CategoryDetail.createRoute(category))
                },
                onNavigateToAiTutor = { navController.navigate(Screen.AiTutor.route) }
            )
        }

        composable(Screen.Materi.route) {
            MateriScreen(
                onNavigateToCategory = { category ->
                    navController.navigate(Screen.CategoryDetail.createRoute(category))
                },
                onNavigateToSubCategory = { category, subCategory ->
                    navController.navigate(Screen.SubCategoryDetail.createRoute(category, subCategory))
                }
            )
        }

        composable(Screen.TryOut.route) {
            TryOutScreen(
                onStartQuiz = { sessionId ->
                    navController.navigate(Screen.Quiz.createRoute(sessionId))
                }
            )
        }

        composable(Screen.Stats.route) {
            StatsScreen(
                onNavigateToCategory = { category ->
                    navController.navigate(Screen.CategoryDetail.createRoute(category))
                }
            )
        }

        composable(Screen.Profile.route) {
            ProfileScreen(
                onNavigateToSettings = { navController.navigate(Screen.Settings.route) },
                onNavigateToPremium = { navController.navigate(Screen.Premium.route) }
            )
        }

        // Quiz flow
        composable(
            route = Screen.Quiz.route,
            arguments = listOf(navArgument("sessionId") { type = NavType.StringType })
        ) { backStackEntry ->
            val sessionId = backStackEntry.arguments?.getString("sessionId") ?: return@composable
            QuizScreen(
                sessionId = sessionId,
                onFinish = { navController.navigate(Screen.QuizResult.createRoute(sessionId)) },
                onBack = { navController.popBackStack() }
            )
        }

        composable(
            route = Screen.QuizResult.route,
            arguments = listOf(navArgument("sessionId") { type = NavType.StringType })
        ) { backStackEntry ->
            val sessionId = backStackEntry.arguments?.getString("sessionId") ?: return@composable
            ResultScreen(
                sessionId = sessionId,
                onReview = { navController.navigate(Screen.QuizReview.createRoute(sessionId)) },
                onRetry = {
                    navController.popBackStack(Screen.TryOut.route, false)
                },
                onBackToHome = {
                    navController.popBackStack(Screen.Home.route, false)
                }
            )
        }

        // Category detail
        composable(
            route = Screen.CategoryDetail.route,
            arguments = listOf(navArgument("category") { type = NavType.StringType })
        ) { backStackEntry ->
            val category = backStackEntry.arguments?.getString("category") ?: return@composable
            // TODO: CategoryDetailScreen
        }

        // AI Tutor
        composable(Screen.AiTutor.route) {
            AiTutorScreen(
                onNavigateBack = { navController.popBackStack() }
            )
        }

        // Premium
        composable(Screen.Premium.route) {
            // TODO: PremiumScreen
        }

        // Settings
        composable(Screen.Settings.route) {
            // TODO: SettingsScreen
        }
    }
}
