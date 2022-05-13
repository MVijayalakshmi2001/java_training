package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.services.DoctorService;

@SpringBootApplication
public class SpringDataJpaSimpleMappingApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpaSimpleMappingApplication.class, args);
		
		Doctor reya=ctx.getBean(Doctor.class);
		
		DoctorService service=ctx.getBean(DoctorService.class);
		
		//service.findByDept("ent").forEach(System.out::println);
		
		//System.out.println(service.findByName("Reya"));
		
		//service.findByNameAndDept("akal", "ent").forEach(System.out::println);
		
		service.findByNameOrDept("Reya","neuro").forEach(System.out::println);
		
		//service.findAll().forEach(System.out::println);
		
		//Doctor added=service.add(reya);
		
//		if(added!=null) {
//			
//			System.out.println("One Doctor Added");
//		}
		
		ctx.close();
	}

	
	@Bean
	public Doctor reya() {
		
		return new Doctor(200,"Reya","ent",987876568l);
	}
}
