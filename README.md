# Android Extensions

[![Kotlin](https://img.shields.io/badge/kotlin-1.7.10-blue.svg?logo=kotlin)](http://kotlinlang.org)
[![Android](https://img.shields.io/badge/API-23%2B-brightgreen.svg?style=flat)]()
[![License](https://img.shields.io/github/license/davidepanidev/android-extensions?color=orange)]()
[![Version](https://img.shields.io/jitpack/version/com.github.davidepanidev/android-extensions?color=red&label=JitPack)](https://jitpack.io/#davidepanidev/android-extensions)

Library containing some helper functions and extensions of the Android framework components, build according SOLID principles.


## Including in your project

### Gradle
Add the code below to your **root** `build.gradle` file (not your module build.gradle file):
```gradle
allprojects {
    repositories {
        ..
        maven { url 'https://jitpack.io' }
    }
}
```

Next, add the dependency below to your **module**'s `build.gradle` file:

```gradle
dependencies {
    implementation "com.github.davidepanidev:android-extensions:2.1"
}
```