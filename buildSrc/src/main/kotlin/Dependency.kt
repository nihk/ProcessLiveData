object Dependency {
    const val activity = "androidx.activity:activity-ktx:${Version.activity}"
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Version.androidGradlePlugin}"
    const val annotation = "androidx.annotation:annotation:${Version.annotation}"
    const val appCompat = "androidx.appcompat:appcompat:${Version.appCompat}"
    const val biometric = "androidx.biometric:biometric:${Version.biometric}"
    const val cardView = "androidx.cardview:cardview:${Version.cardView}"
    const val coil = "io.coil-kt:coil:${Version.coil}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Version.constraintLayout}"
    const val coreKtx = "androidx.core:core-ktx:${Version.coreKtx}"
    const val hamcrest = "org.hamcrest:hamcrest-all:${Version.hamcrest}"
    const val inject = "javax.inject:javax.inject:${Version.inject}"
    const val junit = "junit:junit:${Version.junit}"
    const val material = "com.google.android.material:material:${Version.material}"
    const val multidex = "androidx.multidex:multidex:${Version.multidex}"
    const val okhttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Version.okhttpLoggingInterceptor}"
    const val photoView = "com.github.chrisbanes:PhotoView:${Version.photoView}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Version.recyclerView}"
    const val robolectric = "org.robolectric:robolectric:${Version.robolectric}"
    const val savedState = "androidx.savedstate:savedstate-ktx:${Version.savedState}"
    const val security = "androidx.security:security-crypto:${Version.security}"
    const val swipeRefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:${Version.swipeRefreshLayout}"
    const val timber = "com.jakewharton.timber:timber:${Version.timber}"
    const val transition = "androidx.transition:transition-ktx:${Version.transition}"
    const val vectorDrawable = "androidx.vectordrawable:vectordrawable:${Version.vectorDrawable}"

    object AndroidTest {
        const val core = "androidx.test:core:${Version.androidTest}"
        const val coreKtx = "androidx.test:core-ktx:${Version.androidTest}"
        const val extJunit = "androidx.test.ext:junit:${Version.androidTestJunit}"
        const val runner = "androidx.test:runner:${Version.androidTest}"
        const val rules = "androidx.test:rules:${Version.androidTest}"
    }

    object ArchCore {
        const val runtime = "androidx.arch.core:core-runtime:${Version.archCore}"
        const val testing = "androidx.arch.core:core-testing:${Version.archCore}"
    }

    object Camera {
        const val core = "androidx.camera:camera-core:${Version.cameraX}"
        const val camera2 = "androidx.camera:camera-camera2:${Version.cameraX}"
        const val lifecycle = "androidx.camera:camera-lifecycle:${Version.cameraX}"
        const val view = "androidx.camera:camera-view:${Version.cameraXExt}"
        const val extensions = "androidx.camera:camera-extensions:${Version.cameraXExt}"
    }

    object Compose {
        const val compiler = "androidx.compose.compiler:compiler:${Version.compose}"
        const val runtime = "androidx.compose.runtime:runtime:${Version.compose}"
        const val foundation = "androidx.compose.foundation:foundation:${Version.compose}"
        const val `foundation-layout` = "androidx.compose.foundation:foundation-layout:${Version.compose}"
        const val ui = "androidx.compose.ui:ui:${Version.compose}"
        const val `ui-tooling` = "androidx.compose.ui:ui-tooling:${Version.compose}"
        const val `ui-test` = "androidx.compose.ui:ui-test-junit4:${Version.compose}"
        const val material = "androidx.compose.material:material:${Version.compose}"
        const val `material-icons-core` = "androidx.compose.material:material-icons-core:${Version.compose}"
        const val `material-icons-extended` = "androidx.compose.material:material-icons-extended:${Version.compose}"
    }

    object Dagger {
        const val runtime = "com.google.dagger:dagger:${Version.dagger}"
        const val compiler = "com.google.dagger:dagger-compiler:${Version.dagger}"

        object Hilt {
            const val plugin = "com.google.dagger:hilt-android-gradle-plugin:${Version.hilt}"
            const val runtime = "com.google.dagger:hilt-android:${Version.hilt}"
            const val testing = "com.google.dagger:hilt-android-testing:${Version.hilt}"
            const val compiler = "com.google.dagger:hilt-android-compiler:${Version.hilt}"

            object Jetpack {
                const val lifecycleViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:${Version.hiltJetpack}"
                const val compiler = "androidx.hilt:hilt-compiler:${Version.hiltJetpack}"
            }
        }
    }

    object Espresso {
        const val core = "androidx.test.espresso:espresso-core:${Version.espresso}"
        const val idlingResource = "androidx.test.espresso:espresso-idling-resource:${Version.espresso}"
        const val contrib = "androidx.test.espresso:espresso-contrib:${Version.espresso}"
        const val intents = "androidx.test.espresso:espresso-intents:${Version.espresso}"
    }

    object ExoPlayer {
        const val runtime = "com.google.android.exoplayer:exoplayer:${Version.exoPlayer}"
        const val core = "com.google.android.exoplayer:exoplayer-core:${Version.exoPlayer}"
        const val dash = "com.google.android.exoplayer:exoplayer-dash:${Version.exoPlayer}"
        const val hls = "com.google.android.exoplayer:exoplayer-hls:${Version.exoPlayer}"
        const val smoothstreaming = "com.google.android.exoplayer:exoplayer-smoothstreaming:${Version.exoPlayer}"
        const val ui = "com.google.android.exoplayer:exoplayer-ui:${Version.exoPlayer}"
    }

    object Fragment {
        const val runtime = "androidx.fragment:fragment-ktx:${Version.fragment}"
        const val testing = "androidx.fragment:fragment-testing:${Version.fragment}"
    }

    object Kotlin {
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Version.kotlin}"
        const val testJunit = "org.jetbrains.kotlin:kotlin-test-junit:${Version.kotlin}"
        const val plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}"
        const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.coroutines}"
        const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.coroutines}"
        const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Version.coroutines}"
    }

    object Lifecycle {
        const val runtime = "androidx.lifecycle:lifecycle-runtime:${Version.lifecycle}"
        const val java8 = "androidx.lifecycle:lifecycle-common-java8:${Version.lifecycle}"
        const val compiler = "androidx.lifecycle:lifecycle-compiler:${Version.lifecycle}"
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.lifecycle}"
        const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Version.lifecycle}"
        const val process = "androidx.lifecycle:lifecycle-process:${Version.lifecycle}"
    }

    object Mockito {
        const val core = "org.mockito:mockito-core:${Version.mockito}"
        const val android = "org.mockito:mockito-android:${Version.mockito}"
    }

    object Moshi {
        const val runtime = "com.squareup.moshi:moshi:${Version.moshi}"
        const val kotlinCodegen = "com.squareup.moshi:moshi-kotlin-codegen:${Version.moshi}"
        const val adapters = "com.squareup.moshi:moshi-adapters:${Version.moshi}"
    }

    object Navigation {
        const val runtime = "androidx.navigation:navigation-runtime-ktx:${Version.navigation}"
        const val fragment = "androidx.navigation:navigation-fragment-ktx:${Version.navigation}"
        const val ui = "androidx.navigation:navigation-ui-ktx:${Version.navigation}"
        const val safeArgsPlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:${Version.navigation}"
        const val testing = "androidx.navigation:navigation-testing:${Version.navigation}"
    }

    object Retrofit {
        const val runtime = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
        const val mock = "com.squareup.retrofit2:retrofit-mock:${Version.retrofit}"
        const val moshi = "com.squareup.retrofit2:converter-moshi:${Version.retrofit}"
    }

    object Room {
        const val runtime = "androidx.room:room-runtime:${Version.room}"
        const val compiler = "androidx.room:room-compiler:${Version.room}"
        const val roomKtx = "androidx.room:room-ktx:${Version.room}"
        const val testing = "androidx.room:room-testing:${Version.room}"
    }

    object Work {
        const val runtime = "androidx.work:work-runtime-ktx:${Version.work}"
        const val testing = "androidx.work:work-testing:${Version.work}"
        const val firebase = "androidx.work:work-firebase:${Version.work}"
    }
}