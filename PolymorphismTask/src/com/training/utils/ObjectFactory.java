package com.training.utils;

import com.training.ifaces.Automobile;
import com.training.model.MarutiCar;
import com.training.model.ToyotaCar;

public class ObjectFactory {

	public Automobile getObject(int key) {
		switch(key) {
		case 1:
			return new MarutiCar();
		case 2:
			return new ToyotaCar();
		
		default:
			return null;
		}
	}
	public void printQuote(Automobile poly) {
		System.out.println("color= "+poly.color());
		System.out.println("model= "+poly.model());
		System.out.println("price= "+poly.price());
	}
	
}