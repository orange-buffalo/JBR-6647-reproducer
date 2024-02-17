plugins {
    kotlin("jvm") version "1.9.22"
}

group = "io.orange-buffalo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
    jvmArgs = listOf("-XX:+AllowEnhancedClassRedefinition")
}
kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of("21"))
        vendor = JvmVendorSpec.JETBRAINS
    }
}
