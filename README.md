# ComposeMP

A Kotlin Multiplatform starter using Compose Multiplatform for Android, iOS and Desktop, with one shared UI.

> Status: this is the unmodified JetBrains project wizard template, with a single demo screen. It is a
> starting point for experiments, not a finished app.

## What it does

- One shared `App()` composable in `composeApp/src/commonMain`, rendered on Android, iOS and Desktop.
- A "Click me!" button that toggles a line showing the current platform name, with the Compose logo
  (`Hello, <platform>!`). The platform name comes from a per-target `expect`/`actual` `getPlatform()`.

## Tech stack

- Kotlin 2.0.20 (Multiplatform)
- Compose Multiplatform 1.6.11 (Material, Foundation, Resources)
- Android: AGP 8.2.2, minSdk 24, targetSdk 34, AndroidX Activity Compose
- iOS: SwiftUI host app in `iosApp/` embedding a Compose `MainViewController`
- Desktop: JVM window via `compose.desktop`

## Project layout

- `composeApp/src/commonMain`: shared Kotlin and Compose code (the UI lives here).
- `composeApp/src/androidMain`, `desktopMain`, `iosMain`: platform entry points and `Platform.*` implementations.
- `iosApp/`: Xcode project that hosts the Compose view controller.

## Getting started

Desktop (any OS with JDK 17+):

```shell
./gradlew :composeApp:run
```

Android: open the project in Android Studio and run the `composeApp` configuration, or:

```shell
./gradlew :composeApp:assembleDebug
```

iOS: open `iosApp/iosApp.xcodeproj` in Xcode (or run from the IDE with the KMP plugin) and run on a simulator.

## Learn more

- [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)
- [Compose Multiplatform](https://www.jetbrains.com/lp/compose-multiplatform/)
