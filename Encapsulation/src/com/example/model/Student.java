package com.example.model;

public class Student {
	
	private int rollNumber;
	private String firstName;
	private String branch;
	private double markScored;
	public int getRollNumber() {
		return rollNumber;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNumber, String firstName, String branch, double markScored) {
	    super();
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.branch = branch;
		this.markScored = markScored;
	}

	

	public Student(int rollNumber, String firstName, String branch) {
		this(rollNumber, firstName, branch, 99);
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.branch = branch;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getFirstName() {
		return firstName;
	}
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getMarkScored() {
		return markScored;
	}
	protected void setMarkScored(double markScored) {
		this.markScored = markScored;
	}
	public String getBranch() {
		return branch;
	}
	private void setBranch(String branch) {
		this.branch = branch;
	}
	
	

}
