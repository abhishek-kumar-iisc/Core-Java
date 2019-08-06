package com.week4.restaurant.model;

import java.lang.*;
import java.io.*;
import java.util.Comparator;

public class Dish{

  public int id;
  public String name;
  public DishType dishtype;
  public int calories;
  public int price;

  /**
   * 
   * 
   * public int id; public String name; public dishType dishtype; public int
   * calories; public int price;
   * 
   * /**
   * 
   * @param id
   * @param name
   * @param dishtype
   * @param calories
   * @param price
   */
  public Dish(int id, String name, DishType dishtype, int calories, int price) {
      this.id = id;
      this.name = name;
      this.dishtype = dishtype;
      this.calories = calories;
      this.price = price;
  }

  public void displayDishes() {
      System.out.println("Dish Id is " + this.id + " Dish Name is " + this.name + " Dish has Calories = "
              + this.calories + " Dish price is " + this.price + " Dish type " + this.dishtype);
  }

  public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	/**
   * Override Overriding the equals
   */
  @Override
  public boolean equals(Object obj) {
      if (obj == null) {
          return false;
      }
      if (getClass() != obj.getClass()) {
          return false;
      }
      final Dish other = (Dish) obj;
      if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
          return false;
      }
      return true;

  }

  /**
   * Override OVerriding the hashCode
   */
  @Override
  public int hashCode() {
      int hash = 3;
      hash = 19 * hash + (this.name != null ? this.name.hashCode() : 0);
      return hash;
  }

  /**
   * Override Overriding the toString()
   */
  public String toString() {
      return "Dish{" + " id " + id + ", name" + name + ", calories" + calories + ", price" + price + '}';
  }

}

class SortByCaloriesAssending implements Comparator<Dish> {
  //
  public int compare(Dish a, Dish b) {
      return a.calories - b.calories;
  }

}

class SortByCaloriesDesending implements Comparator<Dish> {
  //
  public int compare(Dish a, Dish b) {
      return b.calories - a.calories;
  }

}

class SortByPricesAssending implements Comparator<Dish> {
  //
  public int compare(Dish a, Dish b) {
      return a.price - b.price;
  }

}

class SortByPricesDesending implements Comparator<Dish> {
  //
  public int compare(Dish a, Dish b) {
      return b.price - a.price;
  }

}
