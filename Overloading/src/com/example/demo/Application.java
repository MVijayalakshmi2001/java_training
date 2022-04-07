package com.example.demo;
import java.util.*;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name");
		
		String name = sc.next();
		
		System.out.println("Enter the Farenheit Temp");
		
		double farenTemp = sc.nextDouble();
		
		Converter convObj = new Converter();
		
		System.out.println(convObj.convert(name));
		
		System.out.println("Celsius temp="+convObj.convert(farenTemp));
		
		System.out.println("Enter the amount");
		
		double amt = sc.nextDouble();
		
		System.out.println("Enter the current to convert 1-USD 2-USD");
		
		int frm = sc.nextInt();
		
		System.out.println(convObj.convert(amt, frm));
		
		
		
		sc.close();

	}

}
