package com.cpns.lolos.data.ai

/**
 * Knowledge Base berisi jawaban pre-generated untuk topik CPNS yang sering ditanyakan.
 * Ini digunakan untuk menjawab pertanyaan tanpa perlu memanggil LLM.
 */
object CpnsKnowledgeBase {

    data class KnowledgeEntry(
        val keywords: List<String>,
        val question: String,
        val answer: String,
        val category: String
    )

    val entries = listOf(
        // ==================== PANCASILA ====================
        KnowledgeEntry(
            keywords = listOf("pancasila", "lahir", "1 juni", "soekarno", "sejarah pancasila"),
            question = "Kapan Pancasila lahir?",
            answer = """
**Hari Lahir Pancasila: 1 Juni 1945**

Pancasila pertama kali dirumuskan dan diusulkan oleh Ir. Soekarno pada tanggal 1 Juni 1945 dalam sidang BPUPKI (Badan Penyelidik Usaha-usaha Persiapan Kemerdekaan Indonesia).

**Kronologi:**
• 29 Mei 1945 - Sidang pertama BPUPKI dimulai
• 1 Juni 1945 - Soekarno menyampaikan pidato tentang dasar negara
• 22 Juni 1945 - Piagam Jakarta disusun oleh Panitia Sembilan
• 18 Agustus 1945 - Pancasila disahkan dalam UUD 1945

**Lima Sila yang Diusulkan Soekarno:**
1. Kebangsaan Indonesia (Nasionalisme)
2. Internasionalisme (Perikemanusiaan)
3. Mufakat (Demokrasi)
4. Kesejahteraan Sosial
5. Ketuhanan

Kelima konsep ini kemudian disempurnakan menjadi Pancasila seperti yang kita kenal sekarang.
            """.trimIndent(),
            category = "TWK"
        ),

        KnowledgeEntry(
            keywords = listOf("sila", "pancasila", "lima sila", "bunyi sila"),
            question = "Apa bunyi lima sila Pancasila?",
            answer = """
**Lima Sila Pancasila:**

1. **Ketuhanan Yang Maha Esa**
   - Lambang: Bintang
   - Makna: Percaya kepada Tuhan, toleransi antar umat beragama

2. **Kemanusiaan yang Adil dan Beradab**
   - Lambang: Rantai
   - Makna: Menghormati HAM, kesetaraan, tidak diskriminatif

3. **Persatuan Indonesia**
   - Lambang: Pohon Beringin
   - Makna: Mengutamakan kepentingan bangsa, Bhinneka Tunggal Ika

4. **Kerakyatan yang Dipimpin oleh Hikmat Kebijaksanaan dalam Permusyawaratan/Perwakilan**
   - Lambang: Kepala Banteng
   - Makna: Demokrasi, musyawarah mufakat, kedaulatan rakyat

5. **Keadilan Sosial bagi Seluruh Rakyat Indonesia**
   - Lambang: Padi dan Kapas
   - Makna: Kesejahteraan rakyat, keadilan ekonomi dan sosial
            """.trimIndent(),
            category = "TWK"
        ),

        // ==================== UUD 1945 ====================
        KnowledgeEntry(
            keywords = listOf("uud 1945", "amandemen", "perubahan uud"),
            question = "Berapa kali UUD 1945 diamandemen?",
            answer = """
**UUD 1945 telah diamandemen sebanyak 4 kali:**

**Amandemen I (19 Oktober 1999)**
- Membatasi kekuasaan Presiden
- Memperkuat fungsi DPR
- Contoh: Presiden tidak lagi membentuk UU, tapi mengajukan RUU

**Amandemen II (18 Agustus 2000)**
- Otonomi daerah
- HAM
- Pertahanan dan keamanan
- Contoh: Penambahan Bab XA tentang HAM (Pasal 28A-28J)

**Amandemen III (9 November 2001)**
- Pemilu langsung Presiden
- Pembentukan MK dan DPD
- Contoh: Presiden dipilih langsung oleh rakyat

**Amandemen IV (11 Agustus 2002)**
- Penghapusan DPA
- Pendidikan dan kebudayaan
- Perekonomian nasional
- Contoh: Anggaran pendidikan minimal 20% dari APBN

**Catatan:** Pembukaan UUD 1945 tidak pernah diamandemen karena mengandung nilai-nilai fundamental.
            """.trimIndent(),
            category = "TWK"
        ),

        KnowledgeEntry(
            keywords = listOf("kedaulatan", "pasal 1", "rakyat"),
            question = "Di mana kedaulatan berada menurut UUD 1945?",
            answer = """
**Kedaulatan Berada di Tangan Rakyat**

Menurut Pasal 1 ayat (2) UUD 1945:
> "Kedaulatan berada di tangan rakyat dan dilaksanakan menurut Undang-Undang Dasar."

**Implementasi Kedaulatan Rakyat:**

1. **Pemilihan Umum (Pemilu)**
   - Pemilu Presiden & Wakil Presiden
   - Pemilu Legislatif (DPR, DPD, DPRD)
   - Pemilihan Kepala Daerah (Pilkada)

2. **Lembaga Perwakilan**
   - DPR (Dewan Perwakilan Rakyat)
   - DPD (Dewan Perwakilan Daerah)
   - MPR (Majelis Permusyawaratan Rakyat)

3. **Partisipasi Masyarakat**
   - Hak menyampaikan pendapat
   - Hak mengajukan petisi
   - Hak mengikuti organisasi

**Indonesia menganut sistem demokrasi konstitusional**, di mana kekuasaan dibatasi oleh konstitusi (UUD 1945).
            """.trimIndent(),
            category = "TWK"
        ),

        // ==================== BHINNEKA TUNGGAL IKA ====================
        KnowledgeEntry(
            keywords = listOf("bhinneka tunggal ika", "semboyan", "sutasoma"),
            question = "Apa arti Bhinneka Tunggal Ika?",
            answer = """
**Bhinneka Tunggal Ika = "Berbeda-beda tetapi tetap satu"**

**Asal-usul:**
- Berasal dari Kitab Sutasoma karangan Mpu Tantular
- Ditulis pada masa Kerajaan Majapahit (abad ke-14)
- Semboyan negara Indonesia sejak kemerdekaan

**Kutipan asli:**
> "Bhinnêka tunggal ika tan hana dharma mangrwa"
> (Berbeda-beda tetapi tetap satu, tidak ada kebenaran yang mendua)

**Makna dalam Konteks Indonesia:**
1. **Keberagaman Suku** - 1.340+ suku bangsa
2. **Keberagaman Agama** - 6 agama resmi + kepercayaan
3. **Keberagaman Bahasa** - 700+ bahasa daerah
4. **Keberagaman Budaya** - Adat istiadat yang beragam

**Nilai yang Terkandung:**
- Toleransi
- Saling menghormati
- Gotong royong
- Persatuan dalam keberagaman

Semboyan ini tertulis pada pita yang dicengkeram burung Garuda dalam lambang negara.
            """.trimIndent(),
            category = "TWK"
        ),

        // ==================== NKRI ====================
        KnowledgeEntry(
            keywords = listOf("nkri", "negara kesatuan", "bentuk negara"),
            question = "Apa itu NKRI?",
            answer = """
**NKRI = Negara Kesatuan Republik Indonesia**

**Dasar Hukum:**
Pasal 1 ayat (1) UUD 1945:
> "Negara Indonesia ialah Negara Kesatuan, yang berbentuk Republik."

**Karakteristik NKRI:**

1. **Kedaulatan Tunggal**
   - Satu pemerintahan pusat
   - Satu UUD yang berlaku di seluruh wilayah
   - Satu sistem hukum nasional

2. **Pembagian Wilayah Administratif**
   - 38 Provinsi
   - 416 Kabupaten
   - 98 Kota
   - 7.094 Kecamatan
   - 83.436 Desa/Kelurahan

3. **Desentralisasi (Otonomi Daerah)**
   - Pemerintah daerah memiliki kewenangan mengatur daerahnya
   - Tetap dalam kerangka NKRI
   - Diatur dalam UU No. 23 Tahun 2014

**Wilayah NKRI:**
- Luas daratan: 1.913.578,68 km²
- Luas perairan: 6.315.222 km²
- 17.504 pulau
- Perbatasan: Malaysia, Papua Nugini, Timor Leste
            """.trimIndent(),
            category = "TWK"
        ),

        // ==================== TIU - SILOGISME ====================
        KnowledgeEntry(
            keywords = listOf("silogisme", "logika", "penalaran", "premis"),
            question = "Apa itu silogisme?",
            answer = """
**Silogisme adalah bentuk penalaran logis dengan dua premis dan satu kesimpulan.**

**Struktur Silogisme:**
1. **Premis Mayor** - Pernyataan umum
2. **Premis Minor** - Pernyataan khusus
3. **Kesimpulan** - Hasil penalaran

**Contoh:**
```
Premis Mayor : Semua mamalia berdarah panas
Premis Minor : Kucing adalah mamalia
Kesimpulan  : Kucing berdarah panas
```

**Jenis-jenis Silogisme:**

1. **Silogisme Kategoris**
   - Semua A adalah B
   - C adalah A
   - Maka C adalah B

2. **Silogisme Hipotesis**
   - Jika A maka B
   - A terjadi
   - Maka B terjadi

3. **Silogisme Alternatif**
   - A atau B
   - Bukan A
   - Maka B

**Tips Mengerjakan Soal Silogisme:**
- Identifikasi premis mayor dan minor
- Perhatikan kata kunci: semua, sebagian, tidak ada
- Tarik kesimpulan berdasarkan hubungan logis
- Hati-hati dengan kesimpulan yang terlalu luas
            """.trimIndent(),
            category = "TIU"
        ),

        KnowledgeEntry(
            keywords = listOf("deret angka", "pola angka", "barisan", "rumus deret"),
            question = "Bagaimana cara mengerjakan soal deret angka?",
            answer = """
**Tips Mengerjakan Soal Deret Angka di TIU CPNS:**

**1. Deret Aritmatika (Beda Tetap)**
```
2, 5, 8, 11, 14, ...
Beda: +3
Jawaban: 17
```

**2. Deret Geometri (Rasio Tetap)**
```
2, 6, 18, 54, ...
Rasio: ×3
Jawaban: 162
```

**3. Deret Fibonacci**
```
1, 1, 2, 3, 5, 8, ...
Pola: Jumlah 2 bilangan sebelumnya
Jawaban: 13
```

**4. Deret Bertingkat**
```
1, 2, 4, 7, 11, ...
Beda: +1, +2, +3, +4, ...
Jawaban: 16
```

**5. Deret Campuran**
```
2, 3, 5, 8, 12, ...
Beda: +1, +2, +3, +4, ...
```

**Strategi:**
1. Hitung selisih antar angka
2. Jika selisih tetap → Aritmatika
3. Jika selisih berubah teratur → Bertingkat
4. Coba bagi antar angka untuk cek rasio
5. Perhatikan pola ganjil/genap
6. Cek pola kuadrat atau pangkat
            """.trimIndent(),
            category = "TIU"
        ),

        // ==================== TKP ====================
        KnowledgeEntry(
            keywords = listOf("tkp", "tips tkp", "cara tkp", "karakteristik pribadi"),
            question = "Bagaimana tips mengerjakan soal TKP?",
            answer = """
**Tips Mengerjakan Soal TKP (Tes Karakteristik Pribadi):**

**Prinsip Utama:**
TKP tidak ada jawaban salah, hanya ada skor berbeda (1-5). Pilih jawaban dengan skor tertinggi!

**Aspek yang Dinilai:**
1. **Pelayanan Publik** - Prioritaskan kepentingan masyarakat
2. **Jejaring Kerja** - Kolaborasi dan kerja tim
3. **Sosial Budaya** - Toleransi dan keberagaman
4. **Profesionalisme** - Tanggung jawab dan dedikasi
5. **Anti Radikalisme** - Moderasi dan toleransi

**Ciri Jawaban Skor Tinggi:**
✅ Mengutamakan kepentingan umum/organisasi
✅ Proaktif mencari solusi
✅ Kolaboratif, bukan individual
✅ Taat aturan dan prosedur
✅ Jujur dan bertanggung jawab
✅ Menghormati atasan dan rekan

**Ciri Jawaban Skor Rendah:**
❌ Mengutamakan kepentingan pribadi
❌ Pasif, menunggu instruksi
❌ Menyalahkan orang lain
❌ Menghindari tanggung jawab
❌ Tidak kooperatif

**Contoh:**
> "Atasan memberikan tugas mendadak saat Anda ingin pulang."

Jawaban terbaik: Menerima tugas dan menyelesaikannya dengan baik.
Jawaban terburuk: Menolak karena sudah waktunya pulang.
            """.trimIndent(),
            category = "TKP"
        ),

        // ==================== INFO CPNS ====================
        KnowledgeEntry(
            keywords = listOf("passing grade", "nilai ambang batas", "skd", "lulus"),
            question = "Berapa passing grade SKD CPNS?",
            answer = """
**Passing Grade SKD CPNS 2024:**

| Kategori | Passing Grade | Nilai Maks | Jumlah Soal |
|----------|---------------|------------|-------------|
| TWK      | 65            | 150        | 30 soal     |
| TIU      | 80            | 175        | 35 soal     |
| TKP      | 166           | 225        | 45 soal     |
| **Total**| **311**       | **550**    | **110 soal**|

**Ketentuan Kelulusan:**
1. ✅ Harus memenuhi passing grade **masing-masing** kategori
2. ✅ TWK ≥ 65 DAN TIU ≥ 80 DAN TKP ≥ 166
3. ❌ Jika salah satu tidak memenuhi, dinyatakan tidak lulus

**Durasi Ujian:**
- 100 menit untuk semua soal
- Sistem CAT (Computer Assisted Test)

**Tips Mencapai Passing Grade:**
- TWK: Minimal 13 soal benar (dari 30)
- TIU: Minimal 16 soal benar (dari 35)
- TKP: Rata-rata skor 3.7 per soal

**Catatan:** Setelah lulus SKD, peserta akan mengikuti SKB (Seleksi Kompetensi Bidang) sesuai formasi jabatan.
            """.trimIndent(),
            category = "INFO"
        ),

        KnowledgeEntry(
            keywords = listOf("cat", "computer assisted test", "sistem ujian"),
            question = "Apa itu sistem CAT CPNS?",
            answer = """
**CAT = Computer Assisted Test**

Sistem ujian berbasis komputer yang digunakan BKN untuk seleksi CPNS.

**Fitur Sistem CAT:**
1. **Soal Acak** - Setiap peserta mendapat urutan soal berbeda
2. **Timer Otomatis** - Waktu 100 menit terhitung otomatis
3. **Hasil Real-time** - Skor langsung terlihat setelah selesai
4. **Anti Kecurangan** - Tidak bisa kembali ke soal sebelumnya

**Tampilan Layar CAT:**
- Soal di tengah layar
- Pilihan jawaban A-E
- Timer di sudut kanan atas
- Nomor soal di sisi layar
- Indikator jawaban (hijau = sudah dijawab)

**Tips Mengerjakan CAT:**
1. ⏱️ Alokasikan waktu: ±55 detik per soal
2. 📝 Jawab semua soal, jangan ada yang kosong
3. 🎯 Kerjakan yang mudah dulu
4. 🔄 Gunakan tombol "Ragu-ragu" untuk soal sulit
5. ⚡ TKP tidak ada jawaban salah, selalu isi

**Persiapan Teknis:**
- Datang 30 menit sebelum jadwal
- Bawa kartu peserta dan KTP
- Ikuti arahan panitia
- Cek kondisi komputer sebelum mulai
            """.trimIndent(),
            category = "INFO"
        )
    )

