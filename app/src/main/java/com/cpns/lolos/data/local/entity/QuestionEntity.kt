package com.cpns.lolos.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Entity untuk menyimpan soal CPNS di database lokal
 */
@Entity(tableName = "questions")
data class QuestionEntity(
    @PrimaryKey
    val id: String,

    // Kategori: TWK, TIU, TKP, SKB
    val category: String,

    // Sub-kategori (e.g., "pancasila", "numerik", "pelayanan_publik")
    val subCategory: String,

    // Teks soal
    val questionText: String,

    // Gambar soal (optional, path atau URL)
    val questionImage: String? = null,

    // Pilihan jawaban (JSON array: ["A. ...", "B. ...", ...])
    val options: String,

    // Index jawaban benar (0-4)
    val correctAnswer: Int,

    // Pembahasan soal (pre-generated)
    val explanation: String,

    // Sumber soal
    val source: String? = null,

    // Tingkat kesulitan: easy, medium, hard
    val difficulty: String = "medium",

    // Tahun soal
    val year: Int? = null,

    // Apakah soal HOTS (Higher Order Thinking Skills)
    val isHots: Boolean = false,

    // Untuk TKP: skor per pilihan (JSON array: [1, 2, 3, 4, 5])
    val tkpScores: String? = null,

    // Timestamp
    val createdAt: Long = System.currentTimeMillis(),
    val updatedAt: Long = System.currentTimeMillis()
)
