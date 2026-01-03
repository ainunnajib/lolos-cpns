package com.cpns.lolos.presentation.screens.quiz

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cpns.lolos.domain.model.Question
import com.cpns.lolos.domain.model.QuestionCategory
import com.cpns.lolos.domain.model.QuizSession
import com.cpns.lolos.domain.model.UserAnswer
import com.cpns.lolos.domain.repository.QuizRepository
import com.cpns.lolos.domain.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

data class QuizUiState(
    val session: QuizSession? = null,
    val currentQuestionIndex: Int = 0,
    val selectedAnswer: Int? = null,
    val isMarkedForReview: Boolean = false,
    val remainingTimeSeconds: Int = 0,
    val answeredQuestions: Set<Int> = emptySet(),
    val markedQuestions: Set<Int> = emptySet(),
    val isLoading: Boolean = true,
    val isFinished: Boolean = false,
    val error: String? = null
) {
    val currentQuestion: Question?
        get() = session?.questions?.getOrNull(currentQuestionIndex)

    val totalQuestions: Int
        get() = session?.questions?.size ?: 0

    val timeString: String
        get() {
            val minutes = remainingTimeSeconds / 60
            val seconds = remainingTimeSeconds % 60
            return String.format("%02d:%02d", minutes, seconds)
        }

    val isTimeWarning: Boolean
        get() = remainingTimeSeconds < 300 // Less than 5 minutes
}

@HiltViewModel
class QuizViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val quizRepository: QuizRepository,
    private val userRepository: UserRepository
) : ViewModel() {

    private val sessionId: String = checkNotNull(savedStateHandle["sessionId"])

    private val _uiState = MutableStateFlow(QuizUiState())
    val uiState: StateFlow<QuizUiState> = _uiState.asStateFlow()

    private var timerJob: Job? = null
    private var questionStartTime: Long = 0

    init {
        loadSession()
    }

    private fun loadSession() {
        viewModelScope.launch {
            try {
                val session = quizRepository.getQuizSession(sessionId)
                if (session != null) {
                    _uiState.update {
                        it.copy(
                            session = session,
                            remainingTimeSeconds = session.timeLimit * 60,
                            isLoading = false
                        )
                    }
                    startTimer()
                    questionStartTime = System.currentTimeMillis()
                } else {
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            error = "Sesi tidak ditemukan"
                        )
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

    private fun startTimer() {
        timerJob?.cancel()
        timerJob = viewModelScope.launch {
            while (_uiState.value.remainingTimeSeconds > 0) {
                delay(1000)
                _uiState.update {
                    it.copy(remainingTimeSeconds = it.remainingTimeSeconds - 1)
                }
            }
            // Time's up - auto finish
            finishQuiz()
        }
    }

    fun selectAnswer(optionIndex: Int) {
        val currentState = _uiState.value
        val question = currentState.currentQuestion ?: return

        // Calculate time spent on this question
        val timeSpent = ((System.currentTimeMillis() - questionStartTime) / 1000).toInt()

        val answer = UserAnswer(
            questionId = question.id,
            selectedOption = optionIndex,
            timeSpent = timeSpent,
            isMarkedForReview = currentState.isMarkedForReview
        )

        // Save answer
        viewModelScope.launch {
            quizRepository.saveAnswer(sessionId, question.id, answer)
        }

        _uiState.update {
            it.copy(
                selectedAnswer = optionIndex,
                answeredQuestions = it.answeredQuestions + currentState.currentQuestionIndex
            )
        }
    }

    fun toggleMarkForReview() {
        val currentIndex = _uiState.value.currentQuestionIndex
        _uiState.update {
            val newMarked = if (it.markedQuestions.contains(currentIndex)) {
                it.markedQuestions - currentIndex
            } else {
                it.markedQuestions + currentIndex
            }
            it.copy(
                isMarkedForReview = !it.isMarkedForReview,
                markedQuestions = newMarked
            )
        }
    }

    fun goToQuestion(index: Int) {
        if (index in 0 until _uiState.value.totalQuestions) {
            // Reset question timer
            questionStartTime = System.currentTimeMillis()

            // Check if this question was already answered
            val session = _uiState.value.session
            val question = session?.questions?.getOrNull(index)
            val previousAnswer = question?.let { session.answers[it.id] }

            _uiState.update {
                it.copy(
                    currentQuestionIndex = index,
                    selectedAnswer = previousAnswer?.selectedOption,
                    isMarkedForReview = it.markedQuestions.contains(index)
                )
            }
        }
    }

    fun nextQuestion() {
        val currentIndex = _uiState.value.currentQuestionIndex
        if (currentIndex < _uiState.value.totalQuestions - 1) {
            goToQuestion(currentIndex + 1)
        }
    }

    fun previousQuestion() {
        val currentIndex = _uiState.value.currentQuestionIndex
        if (currentIndex > 0) {
            goToQuestion(currentIndex - 1)
        }
    }

    fun finishQuiz() {
        timerJob?.cancel()

        viewModelScope.launch {
            try {
                quizRepository.finishQuizSession(sessionId)
                userRepository.updateStreak()
                userRepository.incrementQuestionsAnswered(_uiState.value.answeredQuestions.size)

                _uiState.update {
                    it.copy(isFinished = true)
                }
            } catch (e: Exception) {
                _uiState.update {
                    it.copy(error = e.message ?: "Gagal menyimpan hasil")
                }
            }
        }
    }

    fun abandonQuiz() {
        timerJob?.cancel()
        viewModelScope.launch {
            quizRepository.abandonQuizSession(sessionId)
        }
    }

    override fun onCleared() {
        super.onCleared()
        timerJob?.cancel()
    }
}
