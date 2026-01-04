# CLAUDE.md - Lolos CPNS App Documentation

Dokumentasi lengkap untuk aplikasi Lolos CPNS - Simulasi CAT SKD.

## App Information

| Field | Value |
|-------|-------|
| **App Name** | Lolos CPNS - Simulasi CAT SKD |
| **Package Name** | com.cpns.lolos |
| **Version** | 1.0.0 (versionCode: 1) |
| **Category** | Education |
| **Target Audience** | 18+ |
| **Developer** | @ainunnajib |
| **Contact Email** | ainunnajib.0206@gmail.com |
| **Status** | In Review (submitted 3 Jan 2026) |

## Google Play Console

- **Developer Account ID**: 6093655263316138765
- **App ID**: 4971976003693207457
- **Console URL**: https://play.google.com/console/u/0/developers/6093655263316138765/app/4971976003693207457

## Store Listing

### Short Description (52/80 chars)
```
Latihan soal CPNS CAT SKD. Simulasi ujian realistis!
```

### Full Description (960/4000 chars)
```
Lolos CPNS adalah aplikasi persiapan ujian CPNS CAT SKD yang dirancang untuk membantu Anda sukses dalam seleksi CPNS.

FITUR UTAMA:

📚 BANK SOAL LENGKAP
• Soal TWK (Tes Wawasan Kebangsaan)
• Soal TIU (Tes Intelegensi Umum)
• Soal TKP (Tes Karakteristik Pribadi)
• Lebih dari 500+ soal latihan berkualitas

⏱️ SIMULASI UJIAN REALISTIS
• Timer countdown seperti ujian asli
• Sistem penilaian otomatis
• Passing grade sesuai standar BKN
• Mode latihan dan mode ujian

👁️ DETEKSI WAJAH ANTI-CURANG
• Teknologi face detection untuk simulasi pengawasan ujian
• Latihan fokus dan konsentrasi
• Persiapan menghadapi pengawasan CAT sesungguhnya

📊 TRACKING PROGRESS
• Riwayat hasil latihan lengkap
• Analisis kekuatan dan kelemahan
• Statistik perkembangan belajar

🎯 KEUNGGULAN:
• Gratis tanpa iklan
• Bekerja offline
• Interface mudah digunakan
• Update soal berkala

Persiapkan diri Anda untuk lolos seleksi CPNS dengan latihan intensif menggunakan Lolos CPNS!
```

### Release Notes (v1.0.0)
```xml
<id>
Rilis Pertama - Lolos CPNS v1.0.0

✨ Fitur Utama:
• 500+ soal latihan CPNS CAT SKD (TWK, TIU, TKP)
• Simulasi ujian dengan timer seperti aslinya
• Deteksi wajah untuk pengawasan realistis
• Pembahasan lengkap untuk setiap soal
• Progress tracking dan statistik performa
• Mode latihan per kategori soal

🎯 Siap bantu kamu lolos CPNS!
</id>
```

## Privacy Policy

- **URL**: https://ainunnajib.github.io/lolos-cpns-privacy/privacy-policy.html
- **GitHub Repo**: https://github.com/ainunnajib/lolos-cpns-privacy
- **Local File**: `docs/privacy-policy.html`

## App Content Declarations

### Data Safety
- **No data collected**: App does not collect any user data
- **Data stored locally**: Practice history, settings, learning progress
- **Camera permission**: For face detection during exam simulation (processed locally, not stored/transmitted)

### Ads Declaration
- **Contains ads**: No

### App Access
- **Access type**: All functionality available without special access

### Content Rating (IARC)
- **Violence**: None
- **Sexuality**: None
- **Language**: None
- **Controlled substances**: None
- **Miscellaneous**: No user interaction, no location sharing

### Target Audience
- **Age group**: 18 and older
- **Not designed for children**

### Other Declarations
- **Government apps**: No
- **Financial features**: No
- **Health apps**: No
- **Advertising ID**: Not used

## Store Graphics

All graphics stored in `store-assets/` directory:

