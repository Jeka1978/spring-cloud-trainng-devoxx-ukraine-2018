package com.naya.exams.theology;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
public class TheologyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheologyApplication.class, args);

	}

}
