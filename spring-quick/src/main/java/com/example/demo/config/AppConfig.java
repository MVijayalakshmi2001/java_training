package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Customer;
import com.example.demo.model.Product;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;

@Configuration
public class AppConfig {
	// id of the bean as a method name
	@Bean
	public Student rev() {
		return new Student(101,"rev",98);
				
	}
	@Bean
	public Teacher stylin () {
		return new Teacher(202, "stylin", "science");
	}
	@Bean
	public Product fan() {
		return new Product(501, "kajal");
	}
	@Bean
	public Customer geetha() {
		return new Customer(601,"geetha");
	}
	@Bean
	public Customer jaga() {
		return new Customer(602,"jaga");
	}
	@Bean
	public Customer ajith() {
		return new Customer(602,"ajith");
	}

}