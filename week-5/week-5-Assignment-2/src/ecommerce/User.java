package ecommerce;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {
		private int count;
		private Address address;
		private static int id = 5000;
		private String name;
		private long contactDetails;
		private List<Item> item = new ArrayList<Item>();
		private Cart cart = new Cart();

		public User() {}
		
		public User(String name, Address address, long contactDetails){
			++this.id;
			this.name = name;
			this.contactDetails = contactDetails;
			this.address = address;
			this.count = 50;
		}
		public void addItem(Item items, int quantity, Seller seller){
			this.cart.addToCart(items,quantity,seller);
		}
		public void removeItem(Item items, int quantity, Seller seller){
			this.cart.removeFromCart(items, quantity, seller);
		}
		public void userInfo(){
			System.out.println("User name : "+this.name+"\nUser ID : "+this.id);
		}
		public void pay(double amount){
			
			this.pay(amount);
		}
	}
	class Cart{
	    private int noOfItems;
	    private int quantity;
	    private Set<Item> item = new HashSet<Item>();
	    private Seller seller;
	    private int count = 0;
	    public void addToCart(Item item, int quantity, Seller seller){
	        this.item.add(item);
	        this.quantity = quantity;
	        this.noOfItems = this.noOfItems + quantity;
			this.seller = seller;
			this.seller.
			if(count >= quantity){
				count -= quantity;
				
			}
			else{
				System.out.println("Only "+count+" items left in stock. Try again later");
			}
		}
		
	    public void removeFromCart(Item items, int quantity,  Seller seller){
			
			for(int index = 0; index < this.items.length ; index ++){
	            if( this.items[index]  == items.name){ 
	                if(this.quantity[index] >= quantity){
	                    this.quantity[index] = this.quantity[index] - quantity;
						this.noOfItems = this.noOfItems - quantity;
						
						int count= seller.getCount();
						count += thinoOfItems;
						this.setCount(count);
	                }
	                else if(this.quantity[index] == 0){
	                    System.out.print("Quantity is already empty");
	                }
	            }
	            else {
	                System.out.println("Item not found");
	            }

	        }
	    }

	    public void cartDisplay(){
			System.out.println("ITEMS IN YOUR CART ARE\nItems \t\t Quantity \t\t Seller");
			System.out.println();
	    }
}
