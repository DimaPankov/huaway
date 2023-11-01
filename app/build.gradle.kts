
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("androidx.navigation.safeargs.kotlin")
    id ("com.google.gms.google-services")



}

android {
    namespace = "com.sevens.slots.spectgame"
    compileSdk = 33

    viewBinding{
        enable = true
    }


    defaultConfig {
        applicationId = "com.sevens.slots.spectgame"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

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
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation ("com.huawei.hms:push:6.11.0.300")
    implementation ("com.huawei.hms:hmscoreinstaller:6.7.0.300")
    implementation ("com.huawei.hms:hianalytics:6.12.0.300")
    implementation ("com.huawei.agconnect:agconnect-remoteconfig-ktx:1.9.1.300")
    implementation ("com.google.firebase:firebase-config-ktx:21.5.0")
    implementation ("com.google.android.gms:play-services-ads-identifier:18.0.1")
    implementation ("com.google.android.gms:play-services-appset:16.0.2")
    implementation("com.squareup.okhttp3:okhttp:4.9.1")
    implementation ("androidx.navigation:navigation-fragment-ktx:2.5.3")
    implementation ("androidx.navigation:navigation-ui-ktx:2.5.3")
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}