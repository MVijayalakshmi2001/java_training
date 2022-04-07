package com.example;

import com.training.BankAccount;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount account = new BankAccount("Ramesh",1000);
		
		System.out.println("current balance of Ramesh="+account.getUpdateBalance(2000));
		
		System.out.println("Account Number="+ account.getAccountNumber());
		
		System.out.println("current balance of Ramesh="+account.getUpdateBalance(3000));
		
		//System.out.println(BankAccount.getCount());
		//System.out.println(BankAccount.getCount());
		
	
		
        
BankAccount account2 = new BankAccount("Suresh",2000);
        System.out.println("current balance of Suresh="+ account2.getUpdateBalance(2000));
        System.out.println("Account number="+account2.getAccountNumber());
        System.out.println("current balance of Suresh="+account2.getUpdateBalance(4000));

	}

	

}
