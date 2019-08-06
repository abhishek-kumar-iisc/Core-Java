package com.greatlearning.fsd.modules.payment;

import com.greatlearning.fsd.module2.seller.Seller;

public class Wallet implements Payment{
	private final String name;
	
	public Wallet(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public void pay(double amount, Seller seller) {
		System.out.println("Payment through Wallet");
		seller.deposit(amount);
		
	}

}
