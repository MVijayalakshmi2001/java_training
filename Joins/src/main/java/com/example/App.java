package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

import com.example.demo.services.Services;
import com.example.entity.Customer;
import com.example.entity.LoanApplication;
import com.example.ifaces.CrudRepository;
import com.example.util.ConnectionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Connection con;
		
        
		con= ConnectionFactory.getOracleConnection();
		
		//System.out.println(con);
		
		Services serv = new Services(con);
		
		
		Customer cus=new Customer(767, "reyaa",979809879l, 500.00);
		
		LoanApplication toAdd= new LoanApplication(666,cus, 600.00);
		
		int rowAdded=serv.add(toAdd);
		
		System.out.println("RowAdded="+ rowAdded);
		
		
		
		//Optional<LoanApplication> findId=serv.findById(43);
		
		//System.out.println(findId);
		
		//serv.findAll().forEach(System.out::println);

    }
}
