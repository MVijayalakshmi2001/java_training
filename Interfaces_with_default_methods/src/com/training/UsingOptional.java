package com.training;

import java.util.Optional;

import com.training.ifaces.Conditional;


public class UsingOptional {

	public static  Optional<String> getValue(int key){
		
		Optional<String> response=Optional.empty();
		
		if(key==1) {
			response=Optional.of("Hi");
		}
		return response;
	}
	

	public static Object getString(int key) {
		
		switch (key) {
		
		case 1:
			
			return new String("chocobar");
		case 2:
			
			return new StringBuffer("cassatta");

			
		default:
			return null;
		}
		
		
	}
	public static void main(String[] args) {
		
		//will throw nullpointerexception
		//System.out.println(getString(3).toString());
		
		//to avoid null pointer exception and return DEFAULT value
		// new feature is used from java 8 called optional
		
		
		Optional<Object> optional=Optional.ofNullable(getString(3));
		
		System.out.println(optional.orElse("Vanilla").toString());
		
		
		//checking whether value is present or not
		//if value is present only we will call the value using GET
		Optional<Object> opt2=Optional.ofNullable(getString(2));
		
		if(opt2.isPresent()) {
			System.out.println("Value is present="+ opt2.get());
		}else {
			System.out.println("Value is not present");
		}
		
		
		//using the lambda expression with optional
		Optional<Object> opt3=Optional.ofNullable(getString(2));
		
		opt3.orElseThrow(()->new RuntimeException("No object for value 3 try again"));
		
		Optional<String> resp=getValue(1);
		
		if(resp.isPresent()) {
			System.out.println(resp.get().toString());
			
		}else {
			System.out.println("Invalid choice enter 1");
		}
		
		
		resp.orElseThrow(()->new RuntimeException("Enter choice 1"));
		
		System.out.println(Conditional.getMessage()); 
	}

	
	
}
