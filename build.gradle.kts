plugins {
    java
    id("org.sonarqube") version "5.1.0.4882"
    jacoco
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
}

sonarqube {
    properties {
        property("sonar.projectKey", "TDD")
        property("sonar.projectName", "TDD")
        property("sonar.sources", "src/main/java")
        property("sonar.host.url", "http://localhost:9000")
        property("sonar.token", "sqp_c8dd8750bb8e7a5f84633fbd653c294a7384c050")
        property("sonar.java.binaries", "build/classes/java/main")
    }
}

tasks.test {
    useJUnitPlatform()
}

tasks.jacocoTestReport {
    dependsOn(tasks.test)
    reports {
        xml.required.set(true)
        html.required.set(true)
    }
}
