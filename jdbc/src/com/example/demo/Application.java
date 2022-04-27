package com.example.demo;

import java.sql.*;
import java.util.Optional;

import com.example.demo.services.ProductService;
import com.example.entity.Product;

public class Application {
	
	public static void main(String[] args) {
		
		Connection con;
		
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR", "HR");
			
			ProductService service = new ProductService(con);
			
			Product toAdd = new Product(702,"ups",15000.00);
			
			int rowAdded = service.addProduct(toAdd);
			
			System.out.println("Row Added = "+ rowAdded);
			
			int rowDeleted = service.deleteById(702);
			
			System.out.println("Row deleted="+ rowDeleted);
			
			
			Optional<Product> found= service.findById(10);
			
			if(found.isPresent()) {
				
				System.out.println(found.get());
			}else {
				
				System.out.println("Product with the given id is not present");
			}
			
			int rowsUpdated=service.updatePriceByName("laptop", 5000);

			System.out.println("Row updated="+rowsUpdated);
			
			service.findAll().forEach(System.out::println);

		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}
}
