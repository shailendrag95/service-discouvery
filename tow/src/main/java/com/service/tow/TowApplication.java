package com.service.tow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TowApplication {

	public static void main(String[] args) {
		SpringApplication.run(TowApplication.class, args);
	}

}
