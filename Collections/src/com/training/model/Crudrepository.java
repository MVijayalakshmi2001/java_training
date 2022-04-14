package com.training.model;

import java.util.*;

import com.training.services.Book;

public interface Crudrepository {

	 public boolean add(Book book);
	public Book findbyId(int id);
	public boolean remove(Book book);
	public List<Book> findAll();
	public Book update(Book oldBook,Book recentBook);
	
	
}
