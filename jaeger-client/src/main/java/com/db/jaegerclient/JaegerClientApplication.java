package com.db.jaegerclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.db.jaegerclient")
public class JaegerClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(JaegerClientApplication.class, args);
	}

}
