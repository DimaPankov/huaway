

buildscript {
    repositories {
        google()
        jcenter()
        maven { url = uri("https://developer.huawei.com/repo/") }
    }
    dependencies {
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:2.5.3")
        classpath ("com.google.gms:google-services:4.3.15")
        classpath ("com.huawei.agconnect:agcp:1.9.1.300")
    }
}

plugins {
    id("com.android.application") version "8.0.1" apply false
    id ("com.android.library") version "7.3.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false
}