package com.training;

public class BusinessAccount extends ClassBankAccount {

	private double minBalance=25000;
	private double maxDeposit=1000000;
	@Override
	public double deposit(double amount) {
		
		if(getDepositAmount()>maxDeposit) {
			System.out.println("Deposit less than 1000000");
		}
		return maxDeposit;
	}
	@Override
	public double withdraw(double amount) {
		 if(getBalance()<minBalance) {
			 System.out.println("Balance is less than minimum balance");
		 }
		return minBalance;
	}
	
	public BusinessAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BusinessAccount(String accountHolderName, double balance, double depositAmount, double minBalance,
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
