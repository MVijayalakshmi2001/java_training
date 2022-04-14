package com.training;

import java.util.Set;

import java.util.TreeSet;

import com.training.model.Product;
import com.training.model.ProductService;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p1=new Product(101, "Shampoo", 10000);
		Product p2=new Product(102, "Soap", 9800);
		Product p3=new Product(103, "Detergent", 9500);
		Product p4=new Product(103, "Cosmetics", 9600);
		Product p5=new Product(103, "Groceries", 8400);
		
		TreeSet<Product> products=new TreeSet<>();
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		
		ProductService service=new ProductService(products);
		
		System.out.println(service.getTopThree());
		
	}

}
