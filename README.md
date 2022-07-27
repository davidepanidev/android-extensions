# Android Extensions

[![Kotlin](https://img.shields.io/badge/kotlin-1.7.10-blue.svg?logo=kotlin)](http://kotlinlang.org)
[![Android](https://img.shields.io/badge/API-23%2B-brightgreen.svg?style=flat)]()
[![License](https://img.shields.io/github/license/davide-pani/kotlin-extensions?color=orange)]()

Library containing some helper functions and extensions of the Android framework components.


## Including in your project

[![Version](https://jitpack.io/v/davide-pani/android-extensions.svg)](https://jitpack.io/#davide-pani/android-extensions)

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
    implementation "com.github.davide-pani:android-extensions:1.2.4"
}
```