package com.example.reportsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableHystrix
public class ReportSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReportSystemApplication.class, args);
	}

}
