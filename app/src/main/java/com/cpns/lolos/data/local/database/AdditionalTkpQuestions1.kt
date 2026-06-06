package com.cpns.lolos.data.local.database

import com.cpns.lolos.data.local.entity.QuestionEntity
import com.google.gson.Gson

/**
 * TKP Questions Batch 1: Pelayanan Publik (30 questions)
 * Question IDs: tkp_046 - tkp_075
 */
object AdditionalTkpQuestions1 {

    private val gson = Gson()

    private fun List<String>.toJson(): String = gson.toJson(this)
    private fun List<Int>.toJsonInt(): String = gson.toJson(this)

    fun getQuestions(): List<QuestionEntity> = listOf(
        QuestionEntity(
            id = "tkp_046",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Anda sedang melayani masyarakat, tiba-tiba atasan memanggil untuk rapat mendadak. Apa yang Anda lakukan?",
            options = listOf(
                "Langsung meninggalkan pelayanan untuk menghadiri rapat",
                "Mengabaikan panggilan atasan dan melanjutkan pelayanan",
                "Meminta izin kepada atasan untuk menyelesaikan pelayanan terlebih dahulu",
                "Menyuruh masyarakat untuk menunggu tanpa penjelasan",
                "Meminta rekan menggantikan sambil menjelaskan kepada masyarakat"
            ).toJson(),
            correctAnswer = 4,
            tkpScores = listOf(2, 2, 4, 1, 5).toJsonInt(),
            explanation = """
Meminta rekan menggantikan sambil menjelaskan kepada masyarakat adalah pilihan terbaik karena:
• Menjamin kelangsungan pelayanan
• Menghormati panggilan atasan
• Berkomunikasi dengan baik kepada masyarakat

Skor:
A (2) - Mengabaikan masyarakat
B (2) - Tidak menghormati atasan
C (4) - Baik, tapi mungkin menunda rapat
D (1) - Tidak profesional
E (5) - Solusi terbaik ✓
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_047",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Seorang warga lanjut usia kesulitan mengisi formulir pelayanan. Sikap Anda adalah...",
            options = listOf(
                "Menyuruhnya membawa orang yang lebih muda untuk membantu",
                "Membantu mengisi formulir dengan sabar dan teliti",
                "Memberikan contoh pengisian dan membiarkan dia mengisi sendiri",
                "Meminta nomor antrean berikutnya karena dia terlalu lama",
                "Mengarahkan ke bagian informasi"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 3, 1, 2).toJsonInt(),
            explanation = """
Membantu mengisi dengan sabar dan teliti menunjukkan:
• Pelayanan yang inklusif
• Empati terhadap kelompok rentan
• Profesionalisme pelayanan publik

Skor:
A (2) - Mengalihkan tanggung jawab
B (5) - Solusi terbaik ✓
C (3) - Kurang membantu
D (1) - Tidak berempati
E (2) - Mengalihkan tanggung jawab
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_048",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Sistem pelayanan online sedang error dan banyak warga mengeluh. Apa tindakan Anda?",
            options = listOf(
                "Menyalahkan tim IT atas masalah tersebut",
                "Meminta maaf dan memberikan alternatif pelayanan manual sementara",
                "Menutup loket dan menunggu sistem normal",
                "Menyuruh warga datang lagi besok",
                "Mengabaikan keluhan karena bukan kesalahan Anda"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Meminta maaf dan memberikan alternatif adalah tindakan terbaik:
• Menunjukkan tanggung jawab
• Berorientasi pada solusi
• Menjaga kepuasan masyarakat

Skor:
A (1) - Menyalahkan pihak lain
B (5) - Solusi terbaik ✓
C (2) - Tidak solutif
D (2) - Menunda masalah
E (1) - Tidak bertanggung jawab
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_049",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Warga meminta pelayanan di luar jam kerja karena kondisi darurat. Anda akan...",
            options = listOf(
                "Menolak dengan tegas karena sudah di luar jam kerja",
                "Membantu semampunya meski di luar jam kerja",
                "Menyuruhnya datang besok pagi",
                "Memberikan nomor kontak darurat instansi lain",
                "Berkonsultasi dengan atasan untuk mendapat izin membantu"
            ).toJson(),
            correctAnswer = 4,
            tkpScores = listOf(1, 4, 1, 3, 5).toJsonInt(),
            explanation = """
Berkonsultasi dengan atasan adalah pilihan terbaik:
• Mengikuti prosedur yang benar
• Tetap responsif terhadap kebutuhan darurat
• Tidak mengambil keputusan sendiri

Skor:
A (1) - Tidak berempati
B (4) - Baik, tapi tanpa izin
C (1) - Mengabaikan kedaruratan
D (3) - Membantu sebagian
E (5) - Solusi terbaik ✓
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_050",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Anda menemukan kesalahan pada dokumen yang sudah diproses untuk warga. Langkah Anda adalah...",
            options = listOf(
                "Membiarkannya karena sudah terlanjur diproses",
                "Menghubungi warga dan memperbaiki kesalahan dengan segera",
                "Menyalahkan petugas sebelumnya yang membuat kesalahan",
                "Menunggu warga komplain baru diperbaiki",
                "Melapor atasan tanpa tindakan perbaikan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 1, 2, 3).toJsonInt(),
            explanation = """
Menghubungi warga dan memperbaiki adalah sikap terbaik:
• Proaktif menyelesaikan masalah
• Jujur dan bertanggung jawab
• Mengutamakan kepentingan masyarakat

Skor:
A (1) - Tidak bertanggung jawab
B (5) - Solusi terbaik ✓
C (1) - Menyalahkan orang lain
D (2) - Reaktif, tidak proaktif
E (3) - Kurang inisiatif
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_051",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Seorang warga dengan disabilitas membutuhkan pelayanan khusus. Apa yang Anda lakukan?",
            options = listOf(
                "Memperlakukannya sama seperti warga lain tanpa perlakuan khusus",
                "Menyediakan fasilitas dan pendampingan sesuai kebutuhannya",
                "Menyuruhnya datang dengan pendamping",
                "Mendahulukan antreannya tanpa penjelasan ke yang lain",
                "Mengarahkan ke instansi khusus disabilitas"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 3, 1).toJsonInt(),
            explanation = """
Menyediakan fasilitas dan pendampingan adalah sikap inklusif:
• Memahami kebutuhan khusus
• Pelayanan yang berkeadilan
• Sesuai UU penyandang disabilitas

Skor:
A (2) - Kurang memahami kebutuhan
B (5) - Solusi terbaik ✓
C (2) - Mengalihkan tanggung jawab
D (3) - Baik tapi bisa salah paham
E (1) - Mengalihkan tanggung jawab
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_052",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Warga meminta informasi yang bukan kewenangan unit Anda. Sikap Anda adalah...",
            options = listOf(
                "Menolak memberikan informasi",
                "Memberikan informasi seadanya meski tidak yakin benar",
                "Mengarahkan ke unit yang berwenang dengan informasi lengkap",
                "Menyuruhnya mencari sendiri di website",
                "Membantu mencarikan informasi dari internet"
            ).toJson(),
            correctAnswer = 2,
            tkpScores = listOf(1, 2, 5, 2, 3).toJsonInt(),
            explanation = """
Mengarahkan ke unit berwenang dengan informasi lengkap:
• Bertanggung jawab meski bukan kewenangan
• Memastikan warga mendapat jawaban tepat
• Kolaborasi antar unit

Skor:
A (1) - Tidak membantu
B (2) - Berisiko salah informasi
C (5) - Solusi terbaik ✓
D (2) - Kurang membantu
E (3) - Baik tapi tidak resmi
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_053",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Antrean sangat panjang dan Anda satu-satunya petugas yang hadir. Apa yang Anda lakukan?",
            options = listOf(
                "Melayani dengan kecepatan biasa seperti tidak ada masalah",
                "Meminta bantuan rekan dari unit lain dan mempercepat pelayanan",
                "Menutup antrean dan meminta mereka datang besok",
                "Mempercepat pelayanan dengan mengurangi tahapan prosedur",
                "Menyalahkan rekan yang tidak masuk"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 2, 1).toJsonInt(),
            explanation = """
Meminta bantuan dan mempercepat pelayanan adalah solusi terbaik:
• Inisiatif mencari solusi
• Kerja sama tim
• Tetap mengikuti prosedur

Skor:
A (2) - Kurang responsif
B (5) - Solusi terbaik ✓
C (1) - Tidak solutif
D (2) - Melanggar prosedur
E (1) - Tidak konstruktif
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_054",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Warga menyampaikan kritik keras tentang pelayanan di instansi Anda. Respons Anda adalah...",
            options = listOf(
                "Membela diri dan menjelaskan bahwa prosedur sudah benar",
                "Mendengarkan dengan seksama dan mencatat sebagai masukan",
                "Mengabaikan karena kritik tidak membangun",
                "Meminta warga menyampaikan kritik tertulis saja",
                "Mengarahkan warga ke kotak saran"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 3, 3).toJsonInt(),
            explanation = """
Mendengarkan dan mencatat sebagai masukan menunjukkan:
• Keterbukaan terhadap kritik
• Sikap profesional
• Orientasi perbaikan berkelanjutan

Skor:
A (2) - Defensif
B (5) - Solusi terbaik ✓
C (1) - Tidak responsif
D (3) - Birokratis
E (3) - Kurang personal
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_055",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Anda mengetahui ada petugas lain yang meminta uang tambahan kepada warga. Tindakan Anda adalah...",
            options = listOf(
                "Mendiamkan saja karena bukan urusan Anda",
                "Melaporkan ke atasan atau saluran pengaduan yang tersedia",
                "Menegur langsung di depan warga",
                "Membicarakannya dengan rekan lain dulu",
                "Menasihati secara pribadi tanpa melapor"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 3).toJsonInt(),
            explanation = """
Melaporkan ke atasan/saluran pengaduan adalah sikap berintegritas:
• Menegakkan aturan
• Anti korupsi
• Berani bertindak benar

Skor:
A (1) - Membiarkan pelanggaran
B (5) - Solusi terbaik ✓
C (2) - Tidak bijaksana
D (2) - Menunda penanganan
E (3) - Kurang tegas
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_056",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Warga datang terlambat beberapa menit dari jam pelayanan. Dokumennya sangat mendesak. Sikap Anda adalah...",
            options = listOf(
                "Menolak karena sudah melewati jam pelayanan",
                "Membantu dengan mempertimbangkan urgensi dan kondisi",
                "Menyuruhnya datang besok pagi-pagi",
                "Meminta atasan untuk memutuskan",
                "Memberikan formulir untuk diisi di rumah"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 3, 2).toJsonInt(),
            explanation = """
Membantu dengan mempertimbangkan urgensi menunjukkan:
• Fleksibilitas dalam pelayanan
• Empati terhadap kebutuhan masyarakat
• Pelayanan prima

Skor:
A (2) - Kaku pada aturan
B (5) - Solusi terbaik ✓
C (1) - Tidak berempati
D (3) - Kurang inisiatif
E (2) - Tidak menyelesaikan
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_057",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Terdapat warga yang tidak bisa berbahasa Indonesia dengan baik. Apa yang Anda lakukan?",
            options = listOf(
                "Meminta warga tersebut membawa penerjemah",
                "Berusaha berkomunikasi dengan bahasa sederhana atau bantuan visual",
                "Menolak melayani karena kendala bahasa",
                "Melayani seperti biasa tanpa memastikan pemahaman",
                "Menggunakan aplikasi penerjemah dan berkomunikasi dengan sabar"
            ).toJson(),
            correctAnswer = 4,
            tkpScores = listOf(2, 4, 1, 1, 5).toJsonInt(),
            explanation = """
Menggunakan aplikasi dan berkomunikasi dengan sabar adalah solusi terbaik:
• Memanfaatkan teknologi
• Pelayanan inklusif
• Memastikan pemahaman warga

Skor:
A (2) - Mengalihkan tanggung jawab
B (4) - Usaha baik
C (1) - Menolak melayani
D (1) - Tidak memastikan pemahaman
E (5) - Solusi terbaik ✓
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_058",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Warga mengeluh bahwa prosedur pelayanan terlalu berbelit. Respons Anda adalah...",
            options = listOf(
                "Menjelaskan bahwa prosedur sudah ditetapkan dan harus diikuti",
                "Menyampaikan keluhan ke atasan sebagai bahan evaluasi",
                "Mengabaikan karena Anda tidak berwenang mengubah prosedur",
                "Menyarankan warga mengirim surat resmi ke pimpinan",
                "Membantu mempercepat dengan melewati beberapa prosedur"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 3, 2).toJsonInt(),
            explanation = """
Menyampaikan ke atasan sebagai bahan evaluasi menunjukkan:
• Responsif terhadap masukan
• Menyalurkan aspirasi dengan tepat
• Orientasi perbaikan

Skor:
A (2) - Tidak solutif
B (5) - Solusi terbaik ✓
C (1) - Tidak peduli
D (3) - Birokratis
E (2) - Melanggar prosedur
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_059",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Saat melayani, Anda menerima telepon pribadi yang penting. Apa yang Anda lakukan?",
            options = listOf(
                "Mengangkat telepon dan berbicara sambil melayani",
                "Meminta izin sebentar, menjawab singkat, dan melanjutkan pelayanan",
                "Mengabaikan telepon sampai pelayanan selesai",
                "Meminta warga menunggu sampai telepon selesai",
                "Menyuruh rekan melanjutkan pelayanan sementara"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 3, 2, 4).toJsonInt(),
            explanation = """
Meminta izin dan menjawab singkat adalah sikap profesional:
• Menghormati warga yang dilayani
• Menangani urusan pribadi dengan bijak
• Menjaga fokus pada pelayanan

Skor:
A (1) - Tidak sopan
B (5) - Solusi terbaik ✓
C (3) - Mengabaikan urusan penting
D (2) - Kurang menghormati warga
E (4) - Alternatif baik
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_060",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Warga komplain karena merasa tidak dilayani dengan adil. Sikap Anda adalah...",
            options = listOf(
                "Membela diri bahwa Anda sudah berlaku adil",
                "Mendengarkan keluhan, meminta maaf, dan menjelaskan prosedur yang berlaku",
                "Menyuruh warga mengadu ke atasan",
                "Mengabaikan karena Anda yakin sudah adil",
                "Memberikan perlakuan lebih agar tidak komplain lagi"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 1, 2).toJsonInt(),
            explanation = """
Mendengarkan, meminta maaf, dan menjelaskan adalah respons terbaik:
• Empati terhadap perasaan warga
• Komunikasi yang baik
• Transparan tentang prosedur

Skor:
A (2) - Defensif
B (5) - Solusi terbaik ✓
C (2) - Mengalihkan masalah
D (1) - Tidak responsif
E (2) - Tidak konsisten
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_061",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Anda diminta melayani warga yang merupakan kenalan dekat. Sikap Anda adalah...",
            options = listOf(
                "Mendahulukannya dari antrean yang ada",
                "Melayani sesuai prosedur dan antrean seperti warga lainnya",
                "Meminta rekan lain yang melayani agar tidak canggung",
                "Memberikan informasi khusus yang tidak diberikan ke warga lain",
                "Menolak melayani untuk menghindari konflik kepentingan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 3, 1, 2).toJsonInt(),
            explanation = """
Melayani sesuai prosedur seperti warga lainnya menunjukkan:
• Profesionalisme tinggi
• Tidak ada perlakuan istimewa
• Integritas dalam bertugas

Skor:
A (1) - Tidak adil
B (5) - Solusi terbaik ✓
C (3) - Menghindar, tapi bisa
D (1) - Tidak etis
E (2) - Tidak perlu menolak
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_062",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Warga membawa berkas yang tidak lengkap tetapi sudah datang dari jauh. Apa tindakan Anda?",
            options = listOf(
                "Menolak melayani dan menyuruh kembali dengan berkas lengkap",
                "Memproses berkas yang ada dan meminta melengkapi via online/kurir",
                "Melengkapi sendiri dengan asumsi data yang benar",
                "Memproses meski tidak lengkap agar warga tidak kecewa",
                "Menyalahkan warga karena tidak teliti"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 2, 1).toJsonInt(),
            explanation = """
Memproses dan meminta melengkapi via online/kurir adalah solusi terbaik:
• Membantu sebisa mungkin
• Tetap memenuhi kelengkapan
• Fleksibel dengan teknologi

Skor:
A (2) - Kurang fleksibel
B (5) - Solusi terbaik ✓
C (1) - Melanggar prosedur
D (2) - Mengabaikan kelengkapan
E (1) - Tidak profesional
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_063",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Terjadi kesalahpahaman dengan warga yang membuat suasana tegang. Apa yang Anda lakukan?",
            options = listOf(
                "Mempertahankan pendapat Anda karena yakin benar",
                "Menurunkan emosi dengan komunikasi tenang dan mencari titik temu",
                "Memanggil satpam untuk mengamankan situasi",
                "Meminta warga keluar dari ruangan",
                "Melaporkan warga tersebut ke atasan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 1, 2).toJsonInt(),
            explanation = """
Menurunkan emosi dan mencari titik temu adalah pendekatan terbaik:
• Pengendalian emosi yang baik
• Keterampilan komunikasi
• Orientasi pada solusi

Skor:
A (2) - Tidak fleksibel
B (5) - Solusi terbaik ✓
C (2) - Eskalasi berlebihan
D (1) - Tidak menyelesaikan
E (2) - Tidak proaktif
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_064",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Warga membutuhkan layanan yang seharusnya berbayar tetapi mengaku tidak mampu. Sikap Anda adalah...",
            options = listOf(
                "Tetap meminta pembayaran sesuai ketentuan",
                "Memberikan informasi tentang prosedur pengajuan keringanan",
                "Membebaskan biaya tanpa prosedur resmi",
                "Menyuruh warga mencari bantuan dari pihak lain",
                "Membantu membayarkan dari uang pribadi"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 2, 3).toJsonInt(),
            explanation = """
Memberikan informasi prosedur keringanan adalah sikap yang tepat:
• Membantu dengan cara yang benar
• Tidak melanggar aturan
• Memberikan solusi yang berkelanjutan

Skor:
A (2) - Kurang berempati
B (5) - Solusi terbaik ✓
C (1) - Melanggar prosedur
D (2) - Tidak membantu
E (3) - Baik hati tapi tidak sustainable
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_065",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Anda mendapat pujian dari warga atas pelayanan yang memuaskan. Respons Anda adalah...",
            options = listOf(
                "Menyombongkan diri di depan rekan kerja",
                "Berterima kasih dan menyampaikan bahwa ini adalah tugas dan tanggung jawab",
                "Mengabaikan pujian karena hanya menjalankan tugas",
                "Meminta warga memberikan pujian tertulis ke atasan",
                "Berharap mendapat penghargaan dari instansi"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 2).toJsonInt(),
            explanation = """
Berterima kasih dan menyatakan ini tanggung jawab menunjukkan:
• Kerendahan hati
• Profesionalisme
• Tidak mencari pujian berlebihan

Skor:
A (1) - Sombong
B (5) - Solusi terbaik ✓
C (2) - Kurang menghargai
D (2) - Mencari pengakuan
E (2) - Orientasi reward
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_066",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Terjadi pemadaman listrik saat Anda sedang memproses dokumen warga. Apa yang Anda lakukan?",
            options = listOf(
                "Meminta warga menunggu sampai listrik menyala",
                "Mencatat data secara manual dan melanjutkan proses saat listrik menyala",
                "Menyuruh warga pulang dan kembali lagi nanti",
                "Mengeluh tentang infrastruktur yang buruk",
                "Tidak melakukan apa-apa sampai ada instruksi"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 1, 1).toJsonInt(),
            explanation = """
Mencatat manual dan melanjutkan saat listrik menyala adalah sikap solutif:
• Inisiatif dalam menghadapi kendala
• Tidak menyia-nyiakan waktu warga
• Adaptif terhadap situasi

Skor:
A (2) - Kurang inisiatif
B (5) - Solusi terbaik ✓
C (1) - Tidak solutif
D (1) - Tidak profesional
E (1) - Pasif
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_067",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Warga menanyakan progress pengajuannya yang sudah lama. Anda tidak menangani berkasnya. Sikap Anda adalah...",
            options = listOf(
                "Menyuruh warga bertanya ke petugas yang menangani",
                "Membantu mengecek dan memberikan informasi progress yang jelas",
                "Mengatakan tidak tahu karena bukan tanggung jawab Anda",
                "Menyuruh warga menunggu saja",
                "Menyalahkan petugas lain yang lambat"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 1, 1).toJsonInt(),
            explanation = """
Membantu mengecek dan memberikan informasi menunjukkan:
• Pelayanan one-stop service
• Tidak membuat warga bolak-balik
• Kerja sama tim

Skor:
A (2) - Kurang membantu
B (5) - Solusi terbaik ✓
C (1) - Tidak peduli
D (1) - Tidak informatif
E (1) - Menyalahkan orang lain
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_068",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Warga meminta Anda mempercepat prosesnya dengan imbalan uang. Apa respons Anda?",
            options = listOf(
                "Menerima untuk membantu keuangan keluarga",
                "Menolak dengan tegas dan menjelaskan bahwa itu melanggar aturan",
                "Menolak tapi tidak melaporkan",
                "Menerima tapi menganggap sebagai ucapan terima kasih",
                "Meminta warga memberikan ke petugas lain"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 3, 1, 1).toJsonInt(),
            explanation = """
Menolak dengan tegas dan menjelaskan adalah sikap berintegritas:
• Anti korupsi
• Edukasi kepada masyarakat
• Menjaga kehormatan instansi

Skor:
A (1) - Korupsi
B (5) - Solusi terbaik ✓
C (3) - Kurang tegas
D (1) - Korupsi terselubung
E (1) - Tidak bertanggung jawab
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_069",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Seorang warga mengeluh pelayanan Anda kurang ramah. Bagaimana sikap Anda?",
            options = listOf(
                "Membela diri dan menjelaskan bahwa Anda sudah ramah",
                "Meminta maaf dan berkomitmen untuk meningkatkan pelayanan",
                "Mengabaikan karena tidak setuju dengan penilaian tersebut",
                "Meminta warga menyampaikan keluhan secara tertulis",
                "Menyalahkan kondisi kerja yang membuat Anda lelah"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 2, 1).toJsonInt(),
            explanation = """
Meminta maaf dan berkomitmen meningkatkan adalah sikap dewasa:
• Menerima kritik dengan lapang dada
• Orientasi perbaikan diri
• Profesionalisme

Skor:
A (2) - Defensif
B (5) - Solusi terbaik ✓
C (1) - Tidak menerima masukan
D (2) - Birokratis
E (1) - Menyalahkan kondisi
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_070",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Anda diminta menggantikan rekan yang sakit mendadak di loket yang sangat sibuk. Sikap Anda adalah...",
            options = listOf(
                "Menolak karena bukan tugas pokok Anda",
                "Bersedia membantu dan beradaptasi dengan cepat",
                "Menerima dengan berat hati dan mengeluh",
                "Menyarankan mencari pengganti lain yang lebih kompeten",
                "Menerima tapi tidak berusaha maksimal karena bukan bidang Anda"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Bersedia membantu dan beradaptasi menunjukkan:
• Semangat kerja sama tim
• Loyalitas pada instansi
• Fleksibilitas dalam bekerja

Skor:
A (1) - Tidak kooperatif
B (5) - Solusi terbaik ✓
C (2) - Tidak profesional
D (2) - Kurang inisiatif
E (1) - Tidak bertanggung jawab
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_071",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Warga menyampaikan saran untuk perbaikan sistem pelayanan. Apa yang Anda lakukan?",
            options = listOf(
                "Mengabaikan karena Anda tidak berwenang mengubah sistem",
                "Mendengarkan dan menyampaikan ke atasan sebagai bahan pertimbangan",
                "Menyuruh warga mengirim surat ke pimpinan",
                "Menjelaskan bahwa sistem sudah baku dan tidak bisa diubah",
                "Setuju saja untuk menyenangkan warga"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 2).toJsonInt(),
            explanation = """
Mendengarkan dan menyampaikan ke atasan adalah sikap yang tepat:
• Menghargai partisipasi masyarakat
• Menyalurkan aspirasi dengan benar
• Orientasi perbaikan berkelanjutan

Skor:
A (1) - Tidak responsif
B (5) - Solusi terbaik ✓
C (2) - Birokratis
D (2) - Kaku
E (2) - Tidak substantif
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_072",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Jam makan siang tiba, tetapi masih ada warga yang mengantre. Sikap Anda adalah...",
            options = listOf(
                "Langsung tutup loket karena sudah waktunya istirahat",
                "Menyelesaikan pelayanan untuk yang sudah antre sebelum istirahat",
                "Menutup loket dan meminta warga kembali setelah istirahat",
                "Bergantian istirahat dengan rekan agar pelayanan tetap berjalan",
                "Istirahat dulu baru melanjutkan dengan sisa tenaga"
            ).toJson(),
            correctAnswer = 3,
            tkpScores = listOf(1, 4, 2, 5, 2).toJsonInt(),
            explanation = """
Bergantian istirahat agar pelayanan tetap berjalan adalah solusi terbaik:
• Pelayanan tidak terhenti
• Hak istirahat tetap terpenuhi
• Kerja sama tim

Skor:
A (1) - Tidak menghargai warga
B (4) - Baik, tapi bisa kelelahan
C (2) - Kurang solutif
D (5) - Solusi terbaik ✓
E (2) - Kurang optimal
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_073",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Warga meminta penjelasan berulang-ulang karena sulit memahami. Respons Anda adalah...",
            options = listOf(
                "Merasa kesal dan meminta warga datang dengan orang yang lebih paham",
                "Menjelaskan dengan sabar menggunakan bahasa yang lebih sederhana",
                "Memberikan brosur dan menyuruh baca sendiri",
                "Meminta rekan lain menjelaskan karena Anda sudah lelah",
                "Menjelaskan sekali lagi dengan nada tinggi"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Menjelaskan dengan sabar dan bahasa sederhana menunjukkan:
• Kesabaran dalam melayani
• Kemampuan komunikasi yang baik
• Empati terhadap keterbatasan orang lain

Skor:
A (1) - Tidak sabar
B (5) - Solusi terbaik ✓
C (2) - Kurang personal
D (2) - Kurang tanggung jawab
E (1) - Tidak profesional
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_074",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Anda menemukan celah dalam sistem yang bisa dimanfaatkan untuk mempercepat proses. Apa yang Anda lakukan?",
            options = listOf(
                "Memanfaatkannya untuk keuntungan pribadi",
                "Melaporkan ke atasan untuk perbaikan sistem",
                "Membiarkan saja karena tidak merugikan siapapun",
                "Memberitahu rekan dekat saja",
                "Memanfaatkan untuk membantu warga yang dikenal"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Melaporkan ke atasan untuk perbaikan sistem adalah sikap yang benar:
• Integritas tinggi
• Berorientasi pada perbaikan
• Tidak menyalahgunakan informasi

Skor:
A (1) - Penyalahgunaan
B (5) - Solusi terbaik ✓
C (2) - Tidak proaktif
D (2) - Tidak bertanggung jawab
E (1) - Konflik kepentingan
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_075",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Warga membandingkan pelayanan di instansi Anda dengan instansi lain yang dinilai lebih baik. Respons Anda adalah...",
            options = listOf(
                "Membela instansi dengan menyebutkan kelemahan instansi lain",
                "Menerima masukan dan berkomitmen untuk terus meningkatkan pelayanan",
                "Mengabaikan karena setiap instansi berbeda",
                "Menyalahkan keterbatasan anggaran dan SDM",
                "Menyarankan warga pindah ke instansi yang dinilai lebih baik"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Menerima masukan dan berkomitmen meningkatkan menunjukkan:
• Keterbukaan terhadap kritik
• Orientasi perbaikan
• Profesionalisme

Skor:
A (1) - Defensif negatif
B (5) - Solusi terbaik ✓
C (2) - Tidak responsif
D (2) - Menyalahkan kondisi
E (1) - Tidak profesional
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        )
    )
}
