package com.example;

import java.sql.Connection;
import java.time.LocalDate;

import com.example.dao.MemberRepository;
import com.example.dao.ProductService;
import com.example.entity.Invoice;
import com.example.entity.Member;
import com.example.entity.Product;
import com.example.util.ConnectionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void member() {
		

		Connection con;
		
        try {
		con= ConnectionFactory.getOracleConnection();
        
		MemberRepository repo = new MemberRepository(con);
		
		//System.out.println(con);
		
		Member toAdd=new Member(401,"lachu", "karur", LocalDate.of(2022, 5, 5), "annual", 100.00, 5, 100.00);
	
		int rowAdd = repo.add(toAdd);
		
		System.out.println("RowAdded="+ rowAdd);
		
		repo.findAll().forEach(System.out::println);
		
		
    }catch (Exception e) {
		// TODO: handle exception
    	e.printStackTrace();
	}

}
	
	public static void product() {
		
		try {
	
		
		Connection con = ConnectionFactory.getPostgressConnection();
		
		ProductService service = new ProductService(con);
		
		Product toAdd=new Product(504,"FRIDGE",25000);
		
		int rowAdded =service.addProduct(toAdd);
		
		System.out.println("RowsAdded="+rowAdded);
		
		service.findAll().forEach(System.out::println);
		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
    public static void main( String[] args ) {

    	//member();
    	
    	//product(); 
    	
    	Connection con = ConnectionFactory.getOracleConnection();
		
		ProductService service = new ProductService(con);
		
		//Product kathli=new Product(73, "Moti laddu", 500.00);
		
		//Product jamun=new Product(44," badusha",450.00);
    	 
        //service.usingTxn(kathli, jamun);
		
		Product appliance=new Product(105, "car", 90000.00);
        
        Invoice data=new Invoice(222, "shyam", 7, 105);
        
        service.usingTxnWithCatchBlock(appliance, data);
        
        
}
}
