package com.cpns.lolos.presentation.screens.tryout

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cpns.lolos.domain.model.QuestionCategory
import com.cpns.lolos.domain.model.QuizSession
import com.cpns.lolos.domain.model.QuizType
import com.cpns.lolos.domain.repository.QuizRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

data class TryOutUiState(
    val inProgressSession: QuizSession? = null,
    val isCreatingSession: Boolean = false,
    val createdSessionId: String? = null,
    val error: String? = null
)

@HiltViewModel
class TryOutViewModel @Inject constructor(
    private val quizRepository: QuizRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(TryOutUiState())
    val uiState: StateFlow<TryOutUiState> = _uiState.asStateFlow()

    init {
        checkInProgressSession()
    }

    private fun checkInProgressSession() {
        viewModelScope.launch {
            try {
                val session = quizRepository.getInProgressSession()
                _uiState.update {
                    it.copy(inProgressSession = session)
                }
            } catch (e: Exception) {
                // Ignore - no in-progress session
            }
        }
    }

    fun startQuiz(type: QuizType, category: QuestionCategory? = null) {
        viewModelScope.launch {
            try {
                _uiState.update { it.copy(isCreatingSession = true, error = null) }

                val session = quizRepository.createQuizSession(type, category)

                _uiState.update {
                    it.copy(
                        isCreatingSession = false,
                        createdSessionId = session.id
                    )
                }
            } catch (e: Exception) {
                _uiState.update {
                    it.copy(
                        isCreatingSession = false,
                        error = e.message ?: "Gagal membuat sesi try out"
                    )
                }
            }
        }
    }

    fun resumeSession() {
        _uiState.value.inProgressSession?.let { session ->
            _uiState.update {
                it.copy(createdSessionId = session.id)
            }
        }
    }

    fun clearCreatedSession() {
        _uiState.update {
            it.copy(createdSessionId = null)
        }
    }

    fun clearError() {
        _uiState.update {
            it.copy(error = null)
        }
    }
}
