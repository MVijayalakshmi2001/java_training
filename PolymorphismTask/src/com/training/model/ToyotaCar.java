package com.training.model;

import com.training.ifaces.Automobile;

public class ToyotaCar implements Automobile {

	@Override
	public String color() {
		// TODO Auto-generated method stub
		return "blue";
	}

	@Override
	public String model() {
		// TODO Auto-generated method stub
		return "suv";
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 1000000;
	}

}
