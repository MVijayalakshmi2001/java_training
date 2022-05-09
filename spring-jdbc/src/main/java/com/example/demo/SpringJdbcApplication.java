package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx= SpringApplication.run(SpringJdbcApplication.class, args);
		
		ProductRepository repo=ctx.getBean(ProductRepository.class);
		
		Product tv=ctx.getBean(Product.class);
		
		//System.out.println(tv);
		//System.out.println("Row Added ="+repo.add(tv));
		
		//System.out.println(repo.findById(100));
		Product t=ctx.getBean(Product.class);
		System.out.println(repo.update(t));
		
		//System.out.println(repo.remove(102));
		//repo.findAll().forEach(System.out::println);
			
	}

	@Bean
	public Product tv() {
		return new Product(98,"sam tv",60000.0);
	}
	
	@Bean
	@Primary
	public Product soap() {
		return new Product(105,"soap",80.0);
	}
}
