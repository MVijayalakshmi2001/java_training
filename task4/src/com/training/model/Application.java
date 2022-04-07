package com.training.model;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Address address= new Address(10," North ","Egatoor ","Chennai " );
		MobileBill ram = new MobileBill("ram",999999999l, "prepaid",address);
		MobileBill viji=new MobileBill("viji",999999998l, "postpaid",address);
		System.out.println(ram.amountCalculation());
		System.out.println(viji.amountCalculation());
		System.out.println(ram.getAddress());
		
		
	}

}
