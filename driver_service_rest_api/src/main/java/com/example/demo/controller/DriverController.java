package com.example.demo.controller;

import java.net.URI;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.Driver;
import com.example.demo.services.DriverService;

@RestController
@RequestMapping(path = "/api/v1")
public class DriverController {

	
	private DriverService service;

	@Autowired
	public DriverController(DriverService service) {
		super();
		this.service = service;
	}
	
	@GetMapping(path = "/drivers")
	public List<Driver> getAllDrivers(){
		
		return this.service.findAll();
		
	}
	
	@GetMapping(path = "/drivers/{id}")
	public Driver getDriverById(@PathVariable("id") int id) {
		
		return this.service.findById(id);
	}
	
	@DeleteMapping(path = "/drivers")
	public ResponseEntity<Object> remove(@RequestBody Driver entity) {

		
		Driver result=this.service.remove(entity);
		
		if(result!=null) {
			
			return ResponseEntity.status(204).build();
			
		}else {
			
			return ResponseEntity.ok("No record matching");
		}
//	Driver driver = this.service.deleteByid(id).orElseThrow(()->
//	new NoSuchElementException("Element not found"));
//
//	     return ResponseEntity.status(204).body(driver);

	}

	
//	@PostMapping(path = "/drivers")
//	public Driver addDriver(@RequestBody Driver entity) {
//		
//		return this.service.add(entity);
//	}
	
	@PostMapping(path = "/drivers")
	public ResponseEntity<Driver> addDriver(@RequestBody Driver entity){
		
		Driver driver = this.service.add(entity);
		
		URI location =  ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(entity.getDriverId())
				.toUri();
		//return ResponseEntity.status(HttpStatus.CREATED).body(driver);
		return ResponseEntity.created(location).body(driver);
		
	}
	
	@GetMapping(path="/drivers/srch/drivername/{driverName}")
	public List<Driver> findByDriverName(@PathVariable("driverName")String srchName){
		return this.service.findByDriverName(srchName);

	}
	
	@GetMapping(path = "/drivers/srch/mobile/{mobileNumber}")
	public List<Driver> getDriverByMobileNumber(@PathVariable("mobileNumber")long number) {
		
		return this.service.srchByMobileNumber(number);
	}
	
	@GetMapping(path = "/drivers/srch/rating/{rating}")
	public List<Driver> getDriverByRating(@PathVariable("rating") double rating){
		
		return this.service.srchByDriverRating(rating);
	}
	
	@PutMapping(path="/drivers/{id}/{rating}")
	public ResponseEntity<Integer> updateRating(@PathVariable("id") int id, @PathVariable("rating") double updatedRating){
		int update=this.service.updateRating(id, updatedRating);
		return ResponseEntity.ok().body(update);
	}

	@GetMapping(path = "/drivers/sort/{propName}")
	public List<Driver> sortedList(@PathVariable("propName") String propName){
		return this.service.sortedList(propName);
	}
	
	
}
