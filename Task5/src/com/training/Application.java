package com.training;

public class Application {

	public static void main(String[] args) {
		
		int key=2;
		
		switch (key) {
		
		case 1:
			SavingsAccount savings=new SavingsAccount("Viji", 5000.00);
			
			savings.deposit(40000);
			
			savings.withdraw(100);
			
			break;
			
		case 2:
			BusinessAccount business=new BusinessAccount("san",25000 );
			
			business.deposit(50000);
			
			business.withdraw(500);
			
			break;

		}	
	}
}
