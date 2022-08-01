package org.example.services;


public class ProductService {

	public double findDiscount(String product) {
		
		double discount=0.10;
		
		if(product.equals("tv") || product.equals("laptop")) {
			
			discount=0.20;
		}
		
		return discount;
	}
	
	public String[] findProducts(){
		
		String[] strings= {"Dell","Lenova","Hp","Azus"};
		
		return strings;
	}
}
