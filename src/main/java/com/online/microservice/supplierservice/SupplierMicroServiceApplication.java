package com.online.microservice.supplierservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SupplierMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupplierMicroServiceApplication.class, args);
	}

}
