package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student ram=new Student(101, "Ram", LocalDate.of(2001, 7, 17), LocalDateTime.of(2022, Month.MARCH, 21, 9, 30));
		
		Student shyam=new Student(102, "Shyam",LocalDate.now(),LocalDateTime.now());
		
		System.out.println("Ram year of birth="+ ram.getDateOfBirth().getYear());
		
		System.out.println("Ram first birthday="+ ram.getDateOfBirth().plus(1, ChronoUnit.YEARS));
		
		System.out.println("Shyam year of birth="+ shyam.getDateOfBirth().getYear());
		
		System.out.println("Shyam 50th birthday="+ shyam.getDateOfBirth().plus(50, ChronoUnit.YEARS));
		
		System.out.println("Shyam previous birthday="+ shyam.getDateOfBirth().minus(10, ChronoUnit.YEARS));
	
	}

}
