package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Patient;
import com.example.demo.ifaces.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository repo;
	
	public Patient save(Patient entity) {
		return repo.save(entity);
	}
	
	public List<Patient> findAll(){
		return repo.findAll();
	}

	public Patient findByBloodGroup(String name) {
		return repo.findByBloodGroup(name);
	}
	
	public Patient findByLocation(String place) {
		return repo.findByLocation(place);
	}
}
