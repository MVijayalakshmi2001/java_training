package com.example.model3;

public class Hotel {
	private String name;
	private String type;
	private String place;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(String name, String type, String place) {
		super();
		this.name = name;
		this.type = type;
		this.place = place;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	

}
