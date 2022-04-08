package com.training.model;

import com.training.exception.InvalidEmailException;
import com.training.models.Customer;

public class Application {

	public static void main(String[] args) {
		
		Customer ram=new Customer(1010,"viji", 909978787l,"viji@gmail.org");
		if(ram.getEmail()!=null) {
		System.out.println(ram.getEmail());
		}
		
	}
}
