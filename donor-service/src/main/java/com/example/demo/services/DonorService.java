package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Donor;
import com.example.demo.ifaces.DonorRepository;

@Service
public class DonorService {

	@Autowired
	private DonorRepository repo;
	
	public Donor save(Donor entity) {
		return repo.save(entity);
	}
	
	public List<Donor> findAll(){
		return repo.findAll();
	}
	
	public Donor[] findByBloodGroup(String name) {
		return repo.findByBloodGroup(name);
	}
	
	public Donor[] findByLocation(String place) {
		return repo.findByLocation(place);
	}
}
