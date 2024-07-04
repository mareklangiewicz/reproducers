
plugins {
    kotlin("multiplatform") version "2.0.20-Beta1" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.20-Beta1" apply false
    // id("org.jetbrains.compose") version "1.7.0-dev1686" apply false // works correctly with this version
    // id("org.jetbrains.compose") version "1.7.0-dev1698" apply false // reproduces with this version
    id("org.jetbrains.compose") version "1.7.0-alpha01" apply false // reproduces with this version too
}

group = "pl.mareklangiewicz"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
