package com.cpns.lolos.domain.model

/**
 * Domain model untuk Soal CPNS
 */
data class Question(
    val id: String,
    val category: QuestionCategory,
    val subCategory: String,
    val questionText: String,
    val questionImage: String? = null,
    val options: List<String>,
    val correctAnswer: Int,
    val explanation: String,
    val source: String? = null,
    val difficulty: Difficulty = Difficulty.MEDIUM,
    val year: Int? = null,
    val isHots: Boolean = false,
    val tkpScores: List<Int>? = null
)

enum class QuestionCategory(val displayName: String, val passingGrade: Int, val maxScore: Int) {
    TWK("Tes Wawasan Kebangsaan", 65, 150),
    TIU("Tes Intelegensi Umum", 80, 175),
    TKP("Tes Karakteristik Pribadi", 166, 225),
    SKB("Seleksi Kompetensi Bidang", 0, 100)
}

enum class Difficulty(val displayName: String) {
    EASY("Mudah"),
    MEDIUM("Sedang"),
    HARD("Sulit")
}

/**
 * Sub-kategori untuk TWK
 */
object TwkSubCategory {
    const val PANCASILA = "pancasila"
    const val UUD_1945 = "uud_1945"
    const val NKRI = "nkri"
    const val BHINNEKA = "bhinneka"
    const val SEJARAH = "sejarah"
    const val BAHASA_INDONESIA = "bahasa_indonesia"
    const val NASIONALISME = "nasionalisme"
    const val INTEGRITAS = "integritas"
    const val BELA_NEGARA = "bela_negara"

    val all = listOf(
        PANCASILA to "Pancasila",
        UUD_1945 to "UUD 1945",
        NKRI to "NKRI",
        BHINNEKA to "Bhinneka Tunggal Ika",
        SEJARAH to "Sejarah Nasional",
        BAHASA_INDONESIA to "Bahasa Indonesia",
        NASIONALISME to "Nasionalisme",
        INTEGRITAS to "Integritas",
        BELA_NEGARA to "Bela Negara"
    )
}

/**
 * Sub-kategori untuk TIU
 */
object TiuSubCategory {
    const val SINONIM = "sinonim"
    const val ANTONIM = "antonim"
    const val ANALOGI = "analogi"
    const val PENALARAN_VERBAL = "penalaran_verbal"
    const val DERET_ANGKA = "deret_angka"
    const val ARITMATIKA = "aritmatika"
    const val PERBANDINGAN = "perbandingan"
    const val SOAL_CERITA = "soal_cerita"
    const val SILOGISME = "silogisme"
    const val LOGIKA = "logika"
    const val FIGURAL = "figural"

    val all = listOf(
        SINONIM to "Sinonim",
        ANTONIM to "Antonim",
        ANALOGI to "Analogi",
        PENALARAN_VERBAL to "Penalaran Verbal",
        DERET_ANGKA to "Deret Angka",
        ARITMATIKA to "Aritmatika",
        PERBANDINGAN to "Perbandingan",
        SOAL_CERITA to "Soal Cerita",
        SILOGISME to "Silogisme",
        LOGIKA to "Logika",
        FIGURAL to "Figural"
    )
}

/**
 * Sub-kategori untuk TKP
 */
object TkpSubCategory {
    const val PELAYANAN_PUBLIK = "pelayanan_publik"
    const val JEJARING_KERJA = "jejaring_kerja"
    const val SOSIAL_BUDAYA = "sosial_budaya"
    const val TIK = "tik"
    const val PROFESIONALISME = "profesionalisme"
    const val ANTI_RADIKALISME = "anti_radikalisme"

    val all = listOf(
        PELAYANAN_PUBLIK to "Pelayanan Publik",
        JEJARING_KERJA to "Jejaring Kerja",
        SOSIAL_BUDAYA to "Sosial Budaya",
        TIK to "Teknologi Informasi",
        PROFESIONALISME to "Profesionalisme",
        ANTI_RADIKALISME to "Anti Radikalisme"
    )
}
