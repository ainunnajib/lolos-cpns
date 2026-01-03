package com.cpns.lolos.presentation.screens.aitutor

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cpns.lolos.domain.repository.AiRepository
import com.cpns.lolos.domain.repository.AiRepository.AiResponse
import com.cpns.lolos.domain.repository.AiRepository.ModelStatus
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import java.util.UUID
import javax.inject.Inject

data class ChatMessage(
    val id: String = UUID.randomUUID().toString(),
    val content: String,
    val isFromUser: Boolean,
    val source: String? = null,
    val timestamp: Long = System.currentTimeMillis()
)

data class AiTutorUiState(
    val messages: List<ChatMessage> = emptyList(),
    val inputText: String = "",
    val isLoading: Boolean = false,
    val modelStatus: ModelStatus = ModelStatus.NotDownloaded,
    val suggestions: List<String> = emptyList(),
    val streamingResponse: String = "",
    val isStreaming: Boolean = false
)

@HiltViewModel
class AiTutorViewModel @Inject constructor(
    private val aiRepository: AiRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(AiTutorUiState())
    val uiState: StateFlow<AiTutorUiState> = _uiState.asStateFlow()

    init {
        loadSuggestions()
        observeModelStatus()
        addWelcomeMessage()
    }

    private fun addWelcomeMessage() {
        val welcomeMessage = ChatMessage(
            content = """
Halo! Saya AI Tutor untuk persiapan CPNS.

Saya bisa membantu Anda dengan:
• **TWK**: Pancasila, UUD 1945, NKRI, Bhinneka Tunggal Ika
• **TIU**: Logika, Matematika, Verbal
• **TKP**: Tips menjawab soal karakteristik pribadi

Silakan ketik pertanyaan atau pilih dari saran di bawah!
            """.trimIndent(),
            isFromUser = false,
            source = "System"
        )
        _uiState.update { it.copy(messages = listOf(welcomeMessage)) }
    }

    private fun loadSuggestions() {
        val suggestions = aiRepository.getSuggestions()
        _uiState.update { it.copy(suggestions = suggestions) }
    }

    private fun observeModelStatus() {
        viewModelScope.launch {
            aiRepository.getModelStatus().collect { status ->
                _uiState.update { it.copy(modelStatus = status) }
            }
        }
    }

    fun updateInputText(text: String) {
        _uiState.update { it.copy(inputText = text) }
    }

    fun sendMessage() {
        val text = _uiState.value.inputText.trim()
        if (text.isEmpty()) return

        val userMessage = ChatMessage(
            content = text,
            isFromUser = true
        )

        _uiState.update {
            it.copy(
                messages = it.messages + userMessage,
                inputText = "",
                isLoading = true
            )
        }

        viewModelScope.launch {
            val response = aiRepository.askQuestion(text)
            handleResponse(response)
        }
    }

    fun sendSuggestion(suggestion: String) {
        _uiState.update { it.copy(inputText = suggestion) }
        sendMessage()
    }

    fun sendMessageStreaming() {
        val text = _uiState.value.inputText.trim()
        if (text.isEmpty()) return

        val userMessage = ChatMessage(
            content = text,
            isFromUser = true
        )

        _uiState.update {
            it.copy(
                messages = it.messages + userMessage,
                inputText = "",
                isStreaming = true,
                streamingResponse = ""
            )
        }

        viewModelScope.launch {
            aiRepository.askQuestionStreaming(text).collect { partial ->
                _uiState.update { it.copy(streamingResponse = partial) }
            }

            // Add complete message
            val aiMessage = ChatMessage(
                content = _uiState.value.streamingResponse,
                isFromUser = false,
                source = "AI Tutor"
            )

            _uiState.update {
                it.copy(
                    messages = it.messages + aiMessage,
                    isStreaming = false,
                    streamingResponse = ""
                )
            }
        }
    }

    private fun handleResponse(response: AiResponse) {
        val message = when (response) {
            is AiResponse.Success -> ChatMessage(
                content = response.message,
                isFromUser = false,
                source = response.source
            )
            is AiResponse.Error -> ChatMessage(
                content = "Maaf, terjadi kesalahan: ${response.message}",
                isFromUser = false,
                source = "Error"
            )
            is AiResponse.Loading -> return
        }

        _uiState.update {
            it.copy(
                messages = it.messages + message,
                isLoading = false
            )
        }
    }

    fun downloadModel() {
        viewModelScope.launch {
            aiRepository.downloadModel().collect { status ->
                _uiState.update { it.copy(modelStatus = status) }
            }
        }
    }

    fun clearChat() {
        _uiState.update {
            it.copy(messages = emptyList())
        }
        addWelcomeMessage()
    }
}
