
package com.training;

import com.training.exception.RangeCheckException;
import com.training.model.Student;
import com.training.services.ExceptionHandling;
import com.training.services.StudentService;
import java.util.*;
public class Application {

	public static void main(String[] args) {
		
		Student ram=null;
		try {
			ram = new Student(1010,"ramesh",95);
		} catch (RangeCheckException e1) {
			
			e1.printStackTrace();
		}
		
		StudentService service = new StudentService(ram);
		
		System.out.println(service.sendDetails());
		
		StudentService service2=new StudentService(ram);
		
		try {
			System.out.println(service2.findRank());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.err.println("Name is not passed");
		}
		
		ExceptionHandling exHandling=new ExceptionHandling();
		
		exHandling.usingArrayIndexException(args);
		
		exHandling.usingNumberFormatException("45");
		
		try {
			System.out.println(exHandling.understandFinallyBlock());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Since try with resource-Scanner will be closed automatically
		
		try(Scanner scan=new Scanner(System.in)){
			
			System.out.println("Enter Number");
			int num=scan.nextInt();
			System.out.println(num);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
