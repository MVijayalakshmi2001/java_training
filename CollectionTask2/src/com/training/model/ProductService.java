package com.training.model;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ProductService {
	
	private TreeSet<Product> products;

	

	public ProductService() {
		super();
		// TODO Auto-generated constructor stub
	}



	public TreeSet<Product> getProducts() {
		return products;
	}



	public void setProducts(TreeSet<Product> products) {
		this.products = products;
	}



	public ProductService(TreeSet<Product> products) {
		super();
		this.products = products;
	}

	


	public Set<Product> getTopThree(){
		
		Iterator<Product> itr=products.iterator();
		
		TreeSet<Product> newSet=new TreeSet<>();
		
		int idx=1;
		
		while(itr.hasNext()) {
			
			
			newSet.add(itr.next());
	
			idx++;
	
			if(idx>3) {
				break; 
			}
		}
	return newSet;
		
		
		
	}
	
}
