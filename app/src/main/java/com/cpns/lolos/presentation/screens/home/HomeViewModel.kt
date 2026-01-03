package com.cpns.lolos.presentation.screens.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cpns.lolos.domain.model.QuestionCategory
import com.cpns.lolos.domain.model.User
import com.cpns.lolos.domain.repository.QuestionRepository
import com.cpns.lolos.domain.repository.QuizRepository
import com.cpns.lolos.domain.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import java.time.LocalDate
import java.time.temporal.ChronoUnit
import javax.inject.Inject

data class HomeUiState(
    val user: User? = null,
    val totalQuestionsAnswered: Int = 0,
    val overallProgress: Float = 0f,
    val twkProgress: Float = 0f,
    val tiuProgress: Float = 0f,
    val tkpProgress: Float = 0f,
    val daysUntilCpns: Int = 0,
    val isLoading: Boolean = true,
    val error: String? = null
)

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val userRepository: UserRepository,
    private val quizRepository: QuizRepository,
    private val questionRepository: QuestionRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

    init {
        loadData()
    }

    private fun loadData() {
        viewModelScope.launch {
            try {
                // Initialize user if needed
                userRepository.initializeUserIfNeeded()

                // Seed initial questions if database is empty
                questionRepository.seedInitialQuestions()

                // Reset AI queries if new day
                userRepository.resetAiQueriesIfNeeded()

                // Calculate days until CPNS 2025 (estimated August 2025)
                val today = LocalDate.now()
                val cpnsDate = LocalDate.of(2025, 8, 1)
                val daysRemaining = ChronoUnit.DAYS.between(today, cpnsDate).toInt().coerceAtLeast(0)

                // Combine all flows
                combine(
                    userRepository.getLocalUser(),
                    quizRepository.getTotalAttemptedCount(),
                    questionRepository.getTotalQuestionCount(),
                    quizRepository.getAttemptedCountByCategory(QuestionCategory.TWK),
                    quizRepository.getAttemptedCountByCategory(QuestionCategory.TIU),
                    quizRepository.getAttemptedCountByCategory(QuestionCategory.TKP),
                    questionRepository.getQuestionCountByCategory(QuestionCategory.TWK),
                    questionRepository.getQuestionCountByCategory(QuestionCategory.TIU),
                    questionRepository.getQuestionCountByCategory(QuestionCategory.TKP)
                ) { values ->
                    val user = values[0] as User?
                    val totalAnswered = values[1] as Int
                    val totalQuestions = values[2] as Int
                    val twkAnswered = values[3] as Int
                    val tiuAnswered = values[4] as Int
                    val tkpAnswered = values[5] as Int
                    val twkTotal = values[6] as Int
                    val tiuTotal = values[7] as Int
                    val tkpTotal = values[8] as Int

                    HomeUiState(
                        user = user,
                        totalQuestionsAnswered = totalAnswered,
                        overallProgress = if (totalQuestions > 0) {
                            totalAnswered.toFloat() / totalQuestions
                        } else 0f,
                        twkProgress = if (twkTotal > 0) {
                            twkAnswered.toFloat() / twkTotal
                        } else 0f,
                        tiuProgress = if (tiuTotal > 0) {
                            tiuAnswered.toFloat() / tiuTotal
                        } else 0f,
                        tkpProgress = if (tkpTotal > 0) {
                            tkpAnswered.toFloat() / tkpTotal
                        } else 0f,
                        daysUntilCpns = daysRemaining,
                        isLoading = false
                    )
                }.stateIn(
                    viewModelScope,
                    SharingStarted.WhileSubscribed(5000),
                    HomeUiState(isLoading = true)
                ).collect { state ->
                    _uiState.value = state
                }

            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    error = e.message ?: "Terjadi kesalahan"
                )
            }
        }
    }

    fun refresh() {
        _uiState.value = _uiState.value.copy(isLoading = true)
        loadData()
    }
}
