package com.training;

//whenever working with collections
import java.util.*;

import com.training.model.Student; 


public class HashMapApplication {

	public static void main(String[] args) {

		Student ram=new Student(101,"ram",78);
		
		Student shyam=new Student(102,"shyam",68);
		
		Student mukesh=new Student(103,"mukesh",98);
		
		HashMap<Integer, Student> map=new HashMap<>();
		
		System.out.println(map.put(900, ram));
		
		System.out.println(map.put(902, shyam));
		
		Student added=map.put(902, mukesh);
		
		if(added!=null) {
			
			map.put(904, added);
		}
		
		//mukesh is present in 902 since it got replaced
		System.out.println(map.get(902));
		
		//shyam is added in 904 since place need to be given to shyam
		System.out.println(map.get(904));
		
	}
	

}
