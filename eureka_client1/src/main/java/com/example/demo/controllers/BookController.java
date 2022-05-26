package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/api/v1")

public class BookController {

	//value injection
	@Value("${server.port}") 
	private String port;
	
	@GetMapping(path = "/books")
	public List<String> getBooks(){
		
		return Arrays.asList("Head First Java","Spring In Action","Thinking in java");
		
	}
	
	
	@GetMapping(path = "/books/{id}")
	public String getBookById(@PathVariable int id) {
		
		if(id==1) {
			return "Head First java "+ port;
		}else {
			return "Spring in Action "+ port;
		}
	}
}
