package com.greatlearning.fsd.module2.models;

public class Address {
	private int flatNumber;
	private String street;
	private String city;
	private String state;
	private int pinCde;
	
	public Address(int flatNumber, String street, String city, String state, int pinCde) {
		super();
		this.flatNumber = flatNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pinCde = pinCde;
	}
	
	public int getFlatNumber() {
		return flatNumber;
	}
	
	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public int getPinCde() {
		return pinCde;
	}
	
	public void setPinCde(int pinCde) {
		this.pinCde = pinCde;
	}
	

}
