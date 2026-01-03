package com.cpns.lolos.presentation.screens.profile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cpns.lolos.domain.model.User
import com.cpns.lolos.domain.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

data class ProfileUiState(
    val user: User? = null,
    val isLoading: Boolean = true,
    val isSaving: Boolean = false,
    val error: String? = null,
    val successMessage: String? = null
)

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(ProfileUiState())
    val uiState: StateFlow<ProfileUiState> = _uiState.asStateFlow()

    init {
        loadUser()
    }

    private fun loadUser() {
        viewModelScope.launch {
            userRepository.getLocalUser().collect { user ->
                _uiState.update {
                    it.copy(
                        user = user,
                        isLoading = false
                    )
                }
            }
        }
    }

    fun updateName(name: String) {
        viewModelScope.launch {
            try {
                _uiState.update { it.copy(isSaving = true) }
                userRepository.updateUserName(name)
                _uiState.update {
                    it.copy(
                        isSaving = false,
                        successMessage = "Nama berhasil diperbarui"
                    )
                }
            } catch (e: Exception) {
                _uiState.update {
                    it.copy(
                        isSaving = false,
                        error = e.message ?: "Gagal menyimpan"
                    )
                }
            }
        }
    }

    fun updateTarget(formation: String?, institution: String?) {
        viewModelScope.launch {
            try {
                _uiState.update { it.copy(isSaving = true) }
                userRepository.updateTarget(formation, institution)
                _uiState.update {
                    it.copy(
                        isSaving = false,
                        successMessage = "Target berhasil diperbarui"
                    )
                }
            } catch (e: Exception) {
                _uiState.update {
                    it.copy(
                        isSaving = false,
                        error = e.message ?: "Gagal menyimpan"
                    )
                }
            }
        }
    }

    fun clearMessages() {
        _uiState.update {
            it.copy(
                error = null,
                successMessage = null
            )
        }
    }
}
