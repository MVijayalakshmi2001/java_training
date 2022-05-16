package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.LifeInsurance;
import com.example.demo.ifaces.InsuranceRepository;

@Service
public class InsuranceService {

	@Autowired
	InsuranceRepository repo;
	
	@Autowired
	HealthInsurance entity;
	
	@Autowired
	LifeInsurance lifeEntity;
	
	public void addHealthPolicy() {
		
		Object obj=repo.save(entity);
	
		
		if(obj!=null) {
			
			System.out.println("One Record Added");
		}
	}
	
	
	public void addLifePolicy() {
		
		Object obj=repo.save(lifeEntity);
		
		if(obj!=null) {
			
			System.out.println("One Record Added");
		}
	}
	
	public void getPolicy() {
		
		repo.findAll().forEach(System.out::println);
	}
}
