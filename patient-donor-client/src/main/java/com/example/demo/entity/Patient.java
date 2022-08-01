package com.example.demo.entity;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Patient {

	
	int patientId;
	
	
	String patientName;
	
	
	String bloodGroup;
	
	
	int age;

	
	String location;
	
	
	long mobileNumber;
	
}
