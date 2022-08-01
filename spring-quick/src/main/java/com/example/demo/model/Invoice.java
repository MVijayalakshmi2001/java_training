package com.example.demo.model;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Component

public class Invoice {
	Customer customer;
	Product product;
	
	
	@Autowired
	
	public Invoice(@Qualifier("geetha")Customer customer) {
		super();
		System.out.println("constructor called=======");
		this.customer = customer;
		this.product = product;
	}
	
	

}
