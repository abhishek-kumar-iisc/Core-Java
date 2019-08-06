package com.greatlearning.fsd.module2.user;

import com.greatlearning.fsd.module2.models.*;

public class User {
	private int id;
	private String name;
	private Address address;
	private String contactDetails;
	
	
	/**
	 * User Constructor 
	 * */
	public User(int id, String name, Address address, String contactDetails) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contactDetails = contactDetails;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getContactDetails() {
		return contactDetails;
	}
	
	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}
	
	
	

}
