package com.training;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

import java.util.List;

import com.training.services.*;

public class UsingStreams {
	
	public static void useDistinct(List<Book> bookList) {
		
		
		//for each is also a terminal operator
		
		bookList.stream().distinct().forEach(System.out::println);
		
	}
	
	public static void collectToSet(List<Book> bookList) {
		
		Set<Book> bookSet=bookList.stream().filter(e->e.getPrice()>500).collect(toSet());
		
		bookSet.forEach(System.out::println);
	}
	
	
	public static void collectToMap(List<Book> bookList) {
		
		//Set<Book> bookSet=bookList.stream().collect(toSet());
		
		//adding distinct to remove duplicate elements 
		Map<String, Double> values=bookList.stream().
				filter(e->e.getPrice()>500).distinct().
				collect(toMap(Book::getBookName,Book::getPrice));
		
		values.forEach((key,value)->System.out.println(key+","+value));
	}
	
	
	public static void findMaxPrice(List<Book> bookList) {
		
		Optional<Book> optional=bookList.stream().max(Comparator.comparing(Book::getPrice));
		
		if(optional.isPresent()) {
			System.out.println("Maximum size="+optional.get().getPrice());
		}
	}
	
	public static void findMinPrice(List<Book> bookList) {
		
		Optional<Book> optional=bookList.stream().min(Comparator.comparing(Book::getPrice));
		
		if(optional.isPresent()) {
			System.out.println("Minimum size="+optional.get().getPrice());
		}
	}
	
//	public static void countOfBook(List<Book> bookList) {
//		
//		 long countResult=bookList.stream().filter( e->e.getBookName().contains('v')).count();
//		 System.out.println(countResult);
//		 
//	}
	
	public static void countBooksWithGivenChar(List<Book> bookList,String srchstring ) {
		
		 long countResult=bookList.stream().filter( e->e.getBookName().contains(srchstring)).count();
		 System.out.println(srchstring+" occurs = "+countResult+" times");
		 
	}

	
	public static void main(String[] args) {

		Book java=new Book(101,"Java", "suba", 450);
		Book spring=new Book(102, "Spring", "Mad", 650);
		Book maven=new Book(103, "Maven", "Hari", 750);
		Book html=new Book(104, "Html", "Priya", 850);
		Book python=new Book(105, "Python", "Sathya", 950);
		Book mavenNew=new Book(103, "Maven", "Hari", 750);
		Book htmlNew=new Book(104, "Html", "Priya", 850);
		
		List<Book> bookList=Arrays.asList(java,spring,maven,html,python,mavenNew,htmlNew);
		
		
		int key=6;
		
		switch (key) {
		case 1:
			useDistinct(bookList);
			break;
			
		case 2:
			collectToMap(bookList);
			break;
			
		case 3:
			collectToSet(bookList);
			break;
			
		case 4:
			findMaxPrice(bookList);
			break;
			
		case 5:
			findMinPrice(bookList);
			break;
			
		case 6:
			countBooksWithGivenChar(bookList, "v");
			//countOfBook(bookList);
			break;
			
		default:
			break;
		}
		
		//useDistinct(bookList);
		
		//collectToSet(bookList);
		
		//collectToMap(bookList);
		
		//findMaxPrice(bookList);
		
		
	}


}
