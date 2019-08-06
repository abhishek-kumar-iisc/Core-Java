package com.greatlearning.fsd.modules.payment;

import com.greatlearning.fsd.module2.seller.*;


public class NetBanking implements Payment{
	private final String name;
	
	public NetBanking(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public void pay(double amount, Seller seller) {
		System.out.println("Payment through NetBanking");
		seller.deposit(amount);
		
	}

}
