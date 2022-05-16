package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.LifeInsurance;
import com.example.demo.services.InsuranceService;

@SpringBootApplication
public class SingleTablePerClassHierarchyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SingleTablePerClassHierarchyApplication.class, args);
		
		InsuranceService service=ctx.getBean(InsuranceService.class);
		
		service.addHealthPolicy();
		service.addLifePolicy();
	}

	@Bean
	public LifeInsurance life() {
		
		return new LifeInsurance(98,"Ramesh",30,"Doctor");
	}
	
	@Bean
	public HealthInsurance health() {
		
		return new HealthInsurance(90, "Suresh", 60, "diabetic");
	}
}
