package com.training;

public abstract class ClassBankAccount {
	
	private String accountHolderName;
	private double balance;

	public ClassBankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public ClassBankAccount(String accountHolderName, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.balance = balance;
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



	@Override
	public String toString() {
		return "ClassBankAccount [accountHolderName=" + accountHolderName + ", balance=" + balance + "]";
	}



	public abstract double deposit(double amount);
	public abstract double withdraw(double amount);

}
