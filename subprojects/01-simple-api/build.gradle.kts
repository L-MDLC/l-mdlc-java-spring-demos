plugins {
	id("org.springframework.boot")
	id("io.spring.dependency-management")
}

version = "0.0.1-SNAPSHOT"

dependencies {
	implementation("org.springframework:spring-context:6.2.2")
	implementation("org.springframework.boot:spring-boot-starter:3.4.2")
	implementation("org.springframework.boot:spring-boot-starter-web:3.4.2")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.jar {
	isEnabled = true
}
