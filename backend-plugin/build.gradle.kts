plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        register("build-jvm") {
            id = "build-jvm"
            implementationClass = "org.jep21s.plugins.BuildPluginJvm"
        }
        register("build-kmp") {
            id = "build-kmp"
            implementationClass = "org.jep21s.plugins.BuildPluginMultiplatform"
        }
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.plugin.kotlin)
    implementation(libs.plugin.binaryCompatibilityValidator)
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}
