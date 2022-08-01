package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.DonorDto;
import com.example.demo.entity.Donor;
import com.example.demo.entity.Patient;

@RestController
@RequestMapping(path = "/client")
public class ClientController {

	private RestTemplate template;

	@Autowired
	private DonorDto dto;
	

	@Autowired
	public ClientController(RestTemplate template) {
		super();
		this.template = template;
	}
	@GetMapping(path = "/patients")
	public String getPatients() {
		return this.template.getForObject("http://PATIENT-SERVICE/api/v1/patients/", String.class);
	}
	
	
	@GetMapping(path = "/patients/json")
	public Patient[] getPatientJson() {
		return this.template.getForObject("http://PATIENT-SERVICE/api/v1/patients/", Patient[].class);

	}
	
	@GetMapping(path = "/donors")
	public String getDonors() {
		return this.template.getForObject("http://DONOR-SERVICE/api/v1/donors/", String.class);
	}
	
	@GetMapping(path = "/patient/donors/{name}")
	public DonorDto getPatientDonors(@PathVariable("name")String name) {
		
		Patient patient=this.template.getForObject("http://PATIENT-SERVICE/api/v1/patients/srch/"+name,Patient.class);
				
		Donor[] donors=this.template.getForObject("http://DONOR-SERVICE/api/v1/donors/srch/grp/"+name,Donor[].class);	
		
		dto.setPatient(patient);
		List<Donor> detailSet = Arrays.asList(donors);
//		Set<Donor> detailSet = Arrays.stream(donors).collect(Collectors.toSet());
		dto.setDonors(detailSet);
//		
		return dto;
	}
	
	@GetMapping(path = "/patient/donors/loc/{place}")
	public DonorDto getLocation(@PathVariable("place")String place) {
		
		Patient patient=this.template.getForObject("http://PATIENT-SERVICE/api/v1/patients/srch/loc/"+place,Patient.class);
				
		Donor[] donors=this.template.getForObject("http://DONOR-SERVICE/api/v1/donors/srch/loc/"+place,Donor[].class);	
		
		dto.setPatient(patient);
		List<Donor> detailSet = Arrays.asList(donors);
//		Set<Donor> detailSet = Arrays.stream(donors).collect(Collectors.toSet());
		dto.setDonors(detailSet);
//		
		return dto;
}
}
