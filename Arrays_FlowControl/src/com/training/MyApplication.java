package com.training;

import java.util.Scanner;

import com.training.model.BankAccount;
import com.training.services.BankAccountService;
import java.util.*;

public class MyApplication {

	public static void main(String[] args) {
		
		
	    BankAccountService service= new BankAccountService();
	    BankAccount[] list=new BankAccount[2];
	    int idx=0;
	    int choice=0;
	    
	    Scanner sc = new Scanner(System.in);
	   
		do{
	    	BankAccount account= new BankAccount();
	    	        
                    System.out.println("Enter account number");
	    			int accountNumber =  sc.nextInt();
	    			
	    			System.out.println("Enter account holder name");
	    			String accountHolderName = sc.next();
	    			
	    			System.out.println("Enter balance");
	    			double balance=sc.nextDouble();
	    			
	    			System.out.println("Enter accounttype");
	    			String accountType = sc.next();
	    			
	    			System.out.println("Enter the choice 0 to stop or 1 to continue");
	    		    choice=sc.nextInt();
	    			
	    			BankAccount account1 = new BankAccount(accountNumber,accountHolderName,balance,accountType);
	    		
					list[idx]=account1;
                    idx++;    		
	  
	    }while(choice==1);
		
		double[] values = service.findInterest(list);
		
		for(double eachValue:values) {
			System.out.println(eachValue);
		}
		sc.close();
		
	}
}
