package com.training.model;

public class Address {

	private int doorNumber;
	private String streetName;
	private String city;
	private String district;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int doorNumber, String streetName, String city, String district) {
		super();
		this.doorNumber = doorNumber;
		this.streetName = streetName;
		this.city = city;
		this.district = district;
	}

	public int getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.doorNumber+this.streetName+this.city+this.district;
	}
	
}
