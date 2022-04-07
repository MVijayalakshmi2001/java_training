package com.training;

import org.w3c.dom.css.Counter;

import com.training.ifaces.CheckCondition;
import com.training.ifaces.Conditional;
import com.training.ifaces.Function;
import com.training.services.CurrencyConverter;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//subtype = new subtype
		//CurrencyConverter conv = new CurrencyConverter();
		
		//supertype=new subtype
		Function conv=new CurrencyConverter();
		double response = conv.apply(200);
		
		System.out.println(Function.COUNTER);
		
		System.out.println(response);
		
		//line 12,14 and 17 are same
		
		System.out.println(conv.apply(300));

		
		if(conv instanceof CheckCondition) {
			CheckCondition obj=(CheckCondition)conv;
			System.out.println("Is Discount Allowed="+obj.test(300));
		}else {
			System.out.println("cannot cast");
		}
		
		Conditional condObj=new DiscountCalculator();
		System.out.println(condObj.test(6000));
		System.out.println(condObj.negate(6000));
	}

}
