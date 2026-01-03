package com.cpns.lolos.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Entity untuk menyimpan data user
 */
@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey
    val id: String = "local_user",

    // Nama pengguna
    val name: String = "Pengguna",

    // Email (optional, untuk sync)
    val email: String? = null,

    // Target formasi CPNS
    val targetFormation: String? = null,

    // Target instansi
    val targetInstitution: String? = null,

    // Apakah premium
    val isPremium: Boolean = false,

    // Tanggal berlangganan premium
    val premiumExpiresAt: Long? = null,

    // Jumlah AI query yang tersisa (untuk free user)
    val aiQueriesRemaining: Int = 5,

    // Reset AI queries terakhir
    val aiQueriesResetAt: Long = System.currentTimeMillis(),

    // Pengaturan notifikasi
    val notificationEnabled: Boolean = true,

    // Reminder harian jam berapa
    val dailyReminderHour: Int = 20,

    // Streak belajar
    val currentStreak: Int = 0,
    val longestStreak: Int = 0,
    val lastStudyDate: Long? = null,

    // Total soal yang sudah dikerjakan
    val totalQuestionsAnswered: Int = 0,

    // Tanggal registrasi
    val createdAt: Long = System.currentTimeMillis()
)
