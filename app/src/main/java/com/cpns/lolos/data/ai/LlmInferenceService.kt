package com.cpns.lolos.data.ai

import android.content.Context
import com.google.mediapipe.tasks.genai.llminference.LlmInference
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.withContext
import java.io.File
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Service untuk menjalankan LLM inference on-device menggunakan MediaPipe
 */
@Singleton
class LlmInferenceService @Inject constructor(
    @ApplicationContext private val context: Context
) {
    private var llmInference: LlmInference? = null
    private var isInitialized = false

    companion object {
        // Model file name - user needs to download and place in assets or app files
        private const val MODEL_FILE_NAME = "gemma-2b-it-cpu-int4.bin"

        // System prompt for CPNS context
        private const val SYSTEM_PROMPT = """Kamu adalah AI Tutor untuk persiapan Tes CPNS Indonesia.
Tugasmu adalah membantu pengguna memahami materi:
- TWK (Tes Wawasan Kebangsaan): Pancasila, UUD 1945, NKRI, Bhinneka Tunggal Ika
- TIU (Tes Intelegensi Umum): Logika, Matematika, Verbal
- TKP (Tes Karakteristik Pribadi): Sikap dan perilaku ASN

Berikan jawaban yang jelas, ringkas, dan mudah dipahami dalam Bahasa Indonesia.
Gunakan format markdown jika membantu (bold, bullet points, dll)."""
    }

    /**
     * Check if model file exists
     */
    fun isModelAvailable(): Boolean {
        val modelFile = File(context.filesDir, MODEL_FILE_NAME)
        return modelFile.exists()
    }

    /**
     * Get model file path
     */
    fun getModelPath(): String {
        return File(context.filesDir, MODEL_FILE_NAME).absolutePath
    }

    /**
     * Initialize the LLM inference engine
     */
    suspend fun initialize(): Result<Unit> = withContext(Dispatchers.IO) {
        try {
            if (isInitialized && llmInference != null) {
                return@withContext Result.success(Unit)
            }

            val modelPath = getModelPath()
            if (!File(modelPath).exists()) {
                return@withContext Result.failure(
                    IllegalStateException("Model file not found. Please download the model first.")
                )
            }

            val options = LlmInference.LlmInferenceOptions.builder()
                .setModelPath(modelPath)
                .setMaxTokens(1024)
                .build()

            llmInference = LlmInference.createFromOptions(context, options)
            isInitialized = true

            Result.success(Unit)
        } catch (e: Exception) {
            isInitialized = false
            Result.failure(e)
        }
    }

    /**
     * Generate response for a question
     */
    suspend fun generateResponse(question: String): Result<String> = withContext(Dispatchers.IO) {
        try {
            if (!isInitialized) {
                initialize().getOrElse {
                    return@withContext Result.failure(it)
                }
            }

            val inference = llmInference
                ?: return@withContext Result.failure(IllegalStateException("LLM not initialized"))

            val prompt = buildPrompt(question)
            val response = inference.generateResponse(prompt)

            Result.success(response)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    /**
     * Generate response with streaming
     */
    fun generateResponseStreaming(question: String): Flow<String> = flow {
        if (!isInitialized) {
            initialize().getOrThrow()
        }

        val inference = llmInference
            ?: throw IllegalStateException("LLM not initialized")

        val prompt = buildPrompt(question)

        // Use synchronous API since async doesn't directly support Flow
        val response = inference.generateResponse(prompt)
        emit(response)
    }.flowOn(Dispatchers.IO)

    /**
     * Generate explanation for a question
     */
    suspend fun explainQuestion(
        questionText: String,
        options: List<String>,
        correctAnswer: Int,
        userAnswer: Int
    ): Result<String> = withContext(Dispatchers.IO) {
        try {
            if (!isInitialized) {
                initialize().getOrElse {
                    return@withContext Result.failure(it)
                }
            }

            val inference = llmInference
                ?: return@withContext Result.failure(IllegalStateException("LLM not initialized"))

            val optionsText = options.mapIndexed { index, opt ->
                "${('A' + index)}. $opt"
            }.joinToString("\n")

            val prompt = """
$SYSTEM_PROMPT

Jelaskan soal berikut:

Soal: $questionText

Pilihan:
$optionsText

Jawaban benar: ${('A' + correctAnswer)}
Jawaban user: ${('A' + userAnswer)}

Berikan penjelasan mengapa jawaban ${('A' + correctAnswer)} adalah yang benar, dan mengapa pilihan lain salah.
            """.trimIndent()

            val response = inference.generateResponse(prompt)
            Result.success(response)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    /**
     * Build prompt with system context
     */
    private fun buildPrompt(question: String): String {
        return """
$SYSTEM_PROMPT

Pertanyaan pengguna: $question

Jawaban:
        """.trimIndent()
    }

    /**
     * Release resources
     */
    fun release() {
        llmInference?.close()
        llmInference = null
        isInitialized = false
    }
}
