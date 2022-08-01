package org.example;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GreetingTest {

	@Test
	@DisplayName(value = "Test the get message return a string of length 8 characters")
	void testMaxLength() {
		
		Greeting grtObj = new Greeting();
		
		int actual=grtObj.getMessage().length();
		
		int expected = 5;
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	@DisplayName(value = "Test the birthday wish method does not return null")
	void testBirthDayWish() {
		
		Greeting grtObj = new Greeting();
		
		String actual=grtObj.birthDayWish("ramesh");
		
		assertNotNull(actual);

	}
	
	@Test
	@DisplayName(value = "Test Birthday wish method should return Happy birthday with user name suffixed ")
	void testBirthDayWishWithName() {
		
		Greeting grtObj = new Greeting();
		
		String name = "ramesh";
		
		String actual=grtObj.birthDayWish(name);
		
		String expected ="Happy Birthday "+name ;
		
		assertEquals(expected, actual);
		
	}
	
	
	
}
