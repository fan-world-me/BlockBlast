# Logica — Block Puzzle

<img src="picture/app_icon.png" width="180" alt="App icon" />

A modern, cross-platform block puzzle game built with **Kotlin Multiplatform** and **Compose Multiplatform**, sharing code between Android and iOS.

Original project by **fan_world_me**. Modifications and maintenance by **fan_world_me**.

![Kotlin](https://img.shields.io/badge/Kotlin-2.3.21-blue.svg)
![Compose](https://img.shields.io/badge/Compose-1.10.3-green.svg)
![Platforms](https://img.shields.io/badge/Platforms-Android%20%7C%20iOS-orange.svg)

## Screenshots

<p>
  <img src="picture/screen1_en.png" width="200" />
  <img src="picture/screen2_en.png" width="200" />
  <img src="picture/screen3_en.png" width="200" />
  <img src="picture/screen4_en.png" width="200" />
</p>

## Features

- 🧩 Classic block-puzzle gameplay with smooth animations
- 🎨 Polished Material 3 UI tuned for the Block Blast feel
- 📱 Single codebase for Android & iOS via Compose Multiplatform
- 💾 Persistent settings and best-score tracking
- 🎉 Confetti effects on big clears
- 🎵 Rotating background music across multiple tracks
- 📴 Fully offline — no account required
- ⭐ In-app review prompts on Android
- 📊 Firebase Analytics & Crashlytics

## Tech Stack

- **Kotlin Multiplatform** 2.3.21 — shared business logic
- **Compose Multiplatform** 1.10.3 — declarative UI for Android & iOS
- **Material 3** — design system
- **Decompose** + **Essenty** — navigation & lifecycle
- **MVIKotlin** — predictable state management (MVI)
- **Metro DI** — compile-time dependency injection
- **Kotlinx Coroutines / Serialization / Datetime**
- **Multiplatform Settings** — cross-platform key/value storage
- **Firebase** (GitLive SDK) — Analytics, Crashlytics
- **ConfettiKit** — celebratory effects
- **Baseline Profiles** — Android startup performance

## Project Structure

```
BlockBlast/
├── androidApp/      # Android entry point (Activity, manifest, ads, Firebase)
├── iosApp/          # iOS entry point (SwiftUI host)
├── composeApp/      # Shared Compose UI (commonMain, androidMain, iosMain)
├── core/
│   ├── common/      # Common utilities
│   ├── domain/      # Business logic, models, use cases
│   └── data/        # Repositories, persistence
├── feature/
│   ├── root/        # Navigation root
│   ├── home/        # Home screen
│   ├── game/        # Game screen and logic
│   └── settings/    # Settings
├── build-logic/     # Convention plugins for Gradle
└── fastlane/        # Store metadata & changelogs
```

## Getting Started

### Prerequisites
- **JDK 17+**
- **Android Studio** Ladybug or later
- **Xcode 15+** (iOS, macOS only)
- Your own Firebase project — see below

### Firebase setup

This repo does **not** ship Firebase config files. Create your own Firebase project and drop in:

- `androidApp/google-services.json`
- `iosApp/iosApp/GoogleService-Info.plist`

### Build and Run

#### Android

```bash
./gradlew :androidApp:assembleDebug
./gradlew :androidApp:installDebug
```

#### iOS

Open `iosApp/iosApp.xcodeproj` in Xcode and run.

## Development

### Tests

```bash
./gradlew test
```

## Contributing

Contributions are welcome! Feel free to open an issue or submit a PR.

## License

This project is dual-licensed under:

- MIT License
- GNU GPL v3.0

You may use the code under either license. The full texts are included in `LICENSE` and `GPL-3.0.txt`.

## Learn More

- [Kotlin Multiplatform](https://www.jetbrains.com/kotlin-multiplatform/)
- [Compose Multiplatform](https://www.jetbrains.com/lp/compose-multiplatform/)
- [MVIKotlin](https://github.com/arkivanov/MVIKotlin)
- [Decompose](https://github.com/arkivanov/Decompose)
- [Metro](https://github.com/ZacSweers/metro)
