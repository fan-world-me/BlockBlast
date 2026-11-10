[![Telegram](https://img.shields.io/badge/Telegram-@fan__world__me-2CA5E0?style=flat-square&logo=telegram)](https://t.me/fan_world_me)   [![Discord](https://img.shields.io/badge/Discord-fan__world__me-5865F2?style=flat-square&logo=discord)](https://discord.com/users/1040301536036786248)   [![GitHub](https://img.shields.io/badge/GitHub-fan--world--me-181717?style=flat-square&logo=github)](https://github.com/fan-world-me)   [![Portfolio](https://img.shields.io/badge/Portfolio-fan--world--me.github.io-00e5ff?style=flat-square&logo=githubpages&logoColor=white)](https://fan-world-me.github.io/)

<div align="center">
  <img src="picture/app_icon.png" width="180" alt="App icon" />
</div>

# Logica — Block Puzzle

A modern, cross-platform block puzzle game built with **Kotlin Multiplatform** and **Compose Multiplatform**, sharing code between Android and iOS.

Original project by **fan_world_me**. Modifications and maintenance by **fan_world_me**.

### 📸 Screenshots

<p>
  <img src="picture/screen1_en.png" width="200" />
  <img src="picture/screen2_en.png" width="200" />
  <img src="picture/screen3_en.png" width="200" />
  <img src="picture/screen4_en.png" width="200" />
</p>

### 💭 More about this game

- 🧩 **Classic block-puzzle gameplay** with smooth animations
- 🎨 **Polished Material 3 UI** tuned for the Block Blast feel
- 📱 **Single codebase** for Android & iOS via Compose Multiplatform
- 💾 **Persistent settings** and best-score tracking
- 🎉 **Confetti effects** on big clears
- 🎵 **Rotating background music** across multiple tracks
- 📴 **Fully offline** — no account required
- ⭐ **In-app review prompts** on Android
- 📊 **Firebase Analytics & Crashlytics**

---

### 🧰 Tech Stack

**Core**
![Kotlin](https://img.shields.io/badge/Kotlin_Multiplatform-2.3.21-7F52FF?style=flat-square&logo=kotlin&logoColor=white)
![Compose](https://img.shields.io/badge/Compose_Multiplatform-1.10.3-4285F4?style=flat-square&logo=jetpackcompose&logoColor=white)
![Material 3](https://img.shields.io/badge/Material_3-design-6750A4?style=flat-square)
![Platforms](https://img.shields.io/badge/Platforms-Android%20%7C%20iOS-FF6F00?style=flat-square)

| Component | Purpose |
|---|---|
| **Kotlin Multiplatform** 2.3.21 | shared business logic |
| **Compose Multiplatform** 1.10.3 | declarative UI for Android & iOS |
| **Material 3** | design system |
| **Decompose** + **Essenty** | navigation & lifecycle |
| **MVIKotlin** | predictable state management (MVI) |
| **Metro DI** | compile-time dependency injection |
| **Kotlinx Coroutines / Serialization / Datetime** | async, serialization, time |
| **Multiplatform Settings** | cross-platform key/value storage |
| **Firebase** (GitLive SDK) | Analytics, Crashlytics |
| **ConfettiKit** | celebratory effects |
| **Baseline Profiles** | Android startup performance |

---

### 🗂️ Project Structure

```
BlockBlast/
├── androidApp/      — Android entry point (Activity, manifest, ads, Firebase)
├── iosApp/          — iOS entry point (SwiftUI host)
├── composeApp/      — shared Compose UI (commonMain, androidMain, iosMain)
├── core/
│   ├── common/      — common utilities
│   ├── domain/      — business logic, models, use cases
│   └── data/        — repositories, persistence
├── feature/
│   ├── root/        — navigation root
│   ├── home/        — home screen
│   ├── game/        — game screen and logic
│   └── settings/    — settings
├── build-logic/     — convention plugins for Gradle
└── fastlane/        — store metadata & changelogs
```

---

### 🚀 Getting Started

**Prerequisites**

- **JDK 17+**
- **Android Studio** Ladybug or later
- **Xcode 15+** (iOS, macOS only)
- Your own Firebase project — see below

**Firebase setup**

This repo does **not** ship Firebase config files. Create your own Firebase project and drop in:

- `androidApp/google-services.json`
- `iosApp/iosApp/GoogleService-Info.plist`

---

### 📦 Build and Run

**Android**

```bash
./gradlew :androidApp:assembleDebug
./gradlew :androidApp:installDebug
```

**iOS**

Open `iosApp/iosApp.xcodeproj` in Xcode and run.

---

### 🧪 Tests

```bash
./gradlew test
```

---

### 🤝 Contributing

Contributions are welcome! Feel free to open an issue or submit a PR.

---

### 📄 License

This project is dual-licensed under:

- MIT License
- GNU GPL v3.0

You may use the code under either license. The full texts are included in [`LICENSE`](LICENSE) and `GPL-3.0.txt`.

© [fan-world-me](https://github.com/fan-world-me)

---

### 📚 Learn More

- [Kotlin Multiplatform](https://www.jetbrains.com/kotlin-multiplatform/)
- [Compose Multiplatform](https://www.jetbrains.com/lp/compose-multiplatform/)
- [MVIKotlin](https://github.com/arkivanov/MVIKotlin)
- [Decompose](https://github.com/arkivanov/Decompose)
- [Metro](https://github.com/ZacSweers/metro)

---

Made with 🩵 in Ukraine 🇺🇦

[![Telegram](https://img.shields.io/badge/Telegram-@fan__world__me-2CA5E0?style=flat-square&logo=telegram)](https://t.me/fan_world_me)   [![Discord](https://img.shields.io/badge/Discord-fan__world__me-5865F2?style=flat-square&logo=discord)](https://discord.com/users/1040301536036786248)   [![Portfolio](https://img.shields.io/badge/Portfolio-fan--world--me.github.io-00e5ff?style=flat-square&logo=githubpages&logoColor=white)](https://fan-world-me.github.io/)
