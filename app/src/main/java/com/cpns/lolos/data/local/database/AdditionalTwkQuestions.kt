package com.cpns.lolos.data.local.database

import com.cpns.lolos.data.local.entity.QuestionEntity
import com.google.gson.Gson

/**
 * Additional TWK (Tes Wawasan Kebangsaan) questions
 * 90 questions covering all subcategories
 */
object AdditionalTwkQuestions {

    private val gson = Gson()
    private fun List<String>.toJson(): String = gson.toJson(this)

    fun getQuestions(): List<QuestionEntity> = listOf(
        // ==================== PANCASILA (10 soal) ====================
        QuestionEntity(
            id = "twk_add_001",
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
            explanation = "Rumusan Pancasila yang sah dan resmi terdapat dalam Pembukaan UUD 1945 alinea keempat. Rumusan ini berbeda dengan Piagam Jakarta karena telah mengalami perubahan pada sila pertama.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_002",
            category = "TWK",
            subCategory = "pancasila",
            questionText = "Fungsi Pancasila sebagai pandangan hidup bangsa Indonesia berarti...",
            options = listOf(
                "Pancasila menjadi dasar dalam bernegara",
                "Pancasila menjadi sumber hukum tertinggi",
                "Pancasila menjadi petunjuk arah dalam kehidupan sehari-hari",
                "Pancasila menjadi ideologi tertutup",
                "Pancasila menjadi alat pemersatu bangsa"
            ).toJson(),
            correctAnswer = 2,
            explanation = "Sebagai pandangan hidup (way of life), Pancasila berfungsi sebagai petunjuk arah dalam kehidupan sehari-hari masyarakat Indonesia, baik dalam hubungan dengan Tuhan, sesama manusia, maupun alam.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_003",
            category = "TWK",
            subCategory = "pancasila",
            questionText = "Pengamalan sila Kemanusiaan yang Adil dan Beradab diwujudkan dalam bentuk...",
            options = listOf(
                "Melaksanakan ibadah sesuai agama masing-masing",
                "Menghormati hak asasi setiap manusia",
                "Mengutamakan kepentingan golongan",
                "Menjunjung tinggi kedaulatan rakyat",
                "Mendahulukan kepentingan negara"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Sila kedua Pancasila tentang Kemanusiaan yang Adil dan Beradab mengandung nilai penghormatan terhadap hak asasi manusia, persamaan derajat, dan sikap saling mencintai sesama manusia.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_004",
            category = "TWK",
            subCategory = "pancasila",
            questionText = "Tokoh yang mengusulkan nama 'Pancasila' untuk dasar negara Indonesia adalah...",
            options = listOf(
                "Mohammad Hatta",
                "Mr. Soepomo",
                "Ir. Soekarno",
                "Mr. Muhammad Yamin",
                "Ki Hajar Dewantara"
            ).toJson(),
            correctAnswer = 2,
            explanation = "Ir. Soekarno dalam pidatonya tanggal 1 Juni 1945 mengusulkan nama 'Pancasila' untuk dasar negara Indonesia. Nama ini berasal dari bahasa Sanskerta: Panca (lima) dan Sila (dasar/prinsip).",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_005",
            category = "TWK",
            subCategory = "pancasila",
            questionText = "Pancasila sebagai ideologi terbuka memiliki ciri...",
            options = listOf(
                "Tidak dapat diubah dalam situasi apapun",
                "Dapat menyesuaikan dengan perkembangan zaman tanpa mengubah nilai dasarnya",
                "Berasal dari luar negeri dan diadopsi Indonesia",
                "Hanya berlaku untuk golongan tertentu",
                "Bertentangan dengan nilai-nilai agama"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Pancasila sebagai ideologi terbuka berarti nilai-nilai dasarnya tetap, namun penerapannya dapat menyesuaikan dengan perkembangan zaman, iptek, dan dinamika masyarakat.",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_006",
            category = "TWK",
            subCategory = "pancasila",
            questionText = "Makna sila Persatuan Indonesia adalah...",
            options = listOf(
                "Indonesia harus menjadi negara kesatuan",
                "Semua suku harus melebur menjadi satu",
                "Persatuan dalam keberagaman (Bhinneka Tunggal Ika)",
                "Menutup diri dari pengaruh luar",
                "Mengutamakan satu bahasa daerah"
            ).toJson(),
            correctAnswer = 2,
            explanation = "Sila ketiga mengandung makna persatuan dalam keberagaman, bukan penyeragaman. Indonesia tetap menghargai keberagaman suku, agama, ras, dan budaya yang bersatu dalam wadah NKRI.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_007",
            category = "TWK",
            subCategory = "pancasila",
            questionText = "Nilai yang terkandung dalam sila Kerakyatan yang Dipimpin oleh Hikmat Kebijaksanaan dalam Permusyawaratan/Perwakilan adalah...",
            options = listOf(
                "Voting adalah satu-satunya cara mengambil keputusan",
                "Keputusan diambil oleh pemimpin tertinggi",
                "Musyawarah untuk mencapai mufakat",
                "Kepentingan individu lebih utama",
                "Wakil rakyat tidak perlu mendengar aspirasi rakyat"
            ).toJson(),
            correctAnswer = 2,
            explanation = "Sila keempat mengandung nilai musyawarah untuk mencapai mufakat. Pengambilan keputusan dilakukan secara demokratis dengan mengutamakan kepentingan bersama.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_008",
            category = "TWK",
            subCategory = "pancasila",
            questionText = "Implementasi sila Keadilan Sosial bagi Seluruh Rakyat Indonesia dalam kehidupan bernegara adalah...",
            options = listOf(
                "Pemerataan pembangunan di seluruh wilayah Indonesia",
                "Pembangunan hanya di kota-kota besar",
                "Mengutamakan golongan kaya",
                "Membiarkan mekanisme pasar bebas sepenuhnya",
                "Tidak ada campur tangan pemerintah dalam ekonomi"
            ).toJson(),
            correctAnswer = 0,
            explanation = "Sila kelima mengandung nilai keadilan sosial yang diwujudkan melalui pemerataan pembangunan, mengurangi kesenjangan ekonomi, dan memastikan kesejahteraan bagi seluruh rakyat.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_009",
            category = "TWK",
            subCategory = "pancasila",
            questionText = "Pancasila digali dari nilai-nilai luhur bangsa Indonesia, hal ini menunjukkan bahwa Pancasila bersifat...",
            options = listOf(
                "Universal",
                "Asing",
                "Impor dari negara lain",
                "Orisinal dan autentik",
                "Temporal"
            ).toJson(),
            correctAnswer = 3,
            explanation = "Pancasila bersifat orisinal dan autentik karena digali dari nilai-nilai luhur bangsa Indonesia sendiri yang sudah ada sejak lama dalam kehidupan masyarakat Nusantara.",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_010",
            category = "TWK",
            subCategory = "pancasila",
            questionText = "Hubungan antarsila dalam Pancasila bersifat...",
            options = listOf(
                "Saling bertentangan",
                "Terpisah dan berdiri sendiri",
                "Organis dan hierarkis",
                "Tidak ada hubungan",
                "Dapat dipilih salah satu"
            ).toJson(),
            correctAnswer = 2,
            explanation = "Hubungan antarsila Pancasila bersifat organis (saling terkait sebagai satu kesatuan) dan hierarkis (sila pertama menjiwai sila-sila berikutnya). Kelima sila merupakan satu kesatuan yang utuh.",
            difficulty = "medium",
            year = 2024
        ),

        // ==================== UUD 1945 (10 soal) ====================
        QuestionEntity(
            id = "twk_add_011",
            category = "TWK",
            subCategory = "uud1945",
            questionText = "Pembukaan UUD 1945 terdiri dari...",
            options = listOf(
                "3 alinea",
                "4 alinea",
                "5 alinea",
                "6 alinea",
                "7 alinea"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Pembukaan UUD 1945 terdiri dari 4 alinea yang memuat pernyataan kemerdekaan, cita-cita bangsa, proklamasi, dan dasar negara Pancasila.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_012",
            category = "TWK",
            subCategory = "uud1945",
            questionText = "Menurut UUD 1945, lembaga negara yang berwenang mengubah dan menetapkan UUD adalah...",
            options = listOf(
                "DPR",
                "Presiden",
                "MPR",
                "MA",
                "MK"
            ).toJson(),
            correctAnswer = 2,
            explanation = "Berdasarkan Pasal 3 ayat (1) UUD 1945, MPR berwenang mengubah dan menetapkan UUD. Perubahan UUD memerlukan dukungan minimal 2/3 anggota MPR.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_013",
            category = "TWK",
            subCategory = "uud1945",
            questionText = "Pasal yang mengatur tentang hak asasi manusia dalam UUD 1945 hasil amandemen terdapat dalam Pasal...",
            options = listOf(
                "Pasal 1-5",
                "Pasal 10-15",
                "Pasal 28A-28J",
                "Pasal 30-35",
                "Pasal 36-37"
            ).toJson(),
            correctAnswer = 2,
            explanation = "HAM diatur dalam Pasal 28A sampai 28J UUD 1945, yang merupakan hasil Amandemen Kedua. Pasal-pasal ini mengatur berbagai hak dasar warga negara.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_014",
            category = "TWK",
            subCategory = "uud1945",
            questionText = "Menurut UUD 1945, Presiden dan Wakil Presiden dipilih dalam satu pasangan secara langsung oleh...",
            options = listOf(
                "MPR",
                "DPR",
                "Rakyat",
                "Partai politik",
                "Dewan pemilih"
            ).toJson(),
            correctAnswer = 2,
            explanation = "Berdasarkan Pasal 6A UUD 1945 hasil amandemen, Presiden dan Wakil Presiden dipilih langsung oleh rakyat. Sistem ini berlaku sejak Pemilu 2004.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_015",
            category = "TWK",
            subCategory = "uud1945",
            questionText = "Masa jabatan Presiden dan Wakil Presiden menurut UUD 1945 adalah...",
            options = listOf(
                "4 tahun dan dapat dipilih kembali untuk satu kali masa jabatan",
                "5 tahun dan dapat dipilih kembali untuk satu kali masa jabatan",
                "5 tahun dan dapat dipilih kembali tanpa batas",
                "6 tahun dan tidak dapat dipilih kembali",
                "4 tahun dan tidak dapat dipilih kembali"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Berdasarkan Pasal 7 UUD 1945, Presiden dan Wakil Presiden memegang jabatan selama 5 tahun dan sesudahnya dapat dipilih kembali dalam jabatan yang sama, hanya untuk satu kali masa jabatan.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_016",
            category = "TWK",
            subCategory = "uud1945",
            questionText = "Lembaga negara yang berwenang menguji undang-undang terhadap UUD adalah...",
            options = listOf(
                "Mahkamah Agung",
                "Mahkamah Konstitusi",
                "Komisi Yudisial",
                "DPR",
                "MPR"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Berdasarkan Pasal 24C UUD 1945, Mahkamah Konstitusi berwenang menguji undang-undang terhadap UUD (judicial review). MK juga memutus sengketa pemilu dan pembubaran partai politik.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_017",
            category = "TWK",
            subCategory = "uud1945",
            questionText = "Tujuan negara Indonesia sebagaimana tercantum dalam Pembukaan UUD 1945 alinea keempat adalah...",
            options = listOf(
                "Menjadi negara adidaya",
                "Melindungi segenap bangsa dan seluruh tumpah darah Indonesia",
                "Menguasai wilayah negara lain",
                "Menjadi pusat perdagangan dunia",
                "Membangun kekuatan militer terbesar"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Tujuan negara Indonesia dalam Pembukaan UUD 1945 alinea IV: melindungi segenap bangsa, memajukan kesejahteraan umum, mencerdaskan kehidupan bangsa, dan ikut melaksanakan ketertiban dunia.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_018",
            category = "TWK",
            subCategory = "uud1945",
            questionText = "DPD (Dewan Perwakilan Daerah) dibentuk melalui amandemen UUD 1945 yang ke...",
            options = listOf(
                "Pertama",
                "Kedua",
                "Ketiga",
                "Keempat",
                "Kelima"
            ).toJson(),
            correctAnswer = 2,
            explanation = "DPD dibentuk melalui Amandemen Ketiga UUD 1945 (2001). DPD merupakan lembaga perwakilan daerah yang anggotanya dipilih langsung dari setiap provinsi melalui pemilu.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_019",
            category = "TWK",
            subCategory = "uud1945",
            questionText = "Menurut UUD 1945, setiap warga negara berhak mendapat pendidikan. Hal ini diatur dalam Pasal...",
            options = listOf(
                "Pasal 28",
                "Pasal 29",
                "Pasal 30",
                "Pasal 31",
                "Pasal 32"
            ).toJson(),
            correctAnswer = 3,
            explanation = "Pasal 31 UUD 1945 mengatur tentang hak pendidikan: setiap warga negara berhak mendapat pendidikan dan pemerintah wajib membiayai pendidikan dasar. Anggaran pendidikan minimal 20% dari APBN/APBD.",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_020",
            category = "TWK",
            subCategory = "uud1945",
            questionText = "Sistem pemerintahan yang dianut Indonesia menurut UUD 1945 adalah...",
            options = listOf(
                "Presidensial murni",
                "Parlementer murni",
                "Semi presidensial",
                "Presidensial dengan ciri parlementer",
                "Federal"
            ).toJson(),
            correctAnswer = 0,
            explanation = "Indonesia menganut sistem pemerintahan presidensial murni setelah amandemen UUD 1945, di mana Presiden sebagai kepala negara sekaligus kepala pemerintahan, dipilih langsung oleh rakyat.",
            difficulty = "medium",
            year = 2024
        ),

        // ==================== NKRI (10 soal) ====================
        QuestionEntity(
            id = "twk_add_021",
            category = "TWK",
            subCategory = "nkri",
            questionText = "Bentuk negara Indonesia menurut Pasal 1 ayat (1) UUD 1945 adalah...",
            options = listOf(
                "Negara Federal",
                "Negara Konfederasi",
                "Negara Kesatuan berbentuk Republik",
                "Negara Monarki Konstitusional",
                "Negara Serikat"
            ).toJson(),
            correctAnswer = 2,
            explanation = "Pasal 1 ayat (1) UUD 1945 menyatakan 'Negara Indonesia ialah Negara Kesatuan yang berbentuk Republik'. Bentuk negara kesatuan dengan pembagian wilayah administratif.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_022",
            category = "TWK",
            subCategory = "nkri",
            questionText = "Wilayah NKRI meliputi...",
            options = listOf(
                "Hanya daratan",
                "Daratan dan lautan",
                "Daratan, lautan, dan udara",
                "Hanya lautan",
                "Daratan dan udara"
            ).toJson(),
            correctAnswer = 2,
            explanation = "Wilayah NKRI meliputi daratan, lautan (perairan), dan udara di atasnya sebagai satu kesatuan wilayah yang berdaulat. Konsep ini sesuai dengan Deklarasi Djuanda 1957.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_023",
            category = "TWK",
            subCategory = "nkri",
            questionText = "Prinsip otonomi daerah di Indonesia berdasarkan UUD 1945 adalah...",
            options = listOf(
                "Sentralisasi penuh",
                "Desentralisasi, dekonsentrasi, dan tugas pembantuan",
                "Federalisme",
                "Konfederasi",
                "Otonomi tidak terbatas"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Otonomi daerah di Indonesia dilaksanakan dengan prinsip desentralisasi (pelimpahan wewenang), dekonsentrasi (pelimpahan dari pusat ke wakil pusat di daerah), dan tugas pembantuan.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_024",
            category = "TWK",
            subCategory = "nkri",
            questionText = "Asas yang menyatakan bahwa wilayah Indonesia merupakan satu kesatuan politik, ekonomi, sosial budaya, dan hankam adalah...",
            options = listOf(
                "Asas Kebangsaan",
                "Asas Wawasan Nusantara",
                "Asas Kewilayahan",
                "Asas Desentralisasi",
                "Asas Federalisme"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Wawasan Nusantara adalah cara pandang bangsa Indonesia tentang diri dan lingkungannya sebagai satu kesatuan dalam berbagai aspek kehidupan (ideologi, politik, ekonomi, sosial budaya, dan hankam).",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_025",
            category = "TWK",
            subCategory = "nkri",
            questionText = "Deklarasi Djuanda 13 Desember 1957 menegaskan tentang...",
            options = listOf(
                "Kemerdekaan Indonesia",
                "Konsep negara kepulauan Indonesia",
                "Pembentukan ASEAN",
                "Konfrontasi dengan Malaysia",
                "Nasionalisasi perusahaan asing"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Deklarasi Djuanda menegaskan konsep negara kepulauan (archipelagic state) di mana laut di antara pulau-pulau adalah bagian tak terpisahkan dari wilayah Indonesia, bukan laut bebas.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_026",
            category = "TWK",
            subCategory = "nkri",
            questionText = "Jumlah provinsi di Indonesia saat ini (2024) adalah...",
            options = listOf(
                "34 provinsi",
                "36 provinsi",
                "37 provinsi",
                "38 provinsi",
                "40 provinsi"
            ).toJson(),
            correctAnswer = 2,
            explanation = "Per 2024, Indonesia memiliki 37 provinsi setelah pemekaran beberapa provinsi baru termasuk provinsi-provinsi di Papua. Jumlah ini dapat berubah sesuai kebijakan pemerintah.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_027",
            category = "TWK",
            subCategory = "nkri",
            questionText = "Batas laut teritorial Indonesia menurut UNCLOS adalah...",
            options = listOf(
                "3 mil laut",
                "12 mil laut",
                "24 mil laut",
                "200 mil laut",
                "350 mil laut"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Menurut UNCLOS 1982, laut teritorial Indonesia adalah 12 mil laut dari garis pangkal. Zona tambahan 24 mil dan ZEE 200 mil dari garis pangkal.",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_028",
            category = "TWK",
            subCategory = "nkri",
            questionText = "Pembagian daerah di Indonesia diatur dalam UU tentang...",
            options = listOf(
                "UU Pemilu",
                "UU Pemerintahan Daerah",
                "UU ASN",
                "UU Keuangan Negara",
                "UU Pertahanan"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Pembagian daerah dan pemerintahan daerah diatur dalam UU Pemerintahan Daerah (saat ini UU No. 23 Tahun 2014). UU ini mengatur tentang kewenangan pusat dan daerah.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_029",
            category = "TWK",
            subCategory = "nkri",
            questionText = "Ibu kota negara Indonesia yang baru adalah...",
            options = listOf(
                "Jakarta",
                "Palangkaraya",
                "Nusantara",
                "Balikpapan",
                "Samarinda"
            ).toJson(),
            correctAnswer = 2,
            explanation = "Ibu Kota Negara (IKN) baru Indonesia bernama Nusantara, terletak di Kalimantan Timur. Pemindahan ibu kota diatur dalam UU No. 3 Tahun 2022.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_030",
            category = "TWK",
            subCategory = "nkri",
            questionText = "Letak geografis Indonesia yang strategis berada di antara...",
            options = listOf(
                "Benua Asia dan Afrika, Samudra Hindia dan Pasifik",
                "Benua Asia dan Australia, Samudra Hindia dan Pasifik",
                "Benua Asia dan Eropa, Samudra Atlantik dan Hindia",
                "Benua Amerika dan Asia, Samudra Pasifik dan Atlantik",
                "Benua Afrika dan Australia, Samudra Hindia dan Atlantik"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Indonesia terletak di antara dua benua (Asia dan Australia) dan dua samudra (Hindia dan Pasifik). Posisi ini menjadikan Indonesia sebagai jalur perdagangan dan pelayaran internasional.",
            difficulty = "easy",
            year = 2023
        ),

        // ==================== BHINNEKA TUNGGAL IKA (10 soal) ====================
        QuestionEntity(
            id = "twk_add_031",
            category = "TWK",
            subCategory = "bhinneka",
            questionText = "Semboyan Bhinneka Tunggal Ika berasal dari kitab...",
            options = listOf(
                "Negarakertagama",
                "Sutasoma",
                "Pararaton",
                "Arjunawiwaha",
                "Ramayana"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Bhinneka Tunggal Ika berasal dari kitab Sutasoma karya Mpu Tantular pada masa Kerajaan Majapahit (abad 14). Semboyan ini bermakna 'Berbeda-beda tetapi tetap satu'.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_032",
            category = "TWK",
            subCategory = "bhinneka",
            questionText = "Makna Bhinneka Tunggal Ika adalah...",
            options = listOf(
                "Bersatu kita teguh bercerai kita runtuh",
                "Berbeda-beda tetapi tetap satu",
                "Satu untuk semua, semua untuk satu",
                "Banyak anak banyak rezeki",
                "Tak kenal maka tak sayang"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Bhinneka Tunggal Ika bermakna 'Berbeda-beda tetapi tetap satu'. Semboyan ini menggambarkan keberagaman Indonesia (suku, agama, ras, budaya) yang bersatu dalam NKRI.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_033",
            category = "TWK",
            subCategory = "bhinneka",
            questionText = "Sikap yang mencerminkan Bhinneka Tunggal Ika dalam kehidupan sehari-hari adalah...",
            options = listOf(
                "Merendahkan budaya daerah lain",
                "Menghormati perbedaan dan keberagaman",
                "Memaksakan budaya sendiri kepada orang lain",
                "Hanya bergaul dengan satu suku",
                "Menolak keberadaan agama lain"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Sikap yang mencerminkan Bhinneka Tunggal Ika adalah menghormati perbedaan, toleransi antar umat beragama, menghargai keberagaman budaya, dan menjaga persatuan.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_034",
            category = "TWK",
            subCategory = "bhinneka",
            questionText = "Jumlah suku bangsa di Indonesia diperkirakan lebih dari...",
            options = listOf(
                "100 suku",
                "300 suku",
                "500 suku",
                "1.000 suku",
                "1.300 suku"
            ).toJson(),
            correctAnswer = 4,
            explanation = "Indonesia memiliki lebih dari 1.300 suku bangsa dengan ratusan bahasa daerah. Keberagaman ini menjadi kekayaan budaya yang harus dijaga dan dilestarikan.",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_035",
            category = "TWK",
            subCategory = "bhinneka",
            questionText = "Toleransi antar umat beragama di Indonesia diwujudkan melalui...",
            options = listOf(
                "Memaksakan agama kepada orang lain",
                "Melarang peribadatan agama lain",
                "Menghormati kebebasan beribadah sesuai agama masing-masing",
                "Menutup rumah ibadah agama minoritas",
                "Tidak mengakui agama lain"
            ).toJson(),
            correctAnswer = 2,
            explanation = "Toleransi antar umat beragama diwujudkan dengan menghormati kebebasan beribadah sesuai agama dan kepercayaan masing-masing, sebagaimana dijamin dalam UUD 1945 Pasal 29.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_036",
            category = "TWK",
            subCategory = "bhinneka",
            questionText = "Agama yang diakui secara resmi di Indonesia adalah...",
            options = listOf(
                "4 agama",
                "5 agama",
                "6 agama",
                "7 agama",
                "8 agama"
            ).toJson(),
            correctAnswer = 2,
            explanation = "Indonesia mengakui 6 agama resmi: Islam, Kristen Protestan, Katolik, Hindu, Buddha, dan Konghucu. Selain itu, aliran kepercayaan juga diakui keberadaannya.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_037",
            category = "TWK",
            subCategory = "bhinneka",
            questionText = "Forum Kerukunan Umat Beragama (FKUB) dibentuk untuk...",
            options = listOf(
                "Menyebarkan agama tertentu",
                "Membangun kerukunan antar umat beragama",
                "Melarang agama minoritas",
                "Mengatur perpindahan agama",
                "Menghapus perbedaan agama"
            ).toJson(),
            correctAnswer = 1,
            explanation = "FKUB dibentuk untuk membangun dan memelihara kerukunan antar umat beragama di Indonesia. FKUB ada di tingkat provinsi dan kabupaten/kota.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_038",
            category = "TWK",
            subCategory = "bhinneka",
            questionText = "Multikultural dalam konteks Indonesia berarti...",
            options = listOf(
                "Penyeragaman budaya",
                "Penghapusan budaya lokal",
                "Pengakuan dan penghargaan terhadap keberagaman budaya",
                "Dominasi satu budaya tertentu",
                "Isolasi antar budaya"
            ).toJson(),
            correctAnswer = 2,
            explanation = "Multikulturalisme Indonesia berarti mengakui dan menghargai keberagaman budaya yang ada. Setiap budaya memiliki nilai dan kedudukan yang sama dalam bingkai NKRI.",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_039",
            category = "TWK",
            subCategory = "bhinneka",
            questionText = "Bahasa Indonesia ditetapkan sebagai bahasa persatuan dalam...",
            options = listOf(
                "Sumpah Pemuda 1928",
                "Proklamasi 1945",
                "Dekrit Presiden 1959",
                "Supersemar 1966",
                "Reformasi 1998"
            ).toJson(),
            correctAnswer = 0,
            explanation = "Bahasa Indonesia ditetapkan sebagai bahasa persatuan dalam Sumpah Pemuda 28 Oktober 1928, yang berbunyi 'Kami putra dan putri Indonesia menjunjung bahasa persatuan, bahasa Indonesia'.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_040",
            category = "TWK",
            subCategory = "bhinneka",
            questionText = "Perilaku intoleran yang bertentangan dengan Bhinneka Tunggal Ika adalah...",
            options = listOf(
                "Menghadiri perayaan hari besar agama tetangga",
                "Menolak keberadaan rumah ibadah agama lain",
                "Belajar bahasa daerah lain",
                "Mengenakan pakaian adat daerah lain",
                "Mencicipi makanan khas daerah lain"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Menolak keberadaan rumah ibadah agama lain adalah bentuk intoleransi yang bertentangan dengan semangat Bhinneka Tunggal Ika dan kebebasan beragama.",
            difficulty = "easy",
            year = 2023
        ),

        // ==================== SEJARAH INDONESIA (10 soal) ====================
        QuestionEntity(
            id = "twk_add_041",
            category = "TWK",
            subCategory = "sejarah",
            questionText = "Proklamasi Kemerdekaan Indonesia dibacakan pada tanggal...",
            options = listOf(
                "17 Agustus 1945",
                "18 Agustus 1945",
                "1 Juni 1945",
                "22 Juni 1945",
                "28 Oktober 1928"
            ).toJson(),
            correctAnswer = 0,
            explanation = "Proklamasi Kemerdekaan Indonesia dibacakan oleh Soekarno-Hatta pada tanggal 17 Agustus 1945 di Jalan Pegangsaan Timur No. 56, Jakarta.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_042",
            category = "TWK",
            subCategory = "sejarah",
            questionText = "Organisasi pergerakan nasional pertama di Indonesia adalah...",
            options = listOf(
                "Sarekat Islam",
                "Budi Utomo",
                "Muhammadiyah",
                "Partai Nasional Indonesia",
                "Perhimpunan Indonesia"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Budi Utomo didirikan pada 20 Mei 1908 oleh Dr. Soetomo dan kawan-kawan. Tanggal ini kemudian diperingati sebagai Hari Kebangkitan Nasional.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_043",
            category = "TWK",
            subCategory = "sejarah",
            questionText = "Peristiwa Rengasdengklok terjadi pada tanggal...",
            options = listOf(
                "14 Agustus 1945",
                "15 Agustus 1945",
                "16 Agustus 1945",
                "17 Agustus 1945",
                "18 Agustus 1945"
            ).toJson(),
            correctAnswer = 2,
            explanation = "Peristiwa Rengasdengklok terjadi pada 16 Agustus 1945, di mana golongan muda 'menculik' Soekarno-Hatta untuk mempercepat proklamasi kemerdekaan.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_044",
            category = "TWK",
            subCategory = "sejarah",
            questionText = "Konferensi Asia Afrika (KAA) pertama diadakan di...",
            options = listOf(
                "Jakarta, 1945",
                "Bandung, 1955",
                "Yogyakarta, 1949",
                "Surabaya, 1945",
                "Magelang, 1948"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Konferensi Asia Afrika pertama diadakan di Bandung pada 18-24 April 1955. Konferensi ini dihadiri 29 negara Asia dan Afrika serta melahirkan Dasasila Bandung.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_045",
            category = "TWK",
            subCategory = "sejarah",
            questionText = "Pertempuran 10 November 1945 terjadi di kota...",
            options = listOf(
                "Jakarta",
                "Bandung",
                "Surabaya",
                "Semarang",
                "Medan"
            ).toJson(),
            correctAnswer = 2,
            explanation = "Pertempuran 10 November 1945 terjadi di Surabaya, dipimpin oleh Bung Tomo. Tanggal ini diperingati sebagai Hari Pahlawan.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_046",
            category = "TWK",
            subCategory = "sejarah",
            questionText = "Serangan Umum 1 Maret 1949 dipimpin oleh...",
            options = listOf(
                "Jenderal Soedirman",
                "Letnan Kolonel Soeharto",
                "Jenderal A.H. Nasution",
                "Jenderal Gatot Subroto",
                "Jenderal Urip Sumoharjo"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Serangan Umum 1 Maret 1949 di Yogyakarta dipimpin oleh Letnan Kolonel Soeharto. Serangan ini membuktikan bahwa TNI masih eksis meskipun ibu kota diduduki Belanda.",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_047",
            category = "TWK",
            subCategory = "sejarah",
            questionText = "Perjanjian yang mengakhiri Agresi Militer Belanda II adalah...",
            options = listOf(
                "Perjanjian Linggarjati",
                "Perjanjian Renville",
                "Konferensi Meja Bundar",
                "Perjanjian Roem-Royen",
                "Perjanjian San Francisco"
            ).toJson(),
            correctAnswer = 2,
            explanation = "Konferensi Meja Bundar (KMB) di Den Haag, Belanda pada 23 Agustus - 2 November 1949 mengakhiri konflik Indonesia-Belanda. Belanda mengakui kedaulatan Indonesia.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_048",
            category = "TWK",
            subCategory = "sejarah",
            questionText = "Gerakan 30 September 1965 (G30S) terjadi pada masa pemerintahan...",
            options = listOf(
                "Presiden Soekarno",
                "Presiden Soeharto",
                "Presiden Habibie",
                "Presiden Megawati",
                "Presiden SBY"
            ).toJson(),
            correctAnswer = 0,
            explanation = "G30S terjadi pada masa pemerintahan Presiden Soekarno (Orde Lama). Peristiwa ini menjadi awal berakhirnya Orde Lama dan dimulainya Orde Baru.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_049",
            category = "TWK",
            subCategory = "sejarah",
            questionText = "Reformasi 1998 terjadi dan mengakhiri kekuasaan...",
            options = listOf(
                "Presiden Soekarno",
                "Presiden Soeharto",
                "Presiden Habibie",
                "Presiden Gus Dur",
                "Presiden Megawati"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Reformasi 1998 mengakhiri kekuasaan Presiden Soeharto yang telah berkuasa selama 32 tahun. Soeharto mengundurkan diri pada 21 Mei 1998 dan digantikan B.J. Habibie.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_050",
            category = "TWK",
            subCategory = "sejarah",
            questionText = "Kerajaan Sriwijaya berpusat di...",
            options = listOf(
                "Jawa Tengah",
                "Jawa Timur",
                "Sumatera Selatan",
                "Kalimantan",
                "Sulawesi"
            ).toJson(),
            correctAnswer = 2,
            explanation = "Kerajaan Sriwijaya (abad 7-14 M) berpusat di Palembang, Sumatera Selatan. Sriwijaya merupakan kerajaan maritim besar yang menguasai jalur perdagangan Selat Malaka.",
            difficulty = "easy",
            year = 2023
        ),

        // ==================== BAHASA INDONESIA (10 soal) ====================
        QuestionEntity(
            id = "twk_add_051",
            category = "TWK",
            subCategory = "bahasa",
            questionText = "Bahasa Indonesia berasal dari bahasa...",
            options = listOf(
                "Jawa",
                "Sunda",
                "Melayu",
                "Batak",
                "Minang"
            ).toJson(),
            correctAnswer = 2,
            explanation = "Bahasa Indonesia berasal dari bahasa Melayu yang telah digunakan sebagai lingua franca (bahasa pergaulan) di Nusantara selama berabad-abad.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_052",
            category = "TWK",
            subCategory = "bahasa",
            questionText = "Ejaan yang berlaku dalam bahasa Indonesia saat ini adalah...",
            options = listOf(
                "Ejaan Van Ophuijsen",
                "Ejaan Republik",
                "Ejaan Yang Disempurnakan (EYD)",
                "Ejaan Bahasa Indonesia (EBI)",
                "Ejaan Soewandi"
            ).toJson(),
            correctAnswer = 3,
            explanation = "Ejaan yang berlaku saat ini adalah Ejaan Bahasa Indonesia (EBI) yang ditetapkan melalui Permendikbud No. 50 Tahun 2015, menggantikan EYD.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_053",
            category = "TWK",
            subCategory = "bahasa",
            questionText = "Penulisan kata yang benar menurut EBI adalah...",
            options = listOf(
                "Jum'at",
                "Jumat",
                "Juma'at",
                "Djumat",
                "Djuma'at"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Penulisan yang benar menurut EBI adalah 'Jumat' tanpa tanda apostrof. Tanda apostrof hanya digunakan untuk menggantikan huruf yang dilesapkan.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_054",
            category = "TWK",
            subCategory = "bahasa",
            questionText = "Kalimat efektif adalah kalimat yang...",
            options = listOf(
                "Menggunakan banyak kata",
                "Menggunakan kata-kata asing",
                "Tepat sasaran dan tidak bertele-tele",
                "Sangat panjang",
                "Menggunakan kata tidak baku"
            ).toJson(),
            correctAnswer = 2,
            explanation = "Kalimat efektif adalah kalimat yang tepat sasaran, tidak bertele-tele, jelas maknanya, dan mudah dipahami pembaca atau pendengar.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_055",
            category = "TWK",
            subCategory = "bahasa",
            questionText = "Kata baku dari 'nasehat' adalah...",
            options = listOf(
                "Nasehat",
                "Nasihat",
                "Nasehad",
                "Nasihad",
                "Nesihat"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Kata baku yang benar adalah 'nasihat' bukan 'nasehat'. Kata ini berasal dari bahasa Arab 'nasihah'.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_056",
            category = "TWK",
            subCategory = "bahasa",
            questionText = "Fungsi bahasa Indonesia sebagai bahasa negara adalah...",
            options = listOf(
                "Bahasa pengantar di sekolah saja",
                "Bahasa komunikasi antar suku",
                "Bahasa resmi kenegaraan, pengantar pendidikan, dan komunikasi nasional",
                "Bahasa pergaulan sehari-hari",
                "Bahasa daerah pengganti"
            ).toJson(),
            correctAnswer = 2,
            explanation = "Sebagai bahasa negara, bahasa Indonesia berfungsi sebagai bahasa resmi kenegaraan, pengantar pendidikan, alat komunikasi nasional, dan pengembangan kebudayaan nasional.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_057",
            category = "TWK",
            subCategory = "bahasa",
            questionText = "Sinonim dari kata 'komprehensif' adalah...",
            options = listOf(
                "Sebagian",
                "Menyeluruh",
                "Terbatas",
                "Sempit",
                "Parsial"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Komprehensif berarti menyeluruh, lengkap, atau mencakup semua aspek. Antonimnya adalah parsial atau sebagian.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_058",
            category = "TWK",
            subCategory = "bahasa",
            questionText = "Penggunaan tanda baca yang benar adalah...",
            options = listOf(
                "Ibu pergi kepasar.",
                "Ibu pergi ke pasar.",
                "Ibu, pergi ke pasar.",
                "Ibu pergi ke, pasar.",
                "Ibu pergi: ke pasar."
            ).toJson(),
            correctAnswer = 1,
            explanation = "Penulisan yang benar adalah 'Ibu pergi ke pasar.' dengan spasi antara preposisi 'ke' dan kata 'pasar'. 'Ke' sebagai preposisi ditulis terpisah.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_059",
            category = "TWK",
            subCategory = "bahasa",
            questionText = "Antonim dari kata 'abstrak' adalah...",
            options = listOf(
                "Imajinatif",
                "Teoritis",
                "Konkret",
                "Filosofis",
                "Hipotetis"
            ).toJson(),
            correctAnswer = 2,
            explanation = "Antonim (lawan kata) dari abstrak adalah konkret. Abstrak berarti tidak berwujud/tidak nyata, sedangkan konkret berarti nyata/berwujud.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_060",
            category = "TWK",
            subCategory = "bahasa",
            questionText = "Kalimat yang menggunakan kata baku adalah...",
            options = listOf(
                "Anak itu sangat aktip di kelas.",
                "Anak itu sangat aktif di kelas.",
                "Anak itu sangat aktiv di kelas.",
                "Anak itu sangat aktief di kelas.",
                "Anak itu sangat achtif di kelas."
            ).toJson(),
            correctAnswer = 1,
            explanation = "Kata baku yang benar adalah 'aktif' bukan 'aktip', 'aktiv', atau bentuk lainnya. Kata ini diserap dari bahasa Belanda 'actief'.",
            difficulty = "easy",
            year = 2024
        ),

        // ==================== NASIONALISME (10 soal) ====================
        QuestionEntity(
            id = "twk_add_061",
            category = "TWK",
            subCategory = "nasionalisme",
            questionText = "Nasionalisme Indonesia bersifat...",
            options = listOf(
                "Chauvinis",
                "Kosmopolitan",
                "Inklusif dan terbuka",
                "Eksklusif dan tertutup",
                "Isolasionis"
            ).toJson(),
            correctAnswer = 2,
            explanation = "Nasionalisme Indonesia bersifat inklusif dan terbuka, menghargai keberagaman internal dan hubungan baik dengan bangsa lain, berbeda dengan nasionalisme sempit (chauvinisme).",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_062",
            category = "TWK",
            subCategory = "nasionalisme",
            questionText = "Cinta tanah air dapat diwujudkan dengan...",
            options = listOf(
                "Membenci bangsa lain",
                "Menggunakan produk dalam negeri",
                "Menolak hubungan internasional",
                "Menutup diri dari pengaruh luar",
                "Mengagungkan budaya asing"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Cinta tanah air dapat diwujudkan dengan menggunakan produk dalam negeri, melestarikan budaya bangsa, dan berkontribusi positif bagi pembangunan nasional.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_063",
            category = "TWK",
            subCategory = "nasionalisme",
            questionText = "Semangat nasionalisme Indonesia mulai tumbuh pada awal abad ke-20, ditandai dengan berdirinya...",
            options = listOf(
                "VOC",
                "Budi Utomo",
                "Partai Komunis Indonesia",
                "Tentara Nasional Indonesia",
                "Dewan Perwakilan Rakyat"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Budi Utomo yang berdiri pada 20 Mei 1908 menandai kebangkitan nasional Indonesia. Organisasi ini menjadi pelopor pergerakan nasional.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_064",
            category = "TWK",
            subCategory = "nasionalisme",
            questionText = "Rasa bangga terhadap bangsa sendiri yang berlebihan hingga merendahkan bangsa lain disebut...",
            options = listOf(
                "Nasionalisme",
                "Patriotisme",
                "Chauvinisme",
                "Kosmopolitanisme",
                "Internasionalisme"
            ).toJson(),
            correctAnswer = 2,
            explanation = "Chauvinisme adalah nasionalisme sempit yang berlebihan, merasa bangsa sendiri paling unggul dan merendahkan bangsa lain. Sikap ini berbahaya bagi perdamaian dunia.",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_065",
            category = "TWK",
            subCategory = "nasionalisme",
            questionText = "Sumpah Pemuda merupakan tonggak penting nasionalisme Indonesia karena...",
            options = listOf(
                "Memproklamasikan kemerdekaan",
                "Menyatukan tekad pemuda Indonesia dalam satu bangsa, tanah air, dan bahasa",
                "Membentuk pemerintahan pertama",
                "Mengusir penjajah dari Indonesia",
                "Mengesahkan UUD 1945"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Sumpah Pemuda 28 Oktober 1928 menyatukan tekad pemuda dari berbagai daerah untuk mengakui satu bangsa, satu tanah air, dan satu bahasa: Indonesia.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_066",
            category = "TWK",
            subCategory = "nasionalisme",
            questionText = "Patriotisme berbeda dengan nasionalisme dalam hal...",
            options = listOf(
                "Patriotisme lebih menekankan kecintaan pada tanah air",
                "Patriotisme bersifat negatif",
                "Nasionalisme tidak penting",
                "Keduanya bertentangan",
                "Keduanya sama persis"
            ).toJson(),
            correctAnswer = 0,
            explanation = "Patriotisme lebih menekankan kecintaan dan pengorbanan pada tanah air, sedangkan nasionalisme lebih luas mencakup kesadaran sebagai bangsa dengan identitas bersama.",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_067",
            category = "TWK",
            subCategory = "nasionalisme",
            questionText = "Upaya melestarikan budaya nasional merupakan wujud dari...",
            options = listOf(
                "Primordialisme",
                "Nasionalisme",
                "Separatisme",
                "Liberalisme",
                "Individualisme"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Melestarikan budaya nasional merupakan wujud nasionalisme, yaitu kecintaan pada bangsa dan upaya menjaga identitas nasional.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_068",
            category = "TWK",
            subCategory = "nasionalisme",
            questionText = "Sikap yang tidak mencerminkan nasionalisme adalah...",
            options = listOf(
                "Menghormati bendera Merah Putih",
                "Menyanyikan lagu Indonesia Raya dengan khidmat",
                "Lebih memilih produk impor padahal ada produk lokal berkualitas sama",
                "Menjaga kelestarian lingkungan",
                "Belajar dengan giat untuk kemajuan bangsa"
            ).toJson(),
            correctAnswer = 2,
            explanation = "Lebih memilih produk impor padahal ada produk lokal berkualitas sama tidak mencerminkan nasionalisme. Mencintai produk dalam negeri adalah bagian dari nasionalisme ekonomi.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_069",
            category = "TWK",
            subCategory = "nasionalisme",
            questionText = "Makna kemerdekaan bagi bangsa Indonesia adalah...",
            options = listOf(
                "Bebas berbuat apa saja tanpa aturan",
                "Kebebasan untuk menentukan nasib sendiri sebagai bangsa yang berdaulat",
                "Tidak perlu bekerja sama dengan negara lain",
                "Menutup diri dari dunia internasional",
                "Tidak perlu mentaati hukum"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Kemerdekaan berarti kebebasan untuk menentukan nasib sendiri sebagai bangsa yang berdaulat, mengatur pemerintahan, dan membangun bangsa sesuai cita-cita bersama.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_070",
            category = "TWK",
            subCategory = "nasionalisme",
            questionText = "Lagu kebangsaan Indonesia Raya diciptakan oleh...",
            options = listOf(
                "Ismail Marzuki",
                "W.R. Supratman",
                "Kusbini",
                "C. Simanjuntak",
                "Gesang"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Lagu Indonesia Raya diciptakan oleh Wage Rudolf Supratman dan pertama kali diperdengarkan pada Kongres Pemuda II, 28 Oktober 1928.",
            difficulty = "easy",
            year = 2023
        ),

        // ==================== INTEGRITAS (10 soal) ====================
        QuestionEntity(
            id = "twk_add_071",
            category = "TWK",
            subCategory = "integritas",
            questionText = "Integritas dalam konteks ASN berarti...",
            options = listOf(
                "Mementingkan kepentingan pribadi",
                "Konsistensi antara ucapan dan tindakan sesuai nilai-nilai yang benar",
                "Mengikuti perintah atasan tanpa pertimbangan",
                "Fleksibel dalam menerapkan aturan",
                "Menyembunyikan kesalahan"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Integritas berarti konsistensi antara ucapan dan tindakan berdasarkan nilai-nilai yang benar. ASN berintegritas menjalankan tugas dengan jujur, bertanggung jawab, dan taat aturan.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_072",
            category = "TWK",
            subCategory = "integritas",
            questionText = "Perilaku yang mencerminkan integritas adalah...",
            options = listOf(
                "Menerima suap untuk mempercepat pelayanan",
                "Menolak gratifikasi yang terkait dengan jabatan",
                "Memberikan informasi tidak benar untuk keuntungan pribadi",
                "Menggunakan fasilitas kantor untuk kepentingan pribadi",
                "Memanipulasi laporan keuangan"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Menolak gratifikasi yang terkait dengan jabatan adalah perilaku berintegritas. ASN wajib menolak pemberian dalam bentuk apapun yang dapat mempengaruhi keputusan.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_073",
            category = "TWK",
            subCategory = "integritas",
            questionText = "Kejujuran merupakan bagian penting dari integritas karena...",
            options = listOf(
                "Membuat pekerjaan lebih mudah",
                "Merupakan dasar kepercayaan publik",
                "Dapat meningkatkan gaji",
                "Membuat atasan senang",
                "Tidak ada hubungannya dengan integritas"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Kejujuran merupakan dasar kepercayaan publik. ASN yang jujur akan mendapat kepercayaan dari masyarakat dan mampu menjalankan pelayanan publik dengan baik.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_074",
            category = "TWK",
            subCategory = "integritas",
            questionText = "Tindakan yang melanggar integritas ASN adalah...",
            options = listOf(
                "Datang tepat waktu ke kantor",
                "Melaksanakan tugas sesuai SOP",
                "Menerima hadiah dari rekanan proyek",
                "Melaporkan harta kekayaan secara jujur",
                "Menolak permintaan yang melanggar aturan"
            ).toJson(),
            correctAnswer = 2,
            explanation = "Menerima hadiah dari rekanan proyek adalah bentuk gratifikasi yang melanggar integritas. Hal ini dapat menimbulkan konflik kepentingan dan korupsi.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_075",
            category = "TWK",
            subCategory = "integritas",
            questionText = "Gratifikasi yang wajib dilaporkan adalah gratifikasi yang nilainya...",
            options = listOf(
                "Lebih dari Rp 100.000",
                "Lebih dari Rp 500.000",
                "Lebih dari Rp 1.000.000",
                "Berapapun nilainya jika terkait jabatan",
                "Lebih dari Rp 10.000.000"
            ).toJson(),
            correctAnswer = 3,
            explanation = "Semua gratifikasi yang diterima ASN dan terkait dengan jabatan wajib dilaporkan kepada KPK dalam waktu 30 hari, berapapun nilainya.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_076",
            category = "TWK",
            subCategory = "integritas",
            questionText = "Konflik kepentingan dalam pelayanan publik dapat dihindari dengan cara...",
            options = listOf(
                "Menyembunyikan hubungan dengan pihak terkait",
                "Melaporkan dan mengundurkan diri dari penanganan kasus terkait",
                "Tetap menangani dengan berhati-hati",
                "Meminta imbalan sebagai kompensasi",
                "Memberikan keputusan yang menguntungkan pihak terkait"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Konflik kepentingan dihindari dengan melaporkan secara transparan dan mengundurkan diri dari penanganan kasus yang berpotensi konflik kepentingan.",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_077",
            category = "TWK",
            subCategory = "integritas",
            questionText = "Akuntabilitas dalam konteks pelayanan publik berarti...",
            options = listOf(
                "Menghitung keuangan dengan benar",
                "Dapat mempertanggungjawabkan tindakan dan keputusan",
                "Menyimpan catatan dengan rapi",
                "Membuat banyak laporan",
                "Mematuhi perintah atasan"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Akuntabilitas berarti dapat mempertanggungjawabkan semua tindakan dan keputusan kepada publik. ASN harus siap menjelaskan alasan dan dasar setiap keputusan yang diambil.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_078",
            category = "TWK",
            subCategory = "integritas",
            questionText = "Whistleblower adalah...",
            options = listOf(
                "Pelaku korupsi",
                "Orang yang melaporkan dugaan pelanggaran atau korupsi",
                "Atasan yang tegas",
                "Pegawai yang rajin",
                "Pengawas internal"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Whistleblower adalah orang yang melaporkan dugaan pelanggaran atau korupsi di instansinya. Whistleblower dilindungi undang-undang dari pembalasan.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_079",
            category = "TWK",
            subCategory = "integritas",
            questionText = "Transparansi dalam pemerintahan berarti...",
            options = listOf(
                "Semua informasi bersifat rahasia",
                "Keterbukaan informasi publik",
                "Hanya atasan yang boleh tahu",
                "Informasi hanya untuk internal",
                "Menutup akses publik terhadap informasi"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Transparansi berarti keterbukaan informasi publik. Pemerintah wajib memberikan informasi yang dapat diakses publik sesuai UU Keterbukaan Informasi Publik.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_080",
            category = "TWK",
            subCategory = "integritas",
            questionText = "Prinsip 'clean government' dalam penyelenggaraan pemerintahan mencakup...",
            options = listOf(
                "Hanya kebersihan kantor",
                "Bebas dari KKN (Korupsi, Kolusi, Nepotisme)",
                "Penghematan anggaran saja",
                "Pengurangan pegawai",
                "Privatisasi BUMN"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Clean government berarti pemerintahan yang bersih dari KKN (Korupsi, Kolusi, Nepotisme). Prinsip ini menjadi dasar tata kelola pemerintahan yang baik.",
            difficulty = "easy",
            year = 2023
        ),

        // ==================== BELA NEGARA (10 soal) ====================
        QuestionEntity(
            id = "twk_add_081",
            category = "TWK",
            subCategory = "belanegara",
            questionText = "Bela negara menurut UUD 1945 diatur dalam Pasal...",
            options = listOf(
                "Pasal 27 ayat (3)",
                "Pasal 28 ayat (1)",
                "Pasal 29 ayat (1)",
                "Pasal 30 ayat (1)",
                "Pasal 31 ayat (1)"
            ).toJson(),
            correctAnswer = 0,
            explanation = "Pasal 27 ayat (3) UUD 1945 menyatakan 'Setiap warga negara berhak dan wajib ikut serta dalam upaya pembelaan negara'. Ini menjadi dasar konstitusional bela negara.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_082",
            category = "TWK",
            subCategory = "belanegara",
            questionText = "Komponen utama pertahanan negara adalah...",
            options = listOf(
                "Seluruh rakyat Indonesia",
                "TNI",
                "POLRI",
                "Satpam",
                "Hansip"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Berdasarkan UU Pertahanan Negara, komponen utama pertahanan adalah TNI yang disiapkan untuk menghadapi ancaman militer. Komponen cadangan dan pendukung dari rakyat.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_083",
            category = "TWK",
            subCategory = "belanegara",
            questionText = "Nilai-nilai dasar bela negara meliputi...",
            options = listOf(
                "Cinta tanah air, kesadaran berbangsa, yakin Pancasila, rela berkorban, kemampuan bela negara",
                "Kekayaan, kekuasaan, ketenaran",
                "Individualisme, liberalisme, kapitalisme",
                "Primordialisme, sektarianisme, radikalisme",
                "Hedonisme, konsumerisme, materialisme"
            ).toJson(),
            correctAnswer = 0,
            explanation = "Lima nilai dasar bela negara: cinta tanah air, kesadaran berbangsa dan bernegara, yakin akan Pancasila, rela berkorban untuk bangsa dan negara, serta memiliki kemampuan awal bela negara.",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_084",
            category = "TWK",
            subCategory = "belanegara",
            questionText = "Bentuk bela negara dalam kehidupan sehari-hari adalah...",
            options = listOf(
                "Hanya menjadi tentara",
                "Menjaga persatuan dan kesatuan bangsa",
                "Melakukan kekerasan terhadap negara lain",
                "Memprovokasi konflik antar kelompok",
                "Melanggar hukum demi kepentingan kelompok"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Bela negara tidak harus mengangkat senjata. Menjaga persatuan, belajar dengan giat, bekerja dengan sungguh-sungguh, dan menjaga keamanan lingkungan adalah bentuk bela negara.",
            difficulty = "easy",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_085",
            category = "TWK",
            subCategory = "belanegara",
            questionText = "Ancaman yang dapat mengganggu keamanan dan pertahanan negara dibagi menjadi...",
            options = listOf(
                "Ancaman internal saja",
                "Ancaman eksternal saja",
                "Ancaman militer dan nonmiliter",
                "Ancaman ekonomi saja",
                "Ancaman politik saja"
            ).toJson(),
            correctAnswer = 2,
            explanation = "Ancaman terhadap negara dibagi menjadi ancaman militer (agresi, pelanggaran wilayah, dll) dan nonmiliter (ideologi, politik, ekonomi, sosial budaya, keamanan publik).",
            difficulty = "medium",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_086",
            category = "TWK",
            subCategory = "belanegara",
            questionText = "Sishankamrata (Sistem Pertahanan dan Keamanan Rakyat Semesta) berarti...",
            options = listOf(
                "Pertahanan hanya oleh TNI",
                "Pertahanan dengan melibatkan seluruh rakyat dan sumber daya nasional",
                "Pertahanan dengan bantuan negara asing",
                "Pertahanan dengan persenjataan nuklir",
                "Pertahanan dengan tentara bayaran"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Sishankamrata adalah sistem pertahanan yang melibatkan seluruh rakyat dan sumber daya nasional. TNI sebagai komponen utama, rakyat sebagai komponen cadangan dan pendukung.",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_087",
            category = "TWK",
            subCategory = "belanegara",
            questionText = "Pelajar dapat melaksanakan bela negara dengan cara...",
            options = listOf(
                "Ikut berperang melawan negara lain",
                "Belajar dengan sungguh-sungguh dan menjunjung tinggi nilai kebangsaan",
                "Melakukan demonstrasi dengan kekerasan",
                "Mengabaikan aturan sekolah",
                "Tidak peduli dengan lingkungan"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Pelajar melaksanakan bela negara dengan belajar sungguh-sungguh, mengikuti upacara bendera, menjaga lingkungan, dan menjunjung tinggi nilai-nilai kebangsaan.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_088",
            category = "TWK",
            subCategory = "belanegara",
            questionText = "Ketahanan nasional adalah...",
            options = listOf(
                "Kemampuan bertahan dalam perang",
                "Kondisi dinamis bangsa dalam menghadapi ancaman untuk mencapai tujuan nasional",
                "Jumlah tentara yang banyak",
                "Persenjataan yang canggih",
                "Anggaran pertahanan yang besar"
            ).toJson(),
            correctAnswer = 1,
            explanation = "Ketahanan nasional adalah kondisi dinamis bangsa Indonesia dalam menghadapi dan mengatasi segala bentuk ancaman, tantangan, hambatan, dan gangguan untuk mencapai tujuan nasional.",
            difficulty = "medium",
            year = 2023
        ),
        QuestionEntity(
            id = "twk_add_089",
            category = "TWK",
            subCategory = "belanegara",
            questionText = "ASN wajib melaksanakan bela negara sesuai dengan...",
            options = listOf(
                "Keinginan pribadi",
                "UU ASN dan Pancasila",
                "Perintah partai politik",
                "Kepentingan kelompok",
                "Permintaan pihak asing"
            ).toJson(),
            correctAnswer = 1,
            explanation = "ASN wajib melaksanakan bela negara sesuai UU ASN No. 5/2014 yang mewajibkan ASN setia dan taat pada Pancasila, UUD 1945, NKRI, dan pemerintahan yang sah.",
            difficulty = "easy",
            year = 2024
        ),
        QuestionEntity(
            id = "twk_add_090",
            category = "TWK",
            subCategory = "belanegara",
            questionText = "Contoh ancaman nonmiliter terhadap Indonesia adalah...",
            options = listOf(
                "Invasi militer asing",
                "Serangan udara negara lain",
                "Penyebaran ideologi radikal dan terorisme",
                "Pendudukan wilayah oleh tentara asing",
                "Agresi bersenjata"
            ).toJson(),
            correctAnswer = 2,
            explanation = "Ancaman nonmiliter meliputi ideologi (radikalisme), politik (destabilisasi), ekonomi (krisis), sosial budaya (degradasi moral), dan keamanan publik (terorisme, narkoba).",
            difficulty = "easy",
            year = 2023
        )
    )
}
