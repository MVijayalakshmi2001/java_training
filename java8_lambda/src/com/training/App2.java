package com.training;

import java.util.List;

import java.util.Arrays;

public class App2 {

	public static void main(String[] args) {

		
		List<String> names=Arrays.asList("India","Srilanka","Indonesia","Bhutan");
		
		//for(String eachNames:names) {
			
		//	System.out.println(eachNames);
			
		//}
		
		//names.forEach(value->System.out.println(value));
		
		//Method reference
		
		names.forEach(System.out::println);
		
	}

}
