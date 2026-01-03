package com.cpns.lolos.presentation.screens.materi

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cpns.lolos.domain.model.QuestionCategory
import com.cpns.lolos.domain.model.TiuSubCategory
import com.cpns.lolos.domain.model.TkpSubCategory
import com.cpns.lolos.domain.model.TwkSubCategory
import com.cpns.lolos.domain.repository.QuestionRepository
import com.cpns.lolos.domain.repository.QuizRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

data class MateriUiState(
    val categories: List<CategoryState> = emptyList(),
    val expandedCategory: String? = "TWK",
    val isLoading: Boolean = true,
    val error: String? = null
)

data class CategoryState(
    val category: QuestionCategory,
    val totalQuestions: Int = 0,
    val attemptedQuestions: Int = 0,
    val subCategories: List<SubCategoryState> = emptyList()
) {
    val progress: Float
        get() = if (totalQuestions > 0) attemptedQuestions.toFloat() / totalQuestions else 0f
}

data class SubCategoryState(
    val key: String,
    val displayName: String,
    val totalQuestions: Int = 0,
    val attemptedQuestions: Int = 0
) {
    val progress: Float
        get() = if (totalQuestions > 0) attemptedQuestions.toFloat() / totalQuestions else 0f
}

@HiltViewModel
class MateriViewModel @Inject constructor(
    private val questionRepository: QuestionRepository,
    private val quizRepository: QuizRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(MateriUiState())
    val uiState: StateFlow<MateriUiState> = _uiState.asStateFlow()

    init {
        loadCategories()
    }

    private fun loadCategories() {
        viewModelScope.launch {
            try {
                // Load TWK
                val twkCategory = loadCategoryState(
                    QuestionCategory.TWK,
                    TwkSubCategory.all
                )

                // Load TIU
                val tiuCategory = loadCategoryState(
                    QuestionCategory.TIU,
                    TiuSubCategory.all
                )

                // Load TKP
                val tkpCategory = loadCategoryState(
                    QuestionCategory.TKP,
                    TkpSubCategory.all
                )

                _uiState.update {
                    it.copy(
                        categories = listOf(twkCategory, tiuCategory, tkpCategory),
                        isLoading = false
                    )
                }

                // Continuously update progress
                combine(
                    quizRepository.getAttemptedCountByCategory(QuestionCategory.TWK),
                    quizRepository.getAttemptedCountByCategory(QuestionCategory.TIU),
                    quizRepository.getAttemptedCountByCategory(QuestionCategory.TKP)
                ) { twkAttempted, tiuAttempted, tkpAttempted ->
                    Triple(twkAttempted, tiuAttempted, tkpAttempted)
                }.collect { (twkAttempted, tiuAttempted, tkpAttempted) ->
                    _uiState.update { state ->
                        state.copy(
                            categories = state.categories.map { category ->
                                when (category.category) {
                                    QuestionCategory.TWK -> category.copy(attemptedQuestions = twkAttempted)
                                    QuestionCategory.TIU -> category.copy(attemptedQuestions = tiuAttempted)
                                    QuestionCategory.TKP -> category.copy(attemptedQuestions = tkpAttempted)
                                    else -> category
                                }
                            }
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

    private suspend fun loadCategoryState(
        category: QuestionCategory,
        subCategories: List<Pair<String, String>>
    ): CategoryState {
        val subCategoryStates = subCategories.map { (key, displayName) ->
            SubCategoryState(
                key = key,
                displayName = displayName,
                totalQuestions = 0, // Would need per-subcategory query
                attemptedQuestions = 0
            )
        }

        return CategoryState(
            category = category,
            totalQuestions = 0, // Will be updated by flow
            subCategories = subCategoryStates
        )
    }

    fun toggleCategory(categoryName: String) {
        _uiState.update {
            it.copy(
                expandedCategory = if (it.expandedCategory == categoryName) null else categoryName
            )
        }
    }
}
