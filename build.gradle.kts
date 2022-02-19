plugins {
    kotlin("jvm") version "1.6.10"
    war
}

group = "dev.cooeeu.war"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework:spring-webmvc:5.3.16")
    implementation("org.springframework:spring-context-support:5.3.16")
    implementation("org.freemarker:freemarker:2.3.31")
    compileOnly("javax.servlet:javax.servlet-api:4.0.1")
    implementation("ch.qos.logback:logback-classic:1.2.10")
}

