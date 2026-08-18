@file:Suppress("UnstableApiUsage")

data class GprCredentials(val user: String, val key: String)

fun loadGprCredentials(): GprCredentials? {
    // 优先从环境变量读取
    val envUser = System.getenv("GIT_ACTOR")?.takeIf { it.isNotBlank() }
    val envKey = System.getenv("GIT_TOKEN")?.takeIf { it.isNotBlank() }

    if (envUser != null && envKey != null) {
        return GprCredentials(envUser, envKey)
    }

    // 从 signing.properties 读取
    val propsFile = File(rootDir, "signing.properties")
    if (!propsFile.exists()) {
        return null
    }

    val props = java.util.Properties().apply {
        propsFile.inputStream().use { load(it) }
    }

    val user = props.getProperty("gpr.user")?.takeIf { it.isNotBlank() }
    val key = props.getProperty("gpr.key")?.takeIf { it.isNotBlank() }

    if (user == null || key == null) {
        return null
    }

    return GprCredentials(user, key)
}

val gprCredentials by lazy { loadGprCredentials() }

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode = RepositoriesMode.FAIL_ON_PROJECT_REPOS
    repositories {
        google()
        mavenCentral()
        mavenLocal()
        gprCredentials?.let { credentials ->
            maven("https://maven.pkg.github.com/ReChronoRain/HyperCeiler") {
                this.credentials {
                    username = credentials.user
                    password = credentials.key
                }
            }
        }
        maven("https://jitpack.io")
        maven("https://api.xposed.info")
    }
}

rootProject.name = "HyperCeiler"

include(
    "app",
    // ":library:hook",
    ":library:libhook",
    // ":library:xposed-api-101",
    ":library:core",
    ":library:provision",
    ":library:common",
    ":library:processor",
    ":library:hidden-api",
)
