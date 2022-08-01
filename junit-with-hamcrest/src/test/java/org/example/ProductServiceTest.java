package org.example;

import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.fail;
import static org.hamcrest.MatcherAssert.assertThat;
import org.example.services.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProductServiceTest {

	ProductService service = null;
	@BeforeEach
	void init() {
		service=new ProductService();
	}

	@DisplayName(value = "Test findDiscount method returns 0.20 "
			+ "or above for tv and laptops")
	@Test
	void testFindDiscount() {

		double actual=service.findDiscount("tv");

		assertThat(actual, is(greaterThan(0.19)));

	}
	
	@DisplayName(value = "Test findDiscount method returns 0.10 or above for fridge, washing machine")
	@Test
	void testFindDiscountCaseTwo() {
		
		double actual=service.findDiscount("fridge");
		
		assertThat(actual, greaterThan(0.09));

	}
	
	@DisplayName(value = "Test findProducts method returns a list of four brands")
	@Test
	void testFindProducts() {
		
		int actual = service.findProducts().length;
		
		int expected=4;
		
		assertThat(actual, is(equalTo(expected)));

	}
	
	@DisplayName(value = "Test findProducts method returns Dell,Lenova,HP,Azus")
	@Test
	void testFindProductsName() {
		
		String[] actual = service.findProducts();
		
	    assertThat(actual, is(arrayContaining("Dell", "Lenova", "Hp","Azus")));

	}
			
	
}