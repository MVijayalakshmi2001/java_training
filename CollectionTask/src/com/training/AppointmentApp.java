package com.training;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.training.model.Appointment;
import com.training.model.Doctor;
import com.training.model.Patient;

public class AppointmentApp {

	
	public static void main(String[] args) {
		

		Patient ram=new Patient(101, "ram", "Chennai", 998877665l);
		Patient shyam=new Patient(102, "shyam", "madurai", 998877666l);
		Patient magesh=new Patient(103, "magesh", "karur", 998877667l);
		
		HashSet<Patient> patients=new HashSet<>();
		
		patients.add(ram);
		patients.add(shyam);
		patients.add(magesh);
		
		Doctor abi=new Doctor(1, "abi", "ENT",patients);
		

		Patient p4=new Patient(104, "akalya", "Chennai", 998877668l);
		Patient p5=new Patient(105, "akshitha", "madurai", 998877669l);
		Patient p6=new Patient(106, "arthiya", "karur", 998877660l);
		
		HashSet<Patient> patients2=new HashSet<>();
		
		patients2.add(p4);
		patients2.add(p5);
		patients2.add(p6);
		
		Doctor viji=new Doctor(2, "viji", "GYNO", patients2);
		
		Map<Doctor,Set<Patient>> list=new HashMap<>();
		list.put(abi, patients);
		list.put(viji, patients2);
		
		Appointment app=new Appointment(list);
		
		System.out.println(app.getPatients(viji));
		
		
		
		
	}

	}

