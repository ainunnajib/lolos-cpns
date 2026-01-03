package com.cpns.lolos.data.local

import com.cpns.lolos.data.local.entity.QuestionEntity
import com.cpns.lolos.domain.model.TiuSubCategory
import com.cpns.lolos.domain.model.TkpSubCategory
import com.cpns.lolos.domain.model.TwkSubCategory

/**
 * Contoh soal untuk testing dan demo
 * Pada produksi, soal akan diambil dari server atau file JSON
 */
object SampleQuestions {

    val twkQuestions = listOf(
        // Pancasila
        QuestionEntity(
            id = "twk_001",
            category = "TWK",
            subCategory = TwkSubCategory.PANCASILA,
            questionText = "Pancasila sebagai dasar negara Indonesia pertama kali diusulkan oleh Ir. Soekarno pada tanggal...",
            options = """["A. 1 Juni 1945","B. 17 Agustus 1945","C. 18 Agustus 1945","D. 22 Juni 1945","E. 1 Oktober 1945"]""",
            correctAnswer = 0,
            explanation = "Pancasila pertama kali diusulkan oleh Ir. Soekarno pada tanggal 1 Juni 1945 dalam sidang BPUPKI. Tanggal ini kemudian diperingati sebagai Hari Lahir Pancasila.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_002",
            category = "TWK",
            subCategory = TwkSubCategory.PANCASILA,
            questionText = "Sila keempat Pancasila berbunyi...",
            options = """["A. Ketuhanan Yang Maha Esa","B. Kemanusiaan yang adil dan beradab","C. Persatuan Indonesia","D. Kerakyatan yang dipimpin oleh hikmat kebijaksanaan dalam permusyawaratan/perwakilan","E. Keadilan sosial bagi seluruh rakyat Indonesia"]""",
            correctAnswer = 3,
            explanation = "Sila keempat Pancasila adalah 'Kerakyatan yang dipimpin oleh hikmat kebijaksanaan dalam permusyawaratan/perwakilan'. Sila ini menekankan pentingnya demokrasi dan musyawarah dalam pengambilan keputusan.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_003",
            category = "TWK",
            subCategory = TwkSubCategory.UUD_1945,
            questionText = "Menurut UUD 1945, kedaulatan berada di tangan...",
            options = """["A. Presiden","B. MPR","C. DPR","D. Rakyat","E. Mahkamah Konstitusi"]""",
            correctAnswer = 3,
            explanation = "Berdasarkan Pasal 1 ayat (2) UUD 1945, kedaulatan berada di tangan rakyat dan dilaksanakan menurut Undang-Undang Dasar.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_004",
            category = "TWK",
            subCategory = TwkSubCategory.SEJARAH,
            questionText = "Proklamasi Kemerdekaan Indonesia dikumandangkan pada tanggal...",
            options = """["A. 17 Agustus 1944","B. 17 Agustus 1945","C. 18 Agustus 1945","D. 17 Agustus 1946","E. 1 Juni 1945"]""",
            correctAnswer = 1,
            explanation = "Proklamasi Kemerdekaan Indonesia dibacakan oleh Ir. Soekarno didampingi Moh. Hatta pada tanggal 17 Agustus 1945 di Jalan Pegangsaan Timur No. 56, Jakarta.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_005",
            category = "TWK",
            subCategory = TwkSubCategory.BHINNEKA,
            questionText = "Semboyan 'Bhinneka Tunggal Ika' berasal dari kitab...",
            options = """["A. Negarakertagama","B. Sutasoma","C. Pararaton","D. Arjunawiwaha","E. Baratayuda"]""",
            correctAnswer = 1,
            explanation = "Semboyan 'Bhinneka Tunggal Ika' berasal dari Kitab Sutasoma karangan Mpu Tantular pada masa Kerajaan Majapahit. Artinya adalah 'Berbeda-beda tetapi tetap satu'.",
            difficulty = "medium",
            year = 2024
        )
    )

    val tiuQuestions = listOf(
        // Sinonim
        QuestionEntity(
            id = "tiu_001",
            category = "TIU",
            subCategory = TiuSubCategory.SINONIM,
            questionText = "AMBIGU = ...",
            options = """["A. Jelas","B. Terang","C. Rancu","D. Tegas","E. Pasti"]""",
            correctAnswer = 2,
            explanation = "Ambigu berarti memiliki makna ganda atau tidak jelas, sinonimnya adalah rancu.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_002",
            category = "TIU",
            subCategory = TiuSubCategory.ANTONIM,
            questionText = "LAWAN KATA dari HETEROGEN adalah...",
            options = """["A. Beragam","B. Bermacam-macam","C. Homogen","D. Bervariasi","E. Kompleks"]""",
            correctAnswer = 2,
            explanation = "Heterogen berarti beragam atau bermacam-macam, lawan katanya adalah homogen yang berarti sejenis atau sama.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_003",
            category = "TIU",
            subCategory = TiuSubCategory.DERET_ANGKA,
            questionText = "2, 6, 18, 54, ...",
            options = """["A. 108","B. 162","C. 216","D. 324","E. 486"]""",
            correctAnswer = 1,
            explanation = "Deret ini mengikuti pola perkalian dengan 3. 2×3=6, 6×3=18, 18×3=54, 54×3=162.",
            difficulty = "easy",
            year = 2024,
            isHots = false
        ),
        QuestionEntity(
            id = "tiu_004",
            category = "TIU",
            subCategory = TiuSubCategory.ARITMATIKA,
            questionText = "Jika x + y = 10 dan x - y = 4, maka nilai x × y adalah...",
            options = """["A. 14","B. 21","C. 24","D. 28","E. 35"]""",
            correctAnswer = 1,
            explanation = "Dari x + y = 10 dan x - y = 4, kita dapat: 2x = 14, jadi x = 7. Substitusi: y = 10 - 7 = 3. Maka x × y = 7 × 3 = 21.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_005",
            category = "TIU",
            subCategory = TiuSubCategory.SILOGISME,
            questionText = "Semua mahasiswa rajin belajar. Budi adalah mahasiswa. Kesimpulannya adalah...",
            options = """["A. Budi tidak rajin belajar","B. Budi rajin belajar","C. Semua orang rajin belajar","D. Mahasiswa adalah Budi","E. Tidak dapat disimpulkan"]""",
            correctAnswer = 1,
            explanation = "Ini adalah silogisme kategoris. Premis mayor: Semua mahasiswa rajin belajar. Premis minor: Budi adalah mahasiswa. Kesimpulan: Budi rajin belajar.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_006",
            category = "TIU",
            subCategory = TiuSubCategory.ANALOGI,
            questionText = "DOKTER : PASIEN = GURU : ...",
            options = """["A. Sekolah","B. Buku","C. Murid","D. Kelas","E. Pelajaran"]""",
            correctAnswer = 2,
            explanation = "Dokter merawat pasien, guru mengajar murid. Keduanya menunjukkan hubungan profesi dengan objek layanannya.",
            difficulty = "easy",
            year = 2024
        )
    )

