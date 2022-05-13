package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.bidirection.Doctor;
import com.example.demo.entity.bidirection.Patient;
import com.example.demo.utils.bidirection.Utility;

@SpringBootApplication
public class Application {

	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		Utility util=ctx.getBean(Utility.class);
		//util.create();
		//util.findAll();
		util.findDoctorFromPatient();
		ctx.close();
	}
	
	
	@Bean
	public Doctor viji() {
		Doctor doc=new Doctor();
		
		doc.setDoctorId(101);
		doc.setDoctorName("viji");
		doc.setPhoneNumber(987654321);
		doc.setDepartment("cardio");
		return doc;
	}
	
	@Bean
	public Patient rev() {
		return new Patient(201, "rev", 865432198l);
	}
	
	@Bean
	public Patient moni() {
		return new Patient(202, "moni", 876232198l);
	}
	
	@Bean
	public Patient pero() {
		return new Patient(203, "pero", 898432198l);
	}

}

