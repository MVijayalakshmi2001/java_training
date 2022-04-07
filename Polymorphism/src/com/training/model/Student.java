package com.training.model;

import com.training.ifaces.Conditional;

public class Student implements Conditional {

	private double markScored;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(double markScored) {
		super();
		this.markScored = markScored;
	}

	public double isMarkScored() {
		return markScored;
	}

	public void setMarkScored(double markScored) {
		this.markScored = markScored;
	}


	@Override
	public boolean test(Object value) {
		// TODO Auto-generated method stub
		String strBranch=(String)value;
		
		boolean result=false;
		if(this.markScored>80 && strBranch.equalsIgnoreCase("ece")) {
			result= true;
		}
		
		return result;
	}

}
