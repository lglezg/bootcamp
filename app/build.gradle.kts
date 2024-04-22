plugins {
    id(Build.androidAplication)
    id(Kotlin.plugin)
    id(Kotlin.kaptPlugin)
}

android {
    namespace = ProjectConfig.appId
    compileSdk = ProjectConfig.compileSdk

    defaultConfig {
        applicationId = ProjectConfig.appId
        minSdk = ProjectConfig.minSdk
        targetSdk = ProjectConfig.tarjetSdk
        versionCode = ProjectConfig.versionCode
        versionName = ProjectConfig.getVersionName()

        testInstrumentationRunner = Build.testInstrumentationRunner
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Kotlin.extensionVersion
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    //Android
    implementation(Android.coreKtx)
    implementation(Android.lifecycleRuntimeKtx)

    //Compose
    implementation(Compose.activityCompose)
    implementation(platform(Compose.composeBom))
    implementation(Compose.composeUi)
    implementation(Compose.activityCompose)
    implementation(Compose.composeGraphics)
    implementation(Compose.composeToolingPreview)
    implementation(Compose.composeMaterial3)
    implementation(Compose.composeLifecycleViewModel)
    implementation(Compose.composeNavigation)
    implementation(Compose.composeLifecycle)
    debugImplementation(Compose.composeUiTooling)
    debugImplementation(Compose.composeTestManifest)

    //Testing
    testImplementation(Testing.junit4)
    androidTestImplementation(Testing.extJunit)
    androidTestImplementation(Testing.espresso)
    androidTestImplementation(Testing.composeBomTesting)
    androidTestImplementation(Testing.composeUiTesting)


}