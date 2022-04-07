package com.training.model;

public class HealthInsurance extends Insurance {
	
	private String[] preExistingDiseases;
	

	public HealthInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}


	public HealthInsurance(int policyNumber, String policyHolderName, String[] preExistingDiseases) {
		super(policyNumber, policyHolderName);
		this.preExistingDiseases = preExistingDiseases;
	}

	@Override
	public double calculatePremium() {
		
		double premium=10000;
		
		for(String eachItem:preExistingDiseases) {
		
			if(eachItem.equalsIgnoreCase("bp") || eachItem.equalsIgnoreCase("sugar")){
				premium = 15000;
			}
		}
		
		return premium;
	}
	
}

//
//	@Override
//	public double calculatePremium() {
//		
//		double premium=10000;
//		
//		for(String eachItem:preExistingDiseases) {
//			String item=eachItem.toLowerCase();
//			if(eachItem.equals("bp") || eachItem.equals("sugar")){
//				premium = 15000;
//			}
//		}
//		
//		return premium;
//	}
//
//}
