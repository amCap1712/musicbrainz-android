plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "org.metabrainz.android"
        minSdkVersion(21)
        targetSdkVersion(30)

        versionCode = 37
        versionName = "4.3"

        multiDexEnabled = true
        testInstrumentationRunner("androidx.test.runner.AndroidJUnitRunner")
    }

    buildFeatures {
        viewBinding = true
        dataBinding = true
    }

    buildTypes {
        getByName("release") {
            minifyEnabled(false)
            // proguardFiles getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
        }
    }

    lintOptions{
        disable("InvalidPackage")
        disable("MissingTranslation")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    ndkVersion = "21.2.6472646"
    dependenciesInfo {
        includeInApk = true
        includeInBundle = true
    }

    buildToolsVersion = "30.0.2"
}

dependencies {
    val versions = rootProject.extra

    implementation("androidx.appcompat:appcompat:1.3.0-alpha02")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:${versions["lifecycleVersion"]}")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:${versions["lifecycleVersion"]}")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:${versions["lifecycleVersion"]}")
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation("androidx.lifecycle:lifecycle-common-java8:${versions["lifecycleVersion"]}")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.core:core-ktx:1.3.2")
    implementation("androidx.activity:activity-ktx:1.1.0")
    implementation("androidx.fragment:fragment-ktx:1.2.5")
    implementation("androidx.viewpager2:viewpager2:1.1.0-alpha01")

    // webservice Setup
    implementation("com.google.code.gson:gson:2.8.6")
    implementation("com.squareup.retrofit2:retrofit:2.7.1")
    implementation("com.squareup.okhttp3:okhttp:4.8.0")
    implementation("com.squareup.retrofit2:converter-gson:2.7.1")
    implementation("com.squareup.okhttp3:logging-interceptor:4.3.1")
    implementation("io.reactivex.rxjava2:rxandroid:2.1.1")
    implementation("io.reactivex.rxjava2:rxjava:2.2.17")
    implementation("com.jakewharton.retrofit:retrofit2-rxjava2-adapter:1.0.0")
    implementation("androidx.paging:paging-runtime-ktx:3.0.0-alpha07")

    //Image downloading and Caching library
    implementation("com.squareup.picasso:picasso:2.71828")

    //Kotlin setup
    implementation("org.jetbrains.kotlin:kotlin-stdlib:${versions["kotlinVersion"]}")
    implementation("org.jetbrains.kotlin:kotlin-reflect:${versions["kotlinVersion"]}")

    //Fragment Setup For Kotlin
    implementation("androidx.navigation:navigation-fragment-ktx:${versions["navigationVersion"]}")
    implementation("androidx.navigation:navigation-ui-ktx:${versions["navigationVersion"]}")
    implementation("androidx.coordinatorlayout:coordinatorlayout:1.1.0")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.2.0")

    //Test Setup
    testImplementation("junit:junit:4.13")
    testImplementation("com.squareup.okhttp3:mockwebserver:4.8.0")
    testImplementation("androidx.arch.core:core-testing:2.1.0")
    testImplementation("org.hamcrest:hamcrest-all:1.3")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.3.9")

    androidTestImplementation("androidx.test:runner:1.3.0")
    androidTestImplementation("androidx.arch.core:core-testing:2.1.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
    androidTestImplementation("androidx.test.espresso:espresso-intents:3.3.0")
    androidTestImplementation("com.squareup.okhttp3:mockwebserver:4.8.0")

    //Tagger & Metadata Setup
    implementation("info.debatty:java-string-similarity:1.2.1")
    implementation("com.github.amcap1712:KTaglib:release-SNAPSHOT")

    //Design Setup
    implementation("androidx.browser:browser:1.2.0")
    implementation("androidx.recyclerview:recyclerview:1.2.0-alpha06")
    implementation("androidx.cardview:cardview:1.0.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.2")
    implementation("com.google.android.material:material:1.3.0-alpha03")
    implementation("androidx.preference:preference-ktx:1.1.1")
    implementation("com.airbnb.android:lottie:${versions["lottieVersion"]}")

    implementation("me.dm7.barcodescanner:zbar:1.9.13")

    implementation("com.google.dagger:hilt-android:2.28-alpha")
    implementation("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha02")
    implementation("com.google.dagger:dagger:2.28.3")
    annotationProcessor("com.google.dagger:dagger-compiler:2.28")
    annotationProcessor("com.google.dagger:hilt-android-compiler:2.28-alpha")
    annotationProcessor("androidx.hilt:hilt-compiler:1.0.0-alpha02")
    kapt("com.google.dagger:dagger-compiler:2.28")
    kapt("com.google.dagger:hilt-android-compiler:2.28-alpha")
    kapt("androidx.hilt:hilt-compiler:1.0.0-alpha02")
}
