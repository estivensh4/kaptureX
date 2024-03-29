plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.jetbrainsCompose) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
    alias(libs.plugins.kotlinCocoapods) apply false
    alias(libs.plugins.org.jetbrains.kotlin.jvm) apply false
}

allprojects {
    plugins.withId("org.gradle.maven-publish") {
        group = "io.github.estivensh4"
        version = "0.2.0"
    }
}