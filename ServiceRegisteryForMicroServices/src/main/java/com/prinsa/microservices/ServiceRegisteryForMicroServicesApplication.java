package com.prinsa.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegisteryForMicroServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegisteryForMicroServicesApplication.class, args);
		System.out.println("Starting Eureka Server Registry!");
		//http://localhost:8761
	}

}
