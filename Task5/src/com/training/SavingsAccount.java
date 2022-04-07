package com.training;

public class SavingsAccount extends ClassBankAccount {
	
	private double minBalance=5000;
	private double maxDeposit=100000;
	@Override
	public double deposit(double amount) {
		
		
		return 0;
	}
	@Override
	public double withdraw(double amount) {
		
		return 0;	
	}
	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SavingsAccount(String accountHolderName, double balance, double depositAmount, double minBalance,
			double maxDeposit) {
		super(accountHolderName, balance, depositAmount);
		this.minBalance = minBalance;
		this.maxDeposit = maxDeposit;
	}

	
	public double getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	public double getMaxDeposit() {
		return maxDeposit;
	}
	public void setMaxDeposit(double maxDeposit) {
		this.maxDeposit = maxDeposit;
	}
	
	
	
	
}

