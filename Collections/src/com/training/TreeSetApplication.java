package com.training;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.training.model.Student;

public class TreeSetApplication {
 
	public static void main(String[] args) {

		Student ram=new Student(101,"ram",78);
		Student shyam=new Student(102,"shyam",68);
		Student magesh=new Student(103,"magesh",88);
		Student chinnaMagesh=new Student(103,"magesh",88);
		
		Set<Student> set=new TreeSet<>();
		
		set.add(magesh);
		set.add(shyam);
		set.add(ram);
		set.add(chinnaMagesh);
		
		for(Student eachStudent:set) {
			System.out.println(eachStudent.getFirstName());
		}
		
	}

}
