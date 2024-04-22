package com.prinsa.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroServieceCompanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServieceCompanyApplication.class, args);
		System.out.println("Company MicroService Started.");
	}

}
