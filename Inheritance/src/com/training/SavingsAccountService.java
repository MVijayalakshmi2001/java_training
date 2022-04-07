package com.training;

import com.training.model.BankAccount;
import com.training.model.SavingsAccount;
import com.training.services.BankAccountService;

public class SavingsAccountService extends BankAccountService {

	//ADD ADDITIONAL METHOD
	public String getCustomerInfo(SavingsAccount account) {
		
		return account.getAccountHolderName();
	}

	@Override
	public double calculateInterest(BankAccount account) {
        double simpleInterest = 0.15;
		
		if(account.getAccountNumber()<=5000) {
			
			simpleInterest = 0.20;
		
		}
		return account.getBalance()*1*simpleInterest;
	}
}
	
	//OVERRIDING METHOD
	
	

