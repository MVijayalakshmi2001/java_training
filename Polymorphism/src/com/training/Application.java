package com.training;

import com.training.ifaces.Conditional;
import com.training.models.NewObjectFactory;
import com.training.utils.ObjectFactory;

public class Application {

	public static void main(String[] args) {

		ObjectFactory factory=new NewObjectFactory();
		
		Conditional proObj=factory.getConditional(1);
		Conditional stuObj=factory.getConditional(2);
		Conditional principalObj=factory.getConditional(3);
		
		
		System.out.println("Allowance="+factory.getValue(proObj,"chennai"));
		System.out.println("Allowance="+factory.getValue(stuObj, "30"));
		System.out.println("Allowance="+factory.getValue(principalObj, "engg"));
		
		
	}

}
