package com.cpns.lolos.presentation.screens.quiz

import android.graphics.Bitmap
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cpns.lolos.data.facedetection.FaceDetectionResult
import com.cpns.lolos.data.facedetection.FaceDetectionService
import com.cpns.lolos.data.facedetection.FaceStatus
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

/**
 * Proctoring state for exam monitoring
 */
data class ProctoringState(
    val isEnabled: Boolean = false,
    val hasCameraPermission: Boolean = false,
    val faceDetectionResult: FaceDetectionResult? = null,
    val warningCount: Int = 0,
    val lastWarningTime: Long = 0,
    val totalNoFaceTime: Int = 0  // seconds without face detected
) {
    val isWarning: Boolean
        get() = faceDetectionResult?.status != FaceStatus.SINGLE_FACE &&
                faceDetectionResult?.status != FaceStatus.INITIALIZING

    val warningMessage: String?
        get() = when (faceDetectionResult?.status) {
            FaceStatus.NO_FACE -> "Wajah tidak terdeteksi"
            FaceStatus.MULTIPLE_FACES -> "Terdeteksi lebih dari satu wajah"
            else -> null
        }
}

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
    val error: String? = null,
    val proctoring: ProctoringState = ProctoringState()
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
    private val userRepository: UserRepository,
    private val faceDetectionService: FaceDetectionService
) : ViewModel() {

    private val sessionId: String = checkNotNull(savedStateHandle["sessionId"])

    private val _uiState = MutableStateFlow(QuizUiState())
    val uiState: StateFlow<QuizUiState> = _uiState.asStateFlow()

    private var timerJob: Job? = null
    private var proctoringJob: Job? = null
    private var questionStartTime: Long = 0
    private var frameCounter: Int = 0

    init {
        loadSession()
    }

    // ==================== Proctoring Functions ====================

    /**
     * Enable proctoring with camera permission granted
     */
    fun enableProctoring() {
        viewModelScope.launch {
            faceDetectionService.initialize()
            faceDetectionService.start()

            _uiState.update {
                it.copy(
                    proctoring = it.proctoring.copy(
                        isEnabled = true,
                        hasCameraPermission = true
                    )
                )
            }

            // Start monitoring face detection state
            startProctoringMonitor()
        }
    }

    /**
     * Disable proctoring
     */
    fun disableProctoring() {
        proctoringJob?.cancel()
        faceDetectionService.stop()

        _uiState.update {
            it.copy(
                proctoring = ProctoringState(isEnabled = false)
            )
        }
    }

    /**
     * Process a camera frame for face detection
     */
    fun processFrame(bitmap: Bitmap) {
        if (!_uiState.value.proctoring.isEnabled) return

        // Process every 5th frame to reduce CPU load
        frameCounter++
        if (frameCounter % 5 != 0) return

        viewModelScope.launch {
            val result = faceDetectionService.detectFaces(bitmap)
            _uiState.update {
                it.copy(
                    proctoring = it.proctoring.copy(
                        faceDetectionResult = result
                    )
                )
            }
        }
    }

    /**
     * Monitor proctoring state and update warnings
     */
    private fun startProctoringMonitor() {
        proctoringJob?.cancel()
        proctoringJob = viewModelScope.launch {
            while (_uiState.value.proctoring.isEnabled) {
                delay(1000) // Check every second

                val currentState = _uiState.value.proctoring
                val faceResult = currentState.faceDetectionResult

                if (faceResult?.status == FaceStatus.NO_FACE ||
                    faceResult?.status == FaceStatus.MULTIPLE_FACES) {
                    // Increment warning counters
                    val now = System.currentTimeMillis()
                    val shouldWarn = now - currentState.lastWarningTime > 5000 // Warn every 5 seconds

                    _uiState.update {
                        it.copy(
                            proctoring = it.proctoring.copy(
                                totalNoFaceTime = currentState.totalNoFaceTime + 1,
                                warningCount = if (shouldWarn) currentState.warningCount + 1 else currentState.warningCount,
                                lastWarningTime = if (shouldWarn) now else currentState.lastWarningTime
                            )
                        )
                    }
                }
            }
        }
    }

    /**
     * Update camera permission state
     */
    fun setCameraPermission(granted: Boolean) {
        _uiState.update {
            it.copy(
                proctoring = it.proctoring.copy(hasCameraPermission = granted)
            )
        }
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
        proctoringJob?.cancel()
        faceDetectionService.release()
    }
}
