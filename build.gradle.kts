plugins {
    id("application")
}

group = "com.github.jeyeihro.prime"
version = "1.0"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = org.gradle.api.JavaVersion.VERSION_17;
    targetCompatibility = org.gradle.api.JavaVersion.VERSION_17;
}

application {
    mainClass.set("com.github.jeyeihro.prime.Main")
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}