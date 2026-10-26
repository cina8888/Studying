package com.tesing.tesing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesingApplication.class, args);

		System.out.println("=================================");
		System.out.println("App running at: http://localhost:8080/");
		System.out.println("=================================");
	}

}
