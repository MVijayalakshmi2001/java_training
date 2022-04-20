package com.training;

import java.io.File;
import com.training.services.BookService;

public class Application {

	public static void main(String[] args) {

		
//		Book java=new Book(103, " Java", "BG", 980);
//		
		BookService service=new BookService();
//		
//		boolean result= service.writeToFile(new File("Book.txt"),java);
//		
//		if(result) {
//			
//			System.out.println("One Record Added to file");
//			
//		}		
		service.readFromFile(new File("Book.txt")).forEach(System.out::println);
	}

}
