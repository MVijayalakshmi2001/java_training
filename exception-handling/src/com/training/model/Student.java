package com.training.model;

import com.training.exception.RangeCheckException;

public class Student {

	private int rollnumber;
	private String firstName;
	private double markScored;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollnumber, String firstName, double markScored) throws RangeCheckException {
		super();
		
		if(markScored<0) {
			throw new RangeCheckException("mark should be positive integer[0-100]");
		}else {
		this.rollnumber = rollnumber;
		this.firstName = firstName;
		this.markScored = markScored;
		}	
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public double getMarkScored() {
		return markScored;
	}
	public void setMarkScored(double markScored) {
		if(markScored<0) {
			try {
				throw new RangeCheckException("mark should be positive integer[0-100]");
			} catch (RangeCheckException e) {
				e.printStackTrace();
			}
		}else {
		this.markScored = markScored;
		}
	}
	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", firstName=" + firstName + ", markScored=" + markScored + "]";
	}
	
	
}
