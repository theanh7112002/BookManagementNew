buildscript {
    repositories{
        google()
        mavenCentral()
        jcenter() // JCenter đã ngừng hoạt động, hãy cân nhắc xóa nếu không cần
    }
    dependencies {
        classpath("com.google.gms:google-services:4.4.0")
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.6.0" apply false
}