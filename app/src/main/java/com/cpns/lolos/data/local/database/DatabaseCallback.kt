package com.cpns.lolos.data.local.database

import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.google.gson.Gson

/**
 * Callback untuk mengisi database dengan data awal saat pertama kali dibuat
 */
class DatabaseCallback : RoomDatabase.Callback() {

    private val gson = Gson()

    override fun onCreate(db: SupportSQLiteDatabase) {
        super.onCreate(db)
        populateDatabase(db)
    }

    private fun populateDatabase(db: SupportSQLiteDatabase) {
        val questions = QuestionSeeder.getSampleQuestions()

        db.beginTransaction()
        try {
            for (question in questions) {
                val values = ContentValues().apply {
                    put("id", question.id)
                    put("category", question.category)
                    put("subCategory", question.subCategory)
                    put("questionText", question.questionText)
                    put("questionImage", question.questionImage)
                    put("options", question.options)
                    put("correctAnswer", question.correctAnswer)
                    put("explanation", question.explanation)
                    put("source", question.source)
                    put("difficulty", question.difficulty)
                    put("year", question.year)
                    put("isHots", if (question.isHots) 1 else 0)
                    put("tkpScores", question.tkpScores)
                    put("createdAt", question.createdAt)
                    put("updatedAt", question.updatedAt)
                }
                db.insert("questions", SQLiteDatabase.CONFLICT_REPLACE, values)
            }
            db.setTransactionSuccessful()
        } finally {
            db.endTransaction()
        }
    }
}
