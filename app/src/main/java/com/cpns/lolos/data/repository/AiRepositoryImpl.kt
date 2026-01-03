package com.cpns.lolos.data.repository

import android.content.Context
import com.cpns.lolos.data.ai.CpnsKnowledgeBase
import com.cpns.lolos.data.ai.LlmInferenceService
import com.cpns.lolos.domain.repository.AiRepository
import com.cpns.lolos.domain.repository.AiRepository.AiResponse
import com.cpns.lolos.domain.repository.AiRepository.ModelStatus
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withContext
import java.io.File
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AiRepositoryImpl @Inject constructor(
    @ApplicationContext private val context: Context,
    private val llmService: LlmInferenceService
) : AiRepository {

    private val _modelStatus = MutableStateFlow<ModelStatus>(ModelStatus.NotDownloaded)

    init {
        // Check if model is already available
        if (llmService.isModelAvailable()) {
            _modelStatus.value = ModelStatus.Ready
        }
    }

    override fun getModelStatus(): Flow<ModelStatus> = _modelStatus.asStateFlow()

    override suspend fun downloadModel(): Flow<ModelStatus> = flow {
        emit(ModelStatus.Downloading(0f))
        _modelStatus.value = ModelStatus.Downloading(0f)

        // Note: Actual model download would require hosting the model file
        // For now, we'll provide instructions for manual download

        // In production, you would:
        // 1. Download from your server or Google Cloud Storage
        // 2. Save to context.filesDir
        // 3. Emit progress updates

        // Simulated download progress
        for (progress in listOf(0.1f, 0.3f, 0.5f, 0.7f, 0.9f, 1.0f)) {
            kotlinx.coroutines.delay(500)
            emit(ModelStatus.Downloading(progress))
            _modelStatus.value = ModelStatus.Downloading(progress)
        }

        // Check if model exists after "download"
        if (llmService.isModelAvailable()) {
            emit(ModelStatus.Ready)
            _modelStatus.value = ModelStatus.Ready
        } else {
            val error = ModelStatus.Error(
                "Model belum tersedia. Silakan download model Gemma 2B dari " +
                "https://ai.google.dev/edge/mediapipe/solutions/genai/llm_inference/android " +
                "dan letakkan di folder aplikasi."
            )
            emit(error)
            _modelStatus.value = error
        }
    }

    override suspend fun askQuestion(question: String): AiResponse {
        // Step 1: Try Knowledge Base first (fast, no model needed)
        val knowledgeAnswer = CpnsKnowledgeBase.findAnswer(question)
        if (knowledgeAnswer != null) {
            return AiResponse.Success(
                message = knowledgeAnswer.answer,
                source = "Knowledge Base"
            )
        }

        // Step 2: Try LLM if available
        if (llmService.isModelAvailable()) {
            return withContext(Dispatchers.IO) {
                llmService.generateResponse(question).fold(
                    onSuccess = { response ->
                        AiResponse.Success(
                            message = response,
                            source = "AI (Gemma)"
                        )
                    },
                    onFailure = { error ->
                        // Fallback to generic response
                        AiResponse.Success(
                            message = getGenericResponse(question),
                            source = "Fallback"
                        )
                    }
                )
            }
        }

        // Step 3: Fallback response
        return AiResponse.Success(
            message = getGenericResponse(question),
            source = "Fallback"
        )
    }

    override fun askQuestionStreaming(question: String): Flow<String> = flow {
        // Try Knowledge Base first
        val knowledgeAnswer = CpnsKnowledgeBase.findAnswer(question)
        if (knowledgeAnswer != null) {
            // Simulate streaming for knowledge base
            val words = knowledgeAnswer.answer.split(" ")
            val buffer = StringBuilder()
            for (word in words) {
                buffer.append(word).append(" ")
                emit(buffer.toString())
                kotlinx.coroutines.delay(30) // Simulate typing
            }
            return@flow
        }

        // Try LLM if available
        if (llmService.isModelAvailable()) {
            llmService.generateResponseStreaming(question).collect { response ->
                emit(response)
            }
        } else {
            emit(getGenericResponse(question))
        }
    }

    override suspend fun explainQuestion(
        questionText: String,
        options: List<String>,
        correctAnswer: Int,
        userAnswer: Int
    ): AiResponse {
        // Try LLM first for detailed explanation
        if (llmService.isModelAvailable()) {
            return withContext(Dispatchers.IO) {
                llmService.explainQuestion(
                    questionText,
                    options,
                    correctAnswer,
                    userAnswer
                ).fold(
                    onSuccess = { response ->
                        AiResponse.Success(response, "AI (Gemma)")
                    },
                    onFailure = {
                        // Fallback to simple explanation
                        AiResponse.Success(
                            generateSimpleExplanation(options, correctAnswer, userAnswer),
                            "Fallback"
                        )
                    }
                )
            }
        }

        // Fallback explanation
        return AiResponse.Success(
            generateSimpleExplanation(options, correctAnswer, userAnswer),
            "Fallback"
        )
    }

    override fun getSuggestions(): List<String> {
        return CpnsKnowledgeBase.getSuggestions()
    }

    override suspend fun isModelReady(): Boolean {
        return llmService.isModelAvailable()
    }

    override suspend fun deleteModel() {
        val modelFile = File(llmService.getModelPath())
        if (modelFile.exists()) {
            modelFile.delete()
        }
        _modelStatus.value = ModelStatus.NotDownloaded
        llmService.release()
    }

    private fun generateSimpleExplanation(
        options: List<String>,
        correctAnswer: Int,
        userAnswer: Int
    ): String {
        val correctLetter = ('A' + correctAnswer)
        val userLetter = ('A' + userAnswer)

        return if (correctAnswer == userAnswer) {
            """
**Jawaban Anda Benar! ✓**

Jawaban yang benar adalah **$correctLetter. ${options[correctAnswer]}**

Anda sudah memahami materi ini dengan baik. Lanjutkan ke soal berikutnya!
            """.trimIndent()
        } else {
            """
**Jawaban yang Benar: $correctLetter. ${options[correctAnswer]}**

Anda memilih: $userLetter. ${options[userAnswer]}

Untuk memahami lebih lanjut, pelajari kembali materi terkait atau tanyakan ke AI Tutor dengan pertanyaan spesifik.
            """.trimIndent()
        }
    }

    private fun getGenericResponse(question: String): String {
        return """
Maaf, saya belum bisa menjawab pertanyaan ini secara detail.

**Saran:**
1. Coba tanyakan dengan kata kunci yang lebih spesifik
2. Download model AI untuk jawaban yang lebih lengkap
3. Pelajari materi di menu "Materi"

**Pertanyaan yang bisa saya jawab:**
${CpnsKnowledgeBase.getSuggestions().take(3).joinToString("\n") { "• $it" }}

Ketik salah satu pertanyaan di atas untuk mendapatkan jawaban.
        """.trimIndent()
    }
}
