plugins {
    kotlin("jvm") version "1.9.24"
    application
}

kotlin {
    jvmToolchain(21)
}


application {
    mainClass.set("me.dio.lab.MainKt")
}


group = "me.dio.lab"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
}

tasks.test {
    useJUnitPlatform()
}
