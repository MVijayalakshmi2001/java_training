package com.example.demo.utils.bidirection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.bidirection.Doctor;
import com.example.demo.entity.bidirection.Patient;
import com.example.demo.ifaces.bidirection.DoctorRepository;
import com.example.demo.ifaces.bidirection.PatientRepository;


@Component
public class Utility {

	@Autowired
	List<Patient> patientList;
	
	@Autowired
	Doctor doc;
	
	@Autowired
	DoctorRepository repo;
	
	@Autowired
	PatientRepository patientRepo;
	
	public void create() {
		
		Doctor added=repo.save(doc);

		for(Patient eachPatient : patientList) {
		eachPatient.setDoctor(doc);
		patientRepo.save(eachPatient);
		}


		if(added!=null) {

		System.out.println("One Record Added");
		}
		}
	
	//if lazy is used ,use transactional 
	//@Transactional
	public void findAll() {
		
		List<Doctor> doctors=repo.findAll();
		
		for(Doctor eachDoctor:doctors) {
			
			System.out.println("Doctor name:="+ eachDoctor.getDoctorName());
			System.out.println("Department:="+ eachDoctor.getDepartment());
			
			List<Patient> patients = eachDoctor.getPatientList();
			
			for(Patient eachPatient: patients) {
				
				System.out.println("Patient Name:="+eachPatient.getPatientName());
				System.out.println("Mobile Number:="+ eachPatient.getMobileNumber());
			}
		}
	}
	
	
	public void findDoctorFromPatient() {
		
		Patient entity=patientRepo.findById(201).get();
		
		System.out.println("Patient name:="+entity.getPatientName());
		System.out.println("Doctor details:="+entity.getDoctor());
		
	}
	
}

