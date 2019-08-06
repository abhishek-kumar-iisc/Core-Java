package com.week4.restaurant.model;

public class Order {
	
	private static int orderId = 1;
	private Dish dish;
	private String customerName;
	
	public Order(Dish dish, String customerName) {
		super();
		this.dish = dish;
		this.customerName = customerName;
		Order.orderId = Order.orderId + 1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((dish == null) ? 0 : dish.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (dish == null) {
			if (other.dish != null)
				return false;
		} else if (!dish.equals(other.dish))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [dish=" + dish + ", customerName=" + customerName + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	

}