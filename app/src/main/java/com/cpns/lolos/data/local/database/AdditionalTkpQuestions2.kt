package com.cpns.lolos.data.local.database

import com.cpns.lolos.data.local.entity.QuestionEntity
import com.google.gson.Gson

/**
 * TKP Questions Batch 2: Jejaring Kerja & Kerjasama (30 questions)
 * Question IDs: tkp_076 - tkp_105
 */
object AdditionalTkpQuestions2 {

    private val gson = Gson()

    private fun List<String>.toJson(): String = gson.toJson(this)
    private fun List<Int>.toJsonInt(): String = gson.toJson(this)

    fun getQuestions(): List<QuestionEntity> = listOf(
        QuestionEntity(
            id = "tkp_076",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Anda baru bergabung di unit baru dengan rekan yang sudah senior. Bagaimana cara Anda beradaptasi?",
            options = listOf(
                "Menunjukkan kemampuan agar langsung dihormati",
                "Berkenalan dengan ramah dan belajar dari pengalaman mereka",
                "Diam saja dan menunggu diberikan tugas",
                "Langsung memberikan ide-ide perbaikan",
                "Bergabung dengan kelompok yang paling berpengaruh"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 2, 1).toJsonInt(),
            explanation = """
Berkenalan dengan ramah dan belajar dari senior menunjukkan:
• Sikap rendah hati
• Menghargai pengalaman orang lain
• Membangun hubungan yang baik

Skor:
A (2) - Terkesan sombong
B (5) - Solusi terbaik ✓
C (1) - Pasif
D (2) - Terlalu agresif
E (1) - Politik kantor
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_077",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Rekan satu tim tidak setuju dengan pendapat Anda dalam rapat. Apa respons Anda?",
            options = listOf(
                "Mempertahankan pendapat dengan keras karena yakin benar",
                "Mendengarkan argumentasi mereka dan mencari jalan tengah",
                "Menyerah dan mengikuti pendapat mayoritas",
                "Diam dan tidak memberikan masukan lagi",
                "Mengadukan ke atasan bahwa pendapat Anda tidak dihargai"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 1, 1).toJsonInt(),
            explanation = """
Mendengarkan dan mencari jalan tengah menunjukkan:
• Keterbukaan terhadap pendapat lain
• Kemampuan bernegosiasi
• Orientasi pada solusi bersama

Skor:
A (2) - Tidak fleksibel
B (5) - Solusi terbaik ✓
C (2) - Terlalu mudah menyerah
D (1) - Tidak konstruktif
E (1) - Tidak dewasa
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_078",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Anda diminta membantu rekan dari unit lain yang sedang kewalahan. Namun, pekerjaan Anda sendiri juga banyak. Sikap Anda adalah...",
            options = listOf(
                "Menolak karena pekerjaan sendiri lebih prioritas",
                "Membantu semampunya sambil tetap menyelesaikan tugas sendiri",
                "Membantu sepenuhnya dan mengabaikan tugas sendiri",
                "Menyuruhnya meminta bantuan ke orang lain",
                "Melaporkan ke atasan untuk dicarikan solusi"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 1, 3).toJsonInt(),
            explanation = """
Membantu semampunya sambil tetap mengerjakan tugas menunjukkan:
• Keseimbangan prioritas
• Semangat kerja sama
• Manajemen waktu yang baik

Skor:
A (2) - Kurang solidaritas
B (5) - Solusi terbaik ✓
C (2) - Tidak seimbang
D (1) - Tidak membantu
E (3) - Alternatif baik
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_079",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Ada konflik antar rekan di tim Anda. Sebagai anggota tim, apa yang Anda lakukan?",
            options = listOf(
                "Tidak ikut campur karena bukan urusan Anda",
                "Membantu memediasi agar konflik tidak berlarut",
                "Memihak salah satu yang menurut Anda benar",
                "Melaporkan ke atasan agar ditangani",
                "Menjauhi keduanya untuk menghindari masalah"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 3, 1).toJsonInt(),
            explanation = """
Membantu memediasi menunjukkan:
• Kepedulian terhadap harmonisasi tim
• Kemampuan resolusi konflik
• Sikap konstruktif

Skor:
A (2) - Tidak peduli
B (5) - Solusi terbaik ✓
C (1) - Memperburuk situasi
D (3) - Bisa jadi alternatif
E (1) - Menghindar
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_080",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Rekan kerja membicarakan keburukan rekan lain kepada Anda. Apa respons Anda?",
            options = listOf(
                "Mendengarkan dan ikut berkomentar",
                "Mengalihkan pembicaraan ke hal positif atau pekerjaan",
                "Menegur keras di depan orang lain",
                "Melaporkan ke atasan sebagai gosip",
                "Diam saja tanpa menanggapi"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 3).toJsonInt(),
            explanation = """
Mengalihkan ke hal positif menunjukkan:
• Tidak ikut menyebarkan gosip
• Menjaga harmonisasi
• Bijaksana dalam bersikap

Skor:
A (1) - Ikut gosip
B (5) - Solusi terbaik ✓
C (2) - Tidak bijaksana
D (2) - Berlebihan
E (3) - Netral tapi pasif
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_081",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Tim Anda berhasil menyelesaikan proyek besar. Bagaimana Anda merayakannya?",
            options = listOf(
                "Mengklaim keberhasilan sebagai usaha Anda sendiri",
                "Merayakan bersama tim dan mengakui kontribusi semua orang",
                "Biasa saja karena itu sudah kewajiban",
                "Meminta penghargaan khusus dari atasan",
                "Menceritakan ke unit lain untuk mendapat pengakuan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Merayakan bersama dan mengakui kontribusi semua menunjukkan:
• Semangat tim
• Kerendahan hati
• Apresiasi terhadap kerja sama

Skor:
A (1) - Sombong
B (5) - Solusi terbaik ✓
C (2) - Kurang apresiasi
D (2) - Orientasi reward berlebihan
E (1) - Mencari pengakuan
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_082",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Anda memiliki ide yang berbeda dengan keputusan tim. Apa yang Anda lakukan?",
            options = listOf(
                "Mengikuti keputusan tim meski tidak setuju dalam hati",
                "Menyampaikan ide dengan argumentasi lalu menerima keputusan bersama",
                "Diam dan tidak berkontribusi karena tidak didengar",
                "Menjalankan ide sendiri meski berbeda dengan tim",
                "Mengadu ke atasan bahwa tim salah mengambil keputusan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 1, 1).toJsonInt(),
            explanation = """
Menyampaikan ide lalu menerima keputusan bersama menunjukkan:
• Keberanian menyuarakan pendapat
• Menghormati keputusan kolektif
• Kedewasaan dalam tim

Skor:
A (2) - Kurang asertif
B (5) - Solusi terbaik ✓
C (1) - Pasif agresif
D (1) - Tidak menghormati tim
E (1) - Tidak loyal
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_083",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Rekan kerja meminta bantuan Anda untuk pekerjaan yang seharusnya dia kerjakan sendiri. Sikap Anda adalah...",
            options = listOf(
                "Menolak karena itu bukan tanggung jawab Anda",
                "Membantu sambil mengajarkan agar dia bisa mandiri",
                "Membantu sepenuhnya tanpa mengajarkan",
                "Melaporkan ke atasan bahwa dia tidak bekerja",
                "Menyuruhnya belajar sendiri dari internet"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 1, 2).toJsonInt(),
            explanation = """
Membantu sambil mengajarkan adalah sikap terbaik:
• Membangun kapasitas rekan
• Tidak menciptakan ketergantungan
• Solidaritas yang produktif

Skor:
A (2) - Kurang solidaritas
B (5) - Solusi terbaik ✓
C (2) - Tidak mendidik
D (1) - Tidak konstruktif
E (2) - Kurang membantu
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_084",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Anda harus bekerja sama dengan rekan yang pernah memiliki konflik dengan Anda. Bagaimana sikap Anda?",
            options = listOf(
                "Menolak bekerja sama dan meminta penugasan lain",
                "Profesional dan fokus pada tugas bersama",
                "Bekerja sama tapi tetap menjaga jarak",
                "Memanfaatkan kesempatan untuk membahas konflik lama",
                "Meminta atasan sebagai mediator"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 3, 1, 3).toJsonInt(),
            explanation = """
Profesional dan fokus pada tugas menunjukkan:
• Kedewasaan emosional
• Memisahkan urusan personal dan pekerjaan
• Orientasi pada hasil

Skor:
A (1) - Tidak profesional
B (5) - Solusi terbaik ✓
C (3) - Cukup baik
D (1) - Tidak fokus
E (3) - Alternatif valid
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_085",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Dalam diskusi tim, Anda menyadari bahwa pendapat Anda ternyata salah. Apa yang Anda lakukan?",
            options = listOf(
                "Tetap mempertahankan agar tidak terlihat lemah",
                "Mengakui kesalahan dan mengapresiasi koreksi dari rekan",
                "Diam saja dan tidak berkomentar lagi",
                "Menyalahkan data yang kurang lengkap",
                "Mengalihkan pembicaraan ke topik lain"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 1, 1).toJsonInt(),
            explanation = """
Mengakui kesalahan dan mengapresiasi koreksi menunjukkan:
• Kerendahan hati
• Kejujuran intelektual
• Sikap belajar

Skor:
A (1) - Tidak jujur
B (5) - Solusi terbaik ✓
C (2) - Tidak asertif
D (1) - Mencari alasan
E (1) - Menghindar
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_086",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Rekan kerja sering terlambat masuk dan minta Anda menutupinya. Sikap Anda adalah...",
            options = listOf(
                "Membantu menutupi karena dia teman baik",
                "Menolak dengan baik dan menyarankan dia lebih disiplin",
                "Melaporkan langsung ke atasan",
                "Mengabaikan tanpa membantu atau melaporkan",
                "Menyetujui dengan syarat ada balasan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 3, 2, 1).toJsonInt(),
            explanation = """
Menolak dengan baik dan menyarankan disiplin menunjukkan:
• Integritas tinggi
• Kepedulian yang konstruktif
• Tidak ikut berbohong

Skor:
A (1) - Tidak jujur
B (5) - Solusi terbaik ✓
C (3) - Terlalu keras
D (2) - Netral tapi pasif
E (1) - Transaksional
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_087",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Anda ditugaskan memimpin tim untuk proyek penting. Langkah pertama Anda adalah...",
            options = listOf(
                "Langsung membagi tugas sesuai kemampuan Anda nilai",
                "Mengadakan pertemuan untuk memahami kekuatan tiap anggota",
                "Mengerjakan bagian terpenting sendiri",
                "Meminta arahan lengkap dari atasan",
                "Menunggu anggota tim menentukan sendiri tugasnya"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 2, 1).toJsonInt(),
            explanation = """
Mengadakan pertemuan untuk memahami kekuatan tim menunjukkan:
• Kepemimpinan partisipatif
• Menghargai kontribusi anggota
• Perencanaan yang baik

Skor:
A (2) - Tidak partisipatif
B (5) - Solusi terbaik ✓
C (1) - Tidak delegatif
D (2) - Kurang inisiatif
E (1) - Tidak terarah
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_088",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Anggota tim Anda berkinerja kurang baik dan menghambat pekerjaan. Tindakan Anda adalah...",
            options = listOf(
                "Melaporkan ke atasan untuk ditindaklanjuti",
                "Berkomunikasi untuk memahami masalahnya dan membantu mencari solusi",
                "Mengerjakan bagiannya agar proyek tidak terhambat",
                "Menegur keras di depan anggota lain sebagai pembelajaran",
                "Mengabaikan dan fokus pada bagian Anda saja"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 1, 1).toJsonInt(),
            explanation = """
Berkomunikasi dan membantu mencari solusi menunjukkan:
• Kepemimpinan yang suportif
• Fokus pada perbaikan
• Empati terhadap anggota tim

Skor:
A (2) - Kurang pembinaan
B (5) - Solusi terbaik ✓
C (2) - Tidak menyelesaikan akar masalah
D (1) - Tidak bijaksana
E (1) - Tidak bertanggung jawab
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_089",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Tim lain meminta bantuan untuk acara yang bukan tanggung jawab unit Anda. Sikap Anda adalah...",
            options = listOf(
                "Menolak karena bukan tugas unit Anda",
                "Berkoordinasi dengan tim dan atasan untuk membantu jika memungkinkan",
                "Langsung membantu tanpa koordinasi",
                "Menyuruh mereka meminta bantuan resmi melalui surat",
                "Mengabaikan permintaan tersebut"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 3, 2, 1).toJsonInt(),
            explanation = """
Berkoordinasi untuk membantu jika memungkinkan menunjukkan:
• Kerja sama lintas unit
• Mengikuti prosedur yang benar
• Semangat gotong royong

Skor:
A (2) - Kurang solidaritas
B (5) - Solusi terbaik ✓
C (3) - Baik tapi tanpa koordinasi
D (2) - Terlalu birokratis
E (1) - Tidak peduli
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_090",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Dalam rapat tim, ada anggota yang selalu mendominasi diskusi. Bagaimana sikap Anda?",
            options = listOf(
                "Membiarkan saja karena mungkin dia lebih senior",
                "Menyampaikan dengan sopan bahwa semua perlu mendapat kesempatan",
                "Menegur keras agar dia tidak mendominasi",
                "Tidak hadir di rapat berikutnya",
                "Mengadu ke atasan tentang perilakunya"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 1, 2).toJsonInt(),
            explanation = """
Menyampaikan dengan sopan menunjukkan:
• Keberanian menyuarakan keadilan
• Cara komunikasi yang baik
• Menghargai semua anggota

Skor:
A (2) - Pasif
B (5) - Solusi terbaik ✓
C (2) - Kurang diplomatis
D (1) - Menghindar
E (2) - Kurang proaktif
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_091",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Anda mendapat informasi rahasia tentang kebijakan baru dari sumber internal. Apa yang Anda lakukan?",
            options = listOf(
                "Membagikan ke rekan dekat untuk persiapan",
                "Menyimpan informasi sampai ada pengumuman resmi",
                "Mempostingnya di grup chat kantor",
                "Menggunakan untuk keuntungan posisi Anda",
                "Mengkonfirmasi ke atasan apakah boleh dibagikan"
            ).toJson(),
            correctAnswer = 4,
            tkpScores = listOf(2, 4, 1, 1, 5).toJsonInt(),
            explanation = """
Mengkonfirmasi ke atasan adalah langkah terbaik:
• Menghormati kerahasiaan informasi
• Tidak bertindak sendiri
• Sesuai prosedur

Skor:
A (2) - Membocorkan
B (4) - Baik, tapi pasif
C (1) - Menyebarkan
D (1) - Menyalahgunakan
E (5) - Solusi terbaik ✓
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_092",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Rekan Anda mendapat promosi yang Anda juga inginkan. Bagaimana sikap Anda?",
            options = listOf(
                "Merasa iri dan menjauh darinya",
                "Memberi selamat dengan tulus dan belajar darinya",
                "Menanyakan ke atasan mengapa bukan Anda yang dipilih",
                "Mencari kesalahan dalam proses promosi",
                "Biasa saja karena tidak peduli"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 1, 2).toJsonInt(),
            explanation = """
Memberi selamat dan belajar darinya menunjukkan:
• Kedewasaan emosional
• Sportivitas
• Orientasi pengembangan diri

Skor:
A (1) - Tidak dewasa
B (5) - Solusi terbaik ✓
C (2) - Kurang bijaksana
D (1) - Destruktif
E (2) - Tidak berambisi positif
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_093",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Tim Anda gagal mencapai target. Sebagai bagian dari tim, sikap Anda adalah...",
            options = listOf(
                "Menyalahkan anggota yang kinerjanya kurang baik",
                "Evaluasi bersama untuk perbaikan dan berbagi tanggung jawab",
                "Diam saja karena bukan kesalahan Anda sepenuhnya",
                "Melaporkan ke atasan tentang siapa yang bertanggung jawab",
                "Keluar dari tim karena kecewa"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Evaluasi bersama dan berbagi tanggung jawab menunjukkan:
• Akuntabilitas kolektif
• Orientasi perbaikan
• Solidaritas tim

Skor:
A (1) - Menyalahkan orang lain
B (5) - Solusi terbaik ✓
C (2) - Tidak bertanggung jawab
D (2) - Tidak konstruktif
E (1) - Tidak loyal
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_094",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Anda mengetahui rekan kerja sedang mengalami masalah pribadi yang mempengaruhi kinerjanya. Sikap Anda adalah...",
            options = listOf(
                "Menyebarkan informasi ke rekan lain",
                "Menawarkan dukungan dan membantu meringankan beban kerjanya sementara",
                "Melaporkan ke atasan bahwa kinerjanya menurun",
                "Mengabaikan karena itu urusan pribadi",
                "Menyarankan dia mengambil cuti"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 3).toJsonInt(),
            explanation = """
Menawarkan dukungan dan membantu menunjukkan:
• Empati terhadap rekan
• Solidaritas
• Kepedulian yang tepat

Skor:
A (1) - Tidak menjaga privasi
B (5) - Solusi terbaik ✓
C (2) - Kurang empati
D (2) - Tidak peduli
E (3) - Saran yang baik
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_095",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Anda harus berbagi ruangan kerja dengan rekan yang kebiasaannya berbeda dengan Anda. Sikap Anda adalah...",
            options = listOf(
                "Meminta pindah ruangan",
                "Berkomunikasi untuk membuat kesepakatan bersama",
                "Menyesuaikan diri sepenuhnya meski tidak nyaman",
                "Memaksa rekan mengikuti kebiasaan Anda",
                "Melaporkan ke atasan untuk dicarikan solusi"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 3, 1, 2).toJsonInt(),
            explanation = """
Berkomunikasi untuk membuat kesepakatan bersama menunjukkan:
• Kemampuan negosiasi
• Menghargai perbedaan
• Mencari solusi win-win

Skor:
A (2) - Menghindar
B (5) - Solusi terbaik ✓
C (3) - Terlalu mengalah
D (1) - Tidak menghargai
E (2) - Kurang proaktif
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_096",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Anda diminta menjadi mentor untuk pegawai baru. Bagaimana pendekatan Anda?",
            options = listOf(
                "Memberikan tugas langsung untuk belajar dari pengalaman",
                "Menjelaskan tugas secara bertahap dan memberikan umpan balik konstruktif",
                "Menyuruhnya belajar sendiri dari dokumen",
                "Membiarkan dia mengikuti apa yang Anda kerjakan",
                "Meminta atasan menunjuk mentor lain yang lebih berpengalaman"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 3, 1).toJsonInt(),
            explanation = """
Menjelaskan bertahap dengan umpan balik menunjukkan:
• Kemampuan coaching
• Kesabaran dalam membimbing
• Orientasi pengembangan SDM

Skor:
A (2) - Kurang bimbingan
B (5) - Solusi terbaik ✓
C (1) - Tidak membimbing
D (3) - Alternatif cukup
E (1) - Tidak bertanggung jawab
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_097",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Dalam proyek tim, ada anggota yang selalu mengkritik tanpa memberikan solusi. Respons Anda adalah...",
            options = listOf(
                "Mengabaikan kritiknya",
                "Meminta dia memberikan alternatif setiap kali mengkritik",
                "Menegur keras di depan tim",
                "Melaporkan perilakunya ke atasan",
                "Tidak mengundangnya ke pertemuan berikutnya"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 2, 1).toJsonInt(),
            explanation = """
Meminta alternatif setiap mengkritik menunjukkan:
• Mengubah kritik menjadi konstruktif
• Mendorong kontribusi positif
• Komunikasi yang asertif

Skor:
A (2) - Tidak menyelesaikan masalah
B (5) - Solusi terbaik ✓
C (1) - Konfrontatif
D (2) - Tidak langsung menyelesaikan
E (1) - Tidak inklusif
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_098",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Anda memiliki keahlian khusus yang tidak dimiliki rekan lain di tim. Sikap Anda adalah...",
            options = listOf(
                "Menyimpan untuk diri sendiri agar tetap bernilai",
                "Berbagi pengetahuan dan melatih rekan yang berminat",
                "Hanya menggunakan saat diminta",
                "Meminta tambahan insentif karena keahlian khusus",
                "Menunjukkannya hanya di depan atasan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Berbagi dan melatih rekan menunjukkan:
• Semangat berbagi ilmu
• Membangun kapasitas tim
• Tidak egois

Skor:
A (1) - Egois
B (5) - Solusi terbaik ✓
C (2) - Pasif
D (2) - Transaksional
E (1) - Mencari muka
            """.trimIndent(),
            difficulty = "easy",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_099",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Rekan kerja Anda sering mengambil kredit atas pekerjaan tim tanpa menyebut kontribusi anggota lain. Sikap Anda adalah...",
            options = listOf(
                "Melakukan hal yang sama untuk melindungi diri",
                "Menyampaikan dengan sopan bahwa kontribusi tim perlu diakui",
                "Melaporkan ke atasan",
                "Diam saja untuk menghindari konflik",
                "Menyindirnya di depan rekan lain"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 3, 2, 1).toJsonInt(),
            explanation = """
Menyampaikan dengan sopan menunjukkan:
• Keberanian menyuarakan keadilan
• Komunikasi asertif
• Menjaga harmonisasi tim

Skor:
A (1) - Tidak etis
B (5) - Solusi terbaik ✓
C (3) - Eskalasi langsung
D (2) - Pasif
E (1) - Tidak dewasa
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_100",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Tim Anda beragam dengan latar belakang berbeda-beda. Bagaimana Anda menyikapi perbedaan tersebut?",
            options = listOf(
                "Bergaul hanya dengan yang memiliki latar belakang sama",
                "Memanfaatkan keberagaman sebagai kekuatan tim",
                "Mengabaikan perbedaan dan fokus pada pekerjaan saja",
                "Menyeragamkan cara kerja agar tidak ada perbedaan",
                "Membentuk kelompok-kelompok kecil berdasarkan kesamaan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 3, 2, 1).toJsonInt(),
            explanation = """
Memanfaatkan keberagaman sebagai kekuatan menunjukkan:
• Menghargai perbedaan
• Kemampuan manajemen tim
• Perspektif inklusif

Skor:
A (1) - Eksklusif
B (5) - Solusi terbaik ✓
C (3) - Netral
D (2) - Tidak realistis
E (1) - Memecah tim
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_101",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Anda dan rekan memiliki pendekatan berbeda dalam menyelesaikan tugas bersama. Bagaimana menyikapinya?",
            options = listOf(
                "Memaksa pendekatan Anda karena lebih efektif",
                "Diskusi untuk menemukan pendekatan terbaik dari kedua cara",
                "Mengalah dan mengikuti cara rekan",
                "Mengerjakan terpisah lalu menggabungkan hasilnya",
                "Meminta atasan memutuskan cara mana yang dipakai"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 3, 2).toJsonInt(),
            explanation = """
Diskusi untuk menemukan pendekatan terbaik menunjukkan:
• Kolaborasi yang baik
• Keterbukaan pikiran
• Orientasi hasil optimal

Skor:
A (2) - Tidak fleksibel
B (5) - Solusi terbaik ✓
C (2) - Terlalu mengalah
D (3) - Alternatif valid
E (2) - Kurang mandiri
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_102",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Rekan Anda menolak untuk bekerja sama dengan Anda tanpa alasan jelas. Apa yang Anda lakukan?",
            options = listOf(
                "Menolak juga untuk bekerja sama dengannya",
                "Mendekatinya dengan baik untuk memahami masalahnya",
                "Melaporkan ke atasan",
                "Mengabaikan dan bekerja sendiri",
                "Membicarakan perilakunya ke rekan lain"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Mendekati dengan baik untuk memahami masalahnya menunjukkan:
• Inisiatif menyelesaikan masalah
• Keterampilan interpersonal
• Tidak reaktif negatif

Skor:
A (1) - Reaktif negatif
B (5) - Solusi terbaik ✓
C (2) - Langsung eskalasi
D (2) - Tidak menyelesaikan
E (1) - Gosip
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_103",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Anda melihat peluang kerjasama dengan instansi lain yang bisa menguntungkan. Langkah Anda adalah...",
            options = listOf(
                "Langsung menghubungi instansi tersebut",
                "Menyampaikan ide ke atasan untuk didiskusikan lebih lanjut",
                "Diam saja karena bukan wewenang Anda",
                "Membicarakan dengan rekan untuk mencari dukungan dulu",
                "Menunggu ada instruksi untuk mencari kerjasama"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 3, 1).toJsonInt(),
            explanation = """
Menyampaikan ke atasan untuk didiskusikan menunjukkan:
• Inisiatif yang tepat
• Mengikuti hierarki
• Kontribusi strategis

Skor:
A (2) - Tidak sesuai prosedur
B (5) - Solusi terbaik ✓
C (1) - Tidak berinisiatif
D (3) - Kurang langsung
E (1) - Pasif
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_104",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Anda diminta memimpin rapat dengan peserta dari berbagai level jabatan. Bagaimana Anda memastikan semua berpartisipasi?",
            options = listOf(
                "Fokus pada peserta dengan jabatan tinggi saja",
                "Memberikan kesempatan kepada semua untuk menyampaikan pendapat",
                "Membiarkan yang berani angkat tangan untuk berbicara",
                "Meminta yang senior berbicara lebih dulu",
                "Menyelesaikan rapat cepat tanpa banyak diskusi"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Memberikan kesempatan kepada semua menunjukkan:
• Fasilitasi yang inklusif
• Menghargai setiap kontribusi
• Kepemimpinan yang demokratis

Skor:
A (1) - Tidak inklusif
B (5) - Solusi terbaik ✓
C (2) - Tidak merata
D (2) - Bias senioritas
E (1) - Tidak efektif
            """.trimIndent(),
            difficulty = "medium",
            year = 2024
        ),

        QuestionEntity(
            id = "tkp_105",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Proyek yang Anda pimpin mengalami hambatan karena keterlambatan dari unit pendukung. Tindakan Anda adalah...",
            options = listOf(
                "Menyalahkan unit pendukung dalam laporan",
                "Berkoordinasi dengan unit pendukung untuk mencari solusi bersama",
                "Menunggu sampai mereka menyelesaikan bagiannya",
                "Mengambil alih tugas mereka agar tidak terlambat",
                "Melaporkan ke atasan untuk ditegur"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 2).toJsonInt(),
            explanation = """
Berkoordinasi untuk mencari solusi bersama menunjukkan:
• Kepemimpinan yang solutif
• Kolaborasi lintas unit
• Fokus pada hasil

Skor:
A (1) - Menyalahkan
B (5) - Solusi terbaik ✓
C (2) - Pasif
D (2) - Tidak koordinasi
E (2) - Langsung eskalasi
            """.trimIndent(),
            difficulty = "hard",
            year = 2024
        )
    )
}
