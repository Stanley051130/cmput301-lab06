plugins {
    alias(libs.plugins.android.application)
}

android {
    tasks.withType<Test>{
        useJUnitPlatform()
    }
    namespace = "com.example.listycity"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "com.example.listycity"
        minSdk = 24
        targetSdk = 36
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.appcompat)
    testImplementation("org.junit.jupiter:junit-jupiter-api:6.0.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:6.0.2")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:6.0.2")
    implementation(files("C:\\Users\\stan051130\\AppData\\Local\\Android\\Sdk\\platforms\\android-36\\android.jar"))
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}