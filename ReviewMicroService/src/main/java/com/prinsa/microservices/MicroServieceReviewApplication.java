package com.prinsa.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroServieceReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServieceReviewApplication.class, args);
		System.out.println("Review MicroService started!");
	}

}
