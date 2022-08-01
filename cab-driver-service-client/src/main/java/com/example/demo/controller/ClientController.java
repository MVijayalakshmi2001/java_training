package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.TripDto;
import com.example.demo.entity.CabDriver;
import com.example.demo.entity.TripDetail;

@RestController
@RequestMapping(path = "/client")
public class ClientController {

	private RestTemplate template;

	@Autowired
	private TripDto dto;
	

	@Autowired
	public ClientController(RestTemplate template) {
		super();
		this.template = template;
	}
	
	@GetMapping(path = "/drivers")
	public String getDrivers() {
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/", String.class);
	}
	
	
	@GetMapping(path = "/drivers/json")
	public CabDriver[] getDriverJson() {
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/", CabDriver[].class);

	}
	
	@GetMapping(path = "/srch/drivers/{name}")
	public String getDriverByName(@PathVariable("name") String name) {
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/srch/"+name, String.class);
	}
	
	@GetMapping(path = "/trips")
	public String getTrips() {
		return this.template.getForObject("http://TRIP-DRIVER-SERVICE/api/v1/details/", String.class);
	}
	
	@GetMapping(path = "/driver/trips/{id}")
	public TripDto getDriverTrips(@PathVariable("id")int id) {
		
		CabDriver driver=this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/"+id,CabDriver.class);
				
		TripDetail[] trips=this.template.getForObject("http://TRIP-DRIVER-SERVICE/api/v1/details/srch/"+id,TripDetail[].class);	
		
		dto.setDriver(driver);
		//List<TripDetail> detailSet = Arrays.asList(trips);
		Set<TripDetail> detailSet = Arrays.stream(trips).collect(Collectors.toSet());
		dto.setTrips(detailSet);
		
		return dto;
	
	}
	
}
