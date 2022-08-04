package org.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.example.ifaces.ProductRepository;
import org.example.model.Product;


public class ProductService {


	private ProductRepository repo;

	public ProductService(ProductRepository repo) {
		super();
		this.repo = repo;
	}
	
	public Product add(Product prod) {

		return this.repo.add(prod);
	}

	public List<Product> findAll(){
		
		return this.repo.findAll();
	}
	
//	public Product getById(int id) {
//		
//		Product found=null;
//		for(Product eachProduct:this.productList) {
//			if(eachProduct.getId()==id) {
//				found=eachProduct;
//			}
//			else {
//				throw new RuntimeException("Element Not Found");
//			}
//		}
//		return found;
//		
//	}	
	
	public Product getById(int id) {

		Product found = this.repo.getById(id).get();
//		found.setId(2000);
		return found;
		}
	
	
	
		
		
}
