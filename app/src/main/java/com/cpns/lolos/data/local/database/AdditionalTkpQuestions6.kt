package com.cpns.lolos.data.local.database

import com.cpns.lolos.data.local.entity.QuestionEntity
import com.google.gson.Gson

/**
 * TKP Questions Batch 6: Kepemimpinan & Pengambilan Keputusan (30 questions)
 * Question IDs: tkp_201 - tkp_230
 */
object AdditionalTkpQuestions6 {

    private val gson = Gson()

    private fun List<String>.toJson(): String = gson.toJson(this)
    private fun List<Int>.toJsonInt(): String = gson.toJson(this)

    fun getQuestions(): List<QuestionEntity> = listOf(
        QuestionEntity(
            id = "tkp_201",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Anda ditunjuk memimpin tim dengan anggota yang lebih senior. Bagaimana pendekatan Anda?",
            options = listOf(
                "Menunjukkan otoritas agar dihormati",
                "Membangun hubungan baik dan menghargai pengalaman mereka",
                "Menyerahkan keputusan sepenuhnya pada yang senior",
                "Menghindari konfrontasi dengan tidak mengambil keputusan",
                "Meminta penggantian anggota tim yang lebih junior"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 1, 1).toJsonInt(),
            explanation = """
Membangun hubungan dan menghargai pengalaman menunjukkan:
• Kepemimpinan yang inklusif
• Menghargai kontribusi senior
• Kolaboratif

Skor:
A (2) - Otoriter
B (5) - Solusi terbaik ✓
C (2) - Tidak memimpin
D (1) - Tidak tegas
E (1) - Tidak realistis
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_202",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Tim Anda menghadapi masalah yang kompleks dengan deadline ketat. Langkah pertama Anda adalah...",
            options = listOf(
                "Panik dan menyerahkan kepada atasan",
                "Menganalisis masalah dan membagi tugas dengan prioritas",
                "Memperpanjang deadline tanpa usaha menyelesaikan",
                "Mengerjakan semua sendiri karena tidak percaya tim",
                "Menyalahkan situasi dan mengeluh"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Menganalisis dan membagi tugas dengan prioritas menunjukkan:
• Kepemimpinan yang tenang
• Kemampuan problem solving
• Delegasi yang tepat

Skor:
A (1) - Tidak memimpin
B (5) - Solusi terbaik ✓
C (2) - Tidak solutif
D (2) - Tidak delegatif
E (1) - Tidak konstruktif
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_203",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Ada dua pilihan kebijakan yang sama-sama memiliki risiko. Bagaimana Anda mengambil keputusan?",
            options = listOf(
                "Menunda keputusan sampai ada pilihan yang lebih baik",
                "Menganalisis risiko-manfaat dan memutuskan dengan pertimbangan matang",
                "Memilih yang paling aman meski kurang optimal",
                "Menyerahkan keputusan kepada atasan",
                "Memilih secara acak karena sama saja"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 3, 2, 1).toJsonInt(),
            explanation = """
Menganalisis risiko-manfaat dan memutuskan dengan pertimbangan matang:
• Pengambilan keputusan yang rasional
• Tidak menunda tanpa alasan
• Bertanggung jawab

Skor:
A (2) - Menunda
B (5) - Solusi terbaik ✓
C (3) - Konservatif
D (2) - Tidak mandiri
E (1) - Tidak bertanggung jawab
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_204",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Anggota tim Anda berkonflik dan mengganggu produktivitas. Tindakan Anda adalah...",
            options = listOf(
                "Membiarkan mereka menyelesaikan sendiri",
                "Memfasilitasi dialog untuk mencari penyelesaian",
                "Memihak salah satu yang menurut Anda benar",
                "Memisahkan mereka tanpa menyelesaikan konflik",
                "Melaporkan ke HR tanpa berusaha menyelesaikan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 2, 2).toJsonInt(),
            explanation = """
Memfasilitasi dialog untuk mencari penyelesaian menunjukkan:
• Kepemimpinan yang mediasi
• Orientasi penyelesaian konflik
• Tidak memihak

Skor:
A (2) - Tidak bertindak
B (5) - Solusi terbaik ✓
C (1) - Memihak
D (2) - Tidak tuntas
E (2) - Langsung eskalasi
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_205",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Anda harus menyampaikan keputusan yang tidak populer kepada tim. Bagaimana cara Anda?",
            options = listOf(
                "Menyampaikan via email tanpa diskusi",
                "Menjelaskan alasan keputusan dan membuka ruang diskusi",
                "Menyalahkan atasan yang membuat keputusan",
                "Menunda penyampaian sampai suasana kondusif",
                "Meminta orang lain yang menyampaikan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 2, 1).toJsonInt(),
            explanation = """
Menjelaskan alasan dan membuka ruang diskusi:
• Transparansi
• Komunikasi yang baik
• Bertanggung jawab

Skor:
A (2) - Tidak personal
B (5) - Solusi terbaik ✓
C (1) - Tidak bertanggung jawab
D (2) - Menunda
E (1) - Tidak bertanggung jawab
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_206",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Anda menemukan kesalahan strategi yang sudah diputuskan bersama. Langkah Anda adalah...",
            options = listOf(
                "Diam karena itu keputusan bersama",
                "Menyampaikan temuan dan mengusulkan perbaikan",
                "Menyalahkan yang mengusulkan strategi tersebut",
                "Membiarkan sampai gagal baru berbicara",
                "Langsung mengubah strategi tanpa konsultasi"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 1, 2).toJsonInt(),
            explanation = """
Menyampaikan temuan dan mengusulkan perbaikan:
• Berorientasi perbaikan
• Tidak takut berbeda pendapat
• Konstruktif

Skor:
A (2) - Pasif
B (5) - Solusi terbaik ✓
C (1) - Menyalahkan
D (1) - Membiarkan kegagalan
E (2) - Tidak koordinasi
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_207",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Tim Anda berhasil mencapai target dengan hasil luar biasa. Bagaimana Anda merespons?",
            options = listOf(
                "Mengklaim sebagai keberhasilan kepemimpinan Anda",
                "Memberikan apresiasi kepada seluruh tim",
                "Biasa saja karena itu memang seharusnya",
                "Meminta reward khusus untuk diri sendiri",
                "Menaikkan target lebih tinggi tanpa apresiasi"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 1, 2).toJsonInt(),
            explanation = """
Memberikan apresiasi kepada seluruh tim:
• Kepemimpinan yang menghargai
• Tidak egois
• Memotivasi tim

Skor:
A (1) - Sombong
B (5) - Solusi terbaik ✓
C (2) - Kurang apresiasi
D (1) - Egois
E (2) - Tidak apresiatif
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_208",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Ada anggota tim yang berkinerja di bawah standar. Pendekatan Anda adalah...",
            options = listOf(
                "Langsung memberikan sanksi",
                "Berdiskusi untuk memahami penyebab dan memberikan dukungan",
                "Mengabaikan dan berharap membaik sendiri",
                "Memindahkan ke tim lain",
                "Memberikan tugas yang lebih mudah terus menerus"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 2, 2).toJsonInt(),
            explanation = """
Berdiskusi dan memberikan dukungan:
• Kepemimpinan yang suportif
• Pembinaan yang tepat
• Orientasi pengembangan

Skor:
A (2) - Terlalu keras
B (5) - Solusi terbaik ✓
C (1) - Tidak peduli
D (2) - Mengalihkan masalah
E (2) - Tidak mengembangkan
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_209",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Anda harus memutuskan dengan cepat tanpa informasi lengkap. Bagaimana Anda bertindak?",
            options = listOf(
                "Menolak memutuskan tanpa informasi lengkap",
                "Memutuskan berdasarkan informasi terbaik yang ada",
                "Menunda sampai informasi lengkap",
                "Meminta orang lain yang memutuskan",
                "Memutuskan asal-asalan karena tidak ada pilihan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 1, 1).toJsonInt(),
            explanation = """
Memutuskan berdasarkan informasi terbaik yang ada:
• Keberanian mengambil keputusan
• Pragmatis
• Bertanggung jawab

Skor:
A (2) - Tidak realistis
B (5) - Solusi terbaik ✓
C (2) - Menunda
D (1) - Tidak bertanggung jawab
E (1) - Sembarangan
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_210",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Tim Anda menolak perubahan yang Anda inisiasi. Respons Anda adalah...",
            options = listOf(
                "Memaksa perubahan dengan otoritas",
                "Mendengarkan keberatan dan menjelaskan manfaat perubahan",
                "Membatalkan perubahan sepenuhnya",
                "Mengancam dengan konsekuensi jika menolak",
                "Melakukan perubahan secara diam-diam"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 1, 1).toJsonInt(),
            explanation = """
Mendengarkan dan menjelaskan manfaat:
• Kepemimpinan yang partisipatif
• Komunikasi yang baik
• Manajemen perubahan

Skor:
A (2) - Otoriter
B (5) - Solusi terbaik ✓
C (2) - Terlalu mudah menyerah
D (1) - Mengancam
E (1) - Tidak transparan
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_211",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Anda ditugaskan menggantikan pemimpin yang sangat dihormati. Langkah Anda adalah...",
            options = listOf(
                "Langsung mengubah semua kebijakan sebelumnya",
                "Mempelajari kelebihan pendahulu dan membangun kepercayaan tim",
                "Meniru persis gaya kepemimpinan pendahulu",
                "Menjelek-jelekkan pendahulu untuk membangun citra",
                "Tidak melakukan perubahan apapun"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 1, 2).toJsonInt(),
            explanation = """
Mempelajari kelebihan pendahulu dan membangun kepercayaan:
• Transisi yang mulus
• Menghargai warisan
• Membangun legitimasi

Skor:
A (2) - Terlalu radikal
B (5) - Solusi terbaik ✓
C (2) - Tidak autentik
D (1) - Tidak etis
E (2) - Tidak berkembang
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_212",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Atasan memberikan target yang menurut Anda tidak realistis. Sikap Anda adalah...",
            options = listOf(
                "Menolak target tersebut",
                "Menyampaikan analisis dan menegosiasikan target yang achievable",
                "Menerima tapi tidak berusaha mencapainya",
                "Menerima dan memaksa tim tanpa pertimbangan",
                "Mengadu ke atasan lebih tinggi"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 1, 2).toJsonInt(),
            explanation = """
Menyampaikan analisis dan menegosiasikan:
• Komunikasi dengan atasan
• Berbasis data
• Realistis

Skor:
A (2) - Tidak konstruktif
B (5) - Solusi terbaik ✓
C (1) - Tidak bertanggung jawab
D (1) - Tidak bijaksana
E (2) - Langsung eskalasi
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_213",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Tim Anda beragam dengan berbagai tipe kepribadian. Bagaimana Anda memimpin?",
            options = listOf(
                "Menyeragamkan cara kerja untuk semua",
                "Menyesuaikan pendekatan sesuai karakteristik masing-masing",
                "Fokus pada yang mirip kepribadian Anda",
                "Mengabaikan perbedaan dan fokus hasil saja",
                "Meminta yang berbeda untuk menyesuaikan diri"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 2, 2).toJsonInt(),
            explanation = """
Menyesuaikan pendekatan sesuai karakteristik:
• Kepemimpinan situasional
• Memahami individu
• Menghargai perbedaan

Skor:
A (2) - Tidak fleksibel
B (5) - Solusi terbaik ✓
C (1) - Bias
D (2) - Kurang personal
E (2) - Tidak adaptif
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_214",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Anda membuat keputusan yang ternyata salah. Bagaimana Anda menyikapinya?",
            options = listOf(
                "Menyalahkan informasi yang salah",
                "Mengakui kesalahan dan fokus pada perbaikan",
                "Menutupi dan berharap tidak ketahuan",
                "Menyalahkan tim yang tidak mendukung",
                "Membenarkan keputusan meski terbukti salah"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 1, 1, 1).toJsonInt(),
            explanation = """
Mengakui kesalahan dan fokus perbaikan:
• Akuntabilitas
• Kerendahan hati
• Orientasi solusi

Skor:
A (1) - Menyalahkan
B (5) - Solusi terbaik ✓
C (1) - Tidak jujur
D (1) - Menyalahkan tim
E (1) - Tidak mau belajar
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_215",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Ada krisis mendadak yang membutuhkan penanganan segera. Tindakan Anda adalah...",
            options = listOf(
                "Panik dan tidak tahu harus berbuat apa",
                "Tetap tenang, mengkoordinasi tim, dan mengambil tindakan cepat",
                "Menunggu instruksi dari atasan",
                "Menyerahkan penanganan ke siapapun yang mau",
                "Menyalahkan yang menyebabkan krisis"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 1, 1).toJsonInt(),
            explanation = """
Tetap tenang dan mengkoordinasi menunjukkan:
• Kepemimpinan dalam krisis
• Kemampuan bekerja di bawah tekanan
• Pengambilan keputusan cepat

Skor:
A (1) - Tidak siap
B (5) - Solusi terbaik ✓
C (2) - Pasif
D (1) - Tidak bertanggung jawab
E (1) - Tidak solutif
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_216",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Anda harus memilih anggota tim untuk proyek penting. Kriteria utama Anda adalah...",
            options = listOf(
                "Kedekatan personal dengan Anda",
                "Kompetensi dan kesesuaian dengan kebutuhan proyek",
                "Yang paling tidak sibuk",
                "Yang paling senior",
                "Yang paling mudah diatur"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Kompetensi dan kesesuaian dengan kebutuhan proyek:
• Penempatan berbasis merit
• Objektif
• Orientasi hasil

Skor:
A (1) - Nepotisme
B (5) - Solusi terbaik ✓
C (2) - Kurang tepat
D (2) - Bias senioritas
E (1) - Mencari yang patuh
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_217",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Anda memiliki ide inovatif tapi membutuhkan perubahan besar. Pendekatan Anda adalah...",
            options = listOf(
                "Langsung menerapkan tanpa konsultasi",
                "Membangun koalisi pendukung dan menerapkan secara bertahap",
                "Menyerah karena perubahan sulit",
                "Memaksa semua orang mengikuti",
                "Menyimpan ide untuk diri sendiri"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 2, 1).toJsonInt(),
            explanation = """
Membangun koalisi dan menerapkan bertahap:
• Manajemen perubahan yang baik
• Strategi implementasi
• Membangun dukungan

Skor:
A (2) - Tidak partisipatif
B (5) - Solusi terbaik ✓
C (1) - Menyerah
D (2) - Otoriter
E (1) - Tidak berbagi
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_218",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Tim Anda mengalami penurunan motivasi. Langkah Anda adalah...",
            options = listOf(
                "Memberikan sanksi kepada yang tidak termotivasi",
                "Mencari tahu penyebab dan menciptakan lingkungan yang memotivasi",
                "Mengabaikan karena itu masalah pribadi mereka",
                "Mengganti dengan anggota baru",
                "Menambah tekanan agar bekerja lebih keras"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 1, 2, 1).toJsonInt(),
            explanation = """
Mencari penyebab dan menciptakan lingkungan memotivasi:
• Kepemimpinan yang peduli
• Orientasi pada root cause
• Pendekatan suportif

Skor:
A (1) - Kontraproduktif
B (5) - Solusi terbaik ✓
C (1) - Tidak peduli
D (2) - Tidak menyelesaikan
E (1) - Memperburuk
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_219",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Anda harus memberikan feedback negatif kepada anggota tim. Pendekatan Anda adalah...",
            options = listOf(
                "Menyampaikan di depan tim sebagai pelajaran",
                "Menyampaikan secara pribadi dengan konstruktif dan solusi",
                "Menghindari memberikan feedback negatif",
                "Menyampaikan via email tanpa diskusi",
                "Menyuruh rekan lain yang menyampaikan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Menyampaikan secara pribadi dengan konstruktif:
• Menghargai martabat
• Feedback yang membangun
• Fokus pada perbaikan

Skor:
A (1) - Mempermalukan
B (5) - Solusi terbaik ✓
C (2) - Menghindari
D (2) - Tidak personal
E (1) - Tidak bertanggung jawab
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_220",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Anda ditunjuk memimpin proyek lintas departemen. Langkah pertama Anda adalah...",
            options = listOf(
                "Langsung menetapkan aturan main",
                "Bertemu dengan perwakilan setiap departemen untuk memahami perspektif",
                "Fokus pada departemen sendiri dahulu",
                "Meminta salah satu departemen mendominasi",
                "Menunggu ada masalah baru bertindak"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 1, 1).toJsonInt(),
            explanation = """
Bertemu dengan perwakilan setiap departemen:
• Memahami stakeholder
• Inklusif
• Membangun kolaborasi

Skor:
A (2) - Tidak partisipatif
B (5) - Solusi terbaik ✓
C (2) - Tidak komprehensif
D (1) - Tidak adil
E (1) - Reaktif
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_221",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Anda menghadapi tekanan dari berbagai pihak dengan kepentingan berbeda. Sikap Anda adalah...",
            options = listOf(
                "Mengikuti yang paling berkuasa",
                "Menganalisis semua kepentingan dan mencari solusi seimbang",
                "Menolak semua tekanan",
                "Mengikuti siapapun yang datang terakhir",
                "Menyerahkan keputusan kepada orang lain"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 1, 1).toJsonInt(),
            explanation = """
Menganalisis semua kepentingan dan mencari solusi seimbang:
• Kepemimpinan yang adil
• Manajemen stakeholder
• Pengambilan keputusan objektif

Skor:
A (2) - Bias kekuasaan
B (5) - Solusi terbaik ✓
C (2) - Tidak realistis
D (1) - Tidak konsisten
E (1) - Tidak memimpin
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_222",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Anda diminta mengambil keputusan yang berisiko tinggi. Bagaimana Anda mempersiapkan?",
            options = listOf(
                "Menghindari mengambil keputusan berisiko",
                "Mengumpulkan data, berkonsultasi, dan menyiapkan mitigasi risiko",
                "Langsung memutuskan berdasarkan insting",
                "Menyerahkan keputusan kepada atasan",
                "Memutuskan yang risikonya paling kecil meski kurang optimal"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 2, 3).toJsonInt(),
            explanation = """
Mengumpulkan data, berkonsultasi, dan menyiapkan mitigasi:
• Pengambilan keputusan yang matang
• Manajemen risiko
• Persiapan yang baik

Skor:
A (2) - Menghindari
B (5) - Solusi terbaik ✓
C (2) - Sembrono
D (2) - Tidak mandiri
E (3) - Konservatif
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_223",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Anggota tim Anda memiliki potensi tinggi tapi belum berkembang. Tindakan Anda adalah...",
            options = listOf(
                "Membiarkan dia berkembang sendiri",
                "Memberikan tantangan dan bimbingan untuk mengembangkan potensinya",
                "Memindahkan ke tempat yang lebih mudah",
                "Mengabaikan karena sudah cukup bagus",
                "Menunggu dia meminta bimbingan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 2, 2).toJsonInt(),
            explanation = """
Memberikan tantangan dan bimbingan:
• Kepemimpinan yang mengembangkan
• Talent development
• Investasi pada SDM

Skor:
A (2) - Tidak membimbing
B (5) - Solusi terbaik ✓
C (2) - Tidak mengembangkan
D (2) - Tidak proaktif
E (2) - Reaktif
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_224",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Anda harus memprioritaskan antara dua proyek penting dengan sumber daya terbatas. Pendekatan Anda adalah...",
            options = listOf(
                "Mengerjakan dua-duanya dengan separuh sumber daya",
                "Menganalisis dampak dan urgensi untuk memprioritaskan",
                "Memilih yang lebih mudah",
                "Menyerahkan keputusan kepada tim",
                "Menolak salah satu tanpa analisis"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Menganalisis dampak dan urgensi untuk memprioritaskan:
• Pengambilan keputusan berbasis data
• Manajemen sumber daya
• Prioritisasi yang tepat

Skor:
A (2) - Tidak optimal
B (5) - Solusi terbaik ✓
C (2) - Kurang tepat
D (2) - Tidak memimpin
E (1) - Tidak analitis
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_225",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Anda mendapat kritik tajam tentang kepemimpinan Anda. Respons Anda adalah...",
            options = listOf(
                "Membela diri dan menolak kritik",
                "Mendengarkan dengan terbuka dan mengevaluasi diri",
                "Mencari siapa yang mengkritik untuk dibalas",
                "Mengabaikan karena tidak konstruktif",
                "Menyalahkan situasi yang sulit"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 2, 1).toJsonInt(),
            explanation = """
Mendengarkan dengan terbuka dan mengevaluasi diri:
• Keterbukaan terhadap feedback
• Kemampuan refleksi
• Orientasi perbaikan

Skor:
A (2) - Defensif
B (5) - Solusi terbaik ✓
C (1) - Balas dendam
D (2) - Tidak mau belajar
E (1) - Menyalahkan
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_226",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Anda harus memimpin tim di situasi yang penuh ketidakpastian. Bagaimana Anda bertindak?",
            options = listOf(
                "Menunggu sampai situasi jelas",
                "Memberikan arahan yang jelas meski dengan informasi terbatas",
                "Menyerahkan keputusan kepada setiap anggota tim",
                "Tidak mengambil tindakan apapun",
                "Meminta atasan yang memutuskan semua"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 1, 2).toJsonInt(),
            explanation = """
Memberikan arahan yang jelas meski dengan informasi terbatas:
• Kepemimpinan di ketidakpastian
• Memberikan arah
• Berani mengambil keputusan

Skor:
A (2) - Menunda
B (5) - Solusi terbaik ✓
C (2) - Tidak terarah
D (1) - Tidak memimpin
E (2) - Tidak mandiri
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_227",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Anda perlu mendelegasikan tugas penting tapi tidak yakin dengan kemampuan anggota tim. Tindakan Anda adalah...",
            options = listOf(
                "Mengerjakan sendiri untuk memastikan kualitas",
                "Mendelegasikan dengan bimbingan dan monitoring",
                "Mendelegasikan tanpa pengawasan",
                "Mencari orang dari luar tim",
                "Menunda tugas sampai ada orang yang tepat"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Mendelegasikan dengan bimbingan dan monitoring:
• Delegasi yang bertanggung jawab
• Pengembangan kapasitas
• Kepercayaan dengan pengawasan

Skor:
A (2) - Tidak delegatif
B (5) - Solusi terbaik ✓
C (2) - Tidak bertanggung jawab
D (2) - Tidak mengembangkan tim
E (1) - Menunda
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_228",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Anda ditunjuk memimpin perubahan yang tidak populer. Bagaimana Anda mengelolanya?",
            options = listOf(
                "Memaksakan perubahan dengan cepat",
                "Mengkomunikasikan visi, melibatkan tim, dan mengelola transisi",
                "Menunda sampai ada dukungan penuh",
                "Menyerahkan kepada orang lain yang lebih berani",
                "Melakukan perubahan secara sembunyi-sembunyi"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 1, 1).toJsonInt(),
            explanation = """
Mengkomunikasikan visi, melibatkan tim, dan mengelola transisi:
• Manajemen perubahan yang baik
• Kepemimpinan transformasional
• Komunikasi efektif

Skor:
A (2) - Otoriter
B (5) - Solusi terbaik ✓
C (2) - Menunda
D (1) - Tidak bertanggung jawab
E (1) - Tidak transparan
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_229",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Anda harus memilih antara keputusan yang cepat tapi berisiko atau lambat tapi aman. Pertimbangan Anda adalah...",
            options = listOf(
                "Selalu memilih yang cepat agar terlihat tegas",
                "Menilai konteks dan dampak sebelum memutuskan pendekatan",
                "Selalu memilih yang lambat untuk keamanan",
                "Menyerahkan keputusan kepada orang lain",
                "Tidak memutuskan sama sekali"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 1, 1).toJsonInt(),
            explanation = """
Menilai konteks dan dampak sebelum memutuskan:
• Pengambilan keputusan kontekstual
• Tidak ekstrem
• Fleksibilitas

Skor:
A (2) - Tidak bijaksana
B (5) - Solusi terbaik ✓
C (2) - Terlalu konservatif
D (1) - Tidak memimpin
E (1) - Tidak memutuskan
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_230",
            category = "TKP",
            subCategory = "kepemimpinan",
            questionText = "Anda akan meninggalkan posisi kepemimpinan. Bagaimana Anda mempersiapkan transisi?",
            options = listOf(
                "Pergi begitu saja tanpa serah terima",
                "Mempersiapkan pengganti dan melakukan transfer knowledge",
                "Menghabiskan waktu yang tersisa tanpa persiapan",
                "Menyembunyikan informasi penting",
                "Mempersulit pengganti agar terlihat lebih baik"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 1, 1).toJsonInt(),
            explanation = """
Mempersiapkan pengganti dan melakukan transfer knowledge:
• Suksesi yang bertanggung jawab
• Profesionalisme
• Orientasi keberlanjutan

Skor:
A (1) - Tidak bertanggung jawab
B (5) - Solusi terbaik ✓
C (2) - Tidak proaktif
D (1) - Tidak etis
E (1) - Sabotase
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        )
    )
}
