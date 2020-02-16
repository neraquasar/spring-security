import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.61"
}

group = "org.neraquasar"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

val kotlinVersion = "1.3.+"
val springBootVersion = "2.2.4.RELEASE"
dependencies {
    implementation(kotlin("stdlib", kotlinVersion))
    implementation("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.3.+")
    testCompile("org.junit.jupiter:junit-jupiter-api:5.3.1")
    implementation("org.springframework.boot:spring-boot-starter:$springBootVersion")
    implementation("org.springframework.boot:spring-boot-starter-web:$springBootVersion")
    implementation("org.springframework.boot:spring-boot-starter-actuator:$springBootVersion")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:$springBootVersion")
    implementation("org.springframework.boot:spring-boot-starter-security:$springBootVersion")
    implementation("com.h2database:h2:1.4.197")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}
group = "org.neraquasar"
version = "1.0-SNAPSHOT"
