package org.example.ifaces;

import java.util.List;
import java.util.Optional;

import org.example.model.Product;

public interface ProductRepository {

	public Product add(Product prod);
	public Optional<Product> getById(int id);
	public Product deleteById(int id);
	public List<Product> findAll();
}
