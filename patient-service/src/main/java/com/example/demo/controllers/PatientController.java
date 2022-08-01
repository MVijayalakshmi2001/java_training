package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Patient;
import com.example.demo.services.PatientService;

@RestController
@RequestMapping(path = "/api/v1/patients")
@CrossOrigin(origins ="*")
public class PatientController {

	@Autowired
	private PatientService service;
	
	@PostMapping
	public Patient add(@RequestBody Patient entity ) {
		return this.service.save(entity);	
	}
	
	@GetMapping
	public List<Patient> findAll(){
		return this.service.findAll();
	}
	
	@GetMapping(path = "/srch/{name}")
	public Patient findByBloodGroup(@PathVariable("name") String name) {
		return service.findByBloodGroup(name);
	}
	
	@GetMapping(path = "/srch/loc/{place}")
	public Patient findByLocation(@PathVariable("place") String place) {
		return service.findByLocation(place);
	}
}
