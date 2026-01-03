package com.cpns.lolos.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.cpns.lolos.data.local.dao.QuestionDao
import com.cpns.lolos.data.local.dao.UserDao
import com.cpns.lolos.data.local.dao.UserProgressDao
import com.cpns.lolos.data.local.entity.CategoryStatsEntity
import com.cpns.lolos.data.local.entity.QuestionEntity
import com.cpns.lolos.data.local.entity.QuizSessionEntity
import com.cpns.lolos.data.local.entity.UserEntity
import com.cpns.lolos.data.local.entity.UserProgressEntity

@Database(
    entities = [
        QuestionEntity::class,
        UserEntity::class,
        UserProgressEntity::class,
        QuizSessionEntity::class,
        CategoryStatsEntity::class
    ],
    version = 1,
    exportSchema = true
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun questionDao(): QuestionDao
    abstract fun userDao(): UserDao
    abstract fun userProgressDao(): UserProgressDao

    companion object {
        const val DATABASE_NAME = "lolos_cpns_db"
    }
}
