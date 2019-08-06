
package com.week4.resturant.model;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Dishes {

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
    public Dishes(int id, String name, DishType dishtype, int calories, int price) {
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
        final Dishes other = (Dishes) obj;
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

class SortByCaloriesAssending implements Comparator<Dishes> {
    //
    public int compare(Dishes a, Dishes b) {
        return a.calories - b.calories;
    }

}

class SortByCaloriesDesending implements Comparator<Dishes> {
    //
    public int compare(Dishes a, Dishes b) {
        return b.calories - a.calories;
    }

}

class SortByPricesAssending implements Comparator<Dishes> {
    //
    public int compare(Dishes a, Dishes b) {
        return a.price - b.price;
    }

}

class SortByPricesDesending implements Comparator<Dishes> {
    //
    public int compare(Dishes a, Dishes b) {
        return b.price - a.price;
    }

}
