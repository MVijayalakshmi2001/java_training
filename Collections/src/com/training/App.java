package com.training;
import java.util.*;

import com.training.model.Crudrepository;

import com.training.services.Book;

import com.training.services.BookServices;
import com.training.utils.BookNameComparator;


public class App {
	public static void print(List<Book> books) {
		for(Book eachBook:books) {
			System.out.println(eachBook);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names=new ArrayList<String>();
		
		names.add("Anand");
		names.add("Zahir");
		names.add("Pavan");
		names.add("Chandru");
		names.add("Ramesh");
		
		System.out.println(names);
		
		Collections.sort(names);
		System.out.println(names);

		Book java=new Book(101,"Java", "suba", 450);
		Book spring=new Book(102, "Spring", "Mad", 650);
		Book maven=new Book(103, "Maven", "Hari", 750);
		Book html=new Book(104, "Html", "Priya", 850);
		Book python=new Book(105, "Python", "Sathya", 950);
		
		Crudrepository service=new BookServices();
		
		System.out.println("Is Added="+service.add(java));
		service.add(spring);
		service.add(maven);
		service.add(html);
		service.add(python);
		
		List<Book> bookList=service.findAll();
		
		Collections.sort(bookList);
		System.out.println("Sort by Booknumber");
		print(bookList);
		
		Collections.sort(bookList,new BookNameComparator());
		System.out.println("Sort by Bookname");
		print(bookList);
		
		
	}
}
