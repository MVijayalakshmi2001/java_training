package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.training.model.Author;
import org.training.model.Book;

import com.example.demo.model.Bill;
import com.example.demo.model.CustomerList;
import com.example.demo.model.Invoice;
import com.example.demo.model.Teacher;

@SpringBootApplication
@ComponentScan(basePackages = {"org.training","com.example"})
public class SpringQuickApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringQuickApplication.class, args);
		
		
		//public Static trial() {
//		System.out.println(ctx.getBean("rev"));
//		System.out.println(ctx.getBean("teacher"));
//		
//		
//		////casting not required,but there shouild be only one bean of that type will throw exception
//		Teacher celina = ctx.getBean(Teacher.class);
//		celina.setId(201);
//		celina.setName("celina");
//		celina.setSubject("maths");
//		System.out.println(celina);
//	    //System.out.println(ctx.getBean("stylin"));
//		
//		
//		
//		//when use id need to cast to specific bean since return type of get bean method is object
//		Teacher stylin1 = (Teacher) ctx.getBean("stylin");
//		System.out.println(stylin1);
//		
//		
//		
//		//when more than one bean of the same type available should 
//		//use id and class name
//		Teacher stylin2 = ctx.getBean("stylin",Teacher.class);
//		System.out.println(ctx.getBean("stylin2"));
		
		
//		Invoice inv = ctx.getBean(Invoice.class);
//		System.out.println(inv);
//		
//		
//		Bill bill = ctx.getBean(Bill.class);
//		System.out.println("customer:="+bill.getCustomer());
//		System.out.println("product:="+bill.getProduct());
//		
		//CustomerList list= ctx.getBean(CustomerList.class);
		//list.getCustList().forEach(System.out::println);
		
		
		
		System.out.println(ctx.getBean(Book.class));


		System.out.println("author:"+ctx.getBean(Author.class));

		}
	@Bean
	public Author java() {
		return new Author(101,"revathy");
	}
	@Bean
	@Primary
	public Author mani() {
		return new Author(101,"mani");
	}


	}








