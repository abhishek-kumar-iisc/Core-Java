package ecommerce;

public class Address {

	 private String FlatNo;
	 private String street;
	 private String city;
	 private String state;
	 private int pinCode;

	public Address() {}
	
	public Address (String FlatNo, String street, String city, String state, int pinCode){
	   this.FlatNo = FlatNo;
	   this.street = street;
	   this.city = city;
	   this.state = state;
	   this.pinCode = pinCode;
	 }

}
