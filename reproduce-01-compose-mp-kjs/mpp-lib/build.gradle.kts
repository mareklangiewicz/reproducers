plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose") version "1.2.0-beta03-dev803"
}

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    //maven("https://androidx.dev/storage/compose-compiler/repository/")
}

kotlin {
    jvm()
    js(IR) {
        browser()
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.ui)
            }
        }
        val jvmMain by getting {
            dependencies {
                implementation(compose.desktop.common)
                implementation(compose.desktop.currentOs)
            }
        }
    }
}
configurations.all {
    resolutionStrategy.dependencySubstitution {
        substitute(module("org.jetbrains.compose.compiler:compiler")).apply {
            using(module("androidx.compose.compiler:compiler:1.3.2"))
            // using(module("androidx.compose.compiler:compiler:1.4.0-dev-k1.7.20-e49b3b6028b"))
        }
    }
}
