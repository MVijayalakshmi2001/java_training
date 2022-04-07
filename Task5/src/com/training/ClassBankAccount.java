package com.training;

public abstract class ClassBankAccount {
	
	private String accountHolderName;
	private double balance;
	private double depositAmount;
	

	public ClassBankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public ClassBankAccount(String accountHolderName, double balance, double depositAmount) {
		super();
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.depositAmount = depositAmount;
	}


	public String getAccountHolderName() {
		return accountHolderName;
	}


	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public double getDepositAmount() {
		return depositAmount;
	}


	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}


	public abstract double deposit(double amount);
	public abstract double withdraw(double amount);

}
