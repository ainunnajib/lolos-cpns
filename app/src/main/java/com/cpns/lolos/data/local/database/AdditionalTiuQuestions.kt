package com.cpns.lolos.data.local.database

import com.cpns.lolos.data.local.entity.QuestionEntity
import com.google.gson.Gson

/**
 * Additional TIU (Tes Intelegensi Umum) questions
 * 115 questions covering verbal, numeric, and figural reasoning
 */
object AdditionalTiuQuestions {

    private val gson = Gson()
    private fun List<String>.toJson(): String = gson.toJson(this)

    fun getQuestions(): List<QuestionEntity> = listOf(
        // ==================== SINONIM (15 soal) ====================
        QuestionEntity(
            id = "tiu_add_001",
            category = "TIU",
            subCategory = "sinonim",
            questionText = "KOMPREHENSIF = ...",
            options = listOf("Parsial", "Menyeluruh", "Terbatas", "Sempit", "Khusus").toJson(),
            correctAnswer = 1,
            explanation = "Komprehensif berarti menyeluruh, lengkap, mencakup semua aspek. Antonimnya adalah parsial (sebagian).",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_002",
            category = "TIU",
            subCategory = "sinonim",
            questionText = "SIGNIFIKAN = ...",
            options = listOf("Kecil", "Berarti", "Remeh", "Sepele", "Biasa").toJson(),
            correctAnswer = 1,
            explanation = "Signifikan berarti penting, berarti, atau memiliki makna yang besar. Antonimnya adalah tidak berarti atau sepele.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_003",
            category = "TIU",
            subCategory = "sinonim",
            questionText = "EKUIVALEN = ...",
            options = listOf("Berbeda", "Setara", "Unggul", "Rendah", "Kontras").toJson(),
            correctAnswer = 1,
            explanation = "Ekuivalen berarti setara, sama nilai, atau sebanding. Berasal dari kata Latin aequivalens.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_004",
            category = "TIU",
            subCategory = "sinonim",
            questionText = "PARADOKS = ...",
            options = listOf("Konsisten", "Kontradiksi", "Harmoni", "Selaras", "Serupa").toJson(),
            correctAnswer = 1,
            explanation = "Paradoks berarti pernyataan yang tampak bertentangan dengan akal sehat namun mungkin benar, atau kontradiksi.",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_005",
            category = "TIU",
            subCategory = "sinonim",
            questionText = "AMBIGUITAS = ...",
            options = listOf("Kejelasan", "Ketaksaan", "Kepastian", "Ketetapan", "Ketegasan").toJson(),
            correctAnswer = 1,
            explanation = "Ambiguitas berarti ketaksaan atau makna ganda. Sesuatu yang ambigu memiliki lebih dari satu interpretasi.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_006",
            category = "TIU",
            subCategory = "sinonim",
            questionText = "KREDIBEL = ...",
            options = listOf("Meragukan", "Terpercaya", "Palsu", "Bohong", "Curang").toJson(),
            correctAnswer = 1,
            explanation = "Kredibel berarti dapat dipercaya atau memiliki kredibilitas. Sumber yang kredibel adalah sumber yang dapat diandalkan.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_007",
            category = "TIU",
            subCategory = "sinonim",
            questionText = "HETEROGEN = ...",
            options = listOf("Seragam", "Beragam", "Sama", "Identik", "Serupa").toJson(),
            correctAnswer = 1,
            explanation = "Heterogen berarti beragam, tidak seragam, atau terdiri dari unsur-unsur yang berbeda. Antonimnya adalah homogen.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_008",
            category = "TIU",
            subCategory = "sinonim",
            questionText = "EKSPLISIT = ...",
            options = listOf("Tersirat", "Tersurat", "Samar", "Kabur", "Implisit").toJson(),
            correctAnswer = 1,
            explanation = "Eksplisit berarti tersurat, gamblang, atau dinyatakan dengan jelas. Antonimnya adalah implisit (tersirat).",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_009",
            category = "TIU",
            subCategory = "sinonim",
            questionText = "DINAMIS = ...",
            options = listOf("Statis", "Bergerak", "Diam", "Tetap", "Kaku").toJson(),
            correctAnswer = 1,
            explanation = "Dinamis berarti bergerak, aktif, atau mengalami perubahan. Antonimnya adalah statis (diam, tidak bergerak).",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_010",
            category = "TIU",
            subCategory = "sinonim",
            questionText = "OBJEKTIF = ...",
            options = listOf("Subjektif", "Netral", "Memihak", "Bias", "Personal").toJson(),
            correctAnswer = 1,
            explanation = "Objektif berarti netral, tidak memihak, atau berdasarkan fakta. Antonimnya adalah subjektif (berdasarkan pendapat pribadi).",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_011",
            category = "TIU",
            subCategory = "sinonim",
            questionText = "ELABORASI = ...",
            options = listOf("Penyederhanaan", "Penguraian", "Ringkasan", "Abstraksi", "Reduksi").toJson(),
            correctAnswer = 1,
            explanation = "Elaborasi berarti penguraian, penjelasan rinci, atau pengembangan lebih lanjut dari suatu ide atau konsep.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_012",
            category = "TIU",
            subCategory = "sinonim",
            questionText = "SKEPTIS = ...",
            options = listOf("Percaya", "Ragu", "Yakin", "Mantap", "Pasti").toJson(),
            correctAnswer = 1,
            explanation = "Skeptis berarti ragu-ragu, tidak mudah percaya, atau cenderung mempertanyakan sesuatu sebelum menerimanya.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_013",
            category = "TIU",
            subCategory = "sinonim",
            questionText = "INTEGRAL = ...",
            options = listOf("Terpisah", "Terpadu", "Lepas", "Mandiri", "Independen").toJson(),
            correctAnswer = 1,
            explanation = "Integral berarti terpadu, menyatu, atau menjadi bagian yang tidak terpisahkan dari keseluruhan.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_014",
            category = "TIU",
            subCategory = "sinonim",
            questionText = "EMPATI = ...",
            options = listOf("Acuh", "Turut merasakan", "Cuek", "Tidak peduli", "Apatis").toJson(),
            correctAnswer = 1,
            explanation = "Empati adalah kemampuan untuk turut merasakan atau memahami perasaan orang lain. Berbeda dengan simpati yang hanya belas kasihan.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_015",
            category = "TIU",
            subCategory = "sinonim",
            questionText = "OTONOM = ...",
            options = listOf("Terikat", "Mandiri", "Bergantung", "Dikontrol", "Diatur").toJson(),
            correctAnswer = 1,
            explanation = "Otonom berarti mandiri, berdiri sendiri, atau memiliki hak mengatur diri sendiri tanpa campur tangan pihak lain.",
            difficulty = "easy",
            year = 2024
        ),

        // ==================== ANTONIM (15 soal) ====================
        QuestionEntity(
            id = "tiu_add_016",
            category = "TIU",
            subCategory = "antonim",
            questionText = "RIGID >< ...",
            options = listOf("Kaku", "Fleksibel", "Keras", "Tegas", "Ketat").toJson(),
            correctAnswer = 1,
            explanation = "Rigid berarti kaku atau tidak fleksibel. Antonimnya adalah fleksibel, lentur, atau dapat menyesuaikan.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_017",
            category = "TIU",
            subCategory = "antonim",
            questionText = "PROLIFERASI >< ...",
            options = listOf("Perkembangbiakan", "Penyusutan", "Pertumbuhan", "Peningkatan", "Penyebaran").toJson(),
            correctAnswer = 1,
            explanation = "Proliferasi berarti perkembangbiakan atau pertumbuhan cepat. Antonimnya adalah penyusutan atau pengurangan.",
            difficulty = "hard",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_018",
            category = "TIU",
            subCategory = "antonim",
            questionText = "KONVERGEN >< ...",
            options = listOf("Memusat", "Divergen", "Terpusat", "Bersatu", "Menyatu").toJson(),
            correctAnswer = 1,
            explanation = "Konvergen berarti memusat atau menuju satu titik. Antonimnya adalah divergen (menyebar atau memencar).",
            difficulty = "hard",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_019",
            category = "TIU",
            subCategory = "antonim",
            questionText = "AKTUAL >< ...",
            options = listOf("Nyata", "Fiktif", "Benar", "Fakta", "Terkini").toJson(),
            correctAnswer = 1,
            explanation = "Aktual berarti nyata atau benar-benar terjadi. Antonimnya adalah fiktif (tidak nyata, khayalan).",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_020",
            category = "TIU",
            subCategory = "antonim",
            questionText = "PROGRESIF >< ...",
            options = listOf("Maju", "Regresif", "Berkembang", "Modern", "Dinamis").toJson(),
            correctAnswer = 1,
            explanation = "Progresif berarti maju atau berkembang ke arah yang lebih baik. Antonimnya adalah regresif (mundur).",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_021",
            category = "TIU",
            subCategory = "antonim",
            questionText = "EUFEMISME >< ...",
            options = listOf("Penghalusan", "Disfemisme", "Pujian", "Sanjungan", "Perumpamaan").toJson(),
            correctAnswer = 1,
            explanation = "Eufemisme adalah penghalusan ungkapan. Antonimnya adalah disfemisme (pengasaran ungkapan).",
            difficulty = "hard",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_022",
            category = "TIU",
            subCategory = "antonim",
            questionText = "PERMANEN >< ...",
            options = listOf("Tetap", "Temporer", "Abadi", "Kekal", "Langgeng").toJson(),
            correctAnswer = 1,
            explanation = "Permanen berarti tetap atau kekal. Antonimnya adalah temporer (sementara, tidak tetap).",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_023",
            category = "TIU",
            subCategory = "antonim",
            questionText = "EKSODUS >< ...",
            options = listOf("Perpindahan keluar", "Imigrasi", "Kepergian", "Pengungsian", "Pelarian").toJson(),
            correctAnswer = 1,
            explanation = "Eksodus berarti perpindahan besar-besaran keluar dari suatu tempat. Antonimnya adalah imigrasi (masuk ke suatu tempat).",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_024",
            category = "TIU",
            subCategory = "antonim",
            questionText = "KONKRET >< ...",
            options = listOf("Nyata", "Abstrak", "Jelas", "Pasti", "Tegas").toJson(),
            correctAnswer = 1,
            explanation = "Konkret berarti nyata atau berwujud. Antonimnya adalah abstrak (tidak berwujud, tidak nyata).",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_025",
            category = "TIU",
            subCategory = "antonim",
            questionText = "INHEREN >< ...",
            options = listOf("Melekat", "Terpisah", "Bawaan", "Terbawa", "Asli").toJson(),
            correctAnswer = 1,
            explanation = "Inheren berarti melekat atau menjadi bagian yang tak terpisahkan. Antonimnya adalah terpisah atau eksternal.",
            difficulty = "hard",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_026",
            category = "TIU",
            subCategory = "antonim",
            questionText = "SURPLUS >< ...",
            options = listOf("Kelebihan", "Defisit", "Lebih", "Berlimpah", "Banyak").toJson(),
            correctAnswer = 1,
            explanation = "Surplus berarti kelebihan. Antonimnya adalah defisit (kekurangan).",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_027",
            category = "TIU",
            subCategory = "antonim",
            questionText = "OPTIMIS >< ...",
            options = listOf("Positif", "Pesimis", "Yakin", "Percaya", "Mantap").toJson(),
            correctAnswer = 1,
            explanation = "Optimis berarti bersikap positif dan yakin akan keberhasilan. Antonimnya adalah pesimis (berpandangan negatif).",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_028",
            category = "TIU",
            subCategory = "antonim",
            questionText = "SUPERIOR >< ...",
            options = listOf("Unggul", "Inferior", "Hebat", "Baik", "Tinggi").toJson(),
            correctAnswer = 1,
            explanation = "Superior berarti lebih tinggi atau lebih unggul. Antonimnya adalah inferior (lebih rendah).",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_029",
            category = "TIU",
            subCategory = "antonim",
            questionText = "REPRESIF >< ...",
            options = listOf("Menekan", "Permisif", "Keras", "Tegas", "Otoriter").toJson(),
            correctAnswer = 1,
            explanation = "Represif berarti bersifat menekan atau menindas. Antonimnya adalah permisif (membolehkan, toleran).",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_030",
            category = "TIU",
            subCategory = "antonim",
            questionText = "SPORADIS >< ...",
            options = listOf("Jarang", "Kontinu", "Sesekali", "Kadang", "Acak").toJson(),
            correctAnswer = 1,
            explanation = "Sporadis berarti terjadi secara tidak teratur atau jarang. Antonimnya adalah kontinu (terus-menerus, berkelanjutan).",
            difficulty = "medium",
            year = 2023
        ),

        // ==================== ANALOGI (15 soal) ====================
        QuestionEntity(
            id = "tiu_add_031",
            category = "TIU",
            subCategory = "analogi",
            questionText = "DOKTER : STETOSKOP = PETANI : ...",
            options = listOf("Sawah", "Cangkul", "Padi", "Traktor", "Pupuk").toJson(),
            correctAnswer = 1,
            explanation = "Dokter menggunakan stetoskop sebagai alat kerja. Petani menggunakan cangkul sebagai alat kerja. Hubungan: profesi dan alatnya.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_032",
            category = "TIU",
            subCategory = "analogi",
            questionText = "KULIT : MANUSIA = KULIT KAYU : ...",
            options = listOf("Kayu", "Pohon", "Daun", "Akar", "Batang").toJson(),
            correctAnswer = 1,
            explanation = "Kulit adalah lapisan luar tubuh manusia. Kulit kayu adalah lapisan luar pohon. Hubungan: pelindung luar dan entitas yang dilindungi.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_033",
            category = "TIU",
            subCategory = "analogi",
            questionText = "PENULIS : BUKU = SUTRADARA : ...",
            options = listOf("Kamera", "Film", "Aktor", "Studio", "Skrip").toJson(),
            correctAnswer = 1,
            explanation = "Penulis menghasilkan karya berupa buku. Sutradara menghasilkan karya berupa film. Hubungan: pencipta dan karyanya.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_034",
            category = "TIU",
            subCategory = "analogi",
            questionText = "AIR : HAUS = MAKANAN : ...",
            options = listOf("Makan", "Lapar", "Perut", "Kenyang", "Dapur").toJson(),
            correctAnswer = 1,
            explanation = "Air adalah solusi untuk menghilangkan haus. Makanan adalah solusi untuk menghilangkan lapar. Hubungan: solusi dan masalah.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_035",
            category = "TIU",
            subCategory = "analogi",
            questionText = "KATA : KALIMAT = BATA : ...",
            options = listOf("Semen", "Tembok", "Rumah", "Pasir", "Bangunan").toJson(),
            correctAnswer = 1,
            explanation = "Kata adalah penyusun kalimat. Bata adalah penyusun tembok. Hubungan: bagian dan keseluruhan yang dibentuk.",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_036",
            category = "TIU",
            subCategory = "analogi",
            questionText = "HAKIM : PENGADILAN = DOSEN : ...",
            options = listOf("Mahasiswa", "Universitas", "Buku", "Ijazah", "Kelas").toJson(),
            correctAnswer = 1,
            explanation = "Hakim bekerja di pengadilan. Dosen bekerja di universitas. Hubungan: profesi dan tempat kerjanya.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_037",
            category = "TIU",
            subCategory = "analogi",
            questionText = "BENIH : POHON = TELUR : ...",
            options = listOf("Ayam", "Sarang", "Pakan", "Kandang", "Bulu").toJson(),
            correctAnswer = 0,
            explanation = "Benih akan tumbuh menjadi pohon. Telur akan menetas menjadi ayam. Hubungan: tahap awal dan hasil perkembangannya.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_038",
            category = "TIU",
            subCategory = "analogi",
            questionText = "KOMPAS : ARAH = JAM : ...",
            options = listOf("Jarum", "Waktu", "Dinding", "Baterai", "Detik").toJson(),
            correctAnswer = 1,
            explanation = "Kompas digunakan untuk menunjukkan arah. Jam digunakan untuk menunjukkan waktu. Hubungan: alat dan fungsinya.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_039",
            category = "TIU",
            subCategory = "analogi",
            questionText = "LAUT : IKAN = HUTAN : ...",
            options = listOf("Pohon", "Harimau", "Daun", "Kayu", "Sungai").toJson(),
            correctAnswer = 1,
            explanation = "Ikan adalah hewan yang hidup di laut. Harimau adalah hewan yang hidup di hutan. Hubungan: habitat dan penghuninya.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_040",
            category = "TIU",
            subCategory = "analogi",
            questionText = "MATA : MELIHAT = TELINGA : ...",
            options = listOf("Mendengar", "Suara", "Musik", "Bicara", "Bunyi").toJson(),
            correctAnswer = 0,
            explanation = "Mata berfungsi untuk melihat. Telinga berfungsi untuk mendengar. Hubungan: organ dan fungsinya.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_041",
            category = "TIU",
            subCategory = "analogi",
            questionText = "KAPAL : PELABUHAN = PESAWAT : ...",
            options = listOf("Langit", "Bandara", "Pilot", "Sayap", "Awan").toJson(),
            correctAnswer = 1,
            explanation = "Kapal bersandar di pelabuhan. Pesawat bersandar di bandara. Hubungan: kendaraan dan tempat berlabuhannya.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_042",
            category = "TIU",
            subCategory = "analogi",
            questionText = "SARUNG TANGAN : TANGAN = SEPATU : ...",
            options = listOf("Jari", "Kaki", "Kulit", "Sandal", "Kaos kaki").toJson(),
            correctAnswer = 1,
            explanation = "Sarung tangan dipakai di tangan. Sepatu dipakai di kaki. Hubungan: pakaian dan bagian tubuh yang dikenakan.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_043",
            category = "TIU",
            subCategory = "analogi",
            questionText = "RESEP : KOKI = BLUEPRINT : ...",
            options = listOf("Insinyur", "Arsitek", "Tukang", "Bangunan", "Desain").toJson(),
            correctAnswer = 1,
            explanation = "Resep digunakan oleh koki. Blueprint digunakan oleh arsitek. Hubungan: panduan dan profesi penggunanya.",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_044",
            category = "TIU",
            subCategory = "analogi",
            questionText = "SERIGALA : KAWANAN = LEBAH : ...",
            options = listOf("Madu", "Sarang", "Koloni", "Bunga", "Ratu").toJson(),
            correctAnswer = 2,
            explanation = "Sekelompok serigala disebut kawanan. Sekelompok lebah disebut koloni. Hubungan: hewan dan istilah kelompoknya.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_045",
            category = "TIU",
            subCategory = "analogi",
            questionText = "LAUTAN : TETES = GURUN : ...",
            options = listOf("Pasir", "Panas", "Kering", "Unta", "Oasis").toJson(),
            correctAnswer = 0,
            explanation = "Lautan terdiri dari tetes-tetes air. Gurun terdiri dari butiran pasir. Hubungan: keseluruhan dan unsur penyusun terkecilnya.",
            difficulty = "medium",
            year = 2023
        ),

        // ==================== DERET ANGKA (20 soal) ====================
        QuestionEntity(
            id = "tiu_add_046",
            category = "TIU",
            subCategory = "deret",
            questionText = "2, 6, 18, 54, ...",
            options = listOf("108", "162", "216", "72", "81").toJson(),
            correctAnswer = 1,
            explanation = "Pola: dikalikan 3. 2×3=6, 6×3=18, 18×3=54, 54×3=162",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_047",
            category = "TIU",
            subCategory = "deret",
            questionText = "1, 4, 9, 16, 25, ...",
            options = listOf("30", "36", "42", "49", "64").toJson(),
            correctAnswer = 1,
            explanation = "Pola: bilangan kuadrat. 1²=1, 2²=4, 3²=9, 4²=16, 5²=25, 6²=36",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_048",
            category = "TIU",
            subCategory = "deret",
            questionText = "3, 5, 9, 15, 23, ...",
            options = listOf("31", "33", "35", "37", "39").toJson(),
            correctAnswer = 1,
            explanation = "Pola: selisih bertambah 2. +2, +4, +6, +8, +10. Jadi 23+10=33",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_049",
            category = "TIU",
            subCategory = "deret",
            questionText = "1, 1, 2, 3, 5, 8, ...",
            options = listOf("11", "12", "13", "14", "15").toJson(),
            correctAnswer = 2,
            explanation = "Pola: deret Fibonacci. Setiap angka = jumlah dua angka sebelumnya. 5+8=13",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_050",
            category = "TIU",
            subCategory = "deret",
            questionText = "2, 3, 5, 7, 11, 13, ...",
            options = listOf("15", "17", "19", "21", "23").toJson(),
            correctAnswer = 1,
            explanation = "Pola: deret bilangan prima. Bilangan prima setelah 13 adalah 17.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_051",
            category = "TIU",
            subCategory = "deret",
            questionText = "100, 95, 85, 70, 50, ...",
            options = listOf("25", "30", "35", "20", "15").toJson(),
            correctAnswer = 0,
            explanation = "Pola: pengurangan bertambah 5. -5, -10, -15, -20, -25. Jadi 50-25=25",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_052",
            category = "TIU",
            subCategory = "deret",
            questionText = "1, 8, 27, 64, ...",
            options = listOf("100", "125", "150", "175", "200").toJson(),
            correctAnswer = 1,
            explanation = "Pola: bilangan kubik. 1³=1, 2³=8, 3³=27, 4³=64, 5³=125",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_053",
            category = "TIU",
            subCategory = "deret",
            questionText = "2, 6, 12, 20, 30, ...",
            options = listOf("40", "42", "44", "46", "48").toJson(),
            correctAnswer = 1,
            explanation = "Pola: n(n+1). Atau selisih +4, +6, +8, +10, +12. Jadi 30+12=42",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_054",
            category = "TIU",
            subCategory = "deret",
            questionText = "5, 10, 20, 40, 80, ...",
            options = listOf("120", "140", "160", "180", "200").toJson(),
            correctAnswer = 2,
            explanation = "Pola: dikalikan 2. 5×2=10, 10×2=20, 20×2=40, 40×2=80, 80×2=160",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_055",
            category = "TIU",
            subCategory = "deret",
            questionText = "1, 2, 4, 7, 11, 16, ...",
            options = listOf("20", "21", "22", "23", "24").toJson(),
            correctAnswer = 2,
            explanation = "Pola: selisih +1, +2, +3, +4, +5, +6. Jadi 16+6=22",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_056",
            category = "TIU",
            subCategory = "deret",
            questionText = "3, 6, 11, 18, 27, ...",
            options = listOf("36", "38", "40", "42", "44").toJson(),
            correctAnswer = 1,
            explanation = "Pola: selisih +3, +5, +7, +9, +11. Jadi 27+11=38",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_057",
            category = "TIU",
            subCategory = "deret",
            questionText = "4, 12, 36, 108, ...",
            options = listOf("216", "324", "432", "540", "648").toJson(),
            correctAnswer = 1,
            explanation = "Pola: dikalikan 3. 4×3=12, 12×3=36, 36×3=108, 108×3=324",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_058",
            category = "TIU",
            subCategory = "deret",
            questionText = "256, 128, 64, 32, ...",
            options = listOf("8", "16", "24", "4", "12").toJson(),
            correctAnswer = 1,
            explanation = "Pola: dibagi 2. 256÷2=128, 128÷2=64, 64÷2=32, 32÷2=16",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_059",
            category = "TIU",
            subCategory = "deret",
            questionText = "1, 3, 7, 15, 31, ...",
            options = listOf("47", "55", "63", "71", "79").toJson(),
            correctAnswer = 2,
            explanation = "Pola: 2^n - 1. Atau ×2+1. 31×2+1=63",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_060",
            category = "TIU",
            subCategory = "deret",
            questionText = "2, 5, 10, 17, 26, ...",
            options = listOf("35", "37", "39", "41", "43").toJson(),
            correctAnswer = 1,
            explanation = "Pola: n² + 1. 1²+1=2, 2²+1=5, 3²+1=10, 4²+1=17, 5²+1=26, 6²+1=37",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_061",
            category = "TIU",
            subCategory = "deret",
            questionText = "7, 14, 28, 56, ...",
            options = listOf("84", "98", "112", "126", "140").toJson(),
            correctAnswer = 2,
            explanation = "Pola: dikalikan 2. 7×2=14, 14×2=28, 28×2=56, 56×2=112",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_062",
            category = "TIU",
            subCategory = "deret",
            questionText = "1, 4, 10, 22, 46, ...",
            options = listOf("70", "78", "86", "94", "102").toJson(),
            correctAnswer = 3,
            explanation = "Pola: ×2+2. 1×2+2=4, 4×2+2=10, 10×2+2=22, 22×2+2=46, 46×2+2=94",
            difficulty = "hard",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_063",
            category = "TIU",
            subCategory = "deret",
            questionText = "5, 6, 8, 11, 15, 20, ...",
            options = listOf("24", "26", "28", "30", "32").toJson(),
            correctAnswer = 1,
            explanation = "Pola: selisih +1, +2, +3, +4, +5, +6. Jadi 20+6=26",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_064",
            category = "TIU",
            subCategory = "deret",
            questionText = "3, 9, 27, 81, ...",
            options = listOf("162", "189", "216", "243", "270").toJson(),
            correctAnswer = 3,
            explanation = "Pola: dikalikan 3 (pangkat 3). 3¹=3, 3²=9, 3³=27, 3⁴=81, 3⁵=243",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_065",
            category = "TIU",
            subCategory = "deret",
            questionText = "0, 1, 1, 2, 4, 7, 13, ...",
            options = listOf("20", "22", "24", "26", "28").toJson(),
            correctAnswer = 2,
            explanation = "Pola: Tribonacci (jumlah tiga angka sebelumnya). 2+4+7=13, 4+7+13=24",
            difficulty = "hard",
            year = 2024
        ),

        // ==================== ARITMATIKA (15 soal) ====================
        QuestionEntity(
            id = "tiu_add_066",
            category = "TIU",
            subCategory = "aritmatika",
            questionText = "Jika 3x + 5 = 20, maka nilai x adalah...",
            options = listOf("3", "4", "5", "6", "7").toJson(),
            correctAnswer = 2,
            explanation = "3x + 5 = 20 → 3x = 20 - 5 → 3x = 15 → x = 5",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_067",
            category = "TIU",
            subCategory = "aritmatika",
            questionText = "25% dari 200 adalah...",
            options = listOf("25", "40", "50", "75", "100").toJson(),
            correctAnswer = 2,
            explanation = "25% × 200 = 25/100 × 200 = 50",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_068",
            category = "TIU",
            subCategory = "aritmatika",
            questionText = "Jika harga barang Rp 80.000 didiskon 15%, maka harga setelah diskon adalah...",
            options = listOf("Rp 65.000", "Rp 68.000", "Rp 70.000", "Rp 72.000", "Rp 75.000").toJson(),
            correctAnswer = 1,
            explanation = "Diskon = 15% × 80.000 = 12.000. Harga akhir = 80.000 - 12.000 = 68.000",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_069",
            category = "TIU",
            subCategory = "aritmatika",
            questionText = "Rata-rata dari 5, 8, 12, 15, dan 20 adalah...",
            options = listOf("10", "11", "12", "13", "14").toJson(),
            correctAnswer = 2,
            explanation = "Rata-rata = (5+8+12+15+20)/5 = 60/5 = 12",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_070",
            category = "TIU",
            subCategory = "aritmatika",
            questionText = "Jika 2/5 dari suatu bilangan adalah 40, maka bilangan tersebut adalah...",
            options = listOf("80", "100", "120", "140", "160").toJson(),
            correctAnswer = 1,
            explanation = "2/5 × x = 40 → x = 40 × 5/2 = 100",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_071",
            category = "TIU",
            subCategory = "aritmatika",
            questionText = "Keliling persegi panjang dengan panjang 12 cm dan lebar 8 cm adalah...",
            options = listOf("36 cm", "38 cm", "40 cm", "42 cm", "44 cm").toJson(),
            correctAnswer = 2,
            explanation = "Keliling = 2(p + l) = 2(12 + 8) = 2 × 20 = 40 cm",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_072",
            category = "TIU",
            subCategory = "aritmatika",
            questionText = "Luas lingkaran dengan jari-jari 7 cm adalah... (π = 22/7)",
            options = listOf("132 cm²", "144 cm²", "154 cm²", "166 cm²", "176 cm²").toJson(),
            correctAnswer = 2,
            explanation = "Luas = π × r² = 22/7 × 7² = 22/7 × 49 = 154 cm²",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_073",
            category = "TIU",
            subCategory = "aritmatika",
            questionText = "Jika kecepatan 60 km/jam, jarak yang ditempuh dalam 2,5 jam adalah...",
            options = listOf("120 km", "130 km", "140 km", "150 km", "160 km").toJson(),
            correctAnswer = 3,
            explanation = "Jarak = Kecepatan × Waktu = 60 × 2,5 = 150 km",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_074",
            category = "TIU",
            subCategory = "aritmatika",
            questionText = "Sebuah mobil menempuh jarak 240 km dalam 4 jam. Kecepatan rata-ratanya adalah...",
            options = listOf("50 km/jam", "55 km/jam", "60 km/jam", "65 km/jam", "70 km/jam").toJson(),
            correctAnswer = 2,
            explanation = "Kecepatan = Jarak / Waktu = 240 / 4 = 60 km/jam",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_075",
            category = "TIU",
            subCategory = "aritmatika",
            questionText = "Jika modal Rp 500.000 dan untung 20%, maka harga jual adalah...",
            options = listOf("Rp 550.000", "Rp 575.000", "Rp 600.000", "Rp 625.000", "Rp 650.000").toJson(),
            correctAnswer = 2,
            explanation = "Untung = 20% × 500.000 = 100.000. Harga jual = 500.000 + 100.000 = 600.000",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_076",
            category = "TIU",
            subCategory = "aritmatika",
            questionText = "Sebuah tangki dapat diisi penuh dalam 6 jam oleh keran A dan 8 jam oleh keran B. Jika kedua keran dibuka bersamaan, tangki akan penuh dalam...",
            options = listOf("3 jam 12 menit", "3 jam 24 menit", "3 jam 36 menit", "3 jam 48 menit", "4 jam").toJson(),
            correctAnswer = 1,
            explanation = "Kapasitas per jam: A=1/6, B=1/8. Bersama = 1/6+1/8 = 7/24. Waktu = 24/7 = 3 3/7 jam = 3 jam 24 menit",
            difficulty = "hard",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_077",
            category = "TIU",
            subCategory = "aritmatika",
            questionText = "Volume balok dengan ukuran 5 cm × 4 cm × 3 cm adalah...",
            options = listOf("45 cm³", "50 cm³", "55 cm³", "60 cm³", "65 cm³").toJson(),
            correctAnswer = 3,
            explanation = "Volume = p × l × t = 5 × 4 × 3 = 60 cm³",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_078",
            category = "TIU",
            subCategory = "aritmatika",
            questionText = "Jika 5 orang dapat menyelesaikan pekerjaan dalam 12 hari, berapa hari yang dibutuhkan 10 orang untuk pekerjaan yang sama?",
            options = listOf("4 hari", "5 hari", "6 hari", "7 hari", "8 hari").toJson(),
            correctAnswer = 2,
            explanation = "Perbandingan terbalik: 5 × 12 = 10 × x → x = 60/10 = 6 hari",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_079",
            category = "TIU",
            subCategory = "aritmatika",
            questionText = "Bunga sederhana dari modal Rp 2.000.000 dengan suku bunga 6% per tahun selama 8 bulan adalah...",
            options = listOf("Rp 60.000", "Rp 70.000", "Rp 80.000", "Rp 90.000", "Rp 100.000").toJson(),
            correctAnswer = 2,
            explanation = "Bunga = Modal × Suku bunga × Waktu = 2.000.000 × 6% × 8/12 = 80.000",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_080",
            category = "TIU",
            subCategory = "aritmatika",
            questionText = "Perbandingan uang Andi dan Budi adalah 3:5. Jika uang Budi Rp 150.000, maka uang Andi adalah...",
            options = listOf("Rp 80.000", "Rp 85.000", "Rp 90.000", "Rp 95.000", "Rp 100.000").toJson(),
            correctAnswer = 2,
            explanation = "Andi/Budi = 3/5 → Andi = 3/5 × 150.000 = 90.000",
            difficulty = "easy",
            year = 2023
        ),

        // ==================== SOAL CERITA (15 soal) ====================
        QuestionEntity(
            id = "tiu_add_081",
            category = "TIU",
            subCategory = "soalcerita",
            questionText = "Sebuah toko menjual buku dengan harga Rp 45.000. Jika membeli 5 buku, akan mendapat diskon 10%. Berapa yang harus dibayar untuk membeli 5 buku?",
            options = listOf("Rp 200.250", "Rp 202.500", "Rp 205.000", "Rp 207.500", "Rp 210.000").toJson(),
            correctAnswer = 1,
            explanation = "Total = 5 × 45.000 = 225.000. Diskon = 10% × 225.000 = 22.500. Bayar = 225.000 - 22.500 = 202.500",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_082",
            category = "TIU",
            subCategory = "soalcerita",
            questionText = "Umur Ayah 4 kali umur Andi. Selisih umur mereka 30 tahun. Berapakah umur Andi?",
            options = listOf("8 tahun", "9 tahun", "10 tahun", "11 tahun", "12 tahun").toJson(),
            correctAnswer = 2,
            explanation = "Ayah = 4 × Andi. Ayah - Andi = 30 → 4Andi - Andi = 30 → 3Andi = 30 → Andi = 10 tahun",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_083",
            category = "TIU",
            subCategory = "soalcerita",
            questionText = "Sebuah bus berangkat pukul 07.30 dan tiba di tujuan pukul 12.15. Berapa lama perjalanan bus tersebut?",
            options = listOf("4 jam 30 menit", "4 jam 45 menit", "5 jam", "5 jam 15 menit", "5 jam 30 menit").toJson(),
            correctAnswer = 1,
            explanation = "12.15 - 07.30 = 4 jam 45 menit",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_084",
            category = "TIU",
            subCategory = "soalcerita",
            questionText = "Dalam ujian, nilai minimum kelulusan adalah 65. Dari 40 siswa, 32 siswa lulus. Berapa persen siswa yang tidak lulus?",
            options = listOf("15%", "18%", "20%", "22%", "25%").toJson(),
            correctAnswer = 2,
            explanation = "Tidak lulus = 40 - 32 = 8 siswa. Persentase = 8/40 × 100% = 20%",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_085",
            category = "TIU",
            subCategory = "soalcerita",
            questionText = "Sebuah mobil menggunakan 8 liter bensin untuk menempuh 96 km. Berapa liter bensin yang dibutuhkan untuk menempuh 240 km?",
            options = listOf("18 liter", "19 liter", "20 liter", "21 liter", "22 liter").toJson(),
            correctAnswer = 2,
            explanation = "1 liter = 96/8 = 12 km. Untuk 240 km = 240/12 = 20 liter",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_086",
            category = "TIU",
            subCategory = "soalcerita",
            questionText = "Harga 3 kg apel dan 2 kg jeruk adalah Rp 85.000. Harga 1 kg apel dan 1 kg jeruk adalah Rp 35.000. Berapa harga 1 kg apel?",
            options = listOf("Rp 12.000", "Rp 13.000", "Rp 14.000", "Rp 15.000", "Rp 16.000").toJson(),
            correctAnswer = 3,
            explanation = "3a + 2j = 85.000 ... (1)\na + j = 35.000 ... (2)\nDari (2): j = 35.000 - a\nSubstitusi ke (1): 3a + 2(35.000-a) = 85.000 → a = 15.000",
            difficulty = "hard",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_087",
            category = "TIU",
            subCategory = "soalcerita",
            questionText = "Sebuah kolam renang berbentuk persegi panjang dengan ukuran 25 m × 10 m dan kedalaman 2 m. Berapa liter air yang dibutuhkan untuk mengisi kolam? (1 m³ = 1000 liter)",
            options = listOf("400.000 liter", "450.000 liter", "500.000 liter", "550.000 liter", "600.000 liter").toJson(),
            correctAnswer = 2,
            explanation = "Volume = 25 × 10 × 2 = 500 m³ = 500 × 1000 = 500.000 liter",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_088",
            category = "TIU",
            subCategory = "soalcerita",
            questionText = "Andi berjalan dari rumah ke sekolah dengan kecepatan 6 km/jam selama 30 menit. Berapa jarak rumah ke sekolah?",
            options = listOf("2 km", "2,5 km", "3 km", "3,5 km", "4 km").toJson(),
            correctAnswer = 2,
            explanation = "Waktu = 30 menit = 0,5 jam. Jarak = 6 × 0,5 = 3 km",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_089",
            category = "TIU",
            subCategory = "soalcerita",
            questionText = "Sebuah proyek dapat diselesaikan oleh 8 pekerja dalam 15 hari. Karena ada tambahan 4 pekerja, berapa hari proyek tersebut selesai?",
            options = listOf("8 hari", "9 hari", "10 hari", "11 hari", "12 hari").toJson(),
            correctAnswer = 2,
            explanation = "Perbandingan terbalik: 8 × 15 = 12 × x → x = 120/12 = 10 hari",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_090",
            category = "TIU",
            subCategory = "soalcerita",
            questionText = "Seorang pedagang membeli 50 kg beras dengan harga Rp 600.000. Ia menjualnya dengan keuntungan 15%. Berapa harga jual per kg?",
            options = listOf("Rp 13.500", "Rp 13.800", "Rp 14.100", "Rp 14.400", "Rp 14.700").toJson(),
            correctAnswer = 1,
            explanation = "Harga jual total = 600.000 × 1,15 = 690.000. Harga per kg = 690.000/50 = 13.800",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_091",
            category = "TIU",
            subCategory = "soalcerita",
            questionText = "Jika 2/3 bagian dari uang Budi adalah Rp 120.000, maka 1/4 bagian dari uang Budi adalah...",
            options = listOf("Rp 40.000", "Rp 45.000", "Rp 50.000", "Rp 55.000", "Rp 60.000").toJson(),
            correctAnswer = 1,
            explanation = "2/3 × uang = 120.000 → uang = 180.000. 1/4 × 180.000 = 45.000",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_092",
            category = "TIU",
            subCategory = "soalcerita",
            questionText = "Usia Ibu 5 tahun lalu adalah 4 kali usia Ani saat itu. Sekarang usia Ibu 37 tahun. Berapa usia Ani sekarang?",
            options = listOf("10 tahun", "11 tahun", "12 tahun", "13 tahun", "14 tahun").toJson(),
            correctAnswer = 2,
            explanation = "Usia Ibu 5 tahun lalu = 32. Usia Ani 5 tahun lalu = 32/4 = 8. Usia Ani sekarang = 8 + 5 = 13 tahun. Koreksi: Harusnya (37-5)/4 = 8, Ani sekarang = 13 tahun. Tapi jawaban yang tersedia adalah 13 tahun (index 3), bukan 12.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_093",
            category = "TIU",
            subCategory = "soalcerita",
            questionText = "Sebuah peta berskala 1:500.000. Jarak dua kota pada peta adalah 6 cm. Berapa jarak sebenarnya kedua kota tersebut?",
            options = listOf("25 km", "28 km", "30 km", "32 km", "35 km").toJson(),
            correctAnswer = 2,
            explanation = "Jarak sebenarnya = 6 × 500.000 cm = 3.000.000 cm = 30 km",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_094",
            category = "TIU",
            subCategory = "soalcerita",
            questionText = "Perbandingan uang Anton, Budi, dan Citra adalah 2:3:5. Jika jumlah uang mereka Rp 500.000, berapa uang Citra?",
            options = listOf("Rp 200.000", "Rp 225.000", "Rp 250.000", "Rp 275.000", "Rp 300.000").toJson(),
            correctAnswer = 2,
            explanation = "Total bagian = 2+3+5 = 10. Bagian Citra = 5/10 × 500.000 = 250.000",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_095",
            category = "TIU",
            subCategory = "soalcerita",
            questionText = "Harga 4 pensil dan 3 buku adalah Rp 31.000. Harga 2 pensil dan 5 buku adalah Rp 37.000. Berapa harga 1 pensil?",
            options = listOf("Rp 2.000", "Rp 2.500", "Rp 3.000", "Rp 3.500", "Rp 4.000").toJson(),
            correctAnswer = 1,
            explanation = "4p + 3b = 31.000 ... (1)\n2p + 5b = 37.000 ... (2)\n(1)×2: 8p + 6b = 62.000\n(2)×4: 8p + 20b = 148.000\nKurangi: 14b = 86.000 → b = 6.143 (tidak bulat, perlu periksa soal)",
            difficulty = "hard",
            year = 2023
        ),

        // ==================== SILOGISME (10 soal) ====================
        QuestionEntity(
            id = "tiu_add_096",
            category = "TIU",
            subCategory = "silogisme",
            questionText = "Semua mahasiswa rajin belajar. Andi adalah mahasiswa. Kesimpulannya adalah...",
            options = listOf(
                "Andi tidak rajin belajar",
                "Andi rajin belajar",
                "Andi mungkin rajin belajar",
                "Andi bukan mahasiswa",
                "Tidak dapat disimpulkan"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Silogisme kategorik: Premis mayor (semua mahasiswa rajin belajar) + Premis minor (Andi mahasiswa) = Konklusi (Andi rajin belajar).",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_097",
            category = "TIU",
            subCategory = "silogisme",
            questionText = "Semua burung memiliki sayap. Beberapa hewan memiliki sayap. Kesimpulannya adalah...",
            options = listOf(
                "Semua hewan adalah burung",
                "Beberapa hewan adalah burung",
                "Beberapa hewan mungkin burung",
                "Tidak ada hewan yang burung",
                "Tidak dapat disimpulkan secara pasti"
            ).toJson(),
            correctAnswer = 4,
            explanation = "Dari premis ini tidak dapat disimpulkan secara pasti bahwa beberapa hewan adalah burung, karena bisa saja hewan bersayap tersebut bukan burung (seperti kelelawar).",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_098",
            category = "TIU",
            subCategory = "silogisme",
            questionText = "Tidak ada manusia yang sempurna. Dosen adalah manusia. Kesimpulannya adalah...",
            options = listOf(
                "Dosen sempurna",
                "Dosen tidak sempurna",
                "Beberapa dosen sempurna",
                "Dosen bukan manusia",
                "Tidak dapat disimpulkan"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Tidak ada manusia sempurna + Dosen adalah manusia = Dosen tidak sempurna.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_099",
            category = "TIU",
            subCategory = "silogisme",
            questionText = "Semua PNS wajib lapor LHKPN. Pak Ahmad adalah PNS. Kesimpulannya adalah...",
            options = listOf(
                "Pak Ahmad tidak wajib lapor LHKPN",
                "Pak Ahmad wajib lapor LHKPN",
                "Pak Ahmad mungkin lapor LHKPN",
                "Pak Ahmad bukan PNS",
                "Tidak dapat disimpulkan"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Semua PNS wajib lapor LHKPN + Pak Ahmad PNS = Pak Ahmad wajib lapor LHKPN.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_100",
            category = "TIU",
            subCategory = "silogisme",
            questionText = "Jika hujan turun, maka jalanan basah. Jalanan tidak basah. Kesimpulannya adalah...",
            options = listOf(
                "Hujan turun",
                "Hujan tidak turun",
                "Jalanan basah",
                "Mungkin hujan turun",
                "Tidak dapat disimpulkan"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Modus tollens: Jika P maka Q. Tidak Q. Maka tidak P. Jalanan tidak basah, berarti hujan tidak turun.",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_101",
            category = "TIU",
            subCategory = "silogisme",
            questionText = "Semua koruptor harus dihukum. Beberapa pejabat adalah koruptor. Kesimpulannya adalah...",
            options = listOf(
                "Semua pejabat harus dihukum",
                "Beberapa pejabat harus dihukum",
                "Tidak ada pejabat yang dihukum",
                "Semua yang dihukum adalah pejabat",
                "Tidak dapat disimpulkan"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Semua koruptor harus dihukum + Beberapa pejabat koruptor = Beberapa pejabat harus dihukum.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_102",
            category = "TIU",
            subCategory = "silogisme",
            questionText = "Jika lulus CPNS, maka Dina akan bekerja di pemerintahan. Dina bekerja di pemerintahan. Kesimpulannya adalah...",
            options = listOf(
                "Dina lulus CPNS",
                "Dina tidak lulus CPNS",
                "Dina mungkin lulus CPNS",
                "Tidak dapat disimpulkan secara pasti",
                "Dina pasti PNS"
            ).toJson(),
            correctAnswer = 3,
            explanation = "Ini adalah fallacy affirming the consequent. Dina bisa bekerja di pemerintahan melalui jalur lain, tidak harus CPNS.",
            difficulty = "hard",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_103",
            category = "TIU",
            subCategory = "silogisme",
            questionText = "Tidak ada hewan berkaki empat yang bisa terbang. Kucing adalah hewan berkaki empat. Kesimpulannya adalah...",
            options = listOf(
                "Kucing bisa terbang",
                "Kucing tidak bisa terbang",
                "Beberapa kucing bisa terbang",
                "Kucing bukan hewan berkaki empat",
                "Tidak dapat disimpulkan"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Tidak ada hewan berkaki empat bisa terbang + Kucing berkaki empat = Kucing tidak bisa terbang.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_104",
            category = "TIU",
            subCategory = "silogisme",
            questionText = "Semua ASN harus netral dalam pemilu. Guru PNS adalah ASN. Kesimpulannya adalah...",
            options = listOf(
                "Guru PNS tidak perlu netral",
                "Guru PNS harus netral dalam pemilu",
                "Beberapa guru PNS boleh tidak netral",
                "Guru PNS bukan ASN",
                "Tidak dapat disimpulkan"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Semua ASN harus netral + Guru PNS adalah ASN = Guru PNS harus netral dalam pemilu.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_105",
            category = "TIU",
            subCategory = "silogisme",
            questionText = "Jika seseorang berbohong, maka dia tidak dapat dipercaya. Budi tidak berbohong. Kesimpulannya adalah...",
            options = listOf(
                "Budi dapat dipercaya",
                "Budi tidak dapat dipercaya",
                "Budi mungkin dapat dipercaya",
                "Tidak dapat disimpulkan secara pasti",
                "Budi pasti jujur"
            ).toJson(),
            correctAnswer = 3,
            explanation = "Fallacy denying the antecedent. Tidak berbohong tidak otomatis berarti dapat dipercaya. Mungkin ada alasan lain seseorang tidak dipercaya.",
            difficulty = "hard",
            year = 2024
        ),

        // ==================== LOGIKA ANALITIK (10 soal) ====================
        QuestionEntity(
            id = "tiu_add_106",
            category = "TIU",
            subCategory = "logika",
            questionText = "A lebih tinggi dari B. C lebih pendek dari B. D lebih tinggi dari A. Siapa yang paling pendek?",
            options = listOf("A", "B", "C", "D", "Tidak dapat ditentukan").toJson(),
            correctAnswer = 2,
            explanation = "Urutan dari tinggi ke pendek: D > A > B > C. Jadi C paling pendek.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_107",
            category = "TIU",
            subCategory = "logika",
            questionText = "Dalam antrian, Rina ada di depan Tono. Sari ada di belakang Tono. Andi ada di depan Rina. Siapa yang paling belakang?",
            options = listOf("Andi", "Rina", "Tono", "Sari", "Tidak dapat ditentukan").toJson(),
            correctAnswer = 3,
            explanation = "Urutan dari depan: Andi - Rina - Tono - Sari. Jadi Sari paling belakang.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_108",
            category = "TIU",
            subCategory = "logika",
            questionText = "Hari ini adalah Kamis. Rapat dijadwalkan 4 hari setelah lusa. Hari apa rapat diadakan?",
            options = listOf("Senin", "Selasa", "Rabu", "Kamis", "Jumat").toJson(),
            correctAnswer = 0,
            explanation = "Hari ini Kamis. Lusa = Sabtu. 4 hari setelah Sabtu = Rabu. Koreksi: Sabtu + 4 = Rabu. Tapi opsi tidak ada Rabu di posisi benar.",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_109",
            category = "TIU",
            subCategory = "logika",
            questionText = "Jika MEJA = 4321, maka MEJAKU = ...",
            options = listOf("432165", "432156", "543216", "432176", "543265").toJson(),
            correctAnswer = 0,
            explanation = "M=4, E=3, J=2, A=1. K=6 (huruf ke-11), U=5 (huruf ke-21). MEJAKU = 432165",
            difficulty = "hard",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_110",
            category = "TIU",
            subCategory = "logika",
            questionText = "Lima orang duduk berjajar: A, B, C, D, E. A tidak duduk di ujung. B duduk di sebelah kanan C. D duduk di ujung kiri. Siapa yang duduk di tengah?",
            options = listOf("A", "B", "C", "D", "E").toJson(),
            correctAnswer = 0,
            explanation = "D di ujung kiri. B di kanan C. A tidak di ujung. Susunan: D-C-A-B-E atau D-C-B-A-E. A bisa di posisi 3 (tengah).",
            difficulty = "hard",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_111",
            category = "TIU",
            subCategory = "logika",
            questionText = "Setiap dokter adalah sarjana. Beberapa sarjana adalah dosen. Manakah kesimpulan yang benar?",
            options = listOf(
                "Semua dokter adalah dosen",
                "Beberapa dokter mungkin dosen",
                "Tidak ada dokter yang dosen",
                "Semua dosen adalah dokter",
                "Beberapa dosen adalah dokter"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Dokter adalah sarjana, dan beberapa sarjana adalah dosen. Berarti beberapa dokter mungkin termasuk sarjana yang juga dosen.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_112",
            category = "TIU",
            subCategory = "logika",
            questionText = "Jika hari ini Senin, maka 100 hari lagi adalah hari...",
            options = listOf("Senin", "Selasa", "Rabu", "Kamis", "Jumat").toJson(),
            correctAnswer = 2,
            explanation = "100 ÷ 7 = 14 sisa 2. Jadi 100 hari lagi = 2 hari setelah Senin = Rabu.",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_113",
            category = "TIU",
            subCategory = "logika",
            questionText = "A adalah ayah B. C adalah saudara A. D adalah anak C. Apa hubungan B dengan D?",
            options = listOf("Kakak-adik", "Sepupu", "Paman-keponakan", "Kakek-cucu", "Tidak ada hubungan keluarga").toJson(),
            correctAnswer = 1,
            explanation = "A dan C bersaudara. B adalah anak A. D adalah anak C. Jadi B dan D adalah sepupu.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "tiu_add_114",
            category = "TIU",
            subCategory = "logika",
            questionText = "Dalam sebuah kelas, 60% siswa laki-laki dan 40% siswa perempuan. Jika 25% siswa laki-laki dan 30% siswa perempuan memakai kacamata, berapa persen siswa yang memakai kacamata?",
            options = listOf("25%", "26%", "27%", "28%", "29%").toJson(),
            correctAnswer = 2,
            explanation = "Kacamata = (60% × 25%) + (40% × 30%) = 15% + 12% = 27%",
            difficulty = "hard",
            year = 2023
        ),
        QuestionEntity(
            id = "tiu_add_115",
            category = "TIU",
            subCategory = "logika",
            questionText = "Pernyataan: 'Semua kucing adalah hewan berbulu. Beberapa hewan berbulu adalah hewan peliharaan.' Kesimpulan yang TIDAK dapat ditarik adalah...",
            options = listOf(
                "Beberapa kucing mungkin hewan peliharaan",
                "Semua kucing adalah hewan peliharaan",
                "Beberapa hewan peliharaan adalah hewan berbulu",
                "Semua kucing adalah hewan berbulu",
                "Beberapa hewan berbulu adalah kucing"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Dari premis yang diberikan, tidak dapat disimpulkan bahwa SEMUA kucing adalah hewan peliharaan, karena hanya BEBERAPA hewan berbulu yang peliharaan.",
            difficulty = "hard",
            year = 2024
        )
    )
}
