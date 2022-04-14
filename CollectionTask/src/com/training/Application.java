package com.training;

import java.util.HashSet;
import com.training.model.Doctor;

import com.training.model.Patient;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Patient ram=new Patient(101, "ram", "Chennai", 998877665l);
		Patient shyam=new Patient(102, "shyam", "madurai", 998877666l);
		Patient magesh=new Patient(103, "magesh", "karur", 998877667l);
		
		HashSet<Patient> patients=new HashSet<>();
		
		patients.add(ram);
		patients.add(shyam);
		patients.add(magesh);
		
		Doctor abi=new Doctor(1, "abi", "ENT",patients);
		
		
	
		System.out.println("Doctor Name :"+abi.getDoctorName());
		for(Patient eachPatient:abi.getPatients()) {
			
			System.out.println(eachPatient);
		
		}

		
	}

}
