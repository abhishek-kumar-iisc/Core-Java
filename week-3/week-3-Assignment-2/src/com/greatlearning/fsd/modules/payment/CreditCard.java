package com.greatlearning.fsd.modules.payment;


import com.greatlearning.fsd.module2.seller.*;

public class CreditCard implements Payment{
	private String name;
	
	public CreditCard(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	@Override
	public void pay(double amount, Seller seller) {
		System.out.println("Payment through the Credit Card");
		seller.deposit(amount);
	}
}
