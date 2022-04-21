package com.training;

import java.io.File;

import com.training.model.Book;

import com.training.services.BookService;

public class AppForStreams {

	public static void main(String[] args) {

		
	
		BookService service=new BookService();
		
		File file=new File("book.ser");
		
		int ch=2;
		
		if(ch==1) {
	
			Book book=new Book(7, "Oracle", "Narayan", 450);
			
			boolean result = service.writeToStream(file, book);
		
		if(result) {
			
			System.out.println("One Record Serialized");
		}
		}else {
			
			Book fromFile = (Book) service.readFromStream(file);
			
			System.out.println(fromFile);
			
		}
		
		
	}
	
}
