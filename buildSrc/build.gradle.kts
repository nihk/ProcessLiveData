plugins {
    `kotlin-dsl`
}

repositories {
    google()
    jcenter()
}

dependencies {
    implementation("com.android.tools.build:gradle:4.1.2")
    implementation(kotlin("gradle-plugin", "1.4.21"))
}