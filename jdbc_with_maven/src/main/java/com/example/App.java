package com.example;

import java.sql.Connection;

import com.example.dao.MemberRepository;
import com.example.util.ConnectionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    
        Connection con;
		
		con= ConnectionFactory.getOracleConnection();
		
		MemberRepository repo = new MemberRepository(con);
		
		System.out.println(con);
//			
//			repo.findAll().forEach(System.out::println);
    }
    
}
