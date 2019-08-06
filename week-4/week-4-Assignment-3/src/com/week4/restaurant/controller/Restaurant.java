package com.week4.restaurant.controller;

import java.util.*;
import com.week4.restaurant.model.*;
import com.greatlearning.fsd.module4.exceptions.*;

/**
 * Class Name : Restaurant Class Main Function which will act as Client
 * Functionality: 1.the Restaurant class prints the Items/Dishes available in
 * the Restaurant. 2. Prompt the users to select a dish from the available
 * dishes. 3. Displays the dish selected by the user. 4. Ask/Prompt the user to
 * pay the price of the dish. 5. Check for Invalid amount exceptions by the user
 */



public class Restaurant {

    @SuppressWarnings("resource")
	public static void main(String args[]) {
    	
    	/* Displaying the Menu available in the restaurant */
        System.out.println("============================Please select the Dish Id and Hit Enter===================");
        System.out.println(" Dish Id:5, name: Neer-Dosa, Price: 50.0, Calories: 100 ");
        System.out.println(" Dish Id:2, name: Idli-Vada, Price: 40.00  Calories: 200 ");
        System.out.println(" Dish Id:4, name: Roti-Curry, Price: 100.00  Calories: 250 ");
        System.out.println(" Dish Id:1, name: Dosa, Price: 50.00  Calories: 300 ");
        System.out.println(" Dish Id:3, name: Pulav, Price: 80.00  Calories: 330 ");
        
        /*Creating dish objects */
        DishType myveg = DishType.VEG;
        //Dishes dish0 = new Dishes(0, "name", myveg, 10, 10);
        Dish dish1 = new Dish(1, "Dosa", myveg, 300, 50);
        Dish dish2 = new Dish(2, "Idli-Vada", myveg, 200, 40);
        Dish dish3 = new Dish(3, "Pulav", myveg, 330, 80);
        Dish dish4 = new Dish(4, "Roti-Curry", myveg, 250, 100);
        Dish dish5 = new Dish(5, "Neer-Dosa", myveg, 100, 50);
        
        /* Prompting the User to select a dish */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Select a dish based on the ID ");
        
        int userOption = sc.nextInt();
        int userDishPrice = 0;
        
        switch(userOption) {
        case 1:
        	System.out.println("==============You have selected===============");
        	dish1.displayDishes();
        	userDishPrice = dish1.getPrice();
        	break;
        case 2:
        	System.out.println("==============You have selected===============");
        	dish2.displayDishes();
        	userDishPrice = dish2.getPrice();
        	break;
        case 3:
        	System.out.println("==============You have selected===============");
        	dish3.displayDishes();
        	userDishPrice = dish3.getPrice();
        	break;
        case 4:
        	System.out.println("==============You have selected===============");
        	dish4.displayDishes();
        	userDishPrice = dish4.getPrice();
        	break;
        case 5:
        	System.out.println("==============You have selected===============");
        	dish5.displayDishes();
        	userDishPrice = dish5.getPrice();
        	break;
        default:
        	System.out.println("Invalid Selection PLease Try again Later :-( ");
        	break;	
        }
        
        sc.nextLine();
        System.out.println(" Please Enter your Name: ");
        String userName = sc.nextLine();
        System.out.println("Hi "+userName);
        System.out.println("Please pay the bill of Rs "+userDishPrice);
        int userAmount = sc.nextInt();
        try{
        	if(userAmount < userDishPrice) {
        		throw new InvalidAmountException("User Amount is less than the Dish Price");
        	}
        	else if(userAmount == userDishPrice) {
        		System.out.println("=========Thanks for order========");
        	}
        	else if(userAmount >= userDishPrice) {
        		System.out.println("=======Thanks for your Orders. Please collect the change of Rs "+ (userAmount-userDishPrice));
        	}
        	
        }catch(InvalidAmountException ex) {
        	System.out.println("Caugth the Invalid amount exception");
        	//Print the message from MyException object 
        	System.out.println(ex.getMessage());
        }
        
        
        /*Creating orders */
        Order order1 = new Order(dish1, "Abhishek Kumar");
        Order order2 = new Order(dish2, "Pradeep Kumar");
        Order order3 = new Order(dish3, "Gatuam S");
        Order order4 = new Order(dish4, "Ankana Kumari");
        
        Set<Order> myOrderSet = new HashSet<Order>();
        myOrderSet.add(order1);
        myOrderSet.add(order2);
        myOrderSet.add(order3);
        myOrderSet.add(order4);
        
        
        
        
        sc.close();
    }
    
}

