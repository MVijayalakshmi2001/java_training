

import java.util.List;

import com.training.model.Crudrepository;
import com.training.services.Book;
import com.training.services.BookServices;

public class Application {

	public static void print(List<Book> books) {
//		for(Book eachBook:books) {
//			System.out.println(eachBook);
//		}
//		
		books.forEach(System.out::println);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book java=new Book(101,"Java", "suba", 450);
		Book spring=new Book(102, "Spring", "Mad", 650);
		Book maven=new Book(103, "Maven", "Hari", 750);
		Book html=new Book(104, "html", "Priya", 850);
		Book python=new Book(105, "python", "Sathya", 950);
		
		Crudrepository service=new BookServices();
		
		
		System.out.println("Is Added="+service.add(java));
		service.add(spring);
		service.add(maven);
		service.add(html);
		service.add(python);
		
		
		List<Book> bookList1=service.findAll();
		
		print(service.findAll());
		System.out.println(bookList1.size());
		
//		for(Book eachBook:bookList) {
//			System.out.println(eachBook);
//		}
		
		System.out.println("Greater than 800");
		List<Book> bookList=((BookServices)service).getBooksGrtThan(800.00);
		bookList.forEach(System.out::println);
		
		
	
	
		
		
		System.out.println("=====");
		
		Book foundBook=service.findbyId(102);
		System.out.println("Found Book="+foundBook);
		
		service.remove(maven);
		
		System.out.println("========");
		
		print(service.findAll());
		
		
		System.out.println(bookList1.size());
		
//		List<Book> bookList2=service.findAll();
//		
//		for(Book eachBook:bookList) {
//			System.out.println(eachBook);
//		}
		
		Book react=new Book(205,"ReactJS","Rahul",6850);
		
		service.add(react);
		
		print(service.findAll());
		
		Book reactNew=new Book(205,"ReactJS","Rahul kanwal",7850);
		
		service.update(react,reactNew);
		
		Book javaNew=new Book(101,"Java", "subashi", 950);
		
		service.update(java,javaNew);
		
		System.out.println("======AFTER UPDATE======");
		
		print(service.findAll());
		
		
		System.out.println("Using Streams" );
		
		((BookServices)service).findBooksGrtThan(1000).forEach(System.out::println);
		
		
		System.out.println("====Getting only bookname using map method====");
		List<String> nameList=((BookServices)service).getBookNames();
		nameList.forEach(System.out::println);
		
		
		System.out.println("=====");
		
		List<String> grtThanNineHundred=((BookServices)service).getBookNumeGrtThanPrice(900);
		grtThanNineHundred.forEach(System.out::println);
	}	
	
	
	
}
