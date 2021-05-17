package com.db.jaegerserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.db.jaegerserver")
public class JaegerServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JaegerServerApplication.class, args);
	}

}
