package com.greatlearning.fsd.modules.payment;

import com.greatlearning.fsd.module2.seller.*;

public interface Payment {
	public void pay(double amount, Seller seller);
}
