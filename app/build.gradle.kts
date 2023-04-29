plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.egiwon.mylivewidgetexoplayersample"
    compileSdk = 32

    defaultConfig {
        applicationId = "com.egiwon.mylivewidgetexoplayersample"
        minSdk = Apps.minSdk
        targetSdk = Apps.compileSdk
        versionCode = Apps.versionCode
        versionName = Apps.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        dataBinding = true
    }
}

dependencies {

    implementation(Libraries.GoogleSupport.androidx_core)
    implementation(Libraries.GoogleSupport.appcompat)
    implementation(Libraries.GoogleSupport.material)

    implementation(Libraries.Hilt.hilt)
    kapt(Libraries.Hilt.compiler)
}
