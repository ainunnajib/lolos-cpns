# Lolos CPNS - Aplikasi Persiapan Tes CPNS

Aplikasi Android untuk membantu warga Indonesia mempersiapkan Tes CPNS (Calon Pegawai Negeri Sipil) dengan fitur latihan soal, simulasi CAT, dan AI Tutor.

## Fitur

### Gratis
- Latihan soal per kategori (TWK, TIU, TKP)
- 500+ bank soal dengan pembahasan
- Try-out mini (30 soal, 30 menit)
- Progress tracking
- Mode offline untuk soal yang sudah diunduh

### Premium
- Simulasi CAT penuh (110 soal, 100 menit)
- 3000+ bank soal HOTS
- AI Tutor: tanya jawab & penjelasan soal
- Analisis kelemahan & rekomendasi belajar
- Materi SKB per jabatan
- Bebas iklan + offline penuh

## Tech Stack

- **Language**: Kotlin
- **UI**: Jetpack Compose + Material 3
- **Architecture**: MVVM + Clean Architecture
- **DI**: Hilt
- **Database**: Room
- **Navigation**: Navigation Compose
- **Async**: Kotlin Coroutines + Flow

## Struktur Project

```
app/src/main/java/com/cpns/lolos/
├── data/
│   ├── local/
│   │   ├── dao/          # Room DAOs
│   │   ├── entity/       # Room Entities
│   │   └── database/     # AppDatabase
│   ├── repository/       # Repository implementations
│   └── model/            # Data models
├── domain/
│   ├── model/            # Domain models
│   ├── repository/       # Repository interfaces
│   └── usecase/          # Use cases
├── presentation/
│   ├── screens/
│   │   ├── home/         # Home screen
│   │   ├── materi/       # Learning materials
│   │   ├── tryout/       # Try out selection
│   │   ├── quiz/         # Quiz/exam screen
│   │   ├── result/       # Result screen
│   │   ├── stats/        # Statistics
│   │   └── profile/      # User profile
│   ├── components/       # Reusable UI components
│   ├── navigation/       # Navigation setup
│   └── theme/            # Material theme
├── di/                   # Hilt modules
└── util/                 # Utility classes
```

## Materi Tes CPNS

### SKD (Seleksi Kompetensi Dasar) - 110 soal, 100 menit

| Kategori | Jumlah Soal | Passing Grade | Nilai Max |
|----------|-------------|---------------|-----------|
| TWK      | 30          | 65            | 150       |
| TIU      | 35          | 80            | 175       |
| TKP      | 45          | 166           | 225       |

### Sub-kategori TWK
- Pancasila
- UUD 1945
- NKRI
- Bhinneka Tunggal Ika
- Sejarah Nasional
- Bahasa Indonesia
- Nasionalisme
- Integritas
- Bela Negara

### Sub-kategori TIU
- Sinonim & Antonim
- Analogi
- Penalaran Verbal
- Deret Angka
- Aritmatika
- Perbandingan
- Soal Cerita
- Silogisme & Logika
- Figural

### Sub-kategori TKP
- Pelayanan Publik
- Jejaring Kerja
- Sosial Budaya
- Teknologi Informasi
- Profesionalisme
- Anti Radikalisme

## Setup Development

### Prerequisites
- Android Studio Hedgehog atau lebih baru
- JDK 17
- Android SDK 35

### Build & Run
```bash
# Clone repository
git clone <repo-url>
cd tes-cpns

# Build debug APK
./gradlew assembleDebug

# Install ke device/emulator
./gradlew installDebug
```

### Font (Opsional)
Download font Poppins dari Google Fonts dan letakkan di `app/src/main/res/font/`:
- poppins_regular.ttf
- poppins_medium.ttf
- poppins_semibold.ttf
- poppins_bold.ttf

Atau edit `Type.kt` untuk menggunakan font default.

## Roadmap

- [ ] Integrasi AI Tutor (on-device LLM / API)
- [ ] Sinkronisasi progress ke cloud
- [ ] Leaderboard & kompetisi
- [ ] Widget home screen
- [ ] Notifikasi pengingat belajar
- [ ] Materi SKB per formasi jabatan
- [ ] Dark mode
- [ ] Lokalisasi bahasa daerah

## License

MIT License
