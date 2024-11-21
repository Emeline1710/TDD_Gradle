plugins {
    id("java")
    id("org.sonarqube") version "5.1.0.4882"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    gradlePluginPortal()
    google()
    mavenCentral()
    maven {
        url = uri("https://plugins.gradle.org/m2/")
    }
}

dependencies {
    implementation("junit:junit:4.13.1")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

sonarqube  {
    properties {
        property("sonar.projectKey", "TDD")
        property("sonar.projectName", "TDD")
        property("sonar.sources", "src/main/java")
        property("sonar.host.url", "http://localhost:9000")
        property("sonar.token", "sqp_e2a473561da488b963f8d0ea5aaa6e9cc33e97c0")
        property("sonar.java.binaries", file("build/classes"))
    }
}

tasks.test {
    useJUnitPlatform()
}