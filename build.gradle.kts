
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    id(DaggerHilt.plugin) version DaggerHilt.version apply false
}

// If the project has buildSrc module.
gradle.startParameter.excludedTaskNames.addAll(listOf(":buildSrc:testClasses"))