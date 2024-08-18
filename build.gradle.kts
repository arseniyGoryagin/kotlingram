plugins {
    kotlin("jvm") version "1.9.23"
    kotlin("plugin.serialization") version "1.8.0"
    application
}

group = "com.tgbotlib"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()

}

application {
    // Specify the generated class name from your Kotlin file containing the main function
    mainClass.set("MainKt")
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = application.mainClass.get()
    }
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0")
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("com.squareup.okhttp3:okhttp:4.9.3") // HTTP client
    implementation("com.squareup.moshi:moshi:1.14.0")
    implementation("com.squareup.moshi:moshi-adapters:1.14.0")
    implementation("com.squareup.moshi:moshi-kotlin:1.14.0")
    implementation("org.json:json:20210307")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}