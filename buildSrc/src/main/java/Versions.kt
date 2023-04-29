object Apps {
    const val compileSdk = 32
    const val minSdk = 23
    const val targetSdk = 32
    const val buildToolsVersion = "33.0.1"
    const val versionCode = 1
    const val versionName = "1.0.0"
}

object Versions {
    const val android_gradle_plugin_version = "7.2.2"

    object Kotlin {
        const val core = "1.6.10"
        const val core_ktx = "1.7.0"
        const val coroutines = "1.6.0-RC"
    }

    object Androidx {
        const val appcompat = "1.3.1"
        const val material = "1.4.0"
        const val recycler_view = "1.2.1"
        const val recyclerview_selection = "1.1.0"
        const val lifecycle = "2.4.0"
        const val constraint_layout = "2.1.2"
        const val activity_ktx = "1.4.0"
        const val fragment_ktx = "1.4.0"
        const val preference_ktx = "1.1.1"
        const val startup = "1.1.1"
    }

    object Hilt {
        const val plugins = "2.38.1"
    }

    object Network {
        const val retrofit = "2.9.0"
        const val okhttp_logging = "4.9.3"
        const val okhttpprofiler = "1.0.8"
        const val gson = "2.8.9"
    }

    object UI {
        const val viewpager2 = "1.0.0"
        const val glide_core = "4.12.0"
        const val glide_transformations = "4.3.0"
    }

    object Exoplayer {
        const val core = "2.12.0"
        const val ui = "2.12.0"
        const val hls = "2.12.0"
    }
}

object Libraries {

    object Plugins {
        const val android_gradle_plugin_version =
            "com.android.tools.build:gradle:${Versions.android_gradle_plugin_version}"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Kotlin.core}"
        const val hilt = "com.google.dagger:hilt-android-gradle-plugin:${Versions.Hilt.plugins}"
    }

    object GoogleSupport {
        const val appcompat = "androidx.appcompat:appcompat:${Versions.Androidx.appcompat}"
        const val recyclerview =
            "androidx.recyclerview:recyclerview:${Versions.Androidx.recycler_view}"
        const val recyclerview_selection =
            "androidx.recyclerview:recyclerview-selection:${Versions.Androidx.recyclerview_selection}"
        const val material = "com.google.android.material:material:${Versions.Androidx.material}"
        const val startup = "androidx.startup:startup-runtime:${Versions.Androidx.startup}"
        const val androidx_core = "androidx.core:core-ktx:${Versions.Kotlin.core_ktx}"
        const val androidx_activity =
            "androidx.activity:activity-ktx:${Versions.Androidx.activity_ktx}"
        const val androidx_fragment =
            "androidx.fragment:fragment-ktx:${Versions.Androidx.fragment_ktx}"
        const val androidx_preference =
            "androidx.preference:preference-ktx:${Versions.Androidx.preference_ktx}"
    }

    /** Android Architecture Components */
    object AAC {
        const val lifecycle_viewmodel =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.Androidx.lifecycle}"
        const val lifecycle_runtime =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.Androidx.lifecycle}"
        const val lifecycle_process =
            "androidx.lifecycle:lifecycle-process:${Versions.Androidx.lifecycle}"
    }

    /** Network */
    object Network {
        const val gson = "com.google.code.gson:gson:${Versions.Network.gson}"
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.Network.retrofit}"
        const val retrofit_converter =
            "com.squareup.retrofit2:converter-gson:${Versions.Network.retrofit}"
        const val okhttp3_interceptor =
            "com.squareup.okhttp3:logging-interceptor:${Versions.Network.okhttp_logging}"
        const val okhttpprofiler = "com.localebro:okhttpprofiler:${Versions.Network.okhttpprofiler}"
    }

    /** UI */
    object UI {
        const val glide = "com.github.bumptech.glide:glide:${Versions.UI.glide_core}"
        const val glide_compiler = "com.github.bumptech.glide:compiler:${Versions.UI.glide_core}"
        const val glide_transformations =
            "jp.wasabeef:glide-transformations:${Versions.UI.glide_transformations}"
        const val constraintlayout =
            "androidx.constraintlayout:constraintlayout:${Versions.Androidx.constraint_layout}"
        const val viewpager2 = "androidx.viewpager2:viewpager2:${Versions.UI.viewpager2}"
        const val exoplayer_core =
            "com.google.android.exoplayer:exoplayer-core:${Versions.Exoplayer.core}"
        const val exoplayer_ui =
            "com.google.android.exoplayer:exoplayer-ui:${Versions.Exoplayer.ui}"
        const val exoplayer_hls =
            "com.google.android.exoplayer:exoplayer-hls:${Versions.Exoplayer.hls}"
    }

    object Kotlin {
        const val core = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.Kotlin.core}"
        const val coroutines =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.Kotlin.coroutines}"
    }

    object Hilt {
        const val hilt = "com.google.dagger:hilt-android:${Versions.Hilt.plugins}"
        const val compiler = "com.google.dagger:hilt-compiler:${Versions.Hilt.plugins}"
    }
}
