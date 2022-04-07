package com.training;

import com.training.model.HealthInsurance;
import com.training.model.Insurance;
import com.training.model.LifeInsurance;
import com.training.model.VehicleInsurance;

public class Application {

	public static void printPremium(Insurance object) {
		
		System.out.println("Premium="+object.calculatePremium());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VehicleInsurance car = new VehicleInsurance(1010, "ramesh", "car",2019);
		
	    printPremium(car);

	    LifeInsurance life = new LifeInsurance(2020,"viji",70);
	    
	    printPremium(life);
	    
	    String[] illness = {"ent","thyroid"};
	    HealthInsurance health = new HealthInsurance(3030,"jai",illness);
	    
	    printPremium(health);
	}
}

