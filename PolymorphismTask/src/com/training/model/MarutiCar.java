package com.training.model;

import com.training.ifaces.Automobile;

public class MarutiCar implements Automobile {

	@Override
	public String color() {
		// TODO Auto-generated method stub
		return "red";
	}

	@Override
	public String model() {
		// TODO Auto-generated method stub
		return "i20";
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 500000;
	}

	
}
