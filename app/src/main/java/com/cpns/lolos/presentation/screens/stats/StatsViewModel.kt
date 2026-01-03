package com.cpns.lolos.presentation.screens.stats

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cpns.lolos.domain.model.QuestionCategory
import com.cpns.lolos.domain.model.QuizSession
import com.cpns.lolos.domain.model.UserStats
import com.cpns.lolos.domain.repository.QuizRepository
import com.cpns.lolos.domain.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

data class StatsUiState(
    val totalQuestionsAnswered: Int = 0,
    val overallAccuracy: Float = 0f,
    val totalTryouts: Int = 0,
    val currentStreak: Int = 0,
    val averageScore: Float = 0f,
    val highestScore: Int = 0,
    val twkStats: CategoryStatsState = CategoryStatsState(QuestionCategory.TWK),
    val tiuStats: CategoryStatsState = CategoryStatsState(QuestionCategory.TIU),
    val tkpStats: CategoryStatsState = CategoryStatsState(QuestionCategory.TKP),
    val recentSessions: List<SessionHistoryItem> = emptyList(),
    val isLoading: Boolean = true,
    val error: String? = null
)

data class CategoryStatsState(
    val category: QuestionCategory,
    val attempted: Int = 0,
    val correct: Int = 0,
    val accuracy: Float = 0f
)

data class SessionHistoryItem(
    val id: String,
    val type: String,
    val date: Long,
    val score: Int,
    val isPassed: Boolean
)

@HiltViewModel
class StatsViewModel @Inject constructor(
    private val quizRepository: QuizRepository,
    private val userRepository: UserRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(StatsUiState())
    val uiState: StateFlow<StatsUiState> = _uiState.asStateFlow()

    init {
        loadStats()
    }

    private fun loadStats() {
        viewModelScope.launch {
            try {
                // Load user stats
                val userStats = quizRepository.getUserStats()

                // Get user for streak
                userRepository.getLocalUser().collect { user ->
                    _uiState.update {
                        it.copy(
                            currentStreak = user?.currentStreak ?: 0
                        )
                    }
                }

                // Combine all stat flows
                combine(
                    quizRepository.getTotalAttemptedCount(),
                    quizRepository.getTotalCorrectCount(),
                    quizRepository.getAverageScore(),
                    quizRepository.getHighestScore(),
                    quizRepository.getRecentSessions(10),
                    quizRepository.getAttemptedCountByCategory(QuestionCategory.TWK),
                    quizRepository.getCorrectCountByCategory(QuestionCategory.TWK),
                    quizRepository.getAttemptedCountByCategory(QuestionCategory.TIU),
                    quizRepository.getCorrectCountByCategory(QuestionCategory.TIU)
                ) { values ->
                    val totalAttempted = values[0] as Int
                    val totalCorrect = values[1] as Int
                    val avgScore = values[2] as Float?
                    val highScore = values[3] as Int?
                    @Suppress("UNCHECKED_CAST")
                    val recentSessions = values[4] as List<QuizSession>
                    val twkAttempted = values[5] as Int
                    val twkCorrect = values[6] as Int
                    val tiuAttempted = values[7] as Int
                    val tiuCorrect = values[8] as Int

                    StatsPartial(
                        totalAttempted = totalAttempted,
                        totalCorrect = totalCorrect,
                        avgScore = avgScore ?: 0f,
                        highScore = highScore ?: 0,
                        recentSessions = recentSessions,
                        twkAttempted = twkAttempted,
                        twkCorrect = twkCorrect,
                        tiuAttempted = tiuAttempted,
                        tiuCorrect = tiuCorrect
                    )
                }.collect { partial ->
                    // Get TKP stats separately
                    combine(
                        quizRepository.getAttemptedCountByCategory(QuestionCategory.TKP),
                        quizRepository.getCorrectCountByCategory(QuestionCategory.TKP)
                    ) { tkpAttempted, tkpCorrect ->
                        Pair(tkpAttempted, tkpCorrect)
                    }.collect { (tkpAttempted, tkpCorrect) ->
                        _uiState.update {
                            it.copy(
                                totalQuestionsAnswered = partial.totalAttempted,
                                overallAccuracy = if (partial.totalAttempted > 0) {
                                    partial.totalCorrect.toFloat() / partial.totalAttempted * 100
                                } else 0f,
                                totalTryouts = partial.recentSessions.size,
                                averageScore = partial.avgScore,
                                highestScore = partial.highScore,
                                twkStats = CategoryStatsState(
                                    category = QuestionCategory.TWK,
                                    attempted = partial.twkAttempted,
                                    correct = partial.twkCorrect,
                                    accuracy = if (partial.twkAttempted > 0) {
                                        partial.twkCorrect.toFloat() / partial.twkAttempted * 100
                                    } else 0f
                                ),
                                tiuStats = CategoryStatsState(
                                    category = QuestionCategory.TIU,
                                    attempted = partial.tiuAttempted,
                                    correct = partial.tiuCorrect,
                                    accuracy = if (partial.tiuAttempted > 0) {
                                        partial.tiuCorrect.toFloat() / partial.tiuAttempted * 100
                                    } else 0f
                                ),
                                tkpStats = CategoryStatsState(
                                    category = QuestionCategory.TKP,
                                    attempted = tkpAttempted,
                                    correct = tkpCorrect,
                                    accuracy = if (tkpAttempted > 0) {
                                        tkpCorrect.toFloat() / tkpAttempted * 100
                                    } else 0f
                                ),
                                recentSessions = partial.recentSessions.map { session ->
                                    SessionHistoryItem(
                                        id = session.id,
                                        type = session.type.displayName,
                                        date = session.finishedAt ?: session.startedAt,
                                        score = session.getScore().total,
                                        isPassed = session.isPassed()
                                    )
                                },
                                isLoading = false
                            )
                        }
                    }
                }

            } catch (e: Exception) {
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        error = e.message ?: "Terjadi kesalahan"
                    )
                }
            }
        }
    }

    private data class StatsPartial(
        val totalAttempted: Int,
        val totalCorrect: Int,
        val avgScore: Float,
        val highScore: Int,
        val recentSessions: List<QuizSession>,
        val twkAttempted: Int,
        val twkCorrect: Int,
        val tiuAttempted: Int,
        val tiuCorrect: Int
    )
}
