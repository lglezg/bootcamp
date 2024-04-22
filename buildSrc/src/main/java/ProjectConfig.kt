object ProjectConfig {

    const val appId = "com.example.bootcamp"
    const val compileSdk = 34
    const val minSdk = 24
    const val tarjetSdk = 34

    const val versionCode = 1

    const val versionMajor = 1
    const val versionMinor = 0
    const val versionPatch = 0

    fun getVersionName(): String {
        return "$versionMajor$versionMinor$versionPatch"
    }

    const val baseUrlDev = "Aqui va la Url"
    const val baseUrlProd = "Aqui va la Url"
    const val wsPath = "Aqui va la Url"

}