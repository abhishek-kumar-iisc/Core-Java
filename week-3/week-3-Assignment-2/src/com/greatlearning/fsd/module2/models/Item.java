package com.greatlearning.fsd.module2.models;

public class Item {
	
	
	public enum ItemType{
		IPHONE,SAMSUNG,REEBOK,RAYMOND
	}
	
	private int id;
	private String name;
	private String description;
	private int price;
	private Item.ItemType itemType;
	private Category category; 
	
	public Item(int id, Item.ItemType itemType, String description, int price,Category category) {
		super();
		this.id = id;
		this.itemType = itemType;
		this.description = description;
		this.price = price;
		this.category = category;
	}

	public Item.ItemType getItemType() {
		return itemType;
	}

	public void setItemType(Item.ItemType itemType) {
		this.itemType = itemType;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
