package com.example.ForoHub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.ForoHub.controllers", "com.example.infra.security"})
public class ForoHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForoHubApplication.class, args);
	}

}
