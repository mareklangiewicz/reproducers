rootProject.name = "reproduce-01-compose-mp-kjs"

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

include(":mpp-lib")
