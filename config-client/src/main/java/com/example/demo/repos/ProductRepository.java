package com.example.demo.repos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;
import com.example.demo.ifaces.CrudRepository;

@Repository
public class ProductRepository implements CrudRepository<Product> {

	private JdbcTemplate template;
	
	@Autowired
	public ProductRepository(JdbcTemplate template) {
		super();
		this.template = template;
	}

	
	@Override
	public List<Product> findAll() {
		
		String sql= "select * from vijim_product";
		
		return template.query(sql, BeanPropertyRowMapper.newInstance(Product.class));
	}

	
}
