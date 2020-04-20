repositories {
    mavenCentral()
}

plugins {
    //    id("org.springframework.boot") version "2.2.1.RELEASE"
//    id("io.spring.dependency-management") version "1.0.8.RELEASE"
    id("java")
}

group = "ru.game.divvvan"
version = "0.0.1-SNAPSHOT"

dependencies {
    implementation("org.hibernate:hibernate-core:3.6.7.Final")
    testImplementation("junit:junit:4.+")

//====Logbook============================================================
    compileOnly("org.projectlombok:lombok:1.18.12")
    annotationProcessor("org.projectlombok:lombok:1.18.12")

    testCompileOnly("org.projectlombok:lombok:1.18.12")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.12")
//=====================BD===========================================
    implementation("org.liquibase:liquibase-gradle-plugin:2.0.2")
    implementation("com.vladmihalcea:hibernate-types-52:2.7.1")
    runtimeOnly("org.postgresql:postgresql:42.1.4")
//    implementation("org.springframework.boot:spring-boot-starter-web")
//    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
//    implementation("org.apache.commons:commons-text:1.8")
//    implementation("com.opencsv:opencsv:5.0")
//    implementation("org.springframework.boot:spring-boot-starter-actuator")


    //====Logbook============================================================
//    implementation("org.zalando:logbook-spring-boot-starter:2.1.0")

//    //====Test===============================================================
//    testImplementation("org.testcontainers:postgresql:1.12.0")
//    testImplementation("org.springframework.boot:spring-boot-starter-test")
//
//    //====OpenApi============================================================
//    implementation("io.springfox:springfox-swagger2:2.9.2")
//    implementation("org.springframework.cloud:spring-cloud-starter-openfeign:2.2.0.RELEASE")
//    implementation("com.netflix.feign:feign-jackson:8.0.0")
//    implementation("org.openapitools:jackson-databind-nullable:0.2.0")
//    implementation("com.google.code.findbugs:jsr305:3.0.2")
//    //=======================================================================
//
//    //====Feign============================================================
//    implementation("io.github.openfeign:feign-okhttp:10.7.4")
//    implementation("io.github.openfeign:feign-gson:10.7.4")
//    implementation("io.github.openfeign:feign-slf4j:10.7.4")
//    implementation("io.github.openfeign:feign-core:10.7.4")
}
