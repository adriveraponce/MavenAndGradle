package com.github.adriveraponce.mavenexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MavenExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenExampleApplication.class, args);
	}

	@PostMapping("/")
	public String helloWorld() {
		return "Hello World";
	}
}
