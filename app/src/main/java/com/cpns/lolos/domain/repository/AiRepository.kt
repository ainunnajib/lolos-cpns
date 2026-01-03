package com.cpns.lolos.domain.repository

import kotlinx.coroutines.flow.Flow

/**
 * Repository untuk AI Tutor
 */
interface AiRepository {

    /**
     * Status model AI
     */
    sealed class ModelStatus {
        data object NotDownloaded : ModelStatus()
        data class Downloading(val progress: Float) : ModelStatus()
        data object Ready : ModelStatus()
        data class Error(val message: String) : ModelStatus()
    }

    /**
     * Response dari AI
     */
    sealed class AiResponse {
        data class Success(val message: String, val source: String) : AiResponse()
        data class Error(val message: String) : AiResponse()
        data object Loading : AiResponse()
    }

    /**
     * Mendapatkan status model saat ini
     */
    fun getModelStatus(): Flow<ModelStatus>

    /**
     * Download model AI (jika belum ada)
     */
    suspend fun downloadModel(): Flow<ModelStatus>

    /**
     * Mengajukan pertanyaan ke AI
     * Akan coba Knowledge Base dulu, lalu fallback ke LLM jika tersedia
     */
    suspend fun askQuestion(question: String): AiResponse

    /**
     * Mengajukan pertanyaan dengan streaming response
     */
    fun askQuestionStreaming(question: String): Flow<String>

    /**
     * Mendapatkan penjelasan untuk soal
     */
    suspend fun explainQuestion(
        questionText: String,
        options: List<String>,
        correctAnswer: Int,
        userAnswer: Int
    ): AiResponse

    /**
     * Mendapatkan saran pertanyaan
     */
    fun getSuggestions(): List<String>

    /**
     * Cek apakah model siap digunakan
     */
    suspend fun isModelReady(): Boolean

    /**
     * Hapus model dari storage
     */
    suspend fun deleteModel()
}
