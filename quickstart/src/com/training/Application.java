package com.training;

public class Application {

	public static void main(String[] args) {
		
		Greeting grtObj = new Greeting();
		
		// system s = new system();
		// constructor of system is private
		
		System.out.println(grtObj.getMessage());
		
		System.out.println(Greeting.getInfo());
		
		System.out.println(grtObj.getMessage());
		
		//System.out.println(grtObj.getInfo());
	}

}
		

