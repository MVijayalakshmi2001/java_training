package com.example.demo.service;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;


@Service
public class AccountSevice {

	Logger log= Logger.getAnonymousLogger();
	
	public List<String> getAccount(){
		
		//log.info("GET Accounts called");
		
		return Arrays.asList("Ramesh","Suresh","Magesh");
	}
}
