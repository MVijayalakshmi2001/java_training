package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TripDetail;
import com.example.demo.repos.TripDetailRepository;

@Service
public class TripDetailService {

	@Autowired
	private TripDetailRepository repo;
	
	public TripDetail add(TripDetail entity) {
		
		return this.repo.save(entity);
	}
	
	public List<TripDetail> findAll(){
		return this.repo.findAll();
		
	}
	
	public List<TripDetail> findByDriverId(int id) {
		return this.repo.findByDriverId(id);
	}
}
