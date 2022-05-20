package com.example.demo.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Passenger;
import com.example.demo.entity.TripHistory;
import com.example.demo.ifaces.PassengerRepository;

@Service
public class PassengerService {

	@Autowired
	 PassengerRepository repo;
	
	
	public List<Passenger> findAll(){
		return this.repo.findAll();
	}
	
	public List<Passenger> findByPassengerName(String name) {

		return this.repo.findByPassengerName(name);
	}
	
	public List<Passenger> findByTripDateTime(LocalDateTime time) {
		
		return this.repo.findByTripListTripDateTime(time);
	}

}
