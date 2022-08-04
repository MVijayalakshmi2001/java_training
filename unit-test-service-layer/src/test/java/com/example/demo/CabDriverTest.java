package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.entity.CabDriver;
import com.example.demo.service.CabDriverService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import static org.mockito.BDDMockito.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)

@AutoConfigureMockMvc
public class CabDriverTest {

	
	@Autowired
    MockMvc mock;

    @Autowired
    ObjectMapper mapper;
    
    @MockBean
    CabDriverService service;
  
     CabDriver gowri;
     CabDriver jasna;
     CabDriver pavi;
    
    @BeforeAll
    void init() {
    	
    	gowri=new CabDriver(1000, "Gowri", 78654, "Chennai",LocalDate.of(1998, 06, 15),  3.8);
   	 	jasna=new CabDriver(1001, "Jasna", 78655, "Kerala",LocalDate.of(1998, 06, 15),  4.8);
   	 	pavi=new CabDriver(1002, "Pavi", 78656, "Trichy",  LocalDate.of(1998, 06, 15),2.8);

    }

	@DisplayName("Test find All method return a array") 
	@Test
	void testFindAll() throws Exception {
    	 
		List<CabDriver> list=new ArrayList<>();
		
		list.add(gowri);
		list.add(jasna);
		list.add(pavi);
		
		given(service.findAll()).willReturn(list);
		
		mock.perform(MockMvcRequestBuilders
				.get("/api/v1/drivers")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$", hasSize(3)))
				.andExpect(jsonPath("$[2].driverName", is("Pavi")));
	}
	
	@DisplayName("Test add method return status code 201 and returns the element added")
	@Test
	void testAdd() throws Exception{
		
		CabDriver punya=new CabDriver(1004, "punya", 87678,
				"Delhi", LocalDate.of(1998, 06, 15),3.6);
		
		given(service.save(punya)).willReturn(punya);
		
		mock.perform(MockMvcRequestBuilders.post("/api/v1/drivers").
				contentType(MediaType.APPLICATION_JSON).
				content(asJsonString(punya)))
				.andExpect(status().isCreated())
				.andExpect(content()
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.driverName", is("punya")));
	}

	private static String asJsonString(CabDriver obj) {
			
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			
			return objectMapper.writeValueAsString(obj);
			
		} catch (Exception e) {
			
			throw new RuntimeException(e);
			
		}
	
	}
	@Test
	void testFindById() throws Exception {
   	 
		CabDriver gowri=new CabDriver(1000, "Gowri", 78654, "Chennai",LocalDate.of(1998, 06, 15),  3.8);
		
		given(service.findById(1000)).willReturn(Optional.of(gowri));
		
		mock.perform(MockMvcRequestBuilders
				.get("/api/v1/drivers/1000")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.driverName", is("Gowri")));
				
	}
	
	@DisplayName("Test deleteById Method return a deletedelement")
	@Test
	void testDeleteById() throws Exception {

	Optional<CabDriver> element=Optional.of(gowri);

	given(service.remove(1000)).willReturn(element);


	mock.perform(MockMvcRequestBuilders
	.delete("/api/v1/drivers/del/1000")
	.contentType(MediaType.APPLICATION_JSON))
	// .andExpect(status(204))
	// .andExpect(jsonPath("$", hasSize(3)))
	.andExpect(jsonPath("$.driverName", is("Gowri")));

	}
	
}
