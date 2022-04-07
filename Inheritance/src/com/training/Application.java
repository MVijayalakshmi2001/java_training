package com.training;

import com.training.model.BankAccount;
import com.training.model.SavingsAccount;
import com.training.services.BankAccountService;

public class Application {

	public static void main(String[] args) {
		
		BankAccount ramsAccount= new BankAccount(1010,"Ramesh",50000,"savings");
		System.out.println(ramsAccount.toString());
		System.out.println(ramsAccount);
		
		SavingsAccount account = new SavingsAccount(100, "Viji", 1000, "joint", "Reya");
		System.out.println(account.getAccountHolderName());
		System.out.println(account.getNominee());
		System.out.println(account.getAccountNumber());
		System.out.println(account.getAccountType());
		
		SavingsAccountService service=new SavingsAccountService();
		
	
	    System.out.println(service.getCustomerInfo(account));
	    
	    System.out.println(service.calculateInterest(account));
	    
	    //superclass instance = new subclass
	    BankAccountService service2=new SavingsAccountService();
	    
	    //cannot access the subclass method with superclass reference
	    // service2.getCustomerInfo(account);
	    
	    // casting
	    //(subclass)instance
	    
	    SavingsAccountService savingService2 = (SavingsAccountService)service2;
	    System.out.println(savingService2.getCustomerInfo(account));
	    
	   }

}