| Asset | Dimensions | File |
|-------|------------|------|
| App Icon | 512x512 px | `app-icon.png` |
| Feature Graphic | 1024x500 px | `feature-graphic.png` |
| Screenshot 1 | Phone | `screenshot-1.png` |
| Screenshot 2 | Phone | `screenshot-2.png` |
| Screenshot 3 | Phone | `screenshot-3.png` |
| Screenshot 4 | Phone | `screenshot-4.png` |

## Build & Release

### Build Commands
```bash
# Build release AAB
./gradlew bundleRelease

# Output location
app/build/outputs/bundle/release/app-release.aab
```

### Signing
- Keystore: `keystore/release-key.jks`
- Key alias: `lolos-cpns`
- Configured in `app/build.gradle.kts`

## Countries/Regions

- **Selected**: Indonesia only
- **Track**: Production (full rollout)

## Technical Stack

- **Language**: Kotlin
- **Min SDK**: 24 (Android 7.0)
- **Target SDK**: 34 (Android 14)
- **Architecture**: MVVM with Clean Architecture
- **DI**: Hilt
- **Database**: Room
- **Face Detection**: MediaPipe

## Project Structure

```
tes-cpns/
├── app/
│   ├── src/main/
│   │   ├── java/com/cpns/lolos/
│   │   │   ├── data/           # Data layer
│   │   │   ├── domain/         # Domain layer
│   │   │   ├── presentation/   # UI layer
│   │   │   └── di/             # Dependency injection
│   │   └── res/                # Resources
│   ├── build.gradle.kts
│   └── proguard-rules.pro
├── docs/
│   └── privacy-policy.html
├── store-assets/
│   ├── app-icon.png
│   ├── feature-graphic.png
│   └── screenshot-*.png
├── keystore/
│   └── release-key.jks
└── CLAUDE.md                   # This file
```

## Development History

### 4 January 2026 - Session Recap & Beads Integration
- Fixed privacy policy 404 error in Play Console (marked as fixed, re-validated)
- Documented full app details in CLAUDE.md
- Created new GitHub repo: https://github.com/ainunnajib/lolos-cpns
- Pushed complete source code (87 files, 12k+ lines)
- Initialized Beads task tracking system
- Commits: f3f5020, bcc9585, ca39964

### 3 January 2026 - Initial Release & Play Store Submission
- Created Android app with CPNS exam features (TWK, TIU, TKP)
- Implemented face detection for exam proctoring using MediaPipe
- Added 500+ practice questions across all categories
- Built signed release AAB
- Created privacy policy and hosted on GitHub Pages
- Generated store graphics (icon, feature graphic, 4 screenshots)
- Completed all Play Console declarations
- Uploaded AAB to Production track (Indonesia)
- Submitted for Google review
- Commit: 63a4b31

## Completed Tasks

- [x] Create Android app with CPNS exam features
- [x] Implement face detection for exam proctoring
- [x] Add 500+ CPNS questions (TWK, TIU, TKP)
- [x] Build signed release AAB
- [x] Create privacy policy and host on GitHub Pages
- [x] Generate store graphics (icon, feature graphic, screenshots)
- [x] Complete all Play Console declarations
- [x] Upload AAB to Production track
- [x] Select Indonesia as target country
- [x] Submit for Google review
- [x] Fix privacy policy 404 error
- [x] Push source code to GitHub
- [x] Initialize Beads task tracking

## Pending

- [ ] Wait for Google review approval (1-7 days for new apps)
- [ ] Publish app when approved
- [ ] Move keystore credentials to local.properties (security)
- [ ] Add tablet screenshots (optional)
- [ ] Create promotional video (optional)
- [ ] Document AI model download mechanism

## Notes

- App submitted for review on 3 January 2026
- No ads, no in-app purchases, completely free
- All data stored locally on device
- Camera used only for face detection, not recorded

## GitHub Repository

- **Main App**: https://github.com/ainunnajib/lolos-cpns
- **Privacy Policy**: https://github.com/ainunnajib/lolos-cpns-privacy

---

Last updated: 4 January 2026
