package ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Seller {
	private Address address;
	private int id = 2000;
	private String name;
	private long contactDetails;
	private int count;
	public Seller() {}
	
	public Seller(String name, Address address, long contactDetails){
		++this.id;
		this.name = name;
		this.contactDetails = contactDetails;
		this.address = address;
	}
	public int getCount() {
		return this.count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}

class Poorvika extends Seller{
	public int poorvikaItemCount;
	private List<Item> poorvikaInventory = new ArrayList<Item>();

	public Poorvika(String name, Address address, long contactDetails, Item inventory, int count){
		super(name, address, contactDetails);
		this.poorvikaInventory.add(inventory);
		this.poorvikaItemCount += count;
	}
	
	public int getPoorvikaItemCount() {
		return poorvikaItemCount;
	}

	public void setPoorvikaItemCount(int poorvikaItemCount) {
		this.setCount(poorvikaItemCount);
	}

	public List<Item> getPoorvikaInventory() {
		return poorvikaInventory;
	}

	public void setPoorvikaInventory(List<Item> poorvikaInventory) {
		this.poorvikaInventory = poorvikaInventory;
	}

	public int itemCountUpdate(int purchaseQuantity){
		poorvikaItemCount -= purchaseQuantity;
		return poorvikaItemCount; 
	}
}

class Croma extends Seller{
	public int cromaItemCount;
	private List<Item> cromaInventory = new ArrayList<Item>();
	
	public Croma( String name, Address address, long contactDetails, Item inventory, int count){
		super( name, address, contactDetails);
		this.cromaInventory.add(inventory);
		this.cromaItemCount += count;
	}
	
	public int getCromaItemCount() {
		return this.getCount();
	}

	public void setCromaItemCount(int cromaItemCount) {
		this.setCount(cromaItemCount);
	}

	public List<Item> getCromaInventory() {
		return cromaInventory;
	}

	public void setCromaInventory(List<Item> cromaInventory) {
		this.cromaInventory = cromaInventory;
	}

	public int itemCountUpdate(int purchaseQuantity){
		cromaItemCount -= purchaseQuantity;
		return cromaItemCount; 
	}
}

class Soch extends Seller{
	private static int sochItemcount;
	private List<Item> sochInventory = new ArrayList<Item>();
	
	public Soch( String name, Address address, long contactDetails,Item inventory, int count){
		super( name, address, contactDetails);
		this.sochInventory.add(inventory);
		this.sochItemcount += count;
	}
	
	public static int getSochItemcount() {
		return sochItemcount;
	}

	public static void setSochItemcount(int sochItemcount) {
		this.setCount(sochItemcount);
	}

	public List<Item> getSochInventory() {
		return sochInventory;
	}

	public void setSochInventory(List<Item> sochInventory) {
		this.sochInventory = sochInventory;
	}

	public int itemCountUpdate(int purchaseQuantity){
		sochItemcount -= purchaseQuantity;
		return sochItemcount; 
	}
}

class Zara extends Seller{
	private static int zaraItemCount;
	private List<Item> zaraInventory = new ArrayList<Item>();

	public Zara( String name, Address address, long contactDetails, Item inventory,int count){
		super( name, address, contactDetails);
		this.zaraInventory.add(inventory);
		this.zaraItemCount +=count;
	}
	
	public static int getZaraItemCount() {
		return zaraItemCount;
	}

	public static void setZaraItemCount(int zaraItemCount) {
		Zara.zaraItemCount = zaraItemCount;
	}

	public List<Item> getZaraInventory() {
		return zaraInventory;
	}

	public void setZaraInventory(List<Item> zaraInventory) {
		this.zaraInventory = zaraInventory;
	}

	public int itemCountUpdate(int purchaseQuantity){
		zaraItemCount -= purchaseQuantity;
		return zaraItemCount; 
	}
}