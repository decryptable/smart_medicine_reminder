plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "dev.indra.smartmedicinereminder"
    compileSdk = 35

    defaultConfig {
        applicationId = "dev.indra.smartmedicinereminder"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.8"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation(libs.work.runtime)
    implementation(libs.material.v160)
    implementation(libs.work.runtime.v2101)
//    implementation(libs.work.runtime)
}