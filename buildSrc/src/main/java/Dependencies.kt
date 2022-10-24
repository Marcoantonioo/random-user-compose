object App {
    const val compileSdk =  32
    const val minSdk = 21
    const val targetSdk = 32
    const val versionCode = 1
    const val versionName = "1.0.0"
    const val jvmTarget = "1.8"
}

object Versions {
    const val coreKtx = "1.7.0"
    const val compose = "1.2.1"
    const val composeActivity = "1.3.1"
    const val lifecycleRuntime = "2.3.1"
    const val lifecycleViewModel= "2.5.1"
    const val koin = "3.2.2"
    const val retrofit = "2.9.0"
    const val okHttpLogging = "4.9.3"
    const val coroutines = "1.6.4"

    // Tests
    const val junit = "4.13.2"
    const val junitExt = "1.1.3"
    const val espressoCore = "3.4.0"

    const val coil = "2.0.0"
}

object Libs {
    // Core Ktx
    const val coreKtx= "androidx.core:core-ktx:${Versions.coreKtx}"

    // Compose
    const val composeUi = "androidx.compose.ui:ui:${Versions.compose}"
    const val composeMaterial = "androidx.compose.material:material:${Versions.compose}"
    const val composePreview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
    const val composeActivity = "androidx.activity:activity-compose:${Versions.composeActivity}"

    // Lifecycle
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntime}"
    const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleViewModel}"

    // Koin
    const val koin = "io.insert-koin:koin-android:${Versions.koin}"

    // Retrofit
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"

    // OkHttp
    const val okhttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttpLogging}"

    // Coroutines
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"

    // Coil
    const val coil = "io.coil-kt:coil-compose:${Versions.coil}"
}

object LibTests {
    const val junit = "junit:junit:${Versions.junit}"
    const val junitExt = "junit:junit:${Versions.junitExt}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    const val composeJunit = "androidx.compose.ui:ui-test-junit4:${Versions.compose}"
    const val composeManifest = "androidx.compose.ui:ui-test-manifest:${Versions.compose}"

    const val runner = "androidx.test:runner:1.4.0"

    const val rules = "androidx.test:rules:1.4.0"

    const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.4"

    const val mockk = "io.mockk:mockk:1.12.0"
    const val mockkAndroid = "io.mockk:mockk-android:1.12.0"

    const val turbine = "app.cash.turbine:turbine:0.11.0"
}
