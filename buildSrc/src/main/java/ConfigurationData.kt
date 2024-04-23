
object ConfigurationData {
    const val namespace = "com.example.bootcamp"
    const val compileSdk = 34
    const val applicationId = "com.example.bootcamp"
    const val minSdk = 24
    const val targetSdk = 34
    const val versionCode = 1
    const val versionName = "1.0"
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    const val jvmTarget = "1.8"
    const val kotlinCompilerExtensionVersion = "1.5.1"

    const val major = "1"
    const val minor = "0"
    const val patch = "0"
    fun getVersionName(): String = "$major.$minor.$patch"

}
