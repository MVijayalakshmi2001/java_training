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

import com.example.demo.entity.Donor;
import com.example.demo.services.DonorService;

@RestController
@RequestMapping(path = "/api/v1/donors")
@CrossOrigin(origins ="*")

public class DonorController {

	@Autowired
	private DonorService service;
	
	@PostMapping
	public Donor add(@RequestBody Donor entity ) {
		return this.service.save(entity);	
	}
	
	@GetMapping
	public List<Donor> findAll(){
		return this.service.findAll();
	}
	
	@GetMapping(path = "/srch/grp/{name}")
	public Donor[] findByBloodGroup(@PathVariable("name") String name) {
		return service.findByBloodGroup(name);
	}
	
	@GetMapping(path = "/srch/loc/{place}")
	public Donor[] findByLocation(@PathVariable("place") String place) {
		return service.findByLocation(place);
	}
}
