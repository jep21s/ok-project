pluginManagement {
    val kotlinVersion: String by settings
    plugins {
        kotlin("jvm") version "2.1.10"
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "ok-project"
include("m1l1-first")
