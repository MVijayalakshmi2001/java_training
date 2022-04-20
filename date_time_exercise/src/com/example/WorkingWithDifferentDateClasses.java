package com.example;

import java.util.*;
import java.sql.*;
import java.sql.Date;
import java.time.*;

public class WorkingWithDifferentDateClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//step-1 creating util date
		java.util.Date date1 = new java.util.Date();
		System.out.println(date1);
		
		
		//step 2 util date to sql date
		java.sql.Date date2 = new java.sql.Date(date1.getTime());
		System.out.println(date2);
		
		//step 3 sql to localdate
		LocalDate localDate=date2.toLocalDate();
		
		System.out.println(localDate.getDayOfWeek());
		
		System.out.println(localDate.getMonthValue());
		
		
		java.sql.Date sqlDate= java.sql.Date.valueOf(localDate);
		
		System.out.println("SQL date="+sqlDate);
		
		
		
		
		
		
	}

}
