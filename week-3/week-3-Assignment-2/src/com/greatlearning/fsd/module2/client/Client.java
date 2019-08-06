package com.greatlearning.fsd.module2.client;

/* Custom Package import */
import com.greatlearning.fsd.module2.models.*;
import com.greatlearning.fsd.module2.seller.*;
import com.greatlearning.fsd.module2.user.*;
import com.greatlearning.fsd.modules.payment.*;

/* Standard Java Package import */
import java.lang.*;
import java.util.Scanner;
import java.io.*;

/*
 * Client Class for an eCommerce application
 * 1. There will be items. Each item will have id, name, description, price
 * 2. A category can have a sub category
 * 3. Items will belong to a specific category/sub category
 * 4. There will be multiple Sellers
 * 5. Sellers will send multiple items within two categories
 * 6. The Seller will keep item count which show the no of items available
 * 7. Seller will have an id, name, and address and contact Details
 * 
 * */


public class Client {
	
	public static void main(String args[]) {
		Seller sellers[] = populateData();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please select the item form the menu below");
		System.out.println("1 => Iphone");
		System.out.println("2 => Samsung");
		System.out.println("3 => Reebook");
		System.out.println("4 => Raymond");
		
		int option = sc.nextInt();
		System.out.println("Please select the seller");
		Item.ItemType selectedItemType = null;
		switch(option) {
			case 1:
					selectedItemType = Item.ItemType.IPHONE;
					break;
			case 2:
					selectedItemType = Item.ItemType.SAMSUNG;
					break;
			case 3:
					selectedItemType = Item.ItemType.REEBOK;
					break;
			case 4:
					selectedItemType = Item.ItemType.RAYMOND;
					break;
		
		}
		
		if(selectedItemType == null) {
			System.out.println("PLease select a valid Option from 1 to 4");
		}
		else {
			//Fetch the seller having the item type
			Seller[] availableSellers = new Seller[sellers.length];
			int sellerCount = 0;
			seller : for(int index =0;  index < sellers.length; index++) {
				Seller seller = sellers[index];
				//System.out.println("Current Seller "+ seller.getName() )
				Item[] items = seller.getItems();
				
				items: for(int loop = 0; loop < items.length; loop++) {
						if(items[loop] != null && (items[loop].getItemType() == selectedItemType)) {
						availableSellers[sellerCount] = sellers[index];
						sellerCount++;
						break items;
						}
				}
			}
			int limit = 0;
			while(limit < availableSellers.length && availableSellers[limit].getItemCount() < 0) {
				System.out.println((limit +1) +"=>" + availableSellers[limit].getItemCount());
				limit++;
				
			}
			int selectedSellerIndex = sc.nextInt();
			if(selectedSellerIndex > availableSellers.length) {
				System.out.println("Please enter a valid seller option");
			}else {
				Seller selectedSeller = availableSellers[selectedSellerIndex -1];
				System.out.println("==============================================");
				System.out.println("Available items : "+ selectedSeller.getSelectedItemCount(selectedItemType));
				System.out.println("Select 1 for Order or 2 for cancel");
				int selectedOption = sc.nextInt();
				if( selectedOption == 1) {
					System.out.println("Please enter the Payment Type");
					System.out.println("1 => CreditCard ");
					System.out.println("2 => Debit Card ");
					System.out.println("3 => NetBanking ");
					System.out.println("4 => Wallet ");
					
					int selectedPaymentOption = sc.nextInt();
					Payment payment = null;
					switch(selectedPaymentOption) {
						case 1: 
							payment = new CreditCard("ICICI");
							break;
						case 2:
							payment = new DebitCard("SBI");
							break;
						case 3:
							payment = new NetBanking("HDFC");
							break;
						case 4:
							payment = new Wallet("AMAZONWALLET");
							break;
					}
					if(payment != null) {
						long billNo = selectedSeller.order(selectedItemType, payment);
						System.out.println("Thanks for Shopping with us: Your reciept number is");
						System.out.println("===================================================");
						System.out.println("Updated avaiable items : " + selectedSeller.getSelectedItemCount(selectedItemType));
						System.out.println("Seller Balance :" + selectedSeller.getAccountBalance());
					}
					else {
						System.out.println("Not a valid Payment method ...");
					}
				}
				
			}
		}
		
		sc.close();
				
	}
	
	
	public static Seller[] populateData() {
		Address address1 = new Address(10, "18th Ave", "mast", "kalandar", 1000);
		Address address2 = new Address(10, "18th Ave", "Banglaore", "kalandar", 2000);
		Address address3 = new Address(10, "18th Ave", "mast", "kalandar", 1);
		Address address4 = new Address(10, "18th Ave", "mast", "kalandar", 1);
		
		Category mobileCategory = new Category(1, null, Categories.MOBILE);
		Category fashionCategory = new Category(2, null, Categories.FASHION);
		
		Item iPhone1 = new Item(1, Item.ItemType.IPHONE, "I-Phone-X",600000, mobileCategory);
		Item iPhone2 = new Item(1, Item.ItemType.IPHONE, "I-Phone-X",600000, mobileCategory);
		Item iPhone3 = new Item(1, Item.ItemType.IPHONE, "I-Phone-X",600000, mobileCategory);
		Item iPhone4 = new Item(1, Item.ItemType.IPHONE, "I-Phone-X",600000, mobileCategory);
		Item iPhone5 = new Item(1, Item.ItemType.IPHONE, "I-Phone-X",600000, mobileCategory);
		Item iPhone6 = new Item(1, Item.ItemType.IPHONE, "I-Phone-X",600000, mobileCategory);
		
		Item reebok = new Item(2, Item.ItemType.REEBOK,"REEBOK shoe", 2000, fashionCategory);
		Item shirt = new Item(2, Item.ItemType.RAYMOND,"REEBOK shoe", 2000, fashionCategory);
		
		Seller sellers[] = new Seller[2];
		
		Seller wsRetail = new Seller(1, "WSRetails", address1);
		Seller oNigma   = new Seller(2, "ONigma", address2);
		
		wsRetail.addItem(iPhone1);
		wsRetail.addItem(iPhone5);
		wsRetail.addItem(reebok);
		
		oNigma.addItem(iPhone4);
		oNigma.addItem(shirt);
		
		sellers[0] = wsRetail;
		sellers[1] = oNigma;
		
		return sellers;
		
	}

}
