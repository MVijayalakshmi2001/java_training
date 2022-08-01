package com.training;

public class BusinessAccount extends ClassBankAccount {

	@Override
	public double deposit(double amount) {
		
		double maxDeposit=1000000;

		if(amount>maxDeposit) {
			System.out.println("Deposit amount less than 1000000");
		}else {
			System.out.println("Deposited amount = "+ amount);
		}
		return maxDeposit;
	}
	@Override
	public double withdraw(double amount) {
		
		double minBalance=25000;

		 if(getBalance()<minBalance) {
			 System.out.println("Balance is less than minimum balance");
		 }else {
			 double currentBalance=this.getBalance()-amount;
			 
			 System.out.println("Current Balance is "+ currentBalance);
		 }
		return minBalance;
	}
	public BusinessAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BusinessAccount(String accountHolderName, double balance) {
		super(accountHolderName, balance);
		// TODO Auto-generated constructor stub
	}
	
	
}
