package com.microservicios.microservicebeginners;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class MicroserviceBeginnersApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceBeginnersApplication.class, args);
	}
}
