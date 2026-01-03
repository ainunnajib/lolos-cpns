package com.cpns.lolos.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Entity untuk menyimpan progress belajar user
 */
@Entity(tableName = "user_progress")
data class UserProgressEntity(
    @PrimaryKey
    val id: String,

    // ID soal yang dikerjakan
    val questionId: String,

    // Jawaban user (index 0-4)
    val userAnswer: Int,

    // Apakah jawaban benar
    val isCorrect: Boolean,

    // Untuk TKP: skor yang didapat
    val score: Int = 0,

    // Waktu pengerjaan dalam detik
    val timeSpent: Int = 0,

    // Kapan dikerjakan
    val attemptedAt: Long = System.currentTimeMillis(),

    // Session ID (untuk grouping per sesi try out)
    val sessionId: String? = null
)

/**
 * Entity untuk menyimpan sesi try out
 */
@Entity(tableName = "quiz_sessions")
data class QuizSessionEntity(
    @PrimaryKey
    val id: String,

    // Tipe: "tryout_full", "tryout_mini", "latihan_twk", dll
    val type: String,

    // Kategori (jika latihan per kategori)
    val category: String? = null,

    // Jumlah soal
    val totalQuestions: Int,

    // Waktu mulai dan selesai
    val startedAt: Long,
    val finishedAt: Long? = null,

    // Skor
    val scoreTwk: Int = 0,
    val scoreTiu: Int = 0,
    val scoreTkp: Int = 0,
    val scoreTotal: Int = 0,

    // Status: "in_progress", "completed", "abandoned"
    val status: String = "in_progress"
)

/**
 * Entity untuk menyimpan statistik per kategori
 */
@Entity(tableName = "category_stats")
data class CategoryStatsEntity(
    @PrimaryKey
    val category: String,

    val subCategory: String,

    // Total soal yang sudah dikerjakan
    val totalAttempted: Int = 0,

    // Total jawaban benar
    val totalCorrect: Int = 0,

    // Akurasi (persentase)
    val accuracy: Float = 0f,

    // Waktu rata-rata per soal (detik)
    val avgTimePerQuestion: Float = 0f,

    // Update terakhir
    val lastUpdated: Long = System.currentTimeMillis()
)
