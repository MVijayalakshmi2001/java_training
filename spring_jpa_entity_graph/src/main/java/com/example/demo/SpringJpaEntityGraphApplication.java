package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Address;
import com.example.demo.entity.City;
import com.example.demo.entity.User;
import com.example.demo.repos.AddressRepository;
import com.example.demo.services.AddressService;

@SpringBootApplication
public class SpringJpaEntityGraphApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringJpaEntityGraphApplication.class, args);
		
		AddressService service= ctx.getBean(AddressService.class);
		
		//service.task1();
		//service.task2();
		service.task3();
		
		ctx.close();
	}

//	@Bean
//	public CommandLineRunner runner() {
//		
//		return new CommandLineRunner() {
//			
//			@Autowired
//			AddressRepository repo;
//			@Override
//			public void run(String... args) throws Exception {
//				
//				City chennai= new City(90, "Chennai");
//				
//				City madurai=new City(91, "Madurai");
//				
//				User ram=new User(100,"Ramesh",989878789l);
//				
//				User suresh=new User(101,"Suresh",789870989l);
//				
//				Address address1=new Address(200, "Mr.", madurai, suresh);
//				
//				Address address2=new Address(201, "Mr.", chennai, ram);
//				
//				this.repo.save(address1);
//				
//				this.repo.save(address2);
//
//			}
//		};
		
//	}
}
