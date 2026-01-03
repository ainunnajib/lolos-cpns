package com.cpns.lolos.domain.model

/**
 * Domain model untuk sesi quiz/try out
 */
data class QuizSession(
    val id: String,
    val type: QuizType,
    val category: QuestionCategory? = null,
    val questions: List<Question>,
    val answers: MutableMap<String, UserAnswer> = mutableMapOf(),
    val startedAt: Long,
    val finishedAt: Long? = null,
    val timeLimit: Int, // dalam menit
    val status: QuizStatus = QuizStatus.IN_PROGRESS
) {
    val totalQuestions: Int get() = questions.size
    val answeredCount: Int get() = answers.size
    val remainingCount: Int get() = totalQuestions - answeredCount

    fun getScore(): QuizScore {
        var twkScore = 0
        var tiuScore = 0
        var tkpScore = 0

        questions.forEach { question ->
            val answer = answers[question.id] ?: return@forEach

            when (question.category) {
                QuestionCategory.TWK -> {
                    if (answer.selectedOption == question.correctAnswer) {
                        twkScore += 5 // 5 poin per soal TWK benar
                    }
                }
                QuestionCategory.TIU -> {
                    if (answer.selectedOption == question.correctAnswer) {
                        tiuScore += 5 // 5 poin per soal TIU benar
                    }
                }
                QuestionCategory.TKP -> {
                    // TKP scoring berdasarkan tkpScores
                    val scores = question.tkpScores ?: listOf(1, 2, 3, 4, 5)
                    tkpScore += scores.getOrElse(answer.selectedOption) { 1 }
                }
                QuestionCategory.SKB -> {
                    // SKB scoring
                }
            }
        }

        return QuizScore(
            twk = twkScore,
            tiu = tiuScore,
            tkp = tkpScore,
            total = twkScore + tiuScore + tkpScore
        )
    }

    fun isPassed(): Boolean {
        val score = getScore()
        return score.twk >= QuestionCategory.TWK.passingGrade &&
                score.tiu >= QuestionCategory.TIU.passingGrade &&
                score.tkp >= QuestionCategory.TKP.passingGrade
    }
}

data class UserAnswer(
    val questionId: String,
    val selectedOption: Int,
    val timeSpent: Int = 0, // dalam detik
    val isMarkedForReview: Boolean = false
)

data class QuizScore(
    val twk: Int,
    val tiu: Int,
    val tkp: Int,
    val total: Int
) {
    fun isPassingTwk(): Boolean = twk >= QuestionCategory.TWK.passingGrade
    fun isPassingTiu(): Boolean = tiu >= QuestionCategory.TIU.passingGrade
    fun isPassingTkp(): Boolean = tkp >= QuestionCategory.TKP.passingGrade
    fun isPassingAll(): Boolean = isPassingTwk() && isPassingTiu() && isPassingTkp()
}

enum class QuizType(val displayName: String, val questionCount: Int, val timeLimit: Int) {
    TRYOUT_FULL("Try Out SKD Lengkap", 110, 100),
    TRYOUT_MINI("Try Out Mini", 30, 30),
    LATIHAN_TWK("Latihan TWK", 30, 30),
    LATIHAN_TIU("Latihan TIU", 35, 35),
    LATIHAN_TKP("Latihan TKP", 45, 45),
    LATIHAN_CUSTOM("Latihan Custom", 0, 0)
}

enum class QuizStatus {
    IN_PROGRESS,
    COMPLETED,
    ABANDONED
}
