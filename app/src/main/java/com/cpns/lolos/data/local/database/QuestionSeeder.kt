package com.cpns.lolos.data.local.database

import com.cpns.lolos.data.local.entity.QuestionEntity
import com.google.gson.Gson

/**
 * Seeder untuk mengisi database dengan contoh soal CPNS
 */
object QuestionSeeder {

    private val gson = Gson()

    private fun List<String>.toJson(): String = gson.toJson(this)
    private fun List<Int>.toJsonInt(): String = gson.toJson(this)

    fun getSampleQuestions(): List<QuestionEntity> {
        return getTwkQuestions() + getTiuQuestions() + getTkpQuestions()
    }

    // ==================== TWK - TES WAWASAN KEBANGSAAN ====================
    private fun getTwkQuestions(): List<QuestionEntity> = listOf(
        // PANCASILA
        QuestionEntity(
            id = "twk_001",
            category = "TWK",
            subCategory = "pancasila",
            questionText = "Pancasila pertama kali dirumuskan dan disampaikan oleh Ir. Soekarno pada sidang BPUPKI tanggal...",
            options = listOf(
                "29 Mei 1945",
                "1 Juni 1945",
                "22 Juni 1945",
                "17 Agustus 1945",
                "18 Agustus 1945"
            ).toJson(),
            correctAnswer = 1,
            explanation = """
Ir. Soekarno menyampaikan pidato tentang dasar negara yang kemudian dikenal sebagai Pancasila pada tanggal 1 Juni 1945 dalam sidang BPUPKI. Tanggal ini kemudian ditetapkan sebagai Hari Lahir Pancasila.

Kronologi penting:
• 29 Mei 1945 - Sidang pertama BPUPKI dimulai
• 1 Juni 1945 - Soekarno menyampaikan pidato tentang dasar negara
• 22 Juni 1945 - Piagam Jakarta disusun
• 18 Agustus 1945 - Pancasila disahkan dalam UUD 1945
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "twk_002",
            category = "TWK",
            subCategory = "pancasila",
            questionText = "Lambang sila kedua Pancasila adalah...",
            options = listOf(
                "Bintang",
                "Rantai",
                "Pohon Beringin",
                "Kepala Banteng",
                "Padi dan Kapas"
            ).toJson(),
            correctAnswer = 1,
            explanation = """
Lambang sila-sila Pancasila:
• Sila 1 (Ketuhanan Yang Maha Esa) - Bintang
• Sila 2 (Kemanusiaan yang Adil dan Beradab) - Rantai
• Sila 3 (Persatuan Indonesia) - Pohon Beringin
• Sila 4 (Kerakyatan) - Kepala Banteng
• Sila 5 (Keadilan Sosial) - Padi dan Kapas

Rantai melambangkan hubungan antar manusia yang saling terkait, menunjukkan kemanusiaan dan persaudaraan.
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "twk_003",
            category = "TWK",
            subCategory = "pancasila",
            questionText = "Nilai Pancasila yang menjadi dasar bagi sila-sila lainnya adalah...",
            options = listOf(
                "Kemanusiaan",
                "Persatuan",
                "Kerakyatan",
                "Keadilan",
                "Ketuhanan"
            ).toJson(),
            correctAnswer = 4,
            explanation = """
Pancasila memiliki susunan hierarkis piramidal di mana Sila Pertama (Ketuhanan Yang Maha Esa) menjadi dasar bagi sila-sila lainnya.

Makna hierarkis:
• Sila 1 melandasi sila 2, 3, 4, dan 5
• Sila 2 dijiwai sila 1, melandasi sila 3, 4, 5
• Dan seterusnya

Ketuhanan menjadi sumber nilai tertinggi yang menjiwai kemanusiaan, persatuan, kerakyatan, dan keadilan.
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        // UUD 1945
        QuestionEntity(
            id = "twk_004",
            category = "TWK",
            subCategory = "uud1945",
            questionText = "UUD 1945 telah mengalami amandemen sebanyak...",
            options = listOf(
                "1 kali",
                "2 kali",
                "3 kali",
                "4 kali",
                "5 kali"
            ).toJson(),
            correctAnswer = 3,
            explanation = """
UUD 1945 telah diamandemen 4 kali:

1. Amandemen I (19 Oktober 1999)
   - Pembatasan kekuasaan Presiden
   - Penguatan fungsi DPR

2. Amandemen II (18 Agustus 2000)
   - HAM, Otonomi Daerah
   - Pertahanan dan Keamanan

3. Amandemen III (9 November 2001)
   - Pemilu langsung Presiden
   - Pembentukan MK dan DPD

4. Amandemen IV (11 Agustus 2002)
   - Penghapusan DPA
   - Anggaran pendidikan 20%
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "twk_005",
            category = "TWK",
            subCategory = "uud1945",
            questionText = "Menurut UUD 1945 Pasal 1 ayat (2), kedaulatan berada di tangan...",
            options = listOf(
                "Presiden",
                "MPR",
                "DPR",
                "Rakyat",
                "Mahkamah Konstitusi"
            ).toJson(),
            correctAnswer = 3,
            explanation = """
Pasal 1 ayat (2) UUD 1945 (setelah amandemen):
"Kedaulatan berada di tangan rakyat dan dilaksanakan menurut Undang-Undang Dasar."

Sebelum amandemen, bunyi pasal ini adalah:
"Kedaulatan adalah di tangan rakyat, dan dilakukan sepenuhnya oleh Majelis Permusyawaratan Rakyat."

Perubahan ini menegaskan bahwa kedaulatan langsung di tangan rakyat, bukan lembaga negara.
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "twk_006",
            category = "TWK",
            subCategory = "uud1945",
            questionText = "Lembaga negara yang berwenang menguji undang-undang terhadap UUD 1945 adalah...",
            options = listOf(
                "Mahkamah Agung",
                "Mahkamah Konstitusi",
                "DPR",
                "MPR",
                "Presiden"
            ).toJson(),
            correctAnswer = 1,
            explanation = """
Mahkamah Konstitusi (MK) memiliki kewenangan:
1. Menguji UU terhadap UUD (judicial review)
2. Memutus sengketa kewenangan antar lembaga negara
3. Memutus pembubaran partai politik
4. Memutus perselisihan hasil pemilu
5. Memberikan putusan atas pendapat DPR terkait pelanggaran Presiden

Sedangkan Mahkamah Agung menguji peraturan di bawah UU terhadap UU (peraturan pemerintah, Perda, dll).
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        // NKRI
        QuestionEntity(
            id = "twk_007",
            category = "TWK",
            subCategory = "nkri",
            questionText = "Bentuk negara Indonesia menurut UUD 1945 Pasal 1 ayat (1) adalah...",
            options = listOf(
                "Negara Federal",
                "Negara Serikat",
                "Negara Kesatuan",
                "Negara Konfederasi",
                "Negara Monarki"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
Pasal 1 ayat (1) UUD 1945:
"Negara Indonesia ialah Negara Kesatuan, yang berbentuk Republik."

Ciri Negara Kesatuan:
• Satu pemerintahan pusat yang berdaulat
• Satu UUD yang berlaku di seluruh wilayah
• Satu sistem hukum nasional
• Pembagian wilayah bersifat administratif

Indonesia menganut desentralisasi (otonomi daerah) namun tetap dalam kerangka NKRI.
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "twk_008",
            category = "TWK",
            subCategory = "nkri",
            questionText = "Batas wilayah Indonesia di sebelah utara berbatasan dengan negara...",
            options = listOf(
                "Australia dan Timor Leste",
                "Papua Nugini dan Australia",
                "Malaysia, Singapura, dan Filipina",
                "Vietnam dan Thailand",
                "Brunei Darussalam dan Myanmar"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
Batas wilayah Indonesia:

Utara:
• Malaysia (Kalimantan)
• Singapura (Selat)
• Filipina (Laut Sulawesi)

Selatan:
• Australia (Laut Timor, Laut Arafuru)
• Samudra Hindia

Timur:
• Papua Nugini (daratan)
• Timor Leste (daratan)

Barat:
• Samudra Hindia
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        // BHINNEKA TUNGGAL IKA
        QuestionEntity(
            id = "twk_009",
            category = "TWK",
            subCategory = "bhineka",
            questionText = "Semboyan Bhinneka Tunggal Ika berasal dari kitab...",
            options = listOf(
                "Negarakertagama",
                "Sutasoma",
                "Pararaton",
                "Arjunawiwaha",
                "Bharatayudha"
            ).toJson(),
            correctAnswer = 1,
            explanation = """
Bhinneka Tunggal Ika berasal dari Kitab Sutasoma karangan Mpu Tantular pada masa Kerajaan Majapahit (abad ke-14).

Kutipan lengkap:
"Bhinnêka tunggal ika tan hana dharma mangrwa"
(Berbeda-beda tetapi tetap satu, tidak ada kebenaran yang mendua)

Konteks asli: menggambarkan toleransi antara Hindu dan Buddha di Majapahit.

Kitab lain:
• Negarakertagama - Mpu Prapanca (sejarah Majapahit)
• Pararaton - Sejarah Singasari dan Majapahit
• Arjunawiwaha - Mpu Kanwa (Kakawin)
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "twk_010",
            category = "TWK",
            subCategory = "bhineka",
            questionText = "Indonesia memiliki berapa bahasa daerah yang diakui...",
            options = listOf(
                "Kurang dari 100 bahasa",
                "100-300 bahasa",
                "300-500 bahasa",
                "500-700 bahasa",
                "Lebih dari 700 bahasa"
            ).toJson(),
            correctAnswer = 4,
            explanation = """
Indonesia memiliki lebih dari 700 bahasa daerah yang tersebar di seluruh nusantara.

Data keberagaman Indonesia:
• 700+ bahasa daerah
• 1.340+ suku bangsa
• 17.504 pulau
• 6 agama resmi + kepercayaan

Bahasa daerah dengan penutur terbanyak:
1. Bahasa Jawa (~80 juta penutur)
2. Bahasa Sunda (~40 juta penutur)
3. Bahasa Madura (~14 juta penutur)
4. Bahasa Minangkabau (~6 juta penutur)
5. Bahasa Bugis (~5 juta penutur)
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        // SEJARAH
        QuestionEntity(
            id = "twk_011",
            category = "TWK",
            subCategory = "sejarah",
            questionText = "Proklamasi Kemerdekaan Indonesia dibacakan pada tanggal...",
            options = listOf(
                "16 Agustus 1945",
                "17 Agustus 1945",
                "18 Agustus 1945",
                "19 Agustus 1945",
                "20 Agustus 1945"
            ).toJson(),
            correctAnswer = 1,
            explanation = """
Proklamasi Kemerdekaan Indonesia dibacakan oleh Ir. Soekarno didampingi Moh. Hatta pada:
• Tanggal: 17 Agustus 1945
• Waktu: 10.00 WIB
• Tempat: Jalan Pegangsaan Timur No. 56, Jakarta

Kronologi:
• 15 Agustus 1945 - Jepang menyerah kepada Sekutu
• 16 Agustus 1945 - Peristiwa Rengasdengklok
• 17 Agustus 1945 - Proklamasi Kemerdekaan
• 18 Agustus 1945 - PPKI mengesahkan UUD 1945
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "twk_012",
            category = "TWK",
            subCategory = "sejarah",
            questionText = "Peristiwa yang melatarbelakangi dibacakannya Proklamasi di Jalan Pegangsaan Timur No. 56 adalah...",
            options = listOf(
                "Konferensi Meja Bundar",
                "Perjanjian Linggarjati",
                "Peristiwa Rengasdengklok",
                "Agresi Militer Belanda",
                "Perjanjian Roem-Royen"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
Peristiwa Rengasdengklok terjadi pada 16 Agustus 1945.

Kronologi:
1. Para pemuda (Sukarni, Wikana, Chaerul Saleh, dll) mendesak Soekarno-Hatta untuk segera memproklamasikan kemerdekaan
2. Soekarno-Hatta dibawa ke Rengasdengklok untuk "diamankan" dari pengaruh Jepang
3. Malam harinya, mereka kembali ke Jakarta
4. Teks proklamasi dirumuskan di rumah Laksamana Maeda
5. Keesokan harinya, 17 Agustus 1945, proklamasi dibacakan di Jalan Pegangsaan Timur No. 56 (rumah Soekarno)
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        // TATA NEGARA
        QuestionEntity(
            id = "twk_013",
            category = "TWK",
            subCategory = "tata_negara",
            questionText = "Presiden Indonesia memegang jabatan selama...",
            options = listOf(
                "4 tahun dan dapat dipilih kembali",
                "5 tahun dan dapat dipilih kembali untuk satu kali masa jabatan",
                "5 tahun dan dapat dipilih kembali tanpa batas",
                "6 tahun dan tidak dapat dipilih kembali",
                "7 tahun dan dapat dipilih kembali"
            ).toJson(),
            correctAnswer = 1,
            explanation = """
Menurut Pasal 7 UUD 1945 (setelah amandemen):
"Presiden dan Wakil Presiden memegang jabatan selama lima tahun, dan sesudahnya dapat dipilih kembali dalam jabatan yang sama, hanya untuk satu kali masa jabatan."

Artinya:
• Masa jabatan: 5 tahun
• Maksimal 2 periode (10 tahun)
• Dipilih langsung oleh rakyat (Pasal 6A)
• Pemilu serentak dengan legislatif
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "twk_014",
            category = "TWK",
            subCategory = "tata_negara",
            questionText = "Syarat calon Presiden Indonesia menurut UUD 1945 adalah...",
            options = listOf(
                "WNI, usia minimal 35 tahun, berpendidikan minimal SMA",
                "WNI sejak kelahiran, usia minimal 40 tahun",
                "WNI sejak kelahiran, tidak pernah menjadi WNA, mampu secara rohani dan jasmani",
                "WNI, usia minimal 21 tahun, sehat jasmani",
                "WNI, usia minimal 30 tahun, berpendidikan minimal S1"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
Pasal 6 ayat (1) UUD 1945:
"Calon Presiden dan calon Wakil Presiden harus seorang warga negara Indonesia sejak kelahirannya dan tidak pernah menerima kewarganegaraan lain karena kehendaknya sendiri, tidak pernah mengkhianati negara, serta mampu secara rohani dan jasmani untuk melaksanakan tugas dan kewajiban sebagai Presiden dan Wakil Presiden."

Syarat tambahan dalam UU:
• Bertakwa kepada Tuhan YME
• Usia minimal 40 tahun
• Bukan bekas PKI
• Dan lainnya
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "twk_015",
            category = "TWK",
            subCategory = "tata_negara",
            questionText = "Lembaga tinggi negara yang bertugas mengawasi pengelolaan keuangan negara adalah...",
            options = listOf(
                "Mahkamah Agung",
                "Mahkamah Konstitusi",
                "Badan Pemeriksa Keuangan",
                "Bank Indonesia",
                "Komisi Pemberantasan Korupsi"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
Badan Pemeriksa Keuangan (BPK) adalah lembaga tinggi negara yang bebas dan mandiri untuk memeriksa pengelolaan dan tanggung jawab tentang keuangan negara.

Dasar hukum: Pasal 23E UUD 1945

Tugas BPK:
• Memeriksa APBN dan APBD
• Memeriksa keuangan BUMN/BUMD
• Memberikan hasil pemeriksaan kepada DPR/DPD/DPRD
• Melaporkan temuan kerugian negara

Hasil pemeriksaan BPK diserahkan kepada DPR, DPD, dan DPRD sesuai kewenangannya.
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        // TAMBAHAN TWK 16-30
        QuestionEntity(
            id = "twk_016",
            category = "TWK",
            subCategory = "pancasila",
            questionText = "Rumusan Pancasila yang sah dan resmi terdapat dalam...",
            options = listOf(
                "Piagam Jakarta",
                "Pembukaan UUD 1945",
                "Batang Tubuh UUD 1945",
                "Dekrit Presiden 5 Juli 1959",
                "Ketetapan MPR"
            ).toJson(),
            correctAnswer = 1,
            explanation = """
Rumusan Pancasila yang sah dan resmi terdapat dalam Pembukaan UUD 1945 alinea keempat.

Pembukaan UUD 1945 tidak pernah diubah dalam 4 kali amandemen karena mengandung:
• Pernyataan kemerdekaan
• Tujuan negara
• Dasar negara (Pancasila)
• Bentuk negara

Piagam Jakarta berisi rumusan awal yang kemudian diubah pada 18 Agustus 1945.
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "twk_017",
            category = "TWK",
            subCategory = "pancasila",
            questionText = "Pengamalan Pancasila yang bersifat subjektif adalah...",
            options = listOf(
                "Pelaksanaan dalam peraturan perundang-undangan",
                "Pelaksanaan dalam kehidupan bermasyarakat",
                "Pelaksanaan oleh setiap pribadi warga negara",
                "Pelaksanaan oleh lembaga negara",
                "Pelaksanaan dalam kebijakan pemerintah"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
Pengamalan Pancasila dibagi menjadi:

1. Pengamalan Objektif:
   - Melalui peraturan perundang-undangan
   - Kebijakan negara dan pemerintah
   - Lembaga-lembaga negara

2. Pengamalan Subjektif:
   - Dilakukan oleh setiap pribadi warga negara
   - Dalam sikap dan perilaku sehari-hari
   - Berdasarkan kesadaran dan keyakinan

Pengamalan subjektif tergantung pada kesadaran masing-masing individu.
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "twk_018",
            category = "TWK",
            subCategory = "uud1945",
            questionText = "Pasal dalam UUD 1945 yang mengatur tentang hak asasi manusia adalah...",
            options = listOf(
                "Pasal 27",
                "Pasal 28",
                "Pasal 28A - 28J",
                "Pasal 29",
                "Pasal 30"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
HAM diatur dalam Pasal 28A - 28J UUD 1945 (Bab XA) hasil Amandemen II tahun 2000.

Isi pokok:
• 28A - Hak hidup
• 28B - Hak berkeluarga
• 28C - Hak mengembangkan diri
• 28D - Hak atas pengakuan hukum
• 28E - Hak beragama dan berpendapat
• 28F - Hak komunikasi dan informasi
• 28G - Hak perlindungan
• 28H - Hak kesejahteraan
• 28I - Hak yang tidak dapat dikurangi
• 28J - Kewajiban menghormati HAM orang lain
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "twk_019",
            category = "TWK",
            subCategory = "uud1945",
            questionText = "Menurut UUD 1945, kekuasaan kehakiman dilakukan oleh...",
            options = listOf(
                "Mahkamah Agung saja",
                "Mahkamah Konstitusi saja",
                "Mahkamah Agung dan Mahkamah Konstitusi",
                "Mahkamah Agung, Mahkamah Konstitusi, dan Komisi Yudisial",
                "Presiden"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
Pasal 24 ayat (2) UUD 1945:
"Kekuasaan kehakiman dilakukan oleh sebuah Mahkamah Agung dan badan peradilan yang berada di bawahnya... dan oleh sebuah Mahkamah Konstitusi."

Struktur Kekuasaan Kehakiman:
• Mahkamah Agung (MA) - puncak peradilan umum
• Mahkamah Konstitusi (MK) - peradilan konstitusional
• Komisi Yudisial (KY) - bukan pelaku kekuasaan kehakiman, hanya pengawas hakim
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "twk_020",
            category = "TWK",
            subCategory = "nkri",
            questionText = "Otonomi daerah di Indonesia diatur dalam...",
            options = listOf(
                "UU No. 22 Tahun 1999",
                "UU No. 32 Tahun 2004",
                "UU No. 23 Tahun 2014",
                "UU No. 5 Tahun 1974",
                "UU No. 1 Tahun 1945"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
Otonomi daerah saat ini diatur dalam UU No. 23 Tahun 2014 tentang Pemerintahan Daerah.

Sejarah UU Otonomi Daerah:
• UU No. 5 Tahun 1974 (Orde Baru - sentralistik)
• UU No. 22 Tahun 1999 (Reformasi - desentralisasi)
• UU No. 32 Tahun 2004 (Penyempurnaan)
• UU No. 23 Tahun 2014 (Berlaku saat ini)

Prinsip otonomi: desentralisasi, dekonsentrasi, dan tugas pembantuan.
            """.trimIndent(),
            difficulty = "hard",
            year = 2022
        ),

        QuestionEntity(
            id = "twk_021",
            category = "TWK",
            subCategory = "nkri",
            questionText = "Berapa jumlah provinsi di Indonesia saat ini?",
            options = listOf(
                "34 provinsi",
                "35 provinsi",
                "36 provinsi",
                "37 provinsi",
                "38 provinsi"
            ).toJson(),
            correctAnswer = 4,
            explanation = """
Indonesia saat ini memiliki 38 provinsi.

Provinsi terbaru:
• Papua Barat Daya (2022)
• Papua Selatan (2022)
• Papua Tengah (2022)
• Papua Pegunungan (2022)

Provinsi tertua: Jawa Barat, Jawa Tengah, Jawa Timur (sejak kemerdekaan)

Pembagian wilayah:
• 38 Provinsi
• 416 Kabupaten
• 98 Kota
            """.trimIndent(),
            difficulty = "medium",
            year = 2023
        ),

        QuestionEntity(
            id = "twk_022",
            category = "TWK",
            subCategory = "sejarah",
            questionText = "Organisasi pergerakan nasional pertama di Indonesia adalah...",
            options = listOf(
                "Sarekat Islam",
                "Budi Utomo",
                "Indische Partij",
                "PNI",
                "Muhammadiyah"
            ).toJson(),
            correctAnswer = 1,
            explanation = """
Budi Utomo didirikan pada 20 Mei 1908 di Jakarta, merupakan organisasi pergerakan nasional pertama.

Pendiri: Dr. Sutomo, dr. Wahidin Sudirohusodo

Tujuan awal:
• Memajukan pengajaran
• Memajukan kebudayaan Jawa

20 Mei kemudian diperingati sebagai Hari Kebangkitan Nasional.

Organisasi lain:
• Sarekat Islam (1912)
• Indische Partij (1912)
• Muhammadiyah (1912)
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "twk_023",
            category = "TWK",
            subCategory = "sejarah",
            questionText = "Sumpah Pemuda diikrarkan pada tanggal...",
            options = listOf(
                "20 Mei 1928",
                "28 Oktober 1928",
                "17 Agustus 1928",
                "10 November 1928",
                "1 Juni 1928"
            ).toJson(),
            correctAnswer = 1,
            explanation = """
Sumpah Pemuda diikrarkan pada 28 Oktober 1928 dalam Kongres Pemuda II di Jakarta.

Isi Sumpah Pemuda:
1. Kami putra dan putri Indonesia, mengaku bertumpah darah yang satu, tanah Indonesia
2. Kami putra dan putri Indonesia, mengaku berbangsa yang satu, bangsa Indonesia
3. Kami putra dan putri Indonesia, menjunjung bahasa persatuan, bahasa Indonesia

Tokoh: Wage Rudolf Supratman (menciptakan Indonesia Raya)
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "twk_024",
            category = "TWK",
            subCategory = "tata_negara",
            questionText = "DPD dipilih melalui...",
            options = listOf(
                "Pemilu legislatif dengan sistem proporsional",
                "Pemilu dengan sistem distrik",
                "Penunjukan oleh DPRD Provinsi",
                "Pemilihan oleh MPR",
                "Penunjukan oleh Presiden"
            ).toJson(),
            correctAnswer = 1,
            explanation = """
DPD (Dewan Perwakilan Daerah) dipilih melalui Pemilu dengan sistem distrik.

Ketentuan DPD:
• Dipilih langsung oleh rakyat
• Mewakili provinsi (4 orang per provinsi)
• Calon perseorangan (bukan dari parpol)
• Masa jabatan 5 tahun

Fungsi DPD:
• Mengajukan RUU terkait otonomi daerah
• Memberikan pertimbangan RUU APBN
• Mengawasi pelaksanaan UU terkait daerah
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "twk_025",
            category = "TWK",
            subCategory = "tata_negara",
            questionText = "Fungsi anggaran DPR adalah...",
            options = listOf(
                "Membuat undang-undang",
                "Mengawasi jalannya pemerintahan",
                "Menetapkan APBN bersama Presiden",
                "Memilih presiden dan wakil presiden",
                "Mengubah UUD"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
DPR memiliki 3 fungsi (Pasal 20A UUD 1945):

1. Fungsi Legislasi:
   - Membuat undang-undang bersama Presiden

2. Fungsi Anggaran:
   - Menetapkan APBN bersama Presiden
   - Membahas RAPBN

3. Fungsi Pengawasan:
   - Mengawasi pelaksanaan undang-undang
   - Mengawasi kebijakan pemerintah

Hak DPR: interpelasi, angket, menyatakan pendapat
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "twk_026",
            category = "TWK",
            subCategory = "bhineka",
            questionText = "Toleransi dalam kehidupan beragama di Indonesia dijamin oleh...",
            options = listOf(
                "Pasal 28 UUD 1945",
                "Pasal 29 UUD 1945",
                "Pasal 30 UUD 1945",
                "Pasal 31 UUD 1945",
                "Pasal 32 UUD 1945"
            ).toJson(),
            correctAnswer = 1,
            explanation = """
Pasal 29 UUD 1945:
(1) Negara berdasar atas Ketuhanan Yang Maha Esa.
(2) Negara menjamin kemerdekaan tiap-tiap penduduk untuk memeluk agamanya masing-masing dan untuk beribadat menurut agamanya dan kepercayaannya itu.

Implementasi:
• 6 agama resmi diakui: Islam, Kristen, Katolik, Hindu, Buddha, Konghucu
• Kebebasan memeluk agama dan berkepercayaan
• Perlindungan terhadap tempat ibadah
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "twk_027",
            category = "TWK",
            subCategory = "sejarah",
            questionText = "Konferensi Asia Afrika pertama diadakan di...",
            options = listOf(
                "Jakarta",
                "Bandung",
                "Surabaya",
                "Yogyakarta",
                "Semarang"
            ).toJson(),
            correctAnswer = 1,
            explanation = """
Konferensi Asia Afrika (KAA) pertama diadakan di Bandung pada 18-24 April 1955.

Dihadiri 29 negara Asia dan Afrika.

Hasil KAA - Dasasila Bandung:
1. Menghormati HAM
2. Menghormati kedaulatan negara
3. Mengakui persamaan ras dan bangsa
4. Tidak campur tangan urusan dalam negeri
5. Menghormati hak membela diri
6. Tidak menggunakan pakta pertahanan untuk kepentingan negara besar
7. Tidak melakukan agresi
8. Menyelesaikan sengketa secara damai
9. Kerjasama internasional
10. Menghormati hukum dan kewajiban internasional
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "twk_028",
            category = "TWK",
            subCategory = "tata_negara",
            questionText = "Presiden dapat diberhentikan dalam masa jabatannya oleh MPR atas usul DPR jika terbukti...",
            options = listOf(
                "Tidak mampu memimpin negara",
                "Melakukan pelanggaran hukum berupa pengkhianatan terhadap negara, korupsi, penyuapan, tindak pidana berat lainnya, atau perbuatan tercela",
                "Sakit berkepanjangan",
                "Tidak disukai rakyat",
                "Tidak lulus pilpres periode berikutnya"
            ).toJson(),
            correctAnswer = 1,
            explanation = """
Pasal 7A UUD 1945:
Presiden dapat diberhentikan jika terbukti:
• Pengkhianatan terhadap negara
• Korupsi
• Penyuapan
• Tindak pidana berat lainnya
• Perbuatan tercela
• Tidak lagi memenuhi syarat sebagai Presiden

Prosedur:
1. DPR mengajukan pendapat ke MK
2. MK memeriksa dan memutus
3. Jika terbukti, DPR mengadakan sidang paripurna untuk mengusulkan pemberhentian ke MPR
4. MPR mengadakan sidang untuk memutuskan
            """.trimIndent(),
            difficulty = "hard",
            year = 2022
        ),

        QuestionEntity(
            id = "twk_029",
            category = "TWK",
            subCategory = "pancasila",
            questionText = "Makna sila Kerakyatan yang Dipimpin oleh Hikmat Kebijaksanaan dalam Permusyawaratan/Perwakilan adalah...",
            options = listOf(
                "Rakyat harus patuh pada pemimpin",
                "Keputusan diambil dengan voting",
                "Keputusan diambil dengan musyawarah untuk mencapai mufakat",
                "Pemimpin berhak memutuskan sendiri",
                "Rakyat tidak perlu berpartisipasi"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
Sila keempat mengandung nilai-nilai:

1. Kedaulatan di tangan rakyat
2. Demokrasi perwakilan
3. Musyawarah untuk mufakat
4. Kepentingan umum di atas kepentingan pribadi
5. Tidak memaksakan kehendak

Dalam pengambilan keputusan:
• Utamakan musyawarah mufakat
• Jika tidak tercapai, boleh voting
• Menghargai perbedaan pendapat
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "twk_030",
            category = "TWK",
            subCategory = "nkri",
            questionText = "Wawasan Nusantara adalah...",
            options = listOf(
                "Cara pandang bangsa Indonesia tentang diri dan lingkungannya",
                "Kebijakan pertahanan keamanan",
                "Sistem pemerintahan daerah",
                "Undang-undang kelautan",
                "Perjanjian internasional"
            ).toJson(),
            correctAnswer = 0,
            explanation = """
Wawasan Nusantara adalah cara pandang bangsa Indonesia tentang diri dan lingkungannya berdasarkan Pancasila dan UUD 1945.

Unsur dasar:
1. Wadah - wilayah NKRI
2. Isi - cita-cita bangsa
3. Tata laku - sikap dan perilaku

Asas Wawasan Nusantara:
• Kepentingan yang sama
• Keadilan
• Kejujuran
• Solidaritas
• Kerjasama
• Kesetiaan
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        )
    )

    // ==================== TIU - TES INTELEGENSI UMUM ====================
    private fun getTiuQuestions(): List<QuestionEntity> = listOf(
        // VERBAL - SINONIM
        QuestionEntity(
            id = "tiu_001",
            category = "TIU",
            subCategory = "verbal_sinonim",
            questionText = "KONKRET >< ...",
            options = listOf(
                "Nyata",
                "Jelas",
                "Abstrak",
                "Tegas",
                "Pasti"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
Konkret = nyata, dapat dilihat/diraba
Lawan kata (antonim) dari konkret adalah ABSTRAK = tidak nyata, bersifat konsep/ide

Contoh:
• Konkret: Meja, kursi, bangunan
• Abstrak: Cinta, keadilan, demokrasi

Tips: Tanda "><" menunjukkan mencari antonim (lawan kata), bukan sinonim (persamaan kata).
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tiu_002",
            category = "TIU",
            subCategory = "verbal_sinonim",
            questionText = "LOYAL = ...",
            options = listOf(
                "Patuh",
                "Setia",
                "Jujur",
                "Rajin",
                "Sopan"
            ).toJson(),
            correctAnswer = 1,
            explanation = """
LOYAL berarti setia, taat, patuh pada janji atau kewajiban.

Penggunaan dalam kalimat:
• "Karyawan loyal terhadap perusahaan"
• "Loyal kepada negara dan bangsa"

Kata turunan:
• Loyalitas = kesetiaan
• Loyalis = pendukung setia
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tiu_003",
            category = "TIU",
            subCategory = "verbal_sinonim",
            questionText = "HETEROGEN >< ...",
            options = listOf(
                "Beragam",
                "Bermacam-macam",
                "Homogen",
                "Kompleks",
                "Majemuk"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
Heterogen = beragam, bermacam-macam, tidak sejenis
Lawan kata (antonim): HOMOGEN = sejenis, sama, seragam

Contoh:
• Masyarakat heterogen: beragam suku, agama, budaya
• Campuran homogen: air garam (tidak terlihat perbedaannya)

Tips: Hetero = berbeda, Homo = sama
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        // VERBAL - ANALOGI
        QuestionEntity(
            id = "tiu_004",
            category = "TIU",
            subCategory = "verbal_analogi",
            questionText = "Dokter : Pasien = Guru : ...",
            options = listOf(
                "Sekolah",
                "Buku",
                "Murid",
                "Kelas",
                "Pelajaran"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
Pola analogi: PROFESI : OBJEK YANG DILAYANI

Dokter melayani Pasien
Guru melayani Murid

Analogi serupa:
• Pengacara : Klien
• Pilot : Penumpang
• Pelayan : Pelanggan
• Polisi : Masyarakat
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tiu_005",
            category = "TIU",
            subCategory = "verbal_analogi",
            questionText = "Padi : Beras = Tebu : ...",
            options = listOf(
                "Manis",
                "Gula",
                "Perkebunan",
                "Tanaman",
                "Minuman"
            ).toJson(),
            correctAnswer = 1,
            explanation = """
Pola analogi: TANAMAN : HASIL OLAHAN

Padi diolah menjadi Beras
Tebu diolah menjadi Gula

Analogi serupa:
• Kapas : Benang
• Kelapa : Minyak
• Jagung : Tepung
• Kedelai : Tahu/Tempe
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        // NUMERIK - DERET ANGKA
        QuestionEntity(
            id = "tiu_006",
            category = "TIU",
            subCategory = "numerik_deret",
            questionText = "2, 5, 8, 11, 14, ...",
            options = listOf(
                "15",
                "16",
                "17",
                "18",
                "19"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
Ini adalah deret aritmatika dengan beda +3

Pola: +3, +3, +3, +3, +3
• 2 + 3 = 5
• 5 + 3 = 8
• 8 + 3 = 11
• 11 + 3 = 14
• 14 + 3 = 17

Jawaban: 17
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tiu_007",
            category = "TIU",
            subCategory = "numerik_deret",
            questionText = "3, 6, 12, 24, 48, ...",
            options = listOf(
                "72",
                "84",
                "96",
                "108",
                "120"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
Ini adalah deret geometri dengan rasio ×2

Pola: ×2, ×2, ×2, ×2, ×2
• 3 × 2 = 6
• 6 × 2 = 12
• 12 × 2 = 24
• 24 × 2 = 48
• 48 × 2 = 96

Jawaban: 96
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tiu_008",
            category = "TIU",
            subCategory = "numerik_deret",
            questionText = "1, 1, 2, 3, 5, 8, 13, ...",
            options = listOf(
                "18",
                "19",
                "20",
                "21",
                "22"
            ).toJson(),
            correctAnswer = 3,
            explanation = """
Ini adalah deret Fibonacci
Pola: Setiap bilangan = jumlah 2 bilangan sebelumnya

• 1 + 1 = 2
• 1 + 2 = 3
• 2 + 3 = 5
• 3 + 5 = 8
• 5 + 8 = 13
• 8 + 13 = 21

Jawaban: 21
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "tiu_009",
            category = "TIU",
            subCategory = "numerik_deret",
            questionText = "2, 3, 5, 8, 12, 17, ...",
            options = listOf(
                "22",
                "23",
                "24",
                "25",
                "26"
            ).toJson(),
            correctAnswer = 1,
            explanation = """
Ini adalah deret bertingkat (beda naik 1)

Beda: +1, +2, +3, +4, +5, +6
• 2 + 1 = 3
• 3 + 2 = 5
• 5 + 3 = 8
• 8 + 4 = 12
• 12 + 5 = 17
• 17 + 6 = 23

Jawaban: 23
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        // NUMERIK - ARITMATIKA
        QuestionEntity(
            id = "tiu_010",
            category = "TIU",
            subCategory = "numerik_aritmatika",
            questionText = "Jika 3x + 7 = 22, maka nilai x adalah...",
            options = listOf(
                "3",
                "4",
                "5",
                "6",
                "7"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
Penyelesaian:
3x + 7 = 22
3x = 22 - 7
3x = 15
x = 15 ÷ 3
x = 5

Pembuktian:
3(5) + 7 = 15 + 7 = 22 ✓

Jawaban: 5
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tiu_011",
            category = "TIU",
            subCategory = "numerik_aritmatika",
            questionText = "Sebuah persegi panjang memiliki panjang 12 cm dan lebar 8 cm. Berapakah kelilingnya?",
            options = listOf(
                "20 cm",
                "32 cm",
                "40 cm",
                "96 cm",
                "100 cm"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
Rumus keliling persegi panjang:
K = 2 × (p + l)

Diketahui:
• Panjang (p) = 12 cm
• Lebar (l) = 8 cm

Penyelesaian:
K = 2 × (12 + 8)
K = 2 × 20
K = 40 cm

Jawaban: 40 cm
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tiu_012",
            category = "TIU",
            subCategory = "numerik_aritmatika",
            questionText = "Harga sebuah baju setelah diskon 20% adalah Rp160.000. Berapakah harga baju sebelum diskon?",
            options = listOf(
                "Rp180.000",
                "Rp192.000",
                "Rp200.000",
                "Rp210.000",
                "Rp220.000"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
Setelah diskon 20%, harga menjadi 80% dari harga asli

Misalkan harga asli = x
80% × x = 160.000
0,8x = 160.000
x = 160.000 ÷ 0,8
x = 200.000

Pembuktian:
200.000 - (20% × 200.000)
= 200.000 - 40.000
= 160.000 ✓

Jawaban: Rp200.000
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        // LOGIKA - SILOGISME
        QuestionEntity(
            id = "tiu_013",
            category = "TIU",
            subCategory = "logika_silogisme",
            questionText = """
Semua dokter adalah lulusan kedokteran.
Budi adalah seorang dokter.
Kesimpulan yang tepat adalah...
            """.trimIndent(),
            options = listOf(
                "Budi bukan lulusan kedokteran",
                "Budi adalah lulusan kedokteran",
                "Semua lulusan kedokteran adalah dokter",
                "Budi mungkin lulusan kedokteran",
                "Tidak ada kesimpulan yang tepat"
            ).toJson(),
            correctAnswer = 1,
            explanation = """
Silogisme Kategoris:
• Premis Mayor: Semua dokter adalah lulusan kedokteran
• Premis Minor: Budi adalah seorang dokter
• Kesimpulan: Budi adalah lulusan kedokteran

Pola: Semua A adalah B, C adalah A, maka C adalah B

Hati-hati dengan kesimpulan yang terbalik:
"Semua lulusan kedokteran adalah dokter" SALAH karena tidak semua lulusan kedokteran menjadi dokter.
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "tiu_014",
            category = "TIU",
            subCategory = "logika_silogisme",
            questionText = """
Tidak ada mamalia yang bernapas dengan insang.
Semua ikan bernapas dengan insang.
Kesimpulan yang tepat adalah...
            """.trimIndent(),
            options = listOf(
                "Semua ikan adalah mamalia",
                "Sebagian ikan adalah mamalia",
                "Tidak ada ikan yang mamalia",
                "Semua mamalia adalah ikan",
                "Sebagian mamalia adalah ikan"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
Analisis:
• Premis 1: Tidak ada mamalia yang bernapas dengan insang
• Premis 2: Semua ikan bernapas dengan insang

Karena:
- Mamalia TIDAK bernapas dengan insang
- Ikan bernapas dengan insang

Maka: Tidak ada ikan yang merupakan mamalia

Kesimpulan: Tidak ada ikan yang mamalia (ikan dan mamalia adalah dua kelompok berbeda)
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "tiu_015",
            category = "TIU",
            subCategory = "logika_silogisme",
            questionText = """
Jika hujan turun, maka jalanan basah.
Jalanan tidak basah.
Kesimpulan yang tepat adalah...
            """.trimIndent(),
            options = listOf(
                "Hujan turun",
                "Hujan tidak turun",
                "Mungkin hujan turun",
                "Jalanan kering",
                "Tidak ada hubungan"
            ).toJson(),
            correctAnswer = 1,
            explanation = """
Ini adalah silogisme hipotesis (Modus Tollens)

Pola: Jika P maka Q. Bukan Q. Maka bukan P.

• Premis 1: Jika hujan turun (P), maka jalanan basah (Q)
• Premis 2: Jalanan tidak basah (bukan Q)
• Kesimpulan: Hujan tidak turun (bukan P)

Modus Tollens: Menolak konsekuen berarti menolak anteseden.
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        // FIGURAL
        QuestionEntity(
            id = "tiu_016",
            category = "TIU",
            subCategory = "figural",
            questionText = "Jika suatu bangun diputar 180°, maka posisinya akan...",
            options = listOf(
                "Tetap sama",
                "Terbalik",
                "Miring 45°",
                "Bergeser ke kanan",
                "Bergantung pada bentuk bangun"
            ).toJson(),
            correctAnswer = 1,
            explanation = """
Rotasi 180° menghasilkan bayangan yang terbalik dari posisi awal.

Contoh:
• Huruf "A" diputar 180° menjadi "∀"
• Angka "6" diputar 180° menjadi "9"
• Segitiga dengan puncak di atas menjadi puncak di bawah

Rotasi lainnya:
• 90° searah jarum jam = miring ke kanan
• 90° berlawanan jarum jam = miring ke kiri
• 360° = kembali ke posisi awal
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tiu_017",
            category = "TIU",
            subCategory = "numerik_perbandingan",
            questionText = "Perbandingan umur Ayah dan Anak adalah 5:2. Jika umur Anak 14 tahun, berapakah umur Ayah?",
            options = listOf(
                "28 tahun",
                "30 tahun",
                "32 tahun",
                "35 tahun",
                "40 tahun"
            ).toJson(),
            correctAnswer = 3,
            explanation = """
Perbandingan Ayah : Anak = 5 : 2

Jika umur Anak = 14 tahun (setara dengan 2 bagian)
Maka 1 bagian = 14 ÷ 2 = 7 tahun

Umur Ayah = 5 bagian = 5 × 7 = 35 tahun

Pembuktian:
35 : 14 = 5 : 2 ✓

Jawaban: 35 tahun
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tiu_018",
            category = "TIU",
            subCategory = "numerik_aritmatika",
            questionText = "Sebuah mobil menempuh jarak 240 km dalam waktu 4 jam. Berapakah kecepatan rata-rata mobil tersebut?",
            options = listOf(
                "40 km/jam",
                "50 km/jam",
                "60 km/jam",
                "70 km/jam",
                "80 km/jam"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
Rumus kecepatan:
v = s ÷ t

Diketahui:
• Jarak (s) = 240 km
• Waktu (t) = 4 jam

Penyelesaian:
v = 240 ÷ 4
v = 60 km/jam

Jawaban: 60 km/jam

Rumus terkait:
• s = v × t (jarak = kecepatan × waktu)
• t = s ÷ v (waktu = jarak ÷ kecepatan)
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        // TAMBAHAN TIU 19-35
        QuestionEntity(
            id = "tiu_019",
            category = "TIU",
            subCategory = "verbal_sinonim",
            questionText = "PARADOKS = ...",
            options = listOf(
                "Persamaan",
                "Pertentangan",
                "Perbandingan",
                "Perbedaan",
                "Perpaduan"
            ).toJson(),
            correctAnswer = 1,
            explanation = """
PARADOKS berarti pertentangan atau kontradiksi.

Paradoks adalah pernyataan yang tampak bertentangan dengan akal sehat tetapi mengandung kebenaran.

Contoh:
• "Makin banyak belajar, makin merasa tidak tahu"
• "Air yang diam menghanyutkan"
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "tiu_020",
            category = "TIU",
            subCategory = "verbal_sinonim",
            questionText = "EKUIVALEN = ...",
            options = listOf(
                "Berbeda",
                "Setara",
                "Bertentangan",
                "Berlebihan",
                "Berkurang"
            ).toJson(),
            correctAnswer = 1,
            explanation = """
EKUIVALEN berarti setara, sama nilainya, atau sebanding.

Contoh penggunaan:
• "Nilai 80 ekuivalen dengan predikat B"
• "Gelar S1 ekuivalen dengan diploma empat"
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tiu_021",
            category = "TIU",
            subCategory = "verbal_analogi",
            questionText = "Hakim : Pengadilan = Dosen : ...",
            options = listOf(
                "Mahasiswa",
                "Kampus",
                "Kuliah",
                "Gelar",
                "Ijazah"
            ).toJson(),
            correctAnswer = 1,
            explanation = """
Pola analogi: PROFESI : TEMPAT KERJA

Hakim bekerja di Pengadilan
Dosen bekerja di Kampus

Analogi serupa:
• Dokter : Rumah Sakit
• Pilot : Kokpit
• Guru : Sekolah
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tiu_022",
            category = "TIU",
            subCategory = "verbal_analogi",
            questionText = "Mata : Melihat = Telinga : ...",
            options = listOf(
                "Suara",
                "Mendengar",
                "Musik",
                "Kepala",
                "Bicara"
            ).toJson(),
            correctAnswer = 1,
            explanation = """
Pola analogi: ORGAN : FUNGSI

Mata berfungsi untuk Melihat
Telinga berfungsi untuk Mendengar

Analogi serupa:
• Hidung : Mencium
• Lidah : Mengecap
• Kulit : Meraba
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tiu_023",
            category = "TIU",
            subCategory = "numerik_deret",
            questionText = "1, 4, 9, 16, 25, ...",
            options = listOf(
                "30",
                "32",
                "34",
                "36",
                "38"
            ).toJson(),
            correctAnswer = 3,
            explanation = """
Ini adalah deret bilangan kuadrat (pangkat 2)

Pola: n²
• 1² = 1
• 2² = 4
• 3² = 9
• 4² = 16
• 5² = 25
• 6² = 36

Jawaban: 36
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tiu_024",
            category = "TIU",
            subCategory = "numerik_deret",
            questionText = "2, 6, 18, 54, ...",
            options = listOf(
                "108",
                "126",
                "162",
                "180",
                "216"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
Ini adalah deret geometri dengan rasio ×3

Pola: ×3, ×3, ×3, ×3
• 2 × 3 = 6
• 6 × 3 = 18
• 18 × 3 = 54
• 54 × 3 = 162

Jawaban: 162
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tiu_025",
            category = "TIU",
            subCategory = "numerik_aritmatika",
            questionText = "Jika A = 2B dan B = 3C, maka A = ... C",
            options = listOf(
                "3",
                "5",
                "6",
                "8",
                "9"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
Diketahui:
• A = 2B
• B = 3C

Substitusi B ke persamaan A:
A = 2B
A = 2(3C)
A = 6C

Jadi A = 6C

Jawaban: 6
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "tiu_026",
            category = "TIU",
            subCategory = "numerik_aritmatika",
            questionText = "Rata-rata nilai 5 orang siswa adalah 75. Jika satu siswa nilainya 85, berapa rata-rata nilai 4 siswa lainnya?",
            options = listOf(
                "70",
                "72",
                "72,5",
                "73",
                "74"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
Rata-rata 5 siswa = 75
Total nilai = 75 × 5 = 375

Satu siswa nilainya 85
Nilai 4 siswa lainnya = 375 - 85 = 290

Rata-rata 4 siswa = 290 ÷ 4 = 72,5

Jawaban: 72,5
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "tiu_027",
            category = "TIU",
            subCategory = "numerik_aritmatika",
            questionText = "Sebuah tangki berisi 3/4 air. Setelah digunakan 15 liter, tangki tinggal 1/2 penuh. Berapa kapasitas tangki?",
            options = listOf(
                "40 liter",
                "50 liter",
                "60 liter",
                "70 liter",
                "80 liter"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
Misalkan kapasitas tangki = x liter

Kondisi awal: 3/4 × x
Setelah digunakan 15 liter: 3/4x - 15
Kondisi akhir: 1/2 × x

Persamaan:
3/4x - 15 = 1/2x
3/4x - 1/2x = 15
3/4x - 2/4x = 15
1/4x = 15
x = 60

Jawaban: 60 liter
            """.trimIndent(),
            difficulty = "hard",
            year = 2022
        ),

        QuestionEntity(
            id = "tiu_028",
            category = "TIU",
            subCategory = "logika_silogisme",
            questionText = """
Semua pegawai negeri harus disiplin.
Andi adalah pegawai negeri.
Kesimpulan yang tepat adalah...
            """.trimIndent(),
            options = listOf(
                "Andi tidak perlu disiplin",
                "Andi harus disiplin",
                "Semua orang disiplin adalah pegawai negeri",
                "Andi mungkin disiplin",
                "Disiplin tidak penting"
            ).toJson(),
            correctAnswer = 1,
            explanation = """
Silogisme Kategoris:
• Premis Mayor: Semua pegawai negeri harus disiplin
• Premis Minor: Andi adalah pegawai negeri
• Kesimpulan: Andi harus disiplin

Pola: Semua A adalah B, C adalah A, maka C adalah B
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tiu_029",
            category = "TIU",
            subCategory = "logika_silogisme",
            questionText = """
Jika Budi belajar dengan giat, maka ia lulus ujian.
Budi lulus ujian.
Kesimpulan yang tepat adalah...
            """.trimIndent(),
            options = listOf(
                "Budi pasti belajar dengan giat",
                "Budi mungkin belajar dengan giat",
                "Budi tidak belajar dengan giat",
                "Budi malas belajar",
                "Tidak ada kesimpulan yang pasti"
            ).toJson(),
            correctAnswer = 1,
            explanation = """
Ini adalah logika kondisional.

• Premis 1: Jika P maka Q (Jika belajar giat, maka lulus)
• Premis 2: Q (Budi lulus)

Kesimpulan: P tidak pasti (affirming the consequent fallacy)
Budi bisa saja lulus karena faktor lain.

Jadi kesimpulan yang tepat: Budi MUNGKIN belajar dengan giat.
            """.trimIndent(),
            difficulty = "hard",
            year = 2022
        ),

        QuestionEntity(
            id = "tiu_030",
            category = "TIU",
            subCategory = "numerik_perbandingan",
            questionText = "Perbandingan uang Andi dan Budi adalah 3:5. Jika selisih uang mereka Rp40.000, berapa jumlah uang mereka?",
            options = listOf(
                "Rp120.000",
                "Rp140.000",
                "Rp160.000",
                "Rp180.000",
                "Rp200.000"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
Perbandingan Andi : Budi = 3 : 5
Selisih bagian = 5 - 3 = 2 bagian

Selisih = Rp40.000
1 bagian = 40.000 ÷ 2 = Rp20.000

Uang Andi = 3 × 20.000 = Rp60.000
Uang Budi = 5 × 20.000 = Rp100.000

Jumlah = 60.000 + 100.000 = Rp160.000

Jawaban: Rp160.000
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "tiu_031",
            category = "TIU",
            subCategory = "numerik_aritmatika",
            questionText = "Sebuah pekerjaan dapat diselesaikan oleh 6 orang dalam 12 hari. Jika pekerjaan itu dikerjakan oleh 9 orang, berapa hari selesainya?",
            options = listOf(
                "6 hari",
                "8 hari",
                "10 hari",
                "14 hari",
                "18 hari"
            ).toJson(),
            correctAnswer = 1,
            explanation = """
Ini adalah perbandingan berbalik nilai.

Semakin banyak orang, semakin sedikit waktu.

Rumus: n₁ × t₁ = n₂ × t₂
6 × 12 = 9 × t₂
72 = 9 × t₂
t₂ = 72 ÷ 9
t₂ = 8 hari

Jawaban: 8 hari
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "tiu_032",
            category = "TIU",
            subCategory = "verbal_sinonim",
            questionText = "IMPLISIT >< ...",
            options = listOf(
                "Tersembunyi",
                "Tersirat",
                "Eksplisit",
                "Tertutup",
                "Terbatas"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
IMPLISIT = tersirat, tidak dinyatakan secara langsung
Lawan kata: EKSPLISIT = tersurat, dinyatakan secara jelas dan tegas

Contoh:
• Implisit: "Sepertinya kamu perlu istirahat" (tersirat: kamu terlihat lelah)
• Eksplisit: "Kamu terlihat lelah, sebaiknya istirahat"
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "tiu_033",
            category = "TIU",
            subCategory = "numerik_deret",
            questionText = "100, 81, 64, 49, 36, ...",
            options = listOf(
                "16",
                "20",
                "25",
                "28",
                "30"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
Ini adalah deret bilangan kuadrat menurun

Pola: n² dengan n menurun dari 10
• 10² = 100
• 9² = 81
• 8² = 64
• 7² = 49
• 6² = 36
• 5² = 25

Jawaban: 25
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "tiu_034",
            category = "TIU",
            subCategory = "numerik_aritmatika",
            questionText = "25% dari 80% dari 500 adalah...",
            options = listOf(
                "80",
                "90",
                "100",
                "110",
                "120"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
Langkah 1: Hitung 80% dari 500
80% × 500 = 0,8 × 500 = 400

Langkah 2: Hitung 25% dari 400
25% × 400 = 0,25 × 400 = 100

Atau langsung: 25% × 80% × 500
= 0,25 × 0,8 × 500
= 0,2 × 500
= 100

Jawaban: 100
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tiu_035",
            category = "TIU",
            subCategory = "verbal_analogi",
            questionText = "Tangan : Jari = Kaki : ...",
            options = listOf(
                "Lutut",
                "Betis",
                "Jari kaki",
                "Telapak",
                "Tumit"
            ).toJson(),
            correctAnswer = 2,
            explanation = """
Pola analogi: BAGIAN TUBUH : SUB-BAGIAN

Tangan memiliki Jari (tangan)
Kaki memiliki Jari kaki

Analogi serupa:
• Muka : Mata
• Mulut : Gigi
• Kepala : Rambut
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        )
    )

    // ==================== TKP - TES KARAKTERISTIK PRIBADI ====================
    private fun getTkpQuestions(): List<QuestionEntity> = listOf(
        // PELAYANAN PUBLIK
        QuestionEntity(
            id = "tkp_001",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Anda adalah petugas pelayanan. Seorang warga datang dengan keluhan yang rumit dan membutuhkan waktu lama untuk diselesaikan, padahal antrian masih panjang. Apa yang Anda lakukan?",
            options = listOf(
                "Meminta warga tersebut untuk datang lagi besok",
                "Menyelesaikan masalahnya dengan cepat meskipun tidak tuntas",
                "Meminta maaf kepada antrian dan menjelaskan situasinya, lalu membantu warga tersebut sebaik mungkin",
                "Menyuruh warga tersebut ke bagian lain",
                "Mengabaikan dan melayani antrian berikutnya"
            ).toJson(),
            correctAnswer = 2,
            tkpScores = listOf(2, 3, 5, 1, 1).toJsonInt(),
            explanation = """
Pilihan terbaik adalah meminta maaf kepada antrian dan membantu warga sebaik mungkin karena:
• Menunjukkan profesionalisme
• Tetap mengutamakan kepentingan masyarakat
• Berkomunikasi dengan baik

Skor:
A (2) - Menunda masalah
B (3) - Kurang tuntas
C (5) - Solusi terbaik ✓
D (1) - Menghindar dari tanggung jawab
E (1) - Tidak bertanggung jawab
            """.trimIndent(),
            difficulty = "medium",
            year = 2023
        ),

        QuestionEntity(
            id = "tkp_002",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Seorang warga marah-marah karena berkasnya tidak kunjung selesai. Bagaimana sikap Anda?",
            options = listOf(
                "Memarahi balik karena tidak sopan",
                "Mengabaikan dan tetap bekerja",
                "Mendengarkan keluhannya dengan sabar, meminta maaf, dan menjelaskan prosesnya",
                "Meminta warga untuk berbicara dengan atasan",
                "Menyalahkan bagian lain yang memperlambat proses"
            ).toJson(),
            correctAnswer = 2,
            tkpScores = listOf(1, 2, 5, 3, 1).toJsonInt(),
            explanation = """
Sikap terbaik adalah mendengarkan dengan sabar dan menjelaskan karena:
• Menunjukkan empati dan profesionalisme
• Tidak memperkeruh suasana
• Memberikan solusi dan kejelasan

Skor:
A (1) - Tidak profesional
B (2) - Pasif, tidak menyelesaikan
C (5) - Sikap terbaik ✓
D (3) - Mengalihkan tanggung jawab
E (1) - Menyalahkan pihak lain
            """.trimIndent(),
            difficulty = "medium",
            year = 2023
        ),

        QuestionEntity(
            id = "tkp_003",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Jam pelayanan sudah berakhir, tetapi masih ada satu warga yang belum terlayani karena datang terlambat. Apa yang Anda lakukan?",
            options = listOf(
                "Menolak melayani karena sudah lewat jam",
                "Menyuruhnya datang besok pagi-pagi",
                "Tetap melayaninya meskipun sudah lewat jam",
                "Meminta izin atasan terlebih dahulu untuk melayaninya",
                "Meminta rekan yang masih senggang untuk melayani"
            ).toJson(),
            correctAnswer = 3,
            tkpScores = listOf(2, 2, 4, 5, 3).toJsonInt(),
            explanation = """
Meminta izin atasan adalah pilihan terbaik karena:
• Menghormati prosedur
• Tetap mengutamakan pelayanan
• Tidak mengambil keputusan sendiri untuk hal di luar wewenang

Skor:
A (2) - Kaku terhadap aturan
B (2) - Tidak solutif
C (4) - Bagus tapi tidak koordinasi
D (5) - Pilihan terbaik ✓
E (3) - Alternatif yang baik
            """.trimIndent(),
            difficulty = "medium",
            year = 2023
        ),

        // JEJARING KERJA
        QuestionEntity(
            id = "tkp_004",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Rekan kerja Anda kesulitan menyelesaikan tugasnya. Apa yang Anda lakukan?",
            options = listOf(
                "Membiarkannya karena itu tanggung jawabnya",
                "Melaporkan ke atasan bahwa rekan tidak kompeten",
                "Menawarkan bantuan tanpa diminta",
                "Menunggu sampai diminta tolong",
                "Mengerjakan tugas tersebut sendirian"
            ).toJson(),
            correctAnswer = 2,
            tkpScores = listOf(1, 1, 5, 3, 2).toJsonInt(),
            explanation = """
Menawarkan bantuan tanpa diminta menunjukkan:
• Kepedulian terhadap rekan
• Semangat kerja sama tim
• Inisiatif yang baik

Skor:
A (1) - Tidak peduli
B (1) - Menjatuhkan rekan
C (5) - Sikap terbaik ✓
D (3) - Kurang inisiatif
E (2) - Tidak kolaboratif
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tkp_005",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Dalam rapat, pendapat Anda ditolak oleh mayoritas peserta. Bagaimana sikap Anda?",
            options = listOf(
                "Marah dan keluar dari rapat",
                "Menerima keputusan bersama meskipun berbeda pendapat",
                "Tetap memaksakan pendapat",
                "Diam dan tidak berpartisipasi lagi",
                "Mengkritik pendapat orang lain"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Menerima keputusan bersama menunjukkan:
• Kedewasaan dalam bersikap
• Menghargai musyawarah
• Kemampuan bekerja dalam tim

Skor:
A (1) - Tidak dewasa
B (5) - Sikap terbaik ✓
C (2) - Egois
D (2) - Tidak konstruktif
E (1) - Tidak menghargai orang lain
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tkp_006",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Anda mendapat tugas kelompok dengan deadline ketat. Salah satu anggota tidak berkontribusi. Apa yang Anda lakukan?",
            options = listOf(
                "Melaporkan ke atasan agar anggota tersebut ditegur",
                "Mengerjakan bagiannya agar tugas selesai tepat waktu",
                "Berkomunikasi dengannya untuk mengetahui kendalanya dan mencari solusi bersama",
                "Membiarkan saja dan fokus pada bagian sendiri",
                "Menegurnya di depan anggota lain"
            ).toJson(),
            correctAnswer = 2,
            tkpScores = listOf(2, 3, 5, 1, 1).toJsonInt(),
            explanation = """
Berkomunikasi untuk mencari solusi bersama karena:
• Menyelesaikan masalah secara konstruktif
• Menghargai rekan kerja
• Menjaga keharmonisan tim

Skor:
A (2) - Terlalu cepat eskalasi
B (3) - Baik tapi tidak menyelesaikan akar masalah
C (5) - Sikap terbaik ✓
D (1) - Tidak peduli
E (1) - Mempermalukan orang
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        // PROFESIONALISME
        QuestionEntity(
            id = "tkp_007",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Atasan memberikan tugas tambahan saat Anda hendak pulang. Bagaimana sikap Anda?",
            options = listOf(
                "Menolak karena sudah waktunya pulang",
                "Menerima dengan berat hati dan mengerjakannya dengan malas",
                "Menerima tugas dan mengerjakannya dengan sebaik-baiknya",
                "Meminta rekan lain untuk menggantikan",
                "Menerima tapi mengerjakannya besok"
            ).toJson(),
            correctAnswer = 2,
            tkpScores = listOf(1, 2, 5, 2, 3).toJsonInt(),
            explanation = """
Menerima dan mengerjakan dengan baik menunjukkan:
• Profesionalisme tinggi
• Dedikasi terhadap pekerjaan
• Loyalitas kepada organisasi

Skor:
A (1) - Menolak tanggung jawab
B (2) - Tidak profesional
C (5) - Sikap terbaik ✓
D (2) - Menghindar
E (3) - Kurang responsif
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tkp_008",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda menemukan kesalahan dalam pekerjaan yang sudah diserahkan ke atasan. Apa yang Anda lakukan?",
            options = listOf(
                "Berharap atasan tidak menyadarinya",
                "Menunggu atasan menemukan kesalahan tersebut",
                "Segera melapor ke atasan dan memperbaikinya",
                "Menyalahkan rekan yang membantu",
                "Menganggap itu bukan masalah besar"
            ).toJson(),
            correctAnswer = 2,
            tkpScores = listOf(1, 2, 5, 1, 2).toJsonInt(),
            explanation = """
Segera melapor dan memperbaiki menunjukkan:
• Kejujuran dan integritas
• Tanggung jawab atas pekerjaan
• Profesionalisme

Skor:
A (1) - Tidak jujur
B (2) - Pasif
C (5) - Sikap terbaik ✓
D (1) - Tidak bertanggung jawab
E (2) - Meremehkan kualitas
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tkp_009",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda ditawari proyek yang menguntungkan secara pribadi tetapi bertentangan dengan kepentingan instansi. Apa yang Anda lakukan?",
            options = listOf(
                "Menerima karena menguntungkan",
                "Menolak dan melaporkan kepada atasan",
                "Mempertimbangkan untung ruginya",
                "Menerima secara diam-diam",
                "Meminta pendapat rekan kerja"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 1, 3).toJsonInt(),
            explanation = """
Menolak dan melaporkan menunjukkan:
• Integritas tinggi
• Mengutamakan kepentingan instansi
• Menghindari konflik kepentingan

Skor:
A (1) - Tidak berintegritas
B (5) - Sikap terbaik ✓
C (2) - Ragu-ragu
D (1) - Tidak jujur
E (3) - Kurang tegas
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        // SOSIAL BUDAYA
        QuestionEntity(
            id = "tkp_010",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Di kantor, Anda memiliki rekan kerja dari berbagai suku dan agama. Bagaimana sikap Anda?",
            options = listOf(
                "Bergaul hanya dengan yang satu suku",
                "Menghormati perbedaan dan bergaul dengan semua",
                "Menghindari pembahasan tentang suku dan agama",
                "Membahas keunggulan suku sendiri",
                "Memaksakan budaya sendiri kepada orang lain"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 3, 1, 1).toJsonInt(),
            explanation = """
Menghormati perbedaan dan bergaul dengan semua menunjukkan:
• Sikap toleran
• Menghargai keberagaman
• Sesuai dengan Bhinneka Tunggal Ika

Skor:
A (1) - Diskriminatif
B (5) - Sikap terbaik ✓
C (3) - Netral tapi kurang inklusif
D (1) - Chauvinistik
E (1) - Tidak menghargai perbedaan
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tkp_011",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Rekan kerja Anda sedang berpuasa. Apa yang Anda lakukan saat jam makan siang?",
            options = listOf(
                "Makan di depannya seperti biasa",
                "Mengejeknya karena tidak makan",
                "Makan di tempat yang tidak terlihat olehnya sebagai bentuk penghormatan",
                "Mengajaknya makan bersama",
                "Tidak peduli"
            ).toJson(),
            correctAnswer = 2,
            tkpScores = listOf(2, 1, 5, 1, 2).toJsonInt(),
            explanation = """
Makan di tempat yang tidak terlihat menunjukkan:
• Penghormatan terhadap yang berpuasa
• Toleransi beragama
• Kepekaan sosial

Skor:
A (2) - Kurang peka
B (1) - Tidak menghormati
C (5) - Sikap terbaik ✓
D (1) - Tidak memahami situasi
E (2) - Acuh tak acuh
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        // ANTI RADIKALISME
        QuestionEntity(
            id = "tkp_012",
            category = "TKP",
            subCategory = "anti_radikalisme",
            questionText = "Anda melihat konten di media sosial yang berisi ujaran kebencian terhadap kelompok tertentu. Apa yang Anda lakukan?",
            options = listOf(
                "Membagikan konten tersebut",
                "Mengabaikannya",
                "Melaporkan konten tersebut ke platform",
                "Ikut berkomentar menyerang",
                "Menyukai konten tersebut"
            ).toJson(),
            correctAnswer = 2,
            tkpScores = listOf(1, 2, 5, 1, 1).toJsonInt(),
            explanation = """
Melaporkan konten menunjukkan:
• Sikap anti radikalisme
• Tidak menyebarkan kebencian
• Bertanggung jawab sebagai warga digital

Skor:
A (1) - Menyebarkan kebencian
B (2) - Pasif
C (5) - Sikap terbaik ✓
D (1) - Ikut menyerang
E (1) - Mendukung konten negatif
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tkp_013",
            category = "TKP",
            subCategory = "anti_radikalisme",
            questionText = "Seseorang mengajak Anda untuk bergabung dengan kelompok yang menentang kebijakan pemerintah dengan cara kekerasan. Bagaimana sikap Anda?",
            options = listOf(
                "Bergabung karena penasaran",
                "Mempertimbangkan terlebih dahulu",
                "Menolak tegas dan melaporkan ke pihak berwenang",
                "Pura-pura setuju lalu menghindar",
                "Mengikuti tapi tidak aktif"
            ).toJson(),
            correctAnswer = 2,
            tkpScores = listOf(1, 2, 5, 2, 1).toJsonInt(),
            explanation = """
Menolak tegas dan melaporkan menunjukkan:
• Sikap tegas menolak kekerasan
• Menjunjung tinggi hukum
• Kewarganegaraan yang baik

Skor:
A (1) - Berbahaya
B (2) - Ragu-ragu
C (5) - Sikap terbaik ✓
D (2) - Tidak tegas
E (1) - Ikut terlibat
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        // TEKNOLOGI INFORMASI
        QuestionEntity(
            id = "tkp_014",
            category = "TKP",
            subCategory = "teknologi_informasi",
            questionText = "Instansi Anda menerapkan sistem kerja digital baru yang rumit. Bagaimana sikap Anda?",
            options = listOf(
                "Menolak karena sudah nyaman dengan cara lama",
                "Belajar dan beradaptasi dengan sistem baru",
                "Menunggu perintah atasan untuk menggunakannya",
                "Menyuruh rekan lain yang lebih muda untuk mengoperasikannya",
                "Mengkritik sistem baru di depan atasan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 2, 1).toJsonInt(),
            explanation = """
Belajar dan beradaptasi menunjukkan:
• Keterbukaan terhadap perubahan
• Kemauan untuk berkembang
• Sikap profesional

Skor:
A (1) - Menolak perubahan
B (5) - Sikap terbaik ✓
C (2) - Pasif
D (2) - Menghindar
E (1) - Tidak konstruktif
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tkp_015",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Seorang warga lansia kesulitan mengisi formulir online. Apa yang Anda lakukan?",
            options = listOf(
                "Menyuruhnya pulang dan minta bantuan keluarga",
                "Memberikan brosur petunjuk",
                "Membantu mengisi formulir dengan sabar sambil menjelaskan",
                "Meminta petugas lain untuk membantu",
                "Mengarahkan ke ruang komputer umum"
            ).toJson(),
            correctAnswer = 2,
            tkpScores = listOf(1, 2, 5, 3, 2).toJsonInt(),
            explanation = """
Membantu dengan sabar menunjukkan:
• Empati terhadap warga
• Pelayanan prima
• Tidak diskriminatif terhadap kemampuan teknologi

Skor:
A (1) - Tidak peduli
B (2) - Kurang personal
C (5) - Sikap terbaik ✓
D (3) - Alternatif yang baik
E (2) - Kurang membantu
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        // TAMBAHAN TKP 16-45
        QuestionEntity(
            id = "tkp_016",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Anda ditugaskan bekerja dengan tim baru yang belum Anda kenal. Apa yang Anda lakukan?",
            options = listOf(
                "Menunggu mereka memperkenalkan diri terlebih dahulu",
                "Memperkenalkan diri dan berusaha mengenal anggota tim lainnya",
                "Fokus pada pekerjaan tanpa perlu mengenal rekan",
                "Meminta pindah ke tim yang sudah Anda kenal",
                "Bekerja sendiri tanpa berinteraksi dengan tim"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 2, 1, 1).toJsonInt(),
            explanation = """
Memperkenalkan diri dan berusaha mengenal tim menunjukkan:
• Inisiatif dalam membangun hubungan
• Keterbukaan terhadap orang baru
• Semangat kerja sama

Skor:
A (2) - Pasif
B (5) - Sikap terbaik ✓
C (2) - Tidak kolaboratif
D (1) - Menghindari tantangan
E (1) - Tidak mau beradaptasi
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tkp_017",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda diminta mengerjakan tugas yang tidak sesuai dengan keahlian Anda. Bagaimana sikap Anda?",
            options = listOf(
                "Menolak karena bukan bidang keahlian",
                "Menerima dan berusaha belajar sambil mengerjakan",
                "Meminta dipindahkan ke tugas lain",
                "Mengerjakan seadanya",
                "Menyerahkan ke rekan yang lebih ahli"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 1, 3).toJsonInt(),
            explanation = """
Menerima dan berusaha belajar menunjukkan:
• Kemauan untuk berkembang
• Sikap positif terhadap tantangan
• Profesionalisme

Skor:
A (1) - Menolak tanpa usaha
B (5) - Sikap terbaik ✓
C (2) - Menghindar
D (1) - Tidak bertanggung jawab
E (3) - Alternatif yang bisa diterima
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "tkp_018",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Ada warga yang meminta pelayanan di luar jam kerja dengan alasan mendesak. Apa yang Anda lakukan?",
            options = listOf(
                "Menolak karena sudah di luar jam kerja",
                "Meminta warga datang besok",
                "Mendengarkan kebutuhannya dan membantu semampunya jika memang mendesak",
                "Mengabaikan permintaan tersebut",
                "Menyuruhnya ke kantor lain"
            ).toJson(),
            correctAnswer = 2,
            tkpScores = listOf(2, 2, 5, 1, 1).toJsonInt(),
            explanation = """
Mendengarkan dan membantu jika mendesak menunjukkan:
• Empati terhadap masyarakat
• Fleksibilitas dalam pelayanan
• Mengutamakan kepentingan publik

Skor:
A (2) - Kaku
B (2) - Tidak responsif
C (5) - Sikap terbaik ✓
D (1) - Tidak peduli
E (1) - Menghindar
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "tkp_019",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Dalam acara kantor, ada rekan yang tidak mau makan karena makanannya tidak halal. Bagaimana sikap Anda?",
            options = listOf(
                "Mengejeknya karena tidak mau makan",
                "Mengabaikan dan makan sendiri",
                "Menyarankan agar makan saja",
                "Mencarikan alternatif makanan yang halal atau membantu menanyakan ke panitia",
                "Menganggap itu masalahnya sendiri"
            ).toJson(),
            correctAnswer = 3,
            tkpScores = listOf(1, 2, 1, 5, 2).toJsonInt(),
            explanation = """
Membantu mencarikan alternatif menunjukkan:
• Toleransi beragama
• Kepedulian terhadap rekan
• Sikap inklusif

Skor:
A (1) - Tidak toleran
B (2) - Acuh tak acuh
C (1) - Tidak menghormati keyakinan
D (5) - Sikap terbaik ✓
E (2) - Tidak peduli
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tkp_020",
            category = "TKP",
            subCategory = "anti_radikalisme",
            questionText = "Rekan kerja Anda mengajak untuk tidak mengikuti aturan kantor karena dianggap tidak adil. Bagaimana sikap Anda?",
            options = listOf(
                "Ikut tidak mematuhi aturan",
                "Menolak dan menyarankan untuk menyampaikan aspirasi melalui jalur resmi",
                "Mengabaikan ajakan tersebut",
                "Melaporkan rekan tersebut ke atasan",
                "Mempertimbangkan terlebih dahulu"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 3, 2).toJsonInt(),
            explanation = """
Menolak dan menyarankan jalur resmi menunjukkan:
• Kepatuhan terhadap aturan
• Kemampuan mengarahkan ke solusi yang benar
• Sikap konstruktif

Skor:
A (1) - Melanggar aturan
B (5) - Sikap terbaik ✓
C (2) - Tidak tegas
D (3) - Langsung eskalasi
E (2) - Ragu-ragu
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "tkp_021",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Anda memiliki ide baru untuk meningkatkan kinerja tim. Apa yang Anda lakukan?",
            options = listOf(
                "Menyimpan ide tersebut untuk diri sendiri",
                "Menyampaikan ide dalam forum rapat tim",
                "Langsung menerapkan tanpa konsultasi",
                "Menunggu ada yang bertanya",
                "Menyampaikan hanya ke atasan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 1, 3).toJsonInt(),
            explanation = """
Menyampaikan ide dalam forum rapat menunjukkan:
• Inisiatif positif
• Kolaborasi tim
• Keterbukaan berbagi

Skor:
A (1) - Tidak berbagi
B (5) - Sikap terbaik ✓
C (2) - Tidak kolaboratif
D (1) - Pasif
E (3) - Kurang demokratis
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tkp_022",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda diberi tugas dengan deadline yang sangat ketat dan hampir mustahil dipenuhi. Apa yang Anda lakukan?",
            options = listOf(
                "Menolak tugas tersebut",
                "Berusaha semaksimal mungkin dan berkomunikasi dengan atasan tentang kendala",
                "Mengerjakan seadanya",
                "Menyalahkan atasan yang memberi tugas tidak realistis",
                "Meminta rekan mengerjakan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 1, 2).toJsonInt(),
            explanation = """
Berusaha maksimal dan berkomunikasi menunjukkan:
• Tanggung jawab
• Komunikasi yang baik
• Profesionalisme

Skor:
A (1) - Menolak tanggung jawab
B (5) - Sikap terbaik ✓
C (2) - Tidak optimal
D (1) - Menyalahkan orang lain
E (2) - Mengalihkan tanggung jawab
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "tkp_023",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Seorang warga komplain dengan kasar tentang pelayanan. Bagaimana sikap Anda?",
            options = listOf(
                "Membalas dengan kasar juga",
                "Mengabaikan karena tidak sopan",
                "Tetap tenang, mendengarkan, dan mencoba menyelesaikan masalahnya",
                "Langsung memanggil satpam",
                "Menangis karena dimarahi"
            ).toJson(),
            correctAnswer = 2,
            tkpScores = listOf(1, 1, 5, 2, 1).toJsonInt(),
            explanation = """
Tetap tenang dan mendengarkan menunjukkan:
• Pengendalian emosi yang baik
• Profesionalisme
• Fokus pada solusi

Skor:
A (1) - Tidak profesional
B (1) - Mengabaikan masalah
C (5) - Sikap terbaik ✓
D (2) - Berlebihan
E (1) - Tidak profesional
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "tkp_024",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Kantor mengadakan acara perayaan hari raya yang bukan hari raya Anda. Bagaimana sikap Anda?",
            options = listOf(
                "Tidak hadir karena bukan hari raya saya",
                "Hadir dan ikut merayakan sebagai bentuk toleransi",
                "Hadir tapi tidak berpartisipasi",
                "Mengkritik acara tersebut",
                "Meminta acara dibatalkan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 3, 1, 1).toJsonInt(),
            explanation = """
Hadir dan ikut merayakan menunjukkan:
• Toleransi beragama
• Semangat kebersamaan
• Menghargai keberagaman

Skor:
A (1) - Tidak toleran
B (5) - Sikap terbaik ✓
C (3) - Kurang partisipatif
D (1) - Intoleran
E (1) - Sangat intoleran
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tkp_025",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda mengetahui ada rekan yang melakukan korupsi kecil-kecilan. Apa yang Anda lakukan?",
            options = listOf(
                "Ikut-ikutan karena jumlahnya kecil",
                "Mengabaikan karena bukan urusan saya",
                "Melaporkan melalui saluran yang tepat",
                "Memeras rekan tersebut",
                "Menegur langsung di depan umum"
            ).toJson(),
            correctAnswer = 2,
            tkpScores = listOf(1, 1, 5, 1, 2).toJsonInt(),
            explanation = """
Melaporkan melalui saluran yang tepat menunjukkan:
• Integritas tinggi
• Keberanian moral
• Anti korupsi

Skor:
A (1) - Ikut korupsi
B (1) - Membiarkan korupsi
C (5) - Sikap terbaik ✓
D (1) - Pemerasan
E (2) - Kurang bijaksana
            """.trimIndent(),
            difficulty = "hard",
            year = 2022
        ),

        QuestionEntity(
            id = "tkp_026",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Tim Anda berhasil menyelesaikan proyek besar. Bagaimana Anda merespons?",
            options = listOf(
                "Mengklaim sebagai hasil kerja pribadi",
                "Merayakan bersama tim dan mengapresiasi kontribusi semua anggota",
                "Biasa saja karena itu sudah tugas",
                "Meminta bonus pribadi",
                "Langsung fokus ke proyek berikutnya tanpa merayakan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 1, 3).toJsonInt(),
            explanation = """
Merayakan bersama dan mengapresiasi tim menunjukkan:
• Semangat kerja sama
• Menghargai kontribusi orang lain
• Leadership yang baik

Skor:
A (1) - Egois
B (5) - Sikap terbaik ✓
C (2) - Kurang apresiatif
D (1) - Individualistis
E (3) - Kurang merayakan pencapaian
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tkp_027",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Warga meminta Anda untuk mempercepat prosesnya dengan imbalan uang. Apa yang Anda lakukan?",
            options = listOf(
                "Menerima karena jumlahnya kecil",
                "Menolak dengan tegas dan menjelaskan prosedur yang benar",
                "Menerima tapi merasa bersalah",
                "Menerima dan memproses lebih cepat",
                "Meminta jumlah yang lebih besar"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 1, 1, 1).toJsonInt(),
            explanation = """
Menolak tegas dan menjelaskan prosedur menunjukkan:
• Integritas
• Anti korupsi/suap
• Profesionalisme

Skor:
A (1) - Korupsi
B (5) - Sikap terbaik ✓
C (1) - Tetap korupsi
D (1) - Korupsi
E (1) - Pemerasan
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tkp_028",
            category = "TKP",
            subCategory = "anti_radikalisme",
            questionText = "Ada berita hoax yang viral tentang suatu kelompok. Bagaimana sikap Anda?",
            options = listOf(
                "Ikut menyebarkan",
                "Tidak menyebarkan dan mencari tahu kebenarannya terlebih dahulu",
                "Percaya begitu saja",
                "Menyebarkan dengan catatan 'belum tentu benar'",
                "Mengabaikan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 1, 2, 3).toJsonInt(),
            explanation = """
Tidak menyebarkan dan verifikasi menunjukkan:
• Literasi digital
• Bertanggung jawab
• Anti hoax

Skor:
A (1) - Menyebarkan hoax
B (5) - Sikap terbaik ✓
C (1) - Mudah percaya hoax
D (2) - Tetap menyebarkan
E (3) - Netral tapi tidak aktif melawan hoax
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tkp_029",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Atasan Anda melakukan kesalahan yang berdampak pada tim. Bagaimana sikap Anda?",
            options = listOf(
                "Menyebarkan kesalahan atasan ke rekan lain",
                "Menyampaikan secara pribadi kepada atasan dengan sopan",
                "Mengabaikan karena takut",
                "Melaporkan langsung ke atasan yang lebih tinggi",
                "Mengkritik di depan umum"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 3, 1).toJsonInt(),
            explanation = """
Menyampaikan secara pribadi dengan sopan menunjukkan:
• Keberanian yang bijaksana
• Menghormati atasan
• Komunikasi yang baik

Skor:
A (1) - Tidak loyal
B (5) - Sikap terbaik ✓
C (2) - Pasif
D (3) - Terlalu langsung eskalasi
E (1) - Tidak menghormati
            """.trimIndent(),
            difficulty = "hard",
            year = 2022
        ),

        QuestionEntity(
            id = "tkp_030",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Ada rekan kerja yang sering diolok-olok karena latar belakang daerahnya. Bagaimana sikap Anda?",
            options = listOf(
                "Ikut mengolok-olok",
                "Membela dan mengingatkan bahwa itu tidak pantas",
                "Diam saja",
                "Menertawakan tapi dalam hati tidak setuju",
                "Pindah tempat duduk agar tidak mendengar"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 1, 2).toJsonInt(),
            explanation = """
Membela dan mengingatkan menunjukkan:
• Keberanian moral
• Menghargai keberagaman
• Anti diskriminasi

Skor:
A (1) - Ikut diskriminasi
B (5) - Sikap terbaik ✓
C (2) - Pasif
D (1) - Tidak berani
E (2) - Menghindar
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "tkp_031",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Anda menemukan kesalahan dalam dokumen yang sudah diserahkan ke warga. Apa yang Anda lakukan?",
            options = listOf(
                "Berharap warga tidak menyadarinya",
                "Menghubungi warga untuk memperbaiki kesalahan",
                "Menyalahkan rekan yang memproses sebelumnya",
                "Menunggu warga komplain",
                "Memperbaiki di sistem tanpa memberitahu warga"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 1, 2, 3).toJsonInt(),
            explanation = """
Menghubungi warga untuk memperbaiki menunjukkan:
• Kejujuran
• Tanggung jawab
• Pelayanan prima

Skor:
A (1) - Tidak jujur
B (5) - Sikap terbaik ✓
C (1) - Menyalahkan orang lain
D (2) - Pasif
E (3) - Kurang transparan
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tkp_032",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Anda diminta menjadi ketua tim padahal ada rekan yang lebih senior. Bagaimana sikap Anda?",
            options = listOf(
                "Menolak karena merasa tidak pantas",
                "Menerima dan berkonsultasi dengan rekan senior untuk masukan",
                "Menerima dan mengabaikan rekan senior",
                "Menyerahkan posisi ke rekan senior",
                "Menerima tapi merasa tidak percaya diri"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 2, 2).toJsonInt(),
            explanation = """
Menerima dan berkonsultasi menunjukkan:
• Menerima tanggung jawab
• Menghargai pengalaman orang lain
• Leadership yang inklusif

Skor:
A (2) - Kurang percaya diri
B (5) - Sikap terbaik ✓
C (1) - Arogan
D (2) - Tidak mau tanggung jawab
E (2) - Kurang percaya diri
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "tkp_033",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda mendapat kritik pedas dari atasan di depan rekan kerja. Bagaimana sikap Anda?",
            options = listOf(
                "Marah dan melawan",
                "Menerima kritik dengan lapang dada dan memperbaiki diri",
                "Menangis dan merasa terpuruk",
                "Mengundurkan diri",
                "Mencari kesalahan atasan untuk membalas"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 1, 1).toJsonInt(),
            explanation = """
Menerima kritik dengan lapang dada menunjukkan:
• Kedewasaan emosional
• Kemauan untuk berkembang
• Profesionalisme

Skor:
A (1) - Tidak profesional
B (5) - Sikap terbaik ✓
C (2) - Kurang tangguh
D (1) - Terlalu emosional
E (1) - Dendam
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "tkp_034",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Ada warga yang mengaku kenal dengan pejabat dan meminta pelayanan istimewa. Apa yang Anda lakukan?",
            options = listOf(
                "Memberikan pelayanan istimewa karena takut",
                "Tetap melayani sesuai prosedur tanpa membedakan",
                "Menolak melayani sama sekali",
                "Meminta bukti kenalan tersebut",
                "Melaporkan ke atasan dulu sebelum melayani"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 1, 2, 3).toJsonInt(),
            explanation = """
Melayani sesuai prosedur tanpa membedakan menunjukkan:
• Keadilan dalam pelayanan
• Tidak diskriminatif
• Integritas

Skor:
A (1) - Koruptif
B (5) - Sikap terbaik ✓
C (1) - Tidak melayani
D (2) - Ragu-ragu
E (3) - Alternatif yang bisa diterima
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "tkp_035",
            category = "TKP",
            subCategory = "anti_radikalisme",
            questionText = "Ada kelompok yang mengatasnamakan agama meminta dukungan untuk aksi kekerasan. Bagaimana sikap Anda?",
            options = listOf(
                "Mendukung karena mengatasnamakan agama",
                "Menolak tegas karena kekerasan tidak dapat dibenarkan",
                "Ragu-ragu dan mempertimbangkan",
                "Tidak mendukung tapi tidak menolak",
                "Menyerahkan keputusan ke orang lain"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 1, 2, 2).toJsonInt(),
            explanation = """
Menolak tegas kekerasan menunjukkan:
• Anti radikalisme
• Pemahaman agama yang benar
• Keberanian moral

Skor:
A (1) - Mendukung radikalisme
B (5) - Sikap terbaik ✓
C (1) - Ragu pada hal yang jelas salah
D (2) - Tidak tegas
E (2) - Tidak berani mengambil sikap
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tkp_036",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Rekan satu tim Anda sering telat masuk kerja. Bagaimana sikap Anda?",
            options = listOf(
                "Ikut telat karena rekan juga telat",
                "Langsung melaporkan ke atasan",
                "Menegur secara pribadi dan menawarkan bantuan jika ada masalah",
                "Mengabaikan karena bukan urusan saya",
                "Membicarakannya dengan rekan lain"
            ).toJson(),
            correctAnswer = 2,
            tkpScores = listOf(1, 2, 5, 2, 1).toJsonInt(),
            explanation = """
Menegur secara pribadi dan menawarkan bantuan menunjukkan:
• Kepedulian terhadap rekan
• Pendekatan yang konstruktif
• Menjaga keharmonisan tim

Skor:
A (1) - Ikut melanggar
B (2) - Terlalu cepat eskalasi
C (5) - Sikap terbaik ✓
D (2) - Tidak peduli
E (1) - Bergosip
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "tkp_037",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda dihadapkan pada dua tugas mendesak yang deadline-nya bersamaan. Apa yang Anda lakukan?",
            options = listOf(
                "Memilih salah satu dan mengabaikan yang lain",
                "Memprioritaskan berdasarkan tingkat kepentingan dan berkomunikasi dengan pihak terkait",
                "Stres dan tidak mengerjakan keduanya",
                "Meminta orang lain mengerjakan semuanya",
                "Menunda keduanya"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 2, 1).toJsonInt(),
            explanation = """
Memprioritaskan dan berkomunikasi menunjukkan:
• Kemampuan manajemen waktu
• Komunikasi yang baik
• Problem solving

Skor:
A (2) - Tidak optimal
B (5) - Sikap terbaik ✓
C (1) - Menyerah
D (2) - Mengalihkan tanggung jawab
E (1) - Tidak bertanggung jawab
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "tkp_038",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Sistem pelayanan online mengalami gangguan. Banyak warga yang menunggu. Apa yang Anda lakukan?",
            options = listOf(
                "Menyuruh warga pulang dan datang lagi besok",
                "Menginformasikan situasi dengan jelas dan menawarkan alternatif pelayanan manual",
                "Mengabaikan dan menunggu sistem pulih",
                "Menyalahkan bagian IT",
                "Marah-marah karena sistem tidak beres"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 1, 1, 1).toJsonInt(),
            explanation = """
Menginformasikan dan menawarkan alternatif menunjukkan:
• Inisiatif mencari solusi
• Komunikasi yang baik
• Pelayanan prima

Skor:
A (1) - Tidak solutif
B (5) - Sikap terbaik ✓
C (1) - Pasif
D (1) - Menyalahkan orang lain
E (1) - Tidak profesional
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tkp_039",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Ada rekan kerja yang menggunakan bahasa daerah yang tidak Anda pahami. Bagaimana sikap Anda?",
            options = listOf(
                "Menegur agar menggunakan bahasa Indonesia",
                "Meminta mereka menjelaskan apa yang dibicarakan jika perlu",
                "Merasa tersinggung dan curiga",
                "Mengabaikan dan menjauh",
                "Membicarakan mereka dengan rekan lain"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(3, 5, 1, 2, 1).toJsonInt(),
            explanation = """
Meminta penjelasan jika perlu menunjukkan:
• Toleransi terhadap keberagaman
• Komunikasi yang baik
• Tidak curigaan

Skor:
A (3) - Terlalu kaku
B (5) - Sikap terbaik ✓
C (1) - Curigaan
D (2) - Menghindar
E (1) - Bergosip
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tkp_040",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda menemukan jalan pintas yang bisa mempercepat pekerjaan tapi melanggar SOP. Apa yang Anda lakukan?",
            options = listOf(
                "Menggunakan jalan pintas tersebut",
                "Tetap mengikuti SOP dan menyampaikan usulan perbaikan SOP",
                "Menggunakan jalan pintas tapi tidak memberitahu siapa pun",
                "Melaporkan SOP yang tidak efisien tanpa menawarkan solusi",
                "Mengabaikan dan bekerja seperti biasa"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 1, 3, 2).toJsonInt(),
            explanation = """
Mengikuti SOP dan mengusulkan perbaikan menunjukkan:
• Kepatuhan terhadap aturan
• Inisiatif perbaikan
• Konstruktif

Skor:
A (1) - Melanggar SOP
B (5) - Sikap terbaik ✓
C (1) - Tidak jujur
D (3) - Konstruktif tapi tidak lengkap
E (2) - Pasif
            """.trimIndent(),
            difficulty = "hard",
            year = 2022
        ),

        QuestionEntity(
            id = "tkp_041",
            category = "TKP",
            subCategory = "jejaring_kerja",
            questionText = "Ada konflik antara dua rekan di tim Anda. Bagaimana sikap Anda?",
            options = listOf(
                "Memihak salah satu",
                "Berusaha menjadi mediator untuk menyelesaikan konflik",
                "Mengabaikan karena bukan urusan saya",
                "Melaporkan ke atasan tanpa mencoba menyelesaikan",
                "Menyebarkan konflik tersebut ke rekan lain"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 3, 1).toJsonInt(),
            explanation = """
Menjadi mediator menunjukkan:
• Kepedulian terhadap tim
• Kemampuan menyelesaikan konflik
• Leadership

Skor:
A (1) - Memperkeruh
B (5) - Sikap terbaik ✓
C (2) - Tidak peduli
D (3) - Eskalasi langsung
E (1) - Menyebarkan masalah
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "tkp_042",
            category = "TKP",
            subCategory = "pelayanan_publik",
            questionText = "Warga membutuhkan surat keterangan darurat di luar jam kerja karena ada keluarga yang meninggal. Apa yang Anda lakukan?",
            options = listOf(
                "Menolak karena sudah di luar jam kerja",
                "Membantu menerbitkan surat dengan prosedur darurat",
                "Menyuruh menunggu sampai besok",
                "Meminta imbalan untuk membantu",
                "Menyuruh ke kantor lain"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 1, 1, 1).toJsonInt(),
            explanation = """
Membantu dengan prosedur darurat menunjukkan:
• Empati tinggi
• Pelayanan prima
• Fleksibilitas dalam situasi darurat

Skor:
A (1) - Tidak berempati
B (5) - Sikap terbaik ✓
C (1) - Tidak manusiawi
D (1) - Korupsi
E (1) - Mengalihkan
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tkp_043",
            category = "TKP",
            subCategory = "anti_radikalisme",
            questionText = "Anda melihat postingan rekan kerja di media sosial yang berisi provokasi SARA. Apa yang Anda lakukan?",
            options = listOf(
                "Menyukai postingan tersebut",
                "Mengingatkan rekan secara pribadi tentang dampak negatif postingan tersebut",
                "Melaporkan langsung ke HRD tanpa berbicara dulu",
                "Membalas dengan komentar negatif",
                "Mengabaikan karena itu urusan pribadi"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 3, 1, 2).toJsonInt(),
            explanation = """
Mengingatkan secara pribadi menunjukkan:
• Kepedulian terhadap rekan
• Mencegah penyebaran konten negatif
• Pendekatan yang bijaksana

Skor:
A (1) - Mendukung SARA
B (5) - Sikap terbaik ✓
C (3) - Langsung eskalasi
D (1) - Memperkeruh
E (2) - Tidak peduli
            """.trimIndent(),
            difficulty = "medium",
            year = 2022
        ),

        QuestionEntity(
            id = "tkp_044",
            category = "TKP",
            subCategory = "profesionalisme",
            questionText = "Anda berhasil menyelesaikan tugas lebih cepat dari deadline. Apa yang Anda lakukan?",
            options = listOf(
                "Bersantai sampai deadline tiba",
                "Menginformasikan ke atasan dan meminta tugas tambahan atau membantu rekan",
                "Menyembunyikan bahwa sudah selesai",
                "Pulang lebih awal tanpa izin",
                "Bermain games di kantor"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(2, 5, 1, 1, 1).toJsonInt(),
            explanation = """
Menginformasikan dan minta tugas tambahan menunjukkan:
• Kejujuran
• Proaktif
• Dedikasi tinggi

Skor:
A (2) - Kurang produktif
B (5) - Sikap terbaik ✓
C (1) - Tidak jujur
D (1) - Indisipliner
E (1) - Tidak profesional
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        ),

        QuestionEntity(
            id = "tkp_045",
            category = "TKP",
            subCategory = "sosial_budaya",
            questionText = "Kantor Anda akan mengadakan kegiatan sosial ke panti asuhan. Bagaimana sikap Anda?",
            options = listOf(
                "Tidak ikut karena sibuk",
                "Berpartisipasi aktif dan mengajak rekan lain",
                "Ikut tapi tidak antusias",
                "Hanya memberikan sumbangan tanpa hadir",
                "Mengkritik kegiatan tersebut sebagai pencitraan"
            ).toJson(),
            correctAnswer = 1,
            tkpScores = listOf(1, 5, 2, 3, 1).toJsonInt(),
            explanation = """
Berpartisipasi aktif dan mengajak rekan menunjukkan:
• Kepedulian sosial
• Semangat kebersamaan
• Inisiatif positif

Skor:
A (1) - Tidak peduli
B (5) - Sikap terbaik ✓
C (2) - Kurang antusias
D (3) - Alternatif yang baik
E (1) - Negatif
            """.trimIndent(),
            difficulty = "easy",
            year = 2023
        )
    )
}
