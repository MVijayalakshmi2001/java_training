package org.example.mockito.module2;

import static org.hamcrest.CoreMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.example.ifaces.ProductRepository;
import org.example.model.Product;
import org.example.service.ProductService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static  org.mockito.ArgumentMatchers.anyInt;
@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

	@Mock
	ProductRepository repo;
	
	@InjectMocks
	ProductService service;

	@DisplayName("test getbyid method should return elements if id is present")
	@Test
	void testGetById() {
		
		Product prod1=new Product(300, "Fridge", 10000.0);
		Product prod2=new Product(301, "Ac", 50000.0);

		when(repo.getById(300)).thenReturn(Optional.of(prod1));
		
		Product expected=service.getById(300);
		
		assertEquals(expected,prod1);
	}
	
	@Test
	public void shouldThrowExceptionWhenElementNotFound() {
		
	
	when(repo.getById(anyInt())).thenThrow(ArrayIndexOutOfBoundsException.class);
	
	assertThrows(NumberFormatException.class,()->
			service.getById(0));
	}

	
	
}
