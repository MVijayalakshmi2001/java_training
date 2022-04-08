package com.training.exception;

public class InvalidEmailException extends Exception {

	public String message;
	
	
	public InvalidEmailException(String message) {
		super();
		this.message = message;
	}


	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}

	
	
}
