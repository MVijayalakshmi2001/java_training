package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import javax.persistence.EntityNotFoundException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.CabDriver;
import com.example.demo.service.CabDriverService;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class UnitTestServiceLayerApplicationTests {
	
	@Autowired
	CabDriverService service;

	
	@BeforeAll
	void setup() {
		CabDriver driver=new CabDriver(1000, "meena", 78654, 
				"Chennai", LocalDate.of(1998, 06, 15), 3.8);
		driver.setDriverName("Jagadeesh");
		service.save(driver);
	}
		
	
	@Test
	@DisplayName("Find All Method should return an Empty Array")
	void testFindAllFailure() {
		
		assertTrue(service.findAll().isEmpty());
		
	}
	
	@Test
	@DisplayName("Find All Method should return an Array with element")
	void testFindAllTrue() {
		
		assertFalse(service.findAll().isEmpty());
		
	}
	
	@Test
	@DisplayName("Find By Id method should return an element with given id")
	void testFindById() {
		
		//assertEquals("Jagadeesh", service.findById(1000).get().getDriverName());
	
		
		CabDriver driver=service.findById(7656).orElseThrow(EntityNotFoundException::new);
		
		assertEquals("Jagadeesh", driver.getDriverName());
	}
	
}
