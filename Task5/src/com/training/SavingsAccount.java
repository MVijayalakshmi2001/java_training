package com.training;

public class SavingsAccount extends ClassBankAccount {
	
	
	@Override
	public double deposit(double amount) {
		
		double maxDeposit=100000;

		if(amount>maxDeposit) {
			System.out.println("Deposit amount less than 100000");
		}else {
			System.out.println("Deposited amount = "+ amount);
		}
		return maxDeposit;
		
	}
	@Override
	public double withdraw(double amount) {
		
		double minBalance=5000;

		 if(getBalance()<minBalance) {
			 
			 System.out.println("Balance is less than minimum balance");
			 
		 }else {
			 double currentBalance=this.getBalance()-amount;
			 
			 System.out.println("Current Balance is "+ currentBalance);
		 }
		return minBalance;
	}
	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SavingsAccount(String accountHolderName, double balance) {
		super(accountHolderName, balance);
		// TODO Auto-generated constructor stub
	}
	
}

