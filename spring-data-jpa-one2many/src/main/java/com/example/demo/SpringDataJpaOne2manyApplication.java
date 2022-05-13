package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.utils.DoctorUtils;

@SpringBootApplication
public class SpringDataJpaOne2manyApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext	ctx=SpringApplication.run(SpringDataJpaOne2manyApplication.class, args);
		
	DoctorUtils obj=ctx.getBean(DoctorUtils.class);
	
	obj.create();
	
	//obj.findAll();
	}

	@Bean
	public Doctor viji() {
		
	Doctor doc=new Doctor();
	doc.setDoctorId(101);
	doc.setDoctorName("Viji");
	doc.setDepartment("cardio");
	doc.setPhoneNumber(987678986l);
	
	return doc;
	
	}
	
	@Bean
	public Patient reva() {
		
		return new Patient(200,"Revathy",878789876l);
	}
	
	@Bean
	public Patient moni() {
		
		return new Patient(201,"Moni",878789976l);
	}
	
	@Bean
	public Patient pero() {
		
		return new Patient(202,"Peroshiya",878789376l);
	}
}