    val tkpQuestions = listOf(
        QuestionEntity(
            id = "tkp_001",
            category = "TKP",
            subCategory = TkpSubCategory.PELAYANAN_PUBLIK,
            questionText = "Anda adalah petugas pelayanan publik. Seorang warga datang dengan keluhan yang sama yang sudah pernah disampaikan sebelumnya. Apa yang Anda lakukan?",
            options = """["A. Menyuruh warga untuk sabar menunggu","B. Menjelaskan bahwa keluhan sedang diproses dan memberikan estimasi waktu penyelesaian","C. Mengabaikan karena sudah pernah ditangani","D. Menyalahkan bagian lain yang menangani","E. Meminta warga untuk datang lagi besok"]""",
            correctAnswer = 1,
            tkpScores = """[2,5,1,1,2]""",
            explanation = "Pelayanan publik yang baik adalah memberikan informasi yang jelas dan transparan kepada masyarakat, termasuk progress dan estimasi waktu penyelesaian keluhan.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tkp_002",
            category = "TKP",
            subCategory = TkpSubCategory.JEJARING_KERJA,
            questionText = "Dalam sebuah rapat, rekan kerja Anda menyampaikan ide yang menurut Anda kurang tepat. Apa yang Anda lakukan?",
            options = """["A. Langsung menolak ide tersebut","B. Diam saja dan tidak berkomentar","C. Menyampaikan pendapat dengan sopan dan memberikan alternatif solusi","D. Mendukung ide tersebut meskipun tidak setuju","E. Membicarakan kekurangan ide tersebut dengan rekan lain setelah rapat"]""",
            correctAnswer = 2,
            tkpScores = """[2,2,5,1,1]""",
            explanation = "Dalam kerja tim, penting untuk menyampaikan pendapat secara profesional dan konstruktif, sambil tetap menghargai pendapat orang lain.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tkp_003",
            category = "TKP",
            subCategory = TkpSubCategory.PROFESIONALISME,
            questionText = "Atasan Anda memberikan tugas mendadak yang harus selesai hari ini, padahal Anda sudah memiliki rencana lain setelah jam kerja. Sikap Anda adalah...",
            options = """["A. Menolak karena sudah ada rencana","B. Menerima tugas dan membatalkan rencana pribadi","C. Meminta perpanjangan waktu sampai besok","D. Mendelegasikan ke rekan kerja lain","E. Menyelesaikan setengah-setengah agar bisa tetap menjalankan rencana"]""",
            correctAnswer = 1,
            tkpScores = """[1,5,3,2,1]""",
            explanation = "Profesionalisme berarti mengutamakan tanggung jawab pekerjaan. Tugas dari atasan yang urgent harus diprioritaskan.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tkp_004",
            category = "TKP",
            subCategory = TkpSubCategory.SOSIAL_BUDAYA,
            questionText = "Di kantor Anda terdapat rekan kerja dari berbagai suku dan agama. Bagaimana sikap Anda?",
            options = """["A. Bergaul hanya dengan yang satu suku","B. Menghormati semua rekan tanpa membedakan latar belakang","C. Menjaga jarak dengan yang berbeda agama","D. Memaksakan tradisi sendiri kepada rekan lain","E. Tidak peduli dengan keberagaman yang ada"]""",
            correctAnswer = 1,
            tkpScores = """[1,5,1,1,2]""",
            explanation = "Sebagai ASN, kita harus menjunjung tinggi nilai Bhinneka Tunggal Ika dan menghormati keberagaman di lingkungan kerja.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tkp_005",
            category = "TKP",
            subCategory = TkpSubCategory.ANTI_RADIKALISME,
            questionText = "Anda menemukan konten yang berisi ujaran kebencian di grup WhatsApp kantor. Apa yang Anda lakukan?",
            options = """["A. Membagikan ke grup lain","B. Mendiamkan saja","C. Menegur pengirim secara pribadi dan melaporkan ke atasan jika diperlukan","D. Keluar dari grup","E. Membalas dengan konten serupa"]""",
            correctAnswer = 2,
            tkpScores = """[1,2,5,2,1]""",
            explanation = "Sebagai ASN, kita harus aktif mencegah penyebaran konten negatif dan mengambil langkah yang tepat untuk menghentikannya.",
            difficulty = "medium",
            year = 2024
        )
    )

    val allQuestions = twkQuestions + tiuQuestions + tkpQuestions
}
