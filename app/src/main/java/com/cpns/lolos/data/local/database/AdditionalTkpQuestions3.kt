package com.cpns.lolos.data.local.database

import com.cpns.lolos.data.local.entity.QuestionEntity
import com.google.gson.Gson

/**
 * TKP Questions Batch 3: Sosial Budaya (30 questions)
 * Question IDs: tkp_106 - tkp_135
 */
object AdditionalTkpQuestions3 {

    private val gson = Gson()

    private fun List<String>.toJson(): String = gson.toJson(this)
    private fun List<Int>.toJsonInt(): String = gson.toJson(this)

    fun getQuestions(): List<QuestionEntity> = listOf(
        QuestionEntity(
            id = "tkp_106",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Anda bekerja dengan rekan dari suku dan budaya berbeda. Bagaimana Anda menyikapi perbedaan tersebut?",
            options = listOf(
                "Bergaul hanya dengan yang sesuku",
                "Menghormati perbedaan dan belajar dari keragaman budaya",
                "Mengabaikan perbedaan budaya",
                "Menganggap budaya Anda yang paling benar",
                "Meminta penempatan di unit yang homogen"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 1, 1).toJsonInt(),
            explanation = """
Menghormati dan belajar dari keragaman budaya menunjukkan:
• Sikap toleran
• Wawasan kebangsaan
• Sesuai nilai Bhinneka Tunggal Ika

Skor:
A (1) - Eksklusif
B (5) - Solusi terbaik ✓
C (2) - Tidak menghargai
D (1) - Chauvinistik
E (1) - Tidak adaptif
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_107",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Ada rekan yang menjalankan ibadah di jam kerja sesuai agamanya. Sikap Anda adalah...",
            options = listOf(
                "Keberatan karena mengganggu pekerjaan",
                "Menghormati dan memberikan kesempatan tanpa menghambat pekerjaan",
                "Melaporkan ke atasan",
                "Meminta dia mengganti jamnya",
                "Mengabaikan tanpa peduli"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 2).toJsonInt(),
            explanation = """
Menghormati dan memberikan kesempatan menunjukkan:
• Toleransi beragama
• Menghargai hak asasi
• Kerukunan antar umat beragama

Skor:
A (1) - Intoleran
B (5) - Solusi terbaik ✓
C (2) - Berlebihan
D (2) - Kurang menghargai
E (2) - Tidak peduli
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_108",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Anda diundang ke acara adat rekan kerja yang tradisinya berbeda dengan Anda. Respons Anda adalah...",
            options = listOf(
                "Menolak karena tidak sesuai dengan keyakinan Anda",
                "Menghadiri dan menghormati tradisi mereka",
                "Hadir tapi tidak ikut tradisi apapun",
                "Mengirim perwakilan saja",
                "Memberikan alasan tidak bisa hadir"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 3, 2, 2).toJsonInt(),
            explanation = """
Menghadiri dan menghormati tradisi menunjukkan:
• Toleransi budaya
• Mempererat hubungan
• Menghargai keberagaman

Skor:
A (1) - Intoleran
B (5) - Solusi terbaik ✓
C (3) - Cukup baik
D (2) - Kurang personal
E (2) - Menghindari
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_109",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Rekan kerja membuat lelucon tentang suku tertentu. Bagaimana sikap Anda?",
            options = listOf(
                "Ikut tertawa karena hanya bercanda",
                "Menegur dengan sopan bahwa lelucon tersebut tidak pantas",
                "Diam saja meski tidak setuju",
                "Melaporkan ke bagian SDM",
                "Membalasnya dengan lelucon tentang sukunya"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 3, 1).toJsonInt(),
            explanation = """
Menegur dengan sopan menunjukkan:
• Sikap anti diskriminasi
• Keberanian moral
• Menjaga keharmonisan

Skor:
A (1) - Mendukung diskriminasi
B (5) - Solusi terbaik ✓
C (2) - Pasif
D (3) - Eskalasi langsung
E (1) - Memperburuk
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_110",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Anda bertugas di daerah dengan budaya berbeda dari asal Anda. Bagaimana Anda beradaptasi?",
            options = listOf(
                "Tetap menjalankan kebiasaan asal tanpa menyesuaikan",
                "Mempelajari budaya setempat dan beradaptasi dengan baik",
                "Membentuk komunitas sesama daerah asal",
                "Meminta pindah ke daerah yang budayanya sama",
                "Mengabaikan budaya setempat dan fokus bekerja saja"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 1, 2).toJsonInt(),
            explanation = """
Mempelajari dan beradaptasi dengan budaya setempat menunjukkan:
• Fleksibilitas budaya
• Kemauan belajar
• Penghargaan terhadap kearifan lokal

Skor:
A (2) - Tidak adaptif
B (5) - Solusi terbaik ✓
C (2) - Kurang berintegrasi
D (1) - Tidak mau beradaptasi
E (2) - Acuh
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_111",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Ada perayaan hari besar agama tertentu di kantor. Sebagai pemeluk agama berbeda, sikap Anda adalah...",
            options = listOf(
                "Tidak ikut karena bukan agama Anda",
                "Ikut merayakan dan memberikan ucapan selamat",
                "Bekerja seperti biasa tanpa peduli",
                "Izin pulang lebih awal",
                "Mengkritik penggunaan fasilitas kantor untuk acara keagamaan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 1, 1).toJsonInt(),
            explanation = """
Ikut merayakan dan memberikan ucapan menunjukkan:
• Toleransi beragama
• Kerukunan antar pemeluk agama
• Semangat kebersamaan

Skor:
A (2) - Kurang toleran
B (5) - Solusi terbaik ✓
C (2) - Tidak peduli
D (1) - Tidak tepat
E (1) - Intoleran
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_112",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Anda melihat ada diskriminasi terhadap rekan berdasarkan latar belakangnya. Tindakan Anda adalah...",
            options = listOf(
                "Diam saja karena bukan urusan Anda",
                "Menegur pelaku dan memberikan dukungan kepada korban",
                "Melaporkan tapi tidak mau terlibat lebih jauh",
                "Menjauh dari situasi tersebut",
                "Membicarakan dengan rekan lain tanpa bertindak"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 3, 1, 2).toJsonInt(),
            explanation = """
Menegur pelaku dan mendukung korban menunjukkan:
• Sikap anti diskriminasi
• Keberanian moral
• Kepedulian sosial

Skor:
A (1) - Tidak peduli
B (5) - Solusi terbaik ✓
C (3) - Cukup baik
D (1) - Menghindar
E (2) - Tidak bertindak
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_113",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Anda diminta membuat kebijakan yang harus mempertimbangkan keragaman masyarakat. Pendekatan Anda adalah...",
            options = listOf(
                "Membuat kebijakan seragam tanpa pengecualian",
                "Mempertimbangkan aspirasi berbagai kelompok dalam perumusan",
                "Mengutamakan kepentingan kelompok mayoritas",
                "Menyerahkan sepenuhnya kepada atasan",
                "Mengabaikan perbedaan untuk efisiensi"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 2, 1).toJsonInt(),
            explanation = """
Mempertimbangkan aspirasi berbagai kelompok menunjukkan:
• Inklusivitas dalam kebijakan
• Keadilan sosial
• Pemahaman keragaman

Skor:
A (2) - Kurang sensitif
B (5) - Solusi terbaik ✓
C (1) - Tidak adil
D (2) - Tidak berinisiatif
E (1) - Tidak inklusif
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_114",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Rekan dari daerah lain kesulitan memahami bahasa lokal di kantor. Sikap Anda adalah...",
            options = listOf(
                "Membiarkannya belajar sendiri",
                "Membantu menerjemahkan dan mengajarkan bahasa lokal",
                "Menyuruhnya menggunakan bahasa Indonesia saja",
                "Mengabaikan dan berbicara bahasa lokal terus",
                "Mengkritiknya karena tidak bisa berbahasa lokal"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 3, 1, 1).toJsonInt(),
            explanation = """
Membantu menerjemahkan dan mengajarkan menunjukkan:
• Kepedulian terhadap rekan
• Memfasilitasi adaptasi
• Inklusivitas

Skor:
A (2) - Kurang membantu
B (5) - Solusi terbaik ✓
C (3) - Cukup tapi kurang personal
D (1) - Mengeksklusikan
E (1) - Tidak sopan
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_115",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Ada warga yang meminta pelayanan dengan menggunakan bahasa daerah yang tidak Anda pahami. Respons Anda adalah...",
            options = listOf(
                "Meminta warga berbicara bahasa Indonesia saja",
                "Meminta bantuan rekan yang memahami bahasa tersebut",
                "Mengabaikan dan melanjutkan dengan asumsi sendiri",
                "Menolak melayani karena kendala bahasa",
                "Menyuruh warga membawa penerjemah"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(3, 5, 1, 1, 2).toJsonInt(),
            explanation = """
Meminta bantuan rekan yang memahami bahasa menunjukkan:
• Orientasi pelayanan
• Memanfaatkan keberagaman tim
• Tidak menyulitkan warga

Skor:
A (3) - Cukup tapi kurang fleksibel
B (5) - Solusi terbaik ✓
C (1) - Berisiko salah
D (1) - Menolak melayani
E (2) - Menyulitkan warga
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_116",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Kantor mengadakan kegiatan bakti sosial ke daerah terpencil. Sikap Anda adalah...",
            options = listOf(
                "Tidak ikut karena bukan kewajiban",
                "Berpartisipasi aktif dan mengajak rekan lain",
                "Ikut jika diwajibkan saja",
                "Memberikan sumbangan tapi tidak ikut langsung",
                "Mengkritik kegiatan sebagai pemborosan anggaran"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 3, 1).toJsonInt(),
            explanation = """
Berpartisipasi aktif dan mengajak rekan menunjukkan:
• Kepedulian sosial
• Semangat gotong royong
• Inisiatif positif

Skor:
A (1) - Tidak peduli
B (5) - Solusi terbaik ✓
C (2) - Pasif
D (3) - Cukup baik
E (1) - Negatif
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_117",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Anda mendengar berita hoax yang menyerang kelompok tertentu. Tindakan Anda adalah...",
            options = listOf(
                "Menyebarkan untuk memperingatkan orang lain",
                "Tidak menyebarkan dan melakukan klarifikasi jika diperlukan",
                "Mengabaikan saja",
                "Mempercayai karena dari sumber yang dipercaya",
                "Menyimpan sebagai informasi pribadi"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 1, 2).toJsonInt(),
            explanation = """
Tidak menyebarkan dan melakukan klarifikasi menunjukkan:
• Sikap bijak bermedia sosial
• Anti hoax
• Menjaga kerukunan

Skor:
A (1) - Menyebarkan hoax
B (5) - Solusi terbaik ✓
C (2) - Pasif
D (1) - Tidak kritis
E (2) - Tidak bertindak
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_118",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Rekan Anda menolak bekerja sama dengan orang dari agama tertentu. Sikap Anda adalah...",
            options = listOf(
                "Mendukung karena itu haknya",
                "Menyarankan untuk bersikap profesional dan tidak diskriminatif",
                "Mengabaikan karena bukan urusan Anda",
                "Melaporkan ke atasan langsung",
                "Menjauhkan diri dari situasi tersebut"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 3, 1).toJsonInt(),
            explanation = """
Menyarankan untuk bersikap profesional dan tidak diskriminatif:
• Menegakkan nilai toleransi
• Mendidik tanpa mempermalukan
• Menjaga keharmonisan

Skor:
A (1) - Mendukung diskriminasi
B (5) - Solusi terbaik ✓
C (2) - Tidak peduli
D (3) - Eskalasi langsung
E (1) - Menghindar
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_119",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Kantor Anda menyelenggarakan peringatan hari nasional. Bagaimana partisipasi Anda?",
            options = listOf(
                "Hadir karena diwajibkan saja",
                "Berpartisipasi dengan antusias dan memahami makna peringatannya",
                "Tidak hadir karena menganggap tidak penting",
                "Hadir tapi tidak memperhatikan acara",
                "Mengkritik acara sebagai formalitas belaka"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 1, 1).toJsonInt(),
            explanation = """
Berpartisipasi antusias dan memahami makna menunjukkan:
• Nasionalisme
• Penghayatan terhadap sejarah bangsa
• Sikap positif

Skor:
A (2) - Formalitas
B (5) - Solusi terbaik ✓
C (1) - Tidak nasionalis
D (1) - Tidak menghargai
E (1) - Negatif
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_120",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Anda ditugaskan menyusun program yang melibatkan masyarakat adat. Pendekatan Anda adalah...",
            options = listOf(
                "Menyusun program sesuai standar tanpa konsultasi",
                "Melibatkan tokoh adat dalam perencanaan dan pelaksanaan",
                "Memberikan program yang sama dengan daerah lain",
                "Menyerahkan sepenuhnya kepada masyarakat adat",
                "Memaksa masyarakat adat mengikuti program modern"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Melibatkan tokoh adat dalam perencanaan menunjukkan:
• Penghormatan terhadap kearifan lokal
• Pendekatan partisipatif
• Sensitifitas budaya

Skor:
A (2) - Tidak partisipatif
B (5) - Solusi terbaik ✓
C (2) - Tidak sensitif
D (2) - Tidak bertanggung jawab
E (1) - Tidak menghargai
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_121",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Ada rekan yang mengundang Anda ke acara keagamaannya. Anda berbeda agama. Respons Anda adalah...",
            options = listOf(
                "Menolak karena berbeda agama",
                "Menghadiri sebagai bentuk penghormatan",
                "Mengirim perwakilan dengan alasan sibuk",
                "Menerima undangan tapi tidak hadir",
                "Mengkritik undangan lintas agama"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 1, 1).toJsonInt(),
            explanation = """
Menghadiri sebagai bentuk penghormatan menunjukkan:
• Toleransi beragama
• Menghargai undangan
• Mempererat hubungan

Skor:
A (1) - Intoleran
B (5) - Solusi terbaik ✓
C (2) - Kurang personal
D (1) - Tidak menghargai
E (1) - Intoleran
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_122",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Anda melihat konten SARA di media sosial dari akun rekan kerja. Tindakan Anda adalah...",
            options = listOf(
                "Menyukai dan menyebarkan karena lucu",
                "Mengingatkan secara pribadi bahwa konten tidak pantas",
                "Mengabaikan karena itu media sosial pribadinya",
                "Melaporkan ke platform media sosial saja",
                "Menyebarkan ke rekan lain untuk dibahas"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 3, 1).toJsonInt(),
            explanation = """
Mengingatkan secara pribadi menunjukkan:
• Kepedulian terhadap rekan
• Sikap anti SARA
• Pendekatan yang bijaksana

Skor:
A (1) - Mendukung SARA
B (5) - Solusi terbaik ✓
C (2) - Tidak peduli
D (3) - Alternatif baik
E (1) - Memperburuk
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_123",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Anda ditugaskan ke wilayah yang masyarakatnya konservatif. Bagaimana Anda beradaptasi?",
            options = listOf(
                "Memaksakan gaya hidup Anda sendiri",
                "Menyesuaikan diri dengan norma setempat sambil menjalankan tugas",
                "Meminta pindah tugas ke tempat lain",
                "Mengkritik nilai-nilai setempat yang dianggap kuno",
                "Mengisolasi diri dari masyarakat"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 1, 1, 1).toJsonInt(),
            explanation = """
Menyesuaikan diri dengan norma setempat menunjukkan:
• Fleksibilitas budaya
• Profesionalisme
• Penghormatan terhadap nilai lokal

Skor:
A (1) - Tidak adaptif
B (5) - Solusi terbaik ✓
C (1) - Tidak mau beradaptasi
D (1) - Tidak menghargai
E (1) - Isolasi
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_124",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Rekan kerja dari suku tertentu mendapat stereotip negatif dari beberapa rekan lain. Sikap Anda adalah...",
            options = listOf(
                "Ikut melabeli karena mungkin ada benarnya",
                "Membela rekan dan menjelaskan bahwa stereotip tidak benar",
                "Diam saja agar tidak terlibat",
                "Menasihati rekan tersebut untuk membuktikan stereotip salah",
                "Melaporkan ke atasan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 3).toJsonInt(),
            explanation = """
Membela dan menjelaskan stereotip tidak benar menunjukkan:
• Anti diskriminasi
• Keberanian moral
• Solidaritas

Skor:
A (1) - Diskriminatif
B (5) - Solusi terbaik ✓
C (2) - Tidak peduli
D (2) - Victim blaming
E (3) - Alternatif baik
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_125",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Kantor mengadakan potluck dengan makanan dari berbagai daerah. Bagaimana partisipasi Anda?",
            options = listOf(
                "Tidak ikut karena takut tidak cocok dengan makanannya",
                "Berpartisipasi dan mencoba makanan dari berbagai daerah",
                "Hanya membawa dan makan makanan sendiri",
                "Mengkritik makanan yang tidak sesuai selera",
                "Hadir tapi tidak mencoba makanan apapun"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 1, 2).toJsonInt(),
            explanation = """
Berpartisipasi dan mencoba berbagai makanan menunjukkan:
• Keterbukaan budaya
• Menghargai keragaman
• Semangat kebersamaan

Skor:
A (1) - Tertutup
B (5) - Solusi terbaik ✓
C (2) - Kurang terbuka
D (1) - Tidak menghargai
E (2) - Tidak partisipatif
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_126",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Ada perdebatan sengit tentang isu sensitif di grup chat kantor. Sikap Anda adalah...",
            options = listOf(
                "Ikut berdebat untuk menyuarakan pendapat",
                "Menyarankan diskusi dilakukan secara langsung dengan kepala dingin",
                "Keluar dari grup",
                "Melaporkan ke admin grup atau atasan",
                "Mengabaikan dan membiarkan debat berlanjut"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 3, 2).toJsonInt(),
            explanation = """
Menyarankan diskusi langsung dengan kepala dingin menunjukkan:
• Kebijaksanaan dalam berkomunikasi
• Mencegah eskalasi konflik
• Pendekatan konstruktif

Skor:
A (2) - Menambah konflik
B (5) - Solusi terbaik ✓
C (1) - Menghindar
D (3) - Alternatif baik
E (2) - Tidak bertindak
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_127",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Anda harus memberikan pelayanan kepada masyarakat yang memiliki kepercayaan lokal. Pendekatan Anda adalah...",
            options = listOf(
                "Mengabaikan kepercayaan mereka dan fokus pada prosedur",
                "Menghormati kepercayaan mereka sambil memberikan pelayanan",
                "Mencoba mengubah kepercayaan mereka",
                "Menolak melayani jika bertentangan dengan keyakinan Anda",
                "Memaksakan cara pandang modern"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 1, 1).toJsonInt(),
            explanation = """
Menghormati kepercayaan sambil memberikan pelayanan menunjukkan:
• Toleransi
• Profesionalisme
• Pelayanan yang inklusif

Skor:
A (2) - Kurang sensitif
B (5) - Solusi terbaik ✓
C (1) - Tidak menghargai
D (1) - Diskriminatif
E (1) - Tidak menghargai
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_128",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Rekan Anda mengeluh tentang perbedaan gaji antara pegawai lokal dan non-lokal. Respons Anda adalah...",
            options = listOf(
                "Mendukung dan ikut mengeluh",
                "Menjelaskan bahwa gaji didasarkan pada kompetensi, bukan asal daerah",
                "Mengabaikan keluhan tersebut",
                "Menyarankan dia melapor ke HR",
                "Ikut memanas-manasi situasi"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 3, 1).toJsonInt(),
            explanation = """
Menjelaskan dasar penggajian menunjukkan:
• Memberikan perspektif yang benar
• Mencegah prasangka
• Komunikasi yang konstruktif

Skor:
A (2) - Tidak konstruktif
B (5) - Solusi terbaik ✓
C (2) - Tidak responsif
D (3) - Alternatif baik
E (1) - Memperburuk
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_129",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Anda mendapat undangan pernikahan dengan adat yang sangat berbeda dari kebiasaan Anda. Sikap Anda adalah...",
            options = listOf(
                "Menolak hadir karena tidak familiar dengan adatnya",
                "Menghadiri dengan antusias dan mempelajari tradisi baru",
                "Hadir tapi tidak mengikuti tradisi adat",
                "Mengirim kado saja tanpa hadir",
                "Mengkritik tradisi yang dianggap aneh"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Menghadiri dan mempelajari tradisi baru menunjukkan:
• Keterbukaan budaya
• Menghormati undangan
• Semangat belajar

Skor:
A (1) - Tertutup
B (5) - Solusi terbaik ✓
C (2) - Kurang menghargai
D (2) - Kurang personal
E (1) - Tidak sopan
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_130",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Masyarakat di wilayah kerja Anda menolak program pemerintah karena bertentangan dengan adat. Tindakan Anda adalah...",
            options = listOf(
                "Memaksa pelaksanaan program",
                "Berdialog untuk mencari jalan tengah yang menghormati adat",
                "Melaporkan penolakan ke atasan tanpa upaya dialog",
                "Membatalkan program di wilayah tersebut",
                "Mengkritik masyarakat sebagai tidak kooperatif"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Berdialog untuk mencari jalan tengah menunjukkan:
• Pendekatan partisipatif
• Menghormati kearifan lokal
• Orientasi solusi

Skor:
A (1) - Otoriter
B (5) - Solusi terbaik ✓
C (2) - Tidak proaktif
D (2) - Menyerah
E (1) - Tidak menghargai
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_131",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Anda bekerja dalam tim dengan anggota lintas generasi (senior dan junior). Bagaimana menyikapi perbedaan perspektif?",
            options = listOf(
                "Mengikuti pendapat senior karena lebih berpengalaman",
                "Memfasilitasi diskusi untuk mengintegrasikan perspektif semua generasi",
                "Mengabaikan pendapat junior karena kurang pengalaman",
                "Membuat kelompok terpisah berdasarkan generasi",
                "Menghindari diskusi untuk mencegah konflik"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 1, 1).toJsonInt(),
            explanation = """
Memfasilitasi diskusi untuk mengintegrasikan perspektif menunjukkan:
• Menghargai semua kontribusi
• Kolaborasi intergenerasi
• Kepemimpinan inklusif

Skor:
A (2) - Bias senioritas
B (5) - Solusi terbaik ✓
C (1) - Meremehkan junior
D (1) - Memecah tim
E (1) - Menghindar
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_132",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Ada tradisi kantor yang menurut Anda sudah tidak relevan. Bagaimana menyikapinya?",
            options = listOf(
                "Langsung mengkritik dan meminta dihapus",
                "Menghormati tradisi sambil menyampaikan saran perbaikan jika tepat",
                "Menolak ikut tradisi tersebut",
                "Mengikuti dengan terpaksa tanpa komentar",
                "Membicarakan keburukan tradisi dengan rekan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Menghormati sambil menyampaikan saran perbaikan menunjukkan:
• Keseimbangan antara menghargai dan berkontribusi
• Komunikasi yang konstruktif
• Sikap dewasa

Skor:
A (2) - Terlalu frontal
B (5) - Solusi terbaik ✓
C (2) - Tidak kooperatif
D (2) - Pasif
E (1) - Tidak konstruktif
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_133",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Anda melihat postingan media sosial rekan yang merendahkan budaya tertentu. Tindakan Anda adalah...",
            options = listOf(
                "Menyukai dan berkomentar mendukung",
                "Mengingatkan secara pribadi bahwa postingan tidak pantas",
                "Melaporkan ke platform dan atasan",
                "Mengabaikan karena itu ruang pribadinya",
                "Screenshot dan bagikan ke grup untuk dibahas"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 3, 2, 1).toJsonInt(),
            explanation = """
Mengingatkan secara pribadi menunjukkan:
• Kepedulian terhadap rekan
• Menjaga kerukunan
• Pendekatan yang bijaksana

Skor:
A (1) - Mendukung intoleransi
B (5) - Solusi terbaik ✓
C (3) - Langsung eskalasi
D (2) - Tidak bertindak
E (1) - Mempermalukan
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_134",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Anda ditugaskan mengorganisir acara kantor yang melibatkan berbagai latar belakang. Pertimbangan Anda adalah...",
            options = listOf(
                "Mengikuti tradisi mayoritas saja",
                "Memastikan acara mengakomodasi keberagaman peserta",
                "Membuat acara netral tanpa unsur budaya apapun",
                "Memisahkan acara berdasarkan kelompok",
                "Menyerahkan sepenuhnya pada panitia"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 3, 1, 2).toJsonInt(),
            explanation = """
Memastikan acara mengakomodasi keberagaman menunjukkan:
• Inklusivitas
• Sensitivitas budaya
• Kemampuan organisasi

Skor:
A (2) - Tidak inklusif
B (5) - Solusi terbaik ✓
C (3) - Netral tapi kurang
D (1) - Segregatif
E (2) - Tidak bertanggung jawab
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_135",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Anda mendapat tugas di daerah yang memiliki konflik sosial di masa lalu. Bagaimana pendekatan Anda?",
            options = listOf(
                "Mengabaikan sejarah konflik dan fokus tugas",
                "Mempelajari konteks lokal dan membangun hubungan dengan semua pihak",
                "Memihak salah satu kelompok untuk keamanan",
                "Meminta pindah tugas ke tempat lain",
                "Menjaga jarak dengan semua kelompok"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 1, 2).toJsonInt(),
            explanation = """
Mempelajari konteks dan membangun hubungan dengan semua pihak menunjukkan:
• Sensitifitas terhadap sejarah lokal
• Pendekatan inklusif
• Profesionalisme

Skor:
A (2) - Tidak sensitif
B (5) - Solusi terbaik ✓
C (1) - Memperburuk konflik
D (1) - Menghindar
E (2) - Tidak membangun hubungan
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        )
    )
}
