package com.training.model;

public class SavingsAccount extends BankAccount {
	
	private String nominee;

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(int accountNumber, String accountHolderName, double balance, String accountType,
			String nominee) {
		super(accountNumber, accountHolderName, balance, accountType);
		this.nominee = nominee;
	}
	
	
	//whenever subclass constructor is called superclass constructor is also called
	//even if super() keyword is not present
	
//	public SavingsAccount() {
//		
//		System.out.println("Constructor of SUB CLASS Called");
//	}
//	public SavingsAccount() {
//		
//		super(1020,"ram",5000);
//		System.out.println("Constructor of subclass called");
//	}
	

}
