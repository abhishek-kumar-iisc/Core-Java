package com.greatlearning.fsd.modules.payment;

import com.greatlearning.fsd.module2.seller.Seller;

public class DebitCard implements Payment{
	private String name;
	
	public DebitCard(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	@Override
	public void pay(double amount, Seller seller) {
		System.out.println("Payment through the Debit Card");
		seller.deposit(amount);
	}
}
