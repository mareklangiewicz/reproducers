
plugins {
    alias(libs.plugins.mpp) apply false
    alias(libs.plugins.compose) apply false
    alias(libs.plugins.compose.compiler) apply false
}

group = "pl.mareklangiewicz"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
