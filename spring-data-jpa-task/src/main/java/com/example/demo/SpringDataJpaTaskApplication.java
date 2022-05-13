package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Employee;
import com.example.demo.services.EmployeeService;

@SpringBootApplication
public class SpringDataJpaTaskApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx =SpringApplication.run(SpringDataJpaTaskApplication.class, args);
		
		
		Employee viji=ctx.getBean(Employee.class);
		
		EmployeeService service=ctx.getBean(EmployeeService.class);
		
		//System.out.println("Find By Date of Birth");
		//System.out.println(service.findByDateOfBirth(LocalDate.of(2000, 05,22)));
		
		//System.out.println("Find By Location");
		//service.findByLocation("karur").forEach(System.out::println);
		
		//System.out.println("Find By Skill Set");
		//service.findBySkillSet("java").forEach(System.out::println);
		
		//System.out.println("Find By SkillSet and Location");
		//service.findBySkillSetAndLocation("java", "trichy").forEach(System.out::println);
		
//		System.out.println("Find By Skillset or location");
//		service.findBySkillOrLocation("database", "karur").forEach(System.out::println);
		
		service.findAll().forEach(System.out::println);
		
//		Employee added=service.add(viji);
//		
//		if(added!=null) {
//			
//			System.out.println("One employee Added");
//		}
//		
		ctx.close();
	}

	
	@Bean
	public Employee viji() {
		return new Employee(100,"viji",LocalDate.of(2000,05,22),"Chennai","java",787878789l);
	}
	
}
