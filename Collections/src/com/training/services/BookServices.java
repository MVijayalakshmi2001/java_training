package com.training.services;

import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;

import com.training.model.Crudrepository;

public class BookServices implements Crudrepository {

	private ArrayList<Book> bookList;
	
	
	public BookServices() {
		super();
		this.bookList=new ArrayList<>();
	}

	@Override
	public boolean add(Book book) {

		return bookList.add(book);
	}

	@Override
	public Book findbyId(int id) {
		
		Book found=null;
		for(Book eachBook:this.bookList) {
			if(eachBook.getBookNumber()==id) {
				found=eachBook;
			}
		}
		return found;
	}

	@Override
	public boolean remove(Book book) {
		// TODO Auto-generated method stub
		return bookList.remove(book);
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return this.bookList;
	}

	@Override
	public Book update(Book oldBook,Book newBook) {

		if(this.bookList.contains(oldBook)) {
			
			int idxPos=this.bookList.indexOf(oldBook);
			
			this.bookList.set(idxPos, newBook);
			
		}
		return newBook ;
	}

	public List<Book> getBooksGrtThan(double price){
		
		
		List<Book> grtThanList=new ArrayList<>();
		
		Predicate<Double> grtThan=(value)->value>800.00;
		
		
		this.bookList.forEach(book->
		{
			double bookPrice=book.getPrice();
			if(grtThan.test(bookPrice)) {
				System.out.println(book);
				grtThanList.add(book);
				
			}
		});
		return grtThanList ;
		
		
		
	}

}
