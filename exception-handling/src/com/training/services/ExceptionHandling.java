package com.training.services;

public class ExceptionHandling {

	public void usingArrayIndexException(String[] args) {
		
		try {
			System.out.println(args[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Method requires three values to be passed[a,b,c]");
			e.printStackTrace();
		} 
	}
	
	public void usingNumberFormatException(String value) {
		
		
		int age=0;
		try {
			age=Integer.parseInt(value);
			//System.out.println(age);
		} catch (NumberFormatException e) {
			System.out.println("Need to be an integer");
			e.printStackTrace();
		}
		System.out.println(age);
	}
	
	public String understandFinallyBlock() throws Exception {
		
		int denominator=4;
		try {
			System.out.println(4/denominator);
		}catch(ArithmeticException e) {
			System.err.println("Denominator should not be zero");
			//return "welcome";
			throw new Exception();
		}
		finally {
			System.out.println("Inside FINALLY===");
		}
		System.out.println("bye,bye");
		
		return "thanks";
	}                                                                    
}
