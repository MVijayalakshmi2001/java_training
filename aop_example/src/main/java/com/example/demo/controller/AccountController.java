package com.example.demo.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.AccountSevice;

@RestController
@RequestMapping("/api/v1")
public class AccountController {

	private AccountSevice service;

	Logger logger=Logger.getAnonymousLogger(); 
	@Autowired
	public AccountController(AccountSevice service) {
		super();
		//logger.info("Account Controller Constructor called");
		this.service = service;
	}
	
	@GetMapping(path = "/accounts")
	public List<String> getAccounts(){
		
	
		//logger.info("GET Accounts Method called");
		
		return this.service.getAccount();
	}
	
}
