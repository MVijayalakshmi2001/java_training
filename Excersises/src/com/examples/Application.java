package com.examples;
import com.example.model1.Customer;
import com.example.model2.Employee;
import com.example.model3.Hotel;
import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer one = new Customer("Viji",10);
		System.out.println("Name="+one.getName());
		System.out.println("Id="+one.getId());
		
		Employee abc = new Employee(128,"Ram",50000);
		System.out.println("Employee id="+ abc.getId());
		System.out.println("Employee name="+abc.getName());
		System.out.println("Employee salary="+abc.getSalary());
		
		Hotel yummy = new Hotel("A2B","VEG","Chennai");
		System.out.println("Hotel name="+yummy.getName());
		System.out.println("Hotel type="+yummy.getType());
		System.out.println("Hotel place="+yummy.getPlace());
		
        
	}

}
