package com.training.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapApp2 {

	public static void main(String[] args) {

		Student ram=new Student(101,"ram",78);
		
		Student shyam=new Student(102,"shyam",68);
		
		Student mukesh=new Student(103,"mukesh",98);
		
		HashMap<Integer, Student> map=new HashMap<>();
		
		map.put(900, ram);
		map.put(902, shyam);
		map.put(903, mukesh);
		
		
		//to get key values
		Set<Integer> keys=map.keySet();
		
		System.out.println(keys);
		
		//to get each value of key
		for(Integer key:keys) {
			
			System.out.println(map.get(key));
		}
		
		
		Collection<Student> list=map.values();
		
		for(Student eachStudent:list) {
			
			System.out.println(eachStudent);
		}
		
		//map representation 
		
		Set<Map.Entry<Integer,Student>> list2=map.entrySet();
		
		for(Map.Entry<Integer,Student> eachEntry:list2) {
			
			System.out.println(eachEntry.getKey());
			
			System.out.println(eachEntry.getValue());
		}
}
}
