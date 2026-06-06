package com.cpns.lolos.data.local.database

import com.cpns.lolos.data.local.entity.QuestionEntity
import com.google.gson.Gson

/**
 * TKP Questions Batch 4: Profesionalisme (30 questions)
 * Question IDs: tkp_136 - tkp_165
 */
object AdditionalTkpQuestions4 {

    private val gson = Gson()

    private fun List<String>.toJson(): String = gson.toJson(this)
    private fun List<Int>.toJsonInt(): String = gson.toJson(this)

    fun getQuestions(): List<QuestionEntity> = listOf(
        QuestionEntity(
            id = "tkp_136",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda diminta mengerjakan tugas yang bukan bidang keahlian Anda. Sikap Anda adalah...",
            options = listOf(
                "Menolak karena bukan bidang Anda",
                "Menerima dan berusaha belajar untuk menyelesaikannya",
                "Menerima tapi delegasikan ke orang lain",
                "Mengerjakan seadanya tanpa usaha belajar",
                "Mengeluh kepada rekan tentang penugasan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 1, 1).toJsonInt(),
            explanation = """
Menerima dan berusaha belajar menunjukkan:
• Kemauan untuk berkembang
• Fleksibilitas dalam bekerja
• Sikap profesional

Skor:
A (1) - Tidak fleksibel
B (5) - Solusi terbaik ✓
C (2) - Tidak bertanggung jawab
D (1) - Tidak profesional
E (1) - Tidak konstruktif
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_137",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda menemukan kesalahan dalam pekerjaan yang sudah Anda serahkan ke atasan. Tindakan Anda adalah...",
            options = listOf(
                "Diam saja dan berharap tidak ditemukan",
                "Segera melapor dan memperbaiki kesalahan",
                "Menyalahkan data yang diberikan",
                "Menunggu atasan menemukan baru memperbaiki",
                "Meminta rekan menutupi kesalahan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 1, 2, 1).toJsonInt(),
            explanation = """
Segera melapor dan memperbaiki menunjukkan:
• Kejujuran
• Tanggung jawab
• Integritas profesional

Skor:
A (1) - Tidak jujur
B (5) - Solusi terbaik ✓
C (1) - Menyalahkan orang lain
D (2) - Reaktif, tidak proaktif
E (1) - Tidak jujur
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_138",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Deadline pekerjaan Anda bertabrakan dengan acara pribadi penting. Bagaimana Anda menyikapinya?",
            options = listOf(
                "Mengutamakan acara pribadi dan menunda pekerjaan",
                "Mengatur waktu agar keduanya bisa terpenuhi",
                "Meminta rekan mengerjakan pekerjaan Anda",
                "Membatalkan acara pribadi sepenuhnya",
                "Mengerjakan pekerjaan dengan asal-asalan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 3, 1).toJsonInt(),
            explanation = """
Mengatur waktu agar keduanya terpenuhi menunjukkan:
• Manajemen waktu yang baik
• Keseimbangan kerja dan kehidupan
• Perencanaan yang matang

Skor:
A (1) - Tidak profesional
B (5) - Solusi terbaik ✓
C (2) - Tidak bertanggung jawab
D (3) - Baik tapi tidak seimbang
E (1) - Tidak bertanggung jawab
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_139",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda mendapat teguran dari atasan atas pekerjaan Anda. Respons Anda adalah...",
            options = listOf(
                "Membela diri dengan berbagai alasan",
                "Menerima dengan lapang dada dan berkomitmen memperbaiki",
                "Diam tapi menyimpan kekesalan",
                "Membicarakan teguran ke rekan lain",
                "Menyalahkan atasan yang tidak jelas memberikan instruksi"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 1, 1).toJsonInt(),
            explanation = """
Menerima dengan lapang dada dan berkomitmen memperbaiki:
• Kedewasaan dalam menerima kritik
• Orientasi perbaikan diri
• Sikap profesional

Skor:
A (2) - Defensif
B (5) - Solusi terbaik ✓
C (2) - Tidak sehat
D (1) - Tidak profesional
E (1) - Menyalahkan atasan
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_140",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda diminta lembur di hari libur untuk menyelesaikan pekerjaan mendesak. Sikap Anda adalah...",
            options = listOf(
                "Menolak karena itu hak libur Anda",
                "Bersedia membantu dengan pertimbangan kepentingan bersama",
                "Menerima tapi meminta kompensasi berlebihan",
                "Hadir tapi bekerja tidak maksimal",
                "Menyuruh rekan lain yang belum ada jadwal libur"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 1, 2).toJsonInt(),
            explanation = """
Bersedia membantu dengan pertimbangan kepentingan bersama:
• Loyalitas pada organisasi
• Memahami urgensi
• Sikap kooperatif

Skor:
A (2) - Kurang fleksibel
B (5) - Solusi terbaik ✓
C (2) - Transaksional
D (1) - Tidak profesional
E (2) - Mengalihkan tanggung jawab
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_141",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda mengetahui ada kebijakan baru yang tidak menguntungkan Anda secara pribadi. Respons Anda adalah...",
            options = listOf(
                "Menolak dan memprotes keras",
                "Menerima dan menjalankan sesuai aturan yang berlaku",
                "Mencari celah untuk tidak mengikuti",
                "Menyebarkan ketidakpuasan ke rekan lain",
                "Mengabaikan kebijakan tersebut"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 1, 1).toJsonInt(),
            explanation = """
Menerima dan menjalankan sesuai aturan menunjukkan:
• Kepatuhan pada kebijakan
• Profesionalisme
• Kedewasaan bersikap

Skor:
A (2) - Tidak konstruktif
B (5) - Solusi terbaik ✓
C (1) - Tidak patuh
D (1) - Mempengaruhi negatif
E (1) - Tidak patuh
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_142",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Rekan Anda sering meminta bantuan untuk pekerjaannya. Bagaimana Anda menyikapinya?",
            options = listOf(
                "Menolak semua permintaan bantuan",
                "Membantu sambil mengajarkan agar dia bisa mandiri",
                "Membantu terus tanpa mengajarkan",
                "Melaporkan ke atasan tentang kinerjanya",
                "Meminta imbalan setiap kali membantu"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Membantu sambil mengajarkan menunjukkan:
• Orientasi pengembangan
• Solidaritas yang produktif
• Tidak menciptakan ketergantungan

Skor:
A (1) - Tidak solidaritas
B (5) - Solusi terbaik ✓
C (2) - Tidak mendidik
D (2) - Kurang pembinaan
E (1) - Transaksional
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_143",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda merasa jenuh dengan pekerjaan rutin yang monoton. Bagaimana Anda mengatasinya?",
            options = listOf(
                "Mengerjakan dengan malas-malasan",
                "Mencari cara untuk membuat pekerjaan lebih efisien dan menarik",
                "Meminta pindah tugas ke bagian lain",
                "Mengeluh kepada rekan dan atasan",
                "Mencari pekerjaan di tempat lain"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Mencari cara untuk membuat pekerjaan lebih efisien menunjukkan:
• Kreativitas
• Sikap positif
• Orientasi perbaikan

Skor:
A (1) - Tidak profesional
B (5) - Solusi terbaik ✓
C (2) - Menghindar
D (2) - Tidak konstruktif
E (1) - Tidak loyal
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_144",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Atasan memberikan instruksi yang menurut Anda kurang tepat. Sikap Anda adalah...",
            options = listOf(
                "Menolak mengerjakan karena tidak setuju",
                "Menyampaikan pandangan dengan sopan lalu mengikuti keputusan atasan",
                "Mengerjakan sambil mengkritik di belakang",
                "Mengerjakan dengan setengah hati",
                "Melaporkan ke atasan yang lebih tinggi"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 1, 1, 2).toJsonInt(),
            explanation = """
Menyampaikan pandangan lalu mengikuti keputusan atasan:
• Komunikasi yang asertif
• Menghormati hierarki
• Profesionalisme

Skor:
A (1) - Tidak patuh
B (5) - Solusi terbaik ✓
C (1) - Tidak loyal
D (1) - Tidak profesional
E (2) - Eskalasi langsung
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_145",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda diberi tanggung jawab lebih besar tanpa kenaikan gaji. Respons Anda adalah...",
            options = listOf(
                "Menolak tanggung jawab tambahan",
                "Menerima sebagai kesempatan pengembangan diri",
                "Menerima tapi terus menuntut kenaikan gaji",
                "Mengerjakan seadanya karena tidak sesuai bayaran",
                "Membicarakan ketidakadilan ke rekan lain"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 1, 1).toJsonInt(),
            explanation = """
Menerima sebagai kesempatan pengembangan diri menunjukkan:
• Perspektif jangka panjang
• Sikap positif
• Orientasi pengembangan karir

Skor:
A (2) - Tidak berambisi
B (5) - Solusi terbaik ✓
C (2) - Transaksional
D (1) - Tidak profesional
E (1) - Tidak konstruktif
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_146",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda ditugaskan ke proyek yang sebelumnya gagal. Bagaimana pendekatan Anda?",
            options = listOf(
                "Menolak karena takut gagal lagi",
                "Menganalisis penyebab kegagalan dan menyusun strategi baru",
                "Menerima dengan pesimis",
                "Menyalahkan tim sebelumnya yang gagal",
                "Mengerjakan dengan cara yang sama"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 1, 1).toJsonInt(),
            explanation = """
Menganalisis dan menyusun strategi baru menunjukkan:
• Pembelajaran dari kegagalan
• Pendekatan analitis
• Orientasi solusi

Skor:
A (1) - Tidak berani
B (5) - Solusi terbaik ✓
C (2) - Tidak optimis
D (1) - Menyalahkan
E (1) - Tidak belajar
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_147",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Ada kesempatan pelatihan tapi jadwalnya berbenturan dengan pekerjaan. Sikap Anda adalah...",
            options = listOf(
                "Meninggalkan pekerjaan untuk pelatihan",
                "Berkoordinasi dengan atasan untuk mengatur jadwal",
                "Menolak pelatihan karena pekerjaan lebih penting",
                "Meminta rekan menggantikan tanpa koordinasi",
                "Hadir pelatihan tapi tidak mengikuti dengan serius"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Berkoordinasi dengan atasan untuk mengatur jadwal:
• Manajemen prioritas yang baik
• Mengikuti prosedur
• Keseimbangan tugas dan pengembangan

Skor:
A (2) - Tidak bertanggung jawab
B (5) - Solusi terbaik ✓
C (2) - Tidak berorientasi pengembangan
D (2) - Tidak koordinasi
E (1) - Tidak serius
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_148",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda diberi tugas yang biasanya dikerjakan pegawai level di atas Anda. Respons Anda adalah...",
            options = listOf(
                "Menolak karena bukan level Anda",
                "Menerima sebagai kesempatan membuktikan kemampuan",
                "Meminta tambahan kompensasi dulu",
                "Menerima tapi selalu bertanya untuk setiap hal kecil",
                "Mengerjakan dengan tidak serius karena bukan tugas seharusnya"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Menerima sebagai kesempatan membuktikan kemampuan:
• Sikap positif terhadap tantangan
• Ambisi yang sehat
• Kemauan berkembang

Skor:
A (1) - Tidak berambisi
B (5) - Solusi terbaik ✓
C (2) - Transaksional
D (2) - Tidak percaya diri
E (1) - Tidak profesional
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_149",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda merasa kontribusi Anda tidak diapresiasi oleh atasan. Bagaimana Anda menyikapinya?",
            options = listOf(
                "Mengurangi kontribusi Anda",
                "Tetap bekerja profesional sambil mencari kesempatan berkomunikasi",
                "Mengeluh kepada rekan-rekan",
                "Meminta pengakuan secara langsung",
                "Mencari pekerjaan di tempat lain"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Tetap profesional sambil berkomunikasi menunjukkan:
• Kedewasaan emosional
• Tidak mempengaruhi kinerja
• Komunikasi yang tepat

Skor:
A (1) - Tidak profesional
B (5) - Solusi terbaik ✓
C (2) - Tidak konstruktif
D (2) - Kurang bijaksana
E (1) - Tidak loyal
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_150",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda sakit ringan tapi ada deadline penting hari ini. Tindakan Anda adalah...",
            options = listOf(
                "Tidak masuk dan membiarkan deadline terlewat",
                "Tetap bekerja dengan penyesuaian dan berkomunikasi dengan tim",
                "Memaksa masuk meski sangat tidak fit",
                "Meminta deadline diperpanjang tanpa mencoba",
                "Delegasikan semua ke rekan tanpa koordinasi"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 2).toJsonInt(),
            explanation = """
Tetap bekerja dengan penyesuaian dan berkomunikasi:
• Tanggung jawab terhadap deadline
• Menjaga kesehatan tetap
• Komunikasi yang baik

Skor:
A (1) - Tidak bertanggung jawab
B (5) - Solusi terbaik ✓
C (2) - Tidak bijaksana
D (2) - Kurang usaha
E (2) - Tidak koordinasi
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_151",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda mendapat tawaran pekerjaan dengan gaji lebih tinggi saat proyek penting sedang berjalan. Sikap Anda adalah...",
            options = listOf(
                "Langsung menerima dan resign",
                "Mempertimbangkan dengan matang dan menyelesaikan tanggung jawab dulu",
                "Menggunakan tawaran untuk menegosiasi kenaikan gaji",
                "Menolak karena tidak mau meninggalkan proyek",
                "Menerima tapi tidak menyelesaikan proyek"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 3, 3, 1).toJsonInt(),
            explanation = """
Mempertimbangkan matang dan menyelesaikan tanggung jawab:
• Etika profesional
• Tidak meninggalkan tanggung jawab
• Keputusan yang bijaksana

Skor:
A (1) - Tidak profesional
B (5) - Solusi terbaik ✓
C (3) - Bisa diterima
D (3) - Terlalu loyal
E (1) - Tidak bertanggung jawab
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_152",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda diminta mempresentasikan hasil kerja tim padahal Anda bukan yang paling berkontribusi. Sikap Anda adalah...",
            options = listOf(
                "Menolak dan meminta yang berkontribusi lebih yang presentasi",
                "Menerima dan menyebutkan kontribusi seluruh anggota tim",
                "Menerima dan mengklaim sebagai hasil kerja Anda",
                "Menolak karena tidak percaya diri",
                "Menerima tapi menyebutkan bahwa bukan hasil kerja Anda"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(3, 5, 1, 2, 3).toJsonInt(),
            explanation = """
Menerima dan menyebutkan kontribusi seluruh anggota:
• Kejujuran
• Menghargai kontribusi tim
• Profesionalisme

Skor:
A (3) - Alternatif baik
B (5) - Solusi terbaik ✓
C (1) - Tidak jujur
D (2) - Tidak percaya diri
E (3) - Terlalu defensif
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_153",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda mendapat feedback negatif dari stakeholder eksternal. Respons Anda adalah...",
            options = listOf(
                "Membela diri dan menyalahkan kondisi",
                "Menerima dengan profesional dan mencari solusi perbaikan",
                "Mengabaikan karena mereka tidak paham kondisi internal",
                "Melaporkan ke atasan sebagai keluhan stakeholder",
                "Membalas dengan feedback negatif tentang mereka"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 3, 1).toJsonInt(),
            explanation = """
Menerima dengan profesional dan mencari solusi:
• Orientasi perbaikan
• Tidak defensif
• Profesionalisme

Skor:
A (2) - Defensif
B (5) - Solusi terbaik ✓
C (1) - Mengabaikan feedback
D (3) - Alternatif baik
E (1) - Tidak profesional
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_154",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda harus bekerja dengan teknologi baru yang tidak Anda kuasai. Langkah Anda adalah...",
            options = listOf(
                "Menolak dan meminta tugas lain",
                "Belajar secara mandiri dan meminta bimbingan jika diperlukan",
                "Menyuruh rekan yang paham untuk mengerjakan",
                "Mengerjakan dengan cara lama yang dikuasai",
                "Meminta penundaan sampai ada pelatihan resmi"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 2).toJsonInt(),
            explanation = """
Belajar mandiri dan meminta bimbingan menunjukkan:
• Inisiatif belajar
• Tidak menyerah pada keterbatasan
• Adaptabilitas

Skor:
A (1) - Tidak mau belajar
B (5) - Solusi terbaik ✓
C (2) - Tidak bertanggung jawab
D (2) - Tidak adaptif
E (2) - Pasif
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_155",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda diminta menghadiri rapat di luar jam kerja untuk urusan penting. Respons Anda adalah...",
            options = listOf(
                "Menolak karena di luar jam kerja",
                "Menghadiri dengan memahami pentingnya rapat tersebut",
                "Meminta kompensasi waktu sebelum menyetujui",
                "Hadir tapi tidak berpartisipasi aktif",
                "Menyuruh rekan lain menggantikan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 1, 2).toJsonInt(),
            explanation = """
Menghadiri dengan memahami pentingnya menunjukkan:
• Dedikasi pada pekerjaan
• Fleksibilitas
• Memahami prioritas

Skor:
A (2) - Kurang fleksibel
B (5) - Solusi terbaik ✓
C (2) - Transaksional
D (1) - Tidak profesional
E (2) - Tidak bertanggung jawab
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_156",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda menemukan proses kerja yang bisa diperbaiki untuk lebih efisien. Tindakan Anda adalah...",
            options = listOf(
                "Diam saja karena bukan tugas Anda memperbaiki proses",
                "Menyampaikan usulan perbaikan kepada atasan",
                "Langsung mengubah proses tanpa persetujuan",
                "Membicarakan dengan rekan untuk mencari dukungan dulu",
                "Mengkritik proses yang ada di forum terbuka"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 3, 1).toJsonInt(),
            explanation = """
Menyampaikan usulan perbaikan kepada atasan:
• Inisiatif perbaikan
• Mengikuti prosedur
• Kontribusi konstruktif

Skor:
A (1) - Tidak berinisiatif
B (5) - Solusi terbaik ✓
C (2) - Tidak koordinasi
D (3) - Alternatif baik
E (1) - Tidak konstruktif
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_157",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda merasa beban kerja Anda lebih berat dari rekan lain. Bagaimana Anda menyikapinya?",
            options = listOf(
                "Mengeluh dan meminta pengurangan tugas",
                "Berkomunikasi dengan atasan tentang pembagian tugas secara profesional",
                "Mengerjakan seadanya karena kelelahan",
                "Membandingkan dengan rekan di depan atasan",
                "Menolak tugas tambahan tanpa diskusi"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 1, 2).toJsonInt(),
            explanation = """
Berkomunikasi dengan atasan secara profesional:
• Komunikasi yang tepat
• Tidak mengeluh tanpa solusi
• Profesionalisme

Skor:
A (2) - Kurang profesional
B (5) - Solusi terbaik ✓
C (1) - Tidak bertanggung jawab
D (1) - Tidak profesional
E (2) - Tidak komunikatif
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_158",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda memiliki ide inovatif tapi atasan tidak tertarik. Langkah Anda adalah...",
            options = listOf(
                "Menyerah dan tidak menyampaikan ide lagi",
                "Mencari waktu yang tepat untuk menyampaikan dengan data pendukung",
                "Menjalankan ide tersebut tanpa persetujuan",
                "Mengkritik atasan yang tidak inovatif",
                "Menyampaikan ide ke atasan yang lebih tinggi"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 1, 2).toJsonInt(),
            explanation = """
Mencari waktu tepat dengan data pendukung:
• Persistensi yang bijaksana
• Pendekatan yang lebih baik
• Tidak menyerah begitu saja

Skor:
A (2) - Menyerah
B (5) - Solusi terbaik ✓
C (1) - Tidak koordinasi
D (1) - Tidak profesional
E (2) - Eskalasi langsung
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_159",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda ditugaskan di unit yang tidak sesuai dengan latar belakang pendidikan Anda. Sikap Anda adalah...",
            options = listOf(
                "Meminta pindah ke unit yang sesuai",
                "Menerima dan berusaha menguasai bidang baru",
                "Mengerjakan dengan malas karena tidak sesuai passion",
                "Mengeluh kepada atasan dan rekan",
                "Hanya mengerjakan tugas minimal"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 1, 1).toJsonInt(),
            explanation = """
Menerima dan berusaha menguasai bidang baru:
• Fleksibilitas
• Kemauan belajar
• Profesionalisme

Skor:
A (2) - Kurang adaptif
B (5) - Solusi terbaik ✓
C (1) - Tidak profesional
D (1) - Tidak konstruktif
E (1) - Tidak bertanggung jawab
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_160",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda baru saja selesai mengerjakan tugas besar. Langkah selanjutnya adalah...",
            options = listOf(
                "Istirahat panjang karena lelah",
                "Mengevaluasi hasil dan menyiapkan tugas berikutnya",
                "Menunggu instruksi tugas selanjutnya",
                "Membanggakan hasil kerja ke semua orang",
                "Meminta cuti sebagai reward"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 1, 2).toJsonInt(),
            explanation = """
Mengevaluasi dan menyiapkan tugas berikutnya:
• Kontinuitas kerja
• Evaluasi mandiri
• Proaktif

Skor:
A (2) - Tidak proaktif
B (5) - Solusi terbaik ✓
C (2) - Pasif
D (1) - Sombong
E (2) - Kurang tepat
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_161",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda mengalami kesulitan teknis dalam pekerjaan. Tindakan Anda adalah...",
            options = listOf(
                "Diam dan berharap masalah selesai sendiri",
                "Mencoba mencari solusi lalu meminta bantuan jika perlu",
                "Langsung minta bantuan tanpa mencoba dulu",
                "Menyerah dan menunggu orang lain menyelesaikan",
                "Menyalahkan sistem yang tidak berfungsi"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 3, 1, 1).toJsonInt(),
            explanation = """
Mencoba mencari solusi lalu meminta bantuan:
• Inisiatif problem solving
• Tidak langsung menyerah
• Tahu kapan harus minta bantuan

Skor:
A (1) - Pasif
B (5) - Solusi terbaik ✓
C (3) - Kurang inisiatif
D (1) - Menyerah
E (1) - Menyalahkan
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_162",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda mendapat kesempatan promosi tapi harus pindah ke daerah terpencil. Respons Anda adalah...",
            options = listOf(
                "Menolak karena tidak mau pindah",
                "Mempertimbangkan dengan matang sebagai bagian pengembangan karir",
                "Menerima dengan berat hati",
                "Menegosiasikan untuk tidak pindah",
                "Meminta promosi yang tidak perlu pindah"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 3, 2, 2).toJsonInt(),
            explanation = """
Mempertimbangkan matang sebagai pengembangan karir:
• Perspektif jangka panjang
• Mempertimbangkan semua aspek
• Keputusan yang bijaksana

Skor:
A (2) - Kurang berambisi
B (5) - Solusi terbaik ✓
C (3) - Tidak sepenuh hati
D (2) - Kurang fleksibel
E (2) - Tidak realistis
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_163",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda sedang fokus mengerjakan tugas penting, tiba-tiba ada rekan yang mengajak ngobrol. Respons Anda adalah...",
            options = listOf(
                "Mengabaikan dan tidak merespons sama sekali",
                "Merespons singkat dan menjelaskan sedang fokus bekerja",
                "Ikut ngobrol sampai selesai",
                "Memarahi karena mengganggu",
                "Pindah tempat duduk untuk menghindari"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 1, 2).toJsonInt(),
            explanation = """
Merespons singkat dan menjelaskan sedang fokus:
• Komunikasi yang sopan
• Tetap fokus pada tugas
• Menghargai rekan

Skor:
A (1) - Tidak sopan
B (5) - Solusi terbaik ✓
C (2) - Tidak fokus
D (1) - Tidak profesional
E (2) - Menghindar
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_164",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Atasan meminta Anda menyelesaikan pekerjaan yang tidak mungkin selesai tepat waktu. Sikap Anda adalah...",
            options = listOf(
                "Menerima tanpa menyampaikan kendala",
                "Menyampaikan kendala dengan alternatif solusi atau perpanjangan waktu",
                "Menolak dengan alasan tidak mungkin",
                "Menerima tapi menyerahkan pekerjaan yang tidak selesai",
                "Meminta rekan lain dilibatkan tanpa koordinasi"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 1, 2).toJsonInt(),
            explanation = """
Menyampaikan kendala dengan alternatif solusi:
• Komunikasi yang jujur
• Berorientasi solusi
• Profesionalisme

Skor:
A (2) - Tidak realistis
B (5) - Solusi terbaik ✓
C (2) - Terlalu defensif
D (1) - Tidak bertanggung jawab
E (2) - Tidak koordinasi
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_165",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda melihat ada peluang efisiensi anggaran di unit Anda. Tindakan Anda adalah...",
            options = listOf(
                "Diam saja karena bukan tupoksi Anda",
                "Menyampaikan ke atasan dengan data dan usulan konkret",
                "Langsung mengimplementasikan perubahan",
                "Membicarakan dengan rekan tanpa tindak lanjut",
                "Mengkritik penggunaan anggaran saat ini"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Menyampaikan dengan data dan usulan konkret:
• Inisiatif yang konstruktif
• Mengikuti prosedur
• Kontribusi positif

Skor:
A (1) - Tidak berinisiatif
B (5) - Solusi terbaik ✓
C (2) - Tidak koordinasi
D (2) - Tidak ada tindakan
E (1) - Tidak konstruktif
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        )
    )
}
