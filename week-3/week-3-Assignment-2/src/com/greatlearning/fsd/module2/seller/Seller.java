package com.greatlearning.fsd.module2.seller;

import com.greatlearning.fsd.module2.models.*;
import com.greatlearning.fsd.modules.payment.*;

public class Seller {
	
	private int id;
	private String name;
	private Address address;
	private Item items[] = new Item[100];
	private int itemCount;
	private long orderId = 100;
	private double accountBalance;
	
	
	public Seller(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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
	
	public Item[] getItems() {
		return items;
	}
	
	public void setItems(Item[] items) {
		this.items = items;
	}
	
	public int getItemCount() {
		return itemCount;
	}
	
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	
	public long getOderId() {
		return orderId;
	}
	
	public void setOderId(long oderId) {
		this.orderId = oderId;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
	/* Utility function to add the money to the Seller */
	public void deposit(double amount) {
		this.accountBalance += amount;
	}
	
	public void addItem(Item item) {
		if(itemCount < 100) {
			this.items[itemCount] = item;
			itemCount++;
		}
		else {
			System.out.println("Can not add the Item : Cart is full :-(");
		}
	}
	
	public long order(Item.ItemType itemType, Payment payment) {
		Item item = null;
		for(int index = 0; index < items.length; index++) {
			if(items[index] != null && items[index].getItemType() == itemType) {
				item = items[index];
				payment.pay(item.getPrice(), this);
				items[index] = null;
				break;
			}
		}
		return item != null ? ++ orderId : 0;
	}
	
	public int getSelectedItemCount(Item.ItemType itemType) {
		int count =0;
		
		for(int index = 0; index < items.length; index++) {
			if(items[index] != null && items[index].getItemType() == itemType) {
				count++;
			}
			
		}
		return count;
	}	
}
