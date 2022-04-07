package com.task3;
import java.util.*;

import com.example.model2.Employee;



public class Application {

	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter id");
	int id=sc.nextInt();
	
	System.out.println("Enter employee name=");
	
	String name = sc.next();
	
	System.out.println("Enter employee salary=");
	
	double salary = sc.nextDouble();
	
	Employee obj = new Employee(100, name,salary);
	
	EmployeeService service = new EmployeeService();
	
	
	
	System.out.println("Employee bonus="+service.calculateBonus(obj));
	sc.close();
	}
}
