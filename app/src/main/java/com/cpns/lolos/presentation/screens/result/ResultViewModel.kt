package com.cpns.lolos.presentation.screens.result

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cpns.lolos.domain.model.Question
import com.cpns.lolos.domain.model.QuestionCategory
import com.cpns.lolos.domain.model.QuizScore
import com.cpns.lolos.domain.model.QuizSession
import com.cpns.lolos.domain.model.UserAnswer
import com.cpns.lolos.domain.repository.QuizRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

data class ResultUiState(
    val session: QuizSession? = null,
    val score: QuizScore? = null,
    val isPassed: Boolean = false,
    val questionsWithAnswers: List<QuestionWithAnswer> = emptyList(),
    val isLoading: Boolean = true,
    val error: String? = null
)

data class QuestionWithAnswer(
    val question: Question,
    val userAnswer: UserAnswer?,
    val isCorrect: Boolean
)

@HiltViewModel
class ResultViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val quizRepository: QuizRepository
) : ViewModel() {

    private val sessionId: String = checkNotNull(savedStateHandle["sessionId"])

    private val _uiState = MutableStateFlow(ResultUiState())
    val uiState: StateFlow<ResultUiState> = _uiState.asStateFlow()

    init {
        loadResult()
    }

    private fun loadResult() {
        viewModelScope.launch {
            try {
                val session = quizRepository.getQuizSession(sessionId)
                if (session != null) {
                    val score = session.getScore()
                    val isPassed = session.isPassed()

                    val questionsWithAnswers = session.questions.map { question ->
                        val answer = session.answers[question.id]
                        val isCorrect = when (question.category) {
                            QuestionCategory.TKP -> {
                                // TKP doesn't have "correct" answers, just scores
                                val scores = question.tkpScores ?: listOf(1, 2, 3, 4, 5)
                                val userScore = answer?.let { scores.getOrElse(it.selectedOption) { 1 } } ?: 0
                                userScore >= 4 // Consider 4-5 as "good" answers
                            }
                            else -> answer?.selectedOption == question.correctAnswer
                        }

                        QuestionWithAnswer(
                            question = question,
                            userAnswer = answer,
                            isCorrect = isCorrect
                        )
                    }

                    _uiState.update {
                        it.copy(
                            session = session,
                            score = score,
                            isPassed = isPassed,
                            questionsWithAnswers = questionsWithAnswers,
                            isLoading = false
                        )
                    }
                } else {
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            error = "Hasil tidak ditemukan"
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

    fun getScoreBreakdown(): Map<QuestionCategory, Pair<Int, Int>> {
        val session = _uiState.value.session ?: return emptyMap()

        return session.questions.groupBy { it.category }.mapValues { (category, questions) ->
            var correct = 0
            var total = questions.size

            questions.forEach { question ->
                val answer = session.answers[question.id]
                if (answer != null && answer.selectedOption == question.correctAnswer) {
                    correct++
                }
            }

            Pair(correct, total)
        }
    }
}
