plugins {
    alias(libs.plugins.mpp)
    alias(libs.plugins.compose)
    alias(libs.plugins.androlib)
}

repositories {
    mavenCentral()
    google()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

kotlin {
    jvm()
    androidTarget()
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.ui)
            }
        }
    }
}

compose {
    kotlinCompilerPlugin.set(libs.composecompiler.get().toString())
}

android {
    namespace = "reproduce04"
    compileSdk = 34
    defaultConfig {
        minSdk = 26
    }
    compileOptions {
        sourceCompatibility("21")
        targetCompatibility("21")
    }
}