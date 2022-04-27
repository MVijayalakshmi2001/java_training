package com.training.services;

import com.training.ifaces.AgeCondition;
import com.training.ifaces.Conditional;

public class StudentResultService<T> implements Conditional<Double>,AgeCondition<T> {

	
	@Override
	public boolean test(Double t) {
		// TODO Auto-generated method stub
		return t>80;
	}

	@Override
	public boolean negate(Double value) {

		
		// completely overriding 
		if(value>100) {
			return true;
			
		}else {
			return false;
		}
		
		//calling one of the supertype
		//boolean result1=Conditional.super.negate(value);
		//ewturn result1;
		
		//calling both the supertype
		//boolean result2=AgeCondition.super.negate(value);
		
//		if(result1 && result2) {
//			
//			return true;
//			
//		}else {
//		
//			return false;
//		}
	
}
}
