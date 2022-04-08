package com.training.models;

import com.training.exception.InvalidEmailException;

public class Customer {

	private int CustomerId;
	private String customerName;
	private long phoneNumber;
	private String email;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int customerId, String customerName, long phoneNumber, String email) {
		super();
		
		if(email.contains("@") && email.contains(".com") || email.contains(".org") || email.contains(".in")){
		
		CustomerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}else {
		try {
			throw new InvalidEmailException("Enter proper mail id");
		} catch (InvalidEmailException e) {
			e.printStackTrace();
		}
	}

	}
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		
	
		if(email.contains("@") || email.contains(".com") || email.contains(".org") || email.contains(".in")){
			this.email = email;
		}else {
			try {
				throw new InvalidEmailException("Enter proper mail id");
			} catch (InvalidEmailException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
}
