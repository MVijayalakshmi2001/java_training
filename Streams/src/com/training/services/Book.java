package com.training.services;

public class Book implements Comparable<Book> {

	private int bookNumber;
	private String bookName;
	private String bookAuthor;
	private double price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookNumber, String bookName, String bookAuthor, double bookId) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.price = bookId;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public double getPrice() {
		return price;
	}
	public void setBookId(double price ) {
		this.price = price ;
	}
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", price="
				+ price + "]";
	}
	@Override
	public int compareTo(Book otherObj) {
		
		if(otherObj.bookNumber<this.bookNumber) return 1;
		if(otherObj.bookNumber>this.bookNumber) return -1;
		return 0;
		
		//return this.bookName.compareTo(otherObj.bookName);
	}
	
	
}
