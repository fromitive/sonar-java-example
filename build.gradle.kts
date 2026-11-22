plugins {
    id("java")
    id("org.sonarqube") version "7.5.0.8588"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:6.0.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

sonar {
    properties {
        property("sonar.projectKey", "sonar-java-example")
        property("sonar.projectName", "sonar-java-example")
        property("sonar.host.url", "http://localhost:9000")
    }
}

tasks.test {
    useJUnitPlatform()
}