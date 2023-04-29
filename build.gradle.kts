buildscript {

    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://plugins.gradle.org/m2/") }
    }

    dependencies {
        classpath(Libraries.Plugins.android_gradle_plugin_version)
        classpath(Libraries.Plugins.kotlin)
        classpath(Libraries.Plugins.hilt)
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
