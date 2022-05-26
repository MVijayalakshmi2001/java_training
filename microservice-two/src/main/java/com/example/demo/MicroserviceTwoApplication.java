package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceTwoApplication.class, args);
	}

	@Bean
	@LoadBalanced                    //To use service id instead of port number and hostname
	public RestTemplate template() {
		return new RestTemplate();
	}
}
