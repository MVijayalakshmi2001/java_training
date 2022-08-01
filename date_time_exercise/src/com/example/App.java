package com.example;

import java.time.Duration;   
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dateOfBirth="1998-12-19";
		
		Student vicky=new Student();
		
		vicky.setRollNumber(101);
		
		vicky.setStudentName("Vignesh");
		
		vicky.setDateOfBirth(LocalDate.parse(dateOfBirth));
		
		vicky.setDateOfJoining(LocalDateTime.now());
		
		System.out.println("Day="+vicky.getDateOfBirth().getDayOfMonth());
		
		System.out.println("Year="+vicky.getDateOfBirth().getYear());
		
		System.out.println("Month="+vicky.getDateOfBirth().getMonth());
		
		LocalTime startTime=LocalTime.of(9,30);
		
				
		LocalTime endTime=startTime.plus(7,ChronoUnit.HOURS);
		
		System.out.println("Start Time="+startTime);
		
		System.out.println("End Time="+endTime);
		
		
		
	}
	

}
