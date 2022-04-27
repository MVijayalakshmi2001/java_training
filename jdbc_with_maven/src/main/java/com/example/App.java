package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

import com.example.dao.MemberRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    
        Connection con;
		
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR", "HR");
			
			MemberRepository service = new MemberRepository(con);
			
			service.findAll().forEach(System.out::println);

		
			
		}catch(SQLException e) {
    	
    	e.printStackTrace();
		}
    }
    
}
