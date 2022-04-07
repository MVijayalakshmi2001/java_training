package com.example;

import com.example.model.Student;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ram = new Student();
		
		ram.setRollNumber(50);
		// cannot access default because student and application class in two different packages
		//ram.setFirstName("Ram");
		// unable to access because application is not a subclas of student
		//ram.setMarkScored(90);
		// unable to access because method branch is private
		//ram.setBranch("Ece");
		
		System.out.println("Roll Number = "+ram.getRollNumber());
		
		System.out.println("Mark scored ="+ram.getMarkScored());
		
		System.out.println("First Name = "+ram.getFirstName());
		
		Student shyam = new Student(55,"Shyam", "Ece", 90);
		
		System.out.println("Roll Number="+ shyam.getRollNumber());
		
		System.out.println("Student Name="+ shyam.getFirstName());
		
		Student magesh = new Student(99, "viji", "Ece");
		
		
		System.out.println("Roll Number="+magesh.getRollNumber());
		
		System.out.println("Student Name="+magesh.getMarkScored());
	}

}
