package com.example.demo.ifaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Donor;

public interface DonorRepository extends JpaRepository<Donor, String > {

	Donor[] findByBloodGroup(String name);
	
	Donor[] findByLocation(String place);


}
