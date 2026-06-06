package com.cpns.lolos.data.local.database

import com.cpns.lolos.data.local.entity.QuestionEntity
import com.google.gson.Gson

/**
 * TKP Questions Batch 5: Integritas & Anti Korupsi (35 questions)
 * Question IDs: tkp_166 - tkp_200
 */
object AdditionalTkpQuestions5 {

    private val gson = Gson()

    private fun List<String>.toJson(): String = gson.toJson(this)
    private fun List<Int>.toJsonInt(): String = gson.toJson(this)

    fun getQuestions(): List<QuestionEntity> = listOf(
        QuestionEntity(
            id = "tkp_166",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda menemukan rekan kerja menggunakan fasilitas kantor untuk kepentingan pribadi. Tindakan Anda adalah...",
            options = listOf(
                "Membiarkan karena bukan urusan Anda",
                "Mengingatkan bahwa itu tidak sesuai aturan",
                "Ikut menggunakan fasilitas untuk kepentingan pribadi",
                "Melaporkan langsung ke pimpinan tertinggi",
                "Mengambil foto sebagai bukti tanpa menegur"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 3, 1).toJsonInt(),
            explanation = """
Mengingatkan bahwa itu tidak sesuai aturan menunjukkan:
• Integritas
• Kepedulian terhadap aturan
• Pendekatan yang bijaksana

Skor:
A (2) - Membiarkan pelanggaran
B (5) - Solusi terbaik ✓
C (1) - Ikut melanggar
D (3) - Eskalasi langsung
E (1) - Tidak bijaksana
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_167",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Vendor menawarkan uang untuk memenangkan tender. Sikap Anda adalah...",
            options = listOf(
                "Menerima karena itu hal biasa",
                "Menolak tegas dan melaporkan ke unit yang berwenang",
                "Menolak tapi tidak melaporkan",
                "Menegosiasikan jumlah yang lebih besar",
                "Meminta diberikan dalam bentuk lain"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 3, 1, 1).toJsonInt(),
            explanation = """
Menolak tegas dan melaporkan menunjukkan:
• Sikap anti korupsi
• Integritas tinggi
• Keberanian moral

Skor:
A (1) - Korupsi
B (5) - Solusi terbaik ✓
C (3) - Kurang tegas
D (1) - Korupsi
E (1) - Korupsi terselubung
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_168",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda diminta menandatangani dokumen yang Anda tahu tidak akurat. Respons Anda adalah...",
            options = listOf(
                "Menandatangani karena diminta atasan",
                "Menolak dan meminta dokumen diperbaiki terlebih dahulu",
                "Menandatangani tapi mencatat keberatan secara terpisah",
                "Menandatangani dengan syarat nama tidak dicantumkan",
                "Menyuruh orang lain yang menandatangani"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 1, 1).toJsonInt(),
            explanation = """
Menolak dan meminta dokumen diperbaiki menunjukkan:
• Kejujuran
• Tanggung jawab
• Tidak kompromi dengan kebenaran

Skor:
A (1) - Tidak jujur
B (5) - Solusi terbaik ✓
C (2) - Kompromi tidak tepat
D (1) - Tetap tidak jujur
E (1) - Tidak bertanggung jawab
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_169",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda mengetahui ada mark-up anggaran dalam proyek yang Anda tangani. Tindakan Anda adalah...",
            options = listOf(
                "Diam karena bukan yang membuat keputusan",
                "Melaporkan melalui saluran pengaduan yang tersedia",
                "Membicarakan dengan rekan yang terlibat",
                "Keluar dari proyek tanpa melapor",
                "Meminta bagian dari mark-up tersebut"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Melaporkan melalui saluran pengaduan menunjukkan:
• Keberanian melawan korupsi
• Integritas tinggi
• Tindakan yang benar

Skor:
A (2) - Membiarkan korupsi
B (5) - Solusi terbaik ✓
C (2) - Tidak tegas
D (2) - Menghindar
E (1) - Korupsi
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_170",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Keluarga meminta Anda mengurus administrasi dengan mempercepat prosesnya. Sikap Anda adalah...",
            options = listOf(
                "Membantu mempercepat karena itu keluarga",
                "Menjelaskan bahwa harus mengikuti prosedur yang sama seperti yang lain",
                "Meminta rekan lain yang mengurusnya",
                "Menolak membantu sama sekali",
                "Membantu tapi meminta tidak menceritakan ke orang lain"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Menjelaskan harus mengikuti prosedur yang sama menunjukkan:
• Tidak ada perlakuan istimewa
• Integritas
• Profesionalisme

Skor:
A (1) - Nepotisme
B (5) - Solusi terbaik ✓
C (2) - Menghindar
D (2) - Kurang bijaksana
E (1) - Nepotisme terselubung
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_171",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda menemukan kelebihan uang kas saat audit internal. Langkah Anda adalah...",
            options = listOf(
                "Menyimpan karena tidak ada yang tahu",
                "Melaporkan temuan dan mencari penyebab perbedaan",
                "Mengembalikan diam-diam ke kas tanpa laporan",
                "Membagi dengan rekan yang bertugas",
                "Mengabaikan karena jumlahnya kecil"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 1, 1).toJsonInt(),
            explanation = """
Melaporkan dan mencari penyebab perbedaan menunjukkan:
• Kejujuran
• Kepatuhan pada prosedur audit
• Integritas

Skor:
A (1) - Tidak jujur
B (5) - Solusi terbaik ✓
C (2) - Kurang transparan
D (1) - Tidak jujur
E (1) - Mengabaikan masalah
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_172",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Atasan meminta Anda memanipulasi data laporan agar terlihat lebih baik. Respons Anda adalah...",
            options = listOf(
                "Mengikuti instruksi karena itu perintah atasan",
                "Menolak dengan sopan dan menjelaskan pentingnya data akurat",
                "Menolak tapi tidak memberikan alasan",
                "Menyuruh rekan lain yang melakukan",
                "Mengikuti tapi dengan perubahan minimal"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 1, 2).toJsonInt(),
            explanation = """
Menolak dengan sopan dan menjelaskan menunjukkan:
• Integritas tinggi
• Keberanian moral
• Tidak kompromi kebenaran

Skor:
A (1) - Tidak jujur
B (5) - Solusi terbaik ✓
C (2) - Kurang komunikatif
D (1) - Tidak bertanggung jawab
E (2) - Tetap tidak jujur
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_173",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda tidak sengaja membocorkan informasi rahasia kantor. Tindakan Anda adalah...",
            options = listOf(
                "Diam dan berharap tidak ada yang tahu",
                "Segera melapor ke atasan dan bertanggung jawab",
                "Menyalahkan pihak lain yang memancing informasi",
                "Membuat cerita palsu untuk menutupi",
                "Menghapus bukti kebocoran"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 1, 1, 1).toJsonInt(),
            explanation = """
Segera melapor dan bertanggung jawab menunjukkan:
• Kejujuran
• Tanggung jawab atas kesalahan
• Integritas

Skor:
A (1) - Tidak jujur
B (5) - Solusi terbaik ✓
C (1) - Menyalahkan orang lain
D (1) - Berbohong
E (1) - Menghilangkan bukti
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_174",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Rekan Anda meminta Anda menutup kekurangannya dalam absensi. Sikap Anda adalah...",
            options = listOf(
                "Membantu karena dia teman baik",
                "Menolak karena itu tidak jujur",
                "Membantu dengan syarat dia juga membantu Anda nanti",
                "Menyarankan dia izin resmi saja",
                "Diam saja tanpa membantu atau menasihati"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 1, 4, 2).toJsonInt(),
            explanation = """
Menolak karena tidak jujur menunjukkan:
• Integritas
• Tidak kompromi dengan kebohongan
• Keberanian mengatakan tidak

Skor:
A (1) - Tidak jujur
B (5) - Solusi terbaik ✓
C (1) - Transaksional negatif
D (4) - Alternatif baik
E (2) - Pasif
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_175",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda ditawari untuk menjadi bagian dari proyek dengan imbalan tidak resmi. Respons Anda adalah...",
            options = listOf(
                "Menerima karena menguntungkan",
                "Menolak dan menyarankan jalur resmi",
                "Mempertimbangkan tergantung jumlah imbalan",
                "Menerima tapi tidak aktif terlibat",
                "Menolak tapi tidak melaporkan penawaran"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 1, 1, 3).toJsonInt(),
            explanation = """
Menolak dan menyarankan jalur resmi menunjukkan:
• Anti korupsi
• Integritas
• Memberikan alternatif yang benar

Skor:
A (1) - Korupsi
B (5) - Solusi terbaik ✓
C (1) - Tidak bermoral
D (1) - Tetap terlibat korupsi
E (3) - Kurang tegas
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_176",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda menemukan kesalahan dalam perhitungan yang menguntungkan Anda secara pribadi. Tindakan Anda adalah...",
            options = listOf(
                "Membiarkan karena menguntungkan",
                "Melaporkan kesalahan dan meminta koreksi",
                "Menunggu sampai ada yang menemukan",
                "Menyimpan selisihnya untuk sementara",
                "Berbagi dengan yang menemukan kesalahan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 1, 1).toJsonInt(),
            explanation = """
Melaporkan dan meminta koreksi menunjukkan:
• Kejujuran
• Tidak mengambil yang bukan hak
• Integritas tinggi

Skor:
A (1) - Tidak jujur
B (5) - Solusi terbaik ✓
C (2) - Tidak proaktif
D (1) - Penggelapan
E (1) - Tidak jujur
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_177",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Warga menawarkan hadiah sebagai ucapan terima kasih atas pelayanan Anda. Sikap Anda adalah...",
            options = listOf(
                "Menerima karena itu tulus dari warga",
                "Menolak dengan sopan dan menjelaskan kode etik",
                "Menerima tapi menyumbangkannya ke kantor",
                "Meminta hadiah dalam bentuk lain yang tidak kentara",
                "Menerima agar warga tidak tersinggung"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 3, 1, 2).toJsonInt(),
            explanation = """
Menolak dengan sopan dan menjelaskan kode etik menunjukkan:
• Kepatuhan pada aturan
• Integritas
• Profesionalisme

Skor:
A (2) - Melanggar etik
B (5) - Solusi terbaik ✓
C (3) - Alternatif baik
D (1) - Gratifikasi terselubung
E (2) - Melanggar etik
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_178",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda melihat rekan mengambil perlengkapan kantor untuk keperluan pribadi. Respons Anda adalah...",
            options = listOf(
                "Ikut mengambil karena semua orang melakukannya",
                "Menegur dan mengingatkan bahwa itu milik kantor",
                "Melaporkan langsung ke satpam",
                "Diam saja karena jumlahnya kecil",
                "Memfoto sebagai bukti tanpa menegur"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Menegur dan mengingatkan menunjukkan:
• Kepedulian terhadap aset kantor
• Integritas
• Pendekatan yang bijaksana

Skor:
A (1) - Ikut melanggar
B (5) - Solusi terbaik ✓
C (2) - Eskalasi langsung
D (2) - Membiarkan
E (1) - Tidak bijaksana
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_179",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda diminta merekomendasikan keluarga untuk posisi tertentu. Sikap Anda adalah...",
            options = listOf(
                "Merekomendasikan karena yakin dia mampu",
                "Menjelaskan bahwa harus melalui proses seleksi resmi",
                "Merekomendasikan dengan menutup-nutupi hubungan keluarga",
                "Menolak tanpa penjelasan",
                "Meminta bantuan orang lain untuk merekomendasikan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 2, 1).toJsonInt(),
            explanation = """
Menjelaskan harus melalui proses seleksi resmi menunjukkan:
• Anti nepotisme
• Integritas
• Keadilan dalam proses

Skor:
A (2) - Potensial nepotisme
B (5) - Solusi terbaik ✓
C (1) - Nepotisme terselubung
D (2) - Kurang komunikatif
E (1) - Tidak jujur
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_180",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda mengetahui ada penyalahgunaan wewenang oleh atasan. Tindakan Anda adalah...",
            options = listOf(
                "Diam karena takut pada atasan",
                "Melaporkan melalui sistem whistleblowing yang tersedia",
                "Membicarakan dengan rekan untuk mencari dukungan",
                "Mengumpulkan bukti tapi tidak melaporkan",
                "Resign dari pekerjaan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 3, 2, 1).toJsonInt(),
            explanation = """
Melaporkan melalui sistem whistleblowing menunjukkan:
• Keberanian moral
• Integritas tinggi
• Menegakkan kebenaran

Skor:
A (2) - Takut
B (5) - Solusi terbaik ✓
C (3) - Langkah awal baik
D (2) - Tidak tuntas
E (1) - Menghindar
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_181",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda diberi kewenangan mengelola anggaran tanpa pengawasan ketat. Bagaimana Anda mengelolanya?",
            options = listOf(
                "Memanfaatkan untuk kepentingan pribadi sebagian",
                "Mengelola sesuai aturan dan membuat laporan transparan",
                "Mengelola dengan baik tapi tanpa dokumentasi",
                "Meminta bagian untuk pengawas yang ditunjuk",
                "Menghabiskan semua anggaran meski tidak perlu"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 1, 1).toJsonInt(),
            explanation = """
Mengelola sesuai aturan dengan laporan transparan menunjukkan:
• Integritas
• Akuntabilitas
• Pengelolaan yang baik

Skor:
A (1) - Korupsi
B (5) - Solusi terbaik ✓
C (2) - Kurang akuntabel
D (1) - Suap
E (1) - Pemborosan
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_182",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda menemukan dokumen penting yang hilang di meja Anda. Langkah Anda adalah...",
            options = listOf(
                "Menyembunyikan fakta kehilangan",
                "Segera melaporkan dan membantu pencarian",
                "Menyalahkan orang lain yang pernah ke meja Anda",
                "Membuat dokumen baru tanpa memberitahu",
                "Menunggu ada yang menanyakan baru melapor"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 1, 2, 2).toJsonInt(),
            explanation = """
Segera melaporkan dan membantu pencarian menunjukkan:
• Kejujuran
• Tanggung jawab
• Tidak menutupi masalah

Skor:
A (1) - Tidak jujur
B (5) - Solusi terbaik ✓
C (1) - Menyalahkan orang lain
D (2) - Tidak transparan
E (2) - Tidak proaktif
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_183",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Rekan meminta Anda berbohong tentang keberadaannya saat atasan mencari. Respons Anda adalah...",
            options = listOf(
                "Berbohong untuk membantu rekan",
                "Mengatakan jujur bahwa tidak tahu keberadaannya",
                "Mengalihkan pembicaraan tanpa menjawab",
                "Mengarang cerita agar masuk akal",
                "Membantu tapi meminta imbalan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 1, 1).toJsonInt(),
            explanation = """
Mengatakan jujur menunjukkan:
• Kejujuran
• Tidak mau berbohong
• Integritas

Skor:
A (1) - Berbohong
B (5) - Solusi terbaik ✓
C (2) - Tidak langsung
D (1) - Berbohong
E (1) - Transaksional negatif
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_184",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda ditawari komisi oleh penyedia jasa untuk memenangkan kontrak. Tindakan Anda adalah...",
            options = listOf(
                "Menegosiasikan jumlah komisi",
                "Menolak tegas dan melaporkan penawaran tersebut",
                "Menolak tapi tidak melaporkan",
                "Menerima jika tidak ada yang tahu",
                "Meminta komisi diberikan ke pihak lain"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 3, 1, 1).toJsonInt(),
            explanation = """
Menolak tegas dan melaporkan menunjukkan:
• Anti suap
• Integritas tinggi
• Keberanian moral

Skor:
A (1) - Korupsi
B (5) - Solusi terbaik ✓
C (3) - Kurang tegas
D (1) - Korupsi
E (1) - Korupsi terselubung
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_185",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda mengetahui adanya konflik kepentingan dalam tugas yang diberikan kepada Anda. Sikap Anda adalah...",
            options = listOf(
                "Menjalankan tugas tanpa memberitahu siapapun",
                "Mengungkapkan konflik kepentingan dan meminta penugasan ulang",
                "Tetap mengerjakan dengan mengutamakan kepentingan pribadi",
                "Delegasikan ke orang lain tanpa penjelasan",
                "Menolak tugas tanpa alasan yang jelas"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 1, 2, 2).toJsonInt(),
            explanation = """
Mengungkapkan konflik kepentingan dan meminta penugasan ulang:
• Transparansi
• Integritas
• Menghindari konflik kepentingan

Skor:
A (1) - Tidak transparan
B (5) - Solusi terbaik ✓
C (1) - Konflik kepentingan
D (2) - Tidak transparan
E (2) - Tidak komunikatif
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_186",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda menerima informasi insider yang bisa menguntungkan Anda secara finansial. Tindakan Anda adalah...",
            options = listOf(
                "Memanfaatkan informasi tersebut",
                "Tidak memanfaatkan dan menjaga kerahasiaan informasi",
                "Berbagi informasi dengan orang terdekat",
                "Menjual informasi ke pihak yang membutuhkan",
                "Menyimpan untuk digunakan nanti"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 1, 1, 1).toJsonInt(),
            explanation = """
Tidak memanfaatkan dan menjaga kerahasiaan menunjukkan:
• Integritas
• Kepatuhan pada etik
• Tidak menyalahgunakan informasi

Skor:
A (1) - Insider trading
B (5) - Solusi terbaik ✓
C (1) - Membocorkan
D (1) - Menjual informasi
E (1) - Potensial penyalahgunaan
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_187",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda diminta membuat laporan yang menyembunyikan fakta negatif. Respons Anda adalah...",
            options = listOf(
                "Membuat laporan sesuai permintaan",
                "Menolak dan membuat laporan yang akurat",
                "Membuat dua versi laporan",
                "Menyampaikan fakta secara implisit saja",
                "Meminta orang lain yang membuat laporan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 1, 2, 1).toJsonInt(),
            explanation = """
Menolak dan membuat laporan akurat menunjukkan:
• Kejujuran
• Integritas
• Tidak mau berbohong

Skor:
A (1) - Tidak jujur
B (5) - Solusi terbaik ✓
C (1) - Tidak konsisten
D (2) - Tidak tegas
E (1) - Tidak bertanggung jawab
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_188",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda menemukan ada pengeluaran fiktif dalam keuangan unit Anda. Langkah Anda adalah...",
            options = listOf(
                "Diam karena bukan Anda yang melakukan",
                "Melaporkan ke audit internal atau pimpinan",
                "Membicarakan dengan pelaku untuk mencari solusi",
                "Mengancam pelaku untuk keuntungan pribadi",
                "Meminta bagian dari pengeluaran fiktif"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 1, 1).toJsonInt(),
            explanation = """
Melaporkan ke audit internal menunjukkan:
• Sikap anti korupsi
• Integritas
• Keberanian moral

Skor:
A (2) - Membiarkan
B (5) - Solusi terbaik ✓
C (2) - Tidak tegas
D (1) - Pemerasan
E (1) - Korupsi
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_189",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda mendapat hadiah mahal dari vendor yang sedang bekerjasama. Sikap Anda adalah...",
            options = listOf(
                "Menerima karena itu hadiah pribadi",
                "Menolak dan menjelaskan kebijakan anti gratifikasi",
                "Menerima tapi melaporkan ke instansi",
                "Meminta hadiah dalam bentuk yang tidak kentara",
                "Menerima tapi membalas dengan kemudahan proses"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 3, 1, 1).toJsonInt(),
            explanation = """
Menolak dan menjelaskan kebijakan anti gratifikasi:
• Kepatuhan pada aturan
• Integritas
• Profesionalisme

Skor:
A (1) - Gratifikasi
B (5) - Solusi terbaik ✓
C (3) - Alternatif baik
D (1) - Gratifikasi terselubung
E (1) - Suap
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_190",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda mengetahui ada praktik titip absen di kantor. Respons Anda adalah...",
            options = listOf(
                "Ikut melakukan karena sudah biasa",
                "Tidak ikut melakukan dan menyarankan perbaikan sistem",
                "Diam saja meski tidak ikut",
                "Melaporkan semua pelaku ke atasan",
                "Memanfaatkan untuk kepentingan sendiri"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 3, 1).toJsonInt(),
            explanation = """
Tidak ikut dan menyarankan perbaikan sistem:
• Integritas
• Orientasi perbaikan
• Tidak ikut melanggar

Skor:
A (1) - Melanggar
B (5) - Solusi terbaik ✓
C (2) - Pasif
D (3) - Alternatif baik
E (1) - Melanggar
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_191",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda diminta menandatangani dokumen tanpa membacanya terlebih dahulu. Tindakan Anda adalah...",
            options = listOf(
                "Menandatangani karena percaya pada pemberi dokumen",
                "Meminta waktu untuk membaca dan memahami isinya",
                "Menandatangani dengan catatan tidak bertanggung jawab",
                "Menolak tanpa membaca",
                "Menyuruh orang lain menandatangani"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Meminta waktu untuk membaca dan memahami menunjukkan:
• Kehati-hatian
• Tanggung jawab
• Tidak sembarangan menandatangani

Skor:
A (1) - Ceroboh
B (5) - Solusi terbaik ✓
C (2) - Tidak bertanggung jawab
D (2) - Tidak kooperatif
E (1) - Tidak bertanggung jawab
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_192",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda menemukan ada duplikasi pengajuan reimbursement oleh rekan. Langkah Anda adalah...",
            options = listOf(
                "Mengabaikan karena bukan urusan Anda",
                "Menegur rekan dan menyarankan untuk mengoreksi",
                "Melaporkan langsung ke bagian keuangan",
                "Mengancam untuk kepentingan pribadi",
                "Ikut melakukan hal yang sama"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 3, 1, 1).toJsonInt(),
            explanation = """
Menegur dan menyarankan untuk mengoreksi:
• Kepedulian yang bijaksana
• Memberikan kesempatan memperbaiki
• Integritas

Skor:
A (2) - Membiarkan
B (5) - Solusi terbaik ✓
C (3) - Eskalasi langsung
D (1) - Pemerasan
E (1) - Ikut melanggar
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_193",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda mendapat kesempatan menggunakan aset kantor untuk bisnis pribadi. Respons Anda adalah...",
            options = listOf(
                "Menggunakan karena tidak ada yang tahu",
                "Tidak menggunakan karena itu melanggar aturan",
                "Menggunakan dengan kompensasi ke kantor",
                "Menggunakan di luar jam kerja saja",
                "Menyuruh orang lain menggunakannya untuk Anda"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Tidak menggunakan karena melanggar aturan menunjukkan:
• Kepatuhan pada aturan
• Integritas
• Tidak menyalahgunakan aset

Skor:
A (1) - Penyalahgunaan
B (5) - Solusi terbaik ✓
C (2) - Tetap tidak tepat
D (2) - Tetap penyalahgunaan
E (1) - Penyalahgunaan
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_194",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda melihat ada potensi fraud dalam sistem yang Anda temukan. Tindakan Anda adalah...",
            options = listOf(
                "Diam dan memanfaatkan untuk kepentingan pribadi",
                "Melaporkan ke bagian IT dan audit untuk diperbaiki",
                "Memberitahu rekan dekat saja",
                "Mengabaikan karena bukan tanggung jawab Anda",
                "Menutup celah tanpa melaporkan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 3).toJsonInt(),
            explanation = """
Melaporkan ke IT dan audit untuk diperbaiki:
• Proaktif mencegah fraud
• Integritas
• Kontribusi positif

Skor:
A (1) - Melakukan fraud
B (5) - Solusi terbaik ✓
C (2) - Tidak tepat
D (2) - Tidak peduli
E (3) - Kurang transparan
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_195",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda diminta menyetujui pengadaan yang Anda tahu harganya di atas pasar. Sikap Anda adalah...",
            options = listOf(
                "Menyetujui karena sudah keputusan atasan",
                "Menolak dan meminta dilakukan negosiasi ulang",
                "Menyetujui dengan catatan keberatan",
                "Meminta bagian dari selisih harga",
                "Menyetujui tapi tidak menandatangani"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 1, 2).toJsonInt(),
            explanation = """
Menolak dan meminta negosiasi ulang:
• Menjaga keuangan negara
• Integritas
• Tidak menyetujui pemborosan

Skor:
A (1) - Membiarkan
B (5) - Solusi terbaik ✓
C (2) - Kurang tegas
D (1) - Korupsi
E (2) - Tidak konsisten
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_196",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda menemukan bukti pelanggaran oleh seseorang yang berpengaruh. Respons Anda adalah...",
            options = listOf(
                "Diam karena takut pada kekuasaannya",
                "Tetap melaporkan melalui jalur yang benar",
                "Menyimpan bukti untuk perlindungan diri",
                "Memberitahu media untuk ekspose",
                "Menggunakan bukti untuk kepentingan pribadi"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Tetap melaporkan melalui jalur yang benar:
• Keberanian moral
• Integritas tinggi
• Tidak pandang bulu

Skor:
A (2) - Takut
B (5) - Solusi terbaik ✓
C (2) - Tidak tuntas
D (2) - Kurang tepat
E (1) - Pemerasan
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_197",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda mendapat tawaran untuk meloloskan berkas dengan imbalan. Tindakan Anda adalah...",
            options = listOf(
                "Menerima karena tidak merugikan siapapun",
                "Menolak tegas dan memproses berkas sesuai prosedur",
                "Menolak tapi memproses berkas lebih cepat",
                "Menerima sebagian saja",
                "Menolak tapi menyarankan ke petugas lain"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 1, 1).toJsonInt(),
            explanation = """
Menolak tegas dan memproses sesuai prosedur:
• Anti suap
• Integritas
• Profesionalisme

Skor:
A (1) - Suap
B (5) - Solusi terbaik ✓
C (2) - Tidak konsisten
D (1) - Tetap suap
E (1) - Tidak bertanggung jawab
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_198",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda mengetahui rekan memalsukan sertifikat untuk kenaikan pangkat. Langkah Anda adalah...",
            options = listOf(
                "Diam karena bukan urusan Anda",
                "Menyarankan rekan untuk jujur dan melaporkan jika tidak mau",
                "Melaporkan langsung tanpa bicara dengan rekan",
                "Meminta imbalan untuk diam",
                "Ikut memalsukan untuk diri sendiri"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 3, 1, 1).toJsonInt(),
            explanation = """
Menyarankan jujur dan melaporkan jika tidak mau:
• Memberikan kesempatan introspeksi
• Tetap tegas pada kebenaran
• Integritas

Skor:
A (2) - Membiarkan
B (5) - Solusi terbaik ✓
C (3) - Langsung eskalasi
D (1) - Pemerasan
E (1) - Ikut melanggar
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_199",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda diminta mengubah hasil evaluasi agar seseorang lulus penilaian. Respons Anda adalah...",
            options = listOf(
                "Mengubah karena diminta atasan",
                "Menolak dan mempertahankan hasil evaluasi yang objektif",
                "Mengubah sedikit agar tidak terlalu kentara",
                "Meminta orang lain yang mengubah",
                "Mengubah dengan menyimpan bukti asli"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 1, 1, 2).toJsonInt(),
            explanation = """
Menolak dan mempertahankan hasil objektif:
• Kejujuran
• Integritas
• Tidak memanipulasi

Skor:
A (1) - Manipulasi
B (5) - Solusi terbaik ✓
C (1) - Tetap manipulasi
D (1) - Tidak bertanggung jawab
E (2) - Tidak konsisten
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_200",
            category = "TKP",
            subCategory = "integritas",
            questionText = "Anda mendengar ada rencana korupsi di instansi Anda. Tindakan Anda adalah...",
            options = listOf(
                "Diam karena belum terjadi",
                "Melaporkan sebagai upaya pencegahan",
                "Menunggu sampai benar-benar terjadi",
                "Membicarakan dengan yang merencanakan",
                "Mengabaikan karena hanya rencana"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 2, 2).toJsonInt(),
            explanation = """
Melaporkan sebagai upaya pencegahan:
• Proaktif mencegah korupsi
• Integritas
• Tindakan preventif

Skor:
A (2) - Pasif
B (5) - Solusi terbaik ✓
C (2) - Membiarkan berkembang
D (2) - Tidak tepat
E (2) - Mengabaikan
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        )
    )
}