    /**
     * Mencari jawaban berdasarkan pertanyaan user
     */
    fun findAnswer(query: String): KnowledgeEntry? {
        val queryLower = query.lowercase()
        val queryWords = queryLower.split(" ", ",", "?", "!")
            .filter { it.length > 2 }

        var bestMatch: KnowledgeEntry? = null
        var bestScore = 0

        for (entry in entries) {
            var score = 0
            for (keyword in entry.keywords) {
                if (queryLower.contains(keyword)) {
                    score += 3 // Exact keyword match
                } else {
                    for (word in queryWords) {
                        if (keyword.contains(word) || word.contains(keyword)) {
                            score += 1 // Partial match
                        }
                    }
                }
            }

            if (score > bestScore) {
                bestScore = score
                bestMatch = entry
            }
        }

        // Return match only if score is significant
        return if (bestScore >= 2) bestMatch else null
    }

    /**
     * Mendapatkan topik-topik yang tersedia
     */
    fun getAvailableTopics(): List<String> {
        return entries.map { it.question }
    }

    /**
     * Mendapatkan saran pertanyaan
     */
    fun getSuggestions(): List<String> = listOf(
        "Apa itu Pancasila?",
        "Bagaimana tips mengerjakan TKP?",
        "Berapa passing grade SKD?",
        "Apa arti Bhinneka Tunggal Ika?",
        "Bagaimana cara mengerjakan deret angka?",
        "Apa itu silogisme?"
    )
}
