package com.week4.resturant.model;
import java.util.*;

public class Client {
    public static void main(String args[]) {
        /**
         * Creating dishes
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("============== Welcome =====================================");
        System.out.println(" 1 => To sort the dishes in the increasing order of calories");
        System.out.println(" 2 => To sort the dishes in the decreasing order of calories");
        System.out.println(" 3 => To sort the dishes in the increasing order of calories");
        System.out.println(" 4 => To sort the dishes in the decreasing order of calories");
        System.out.println("=============================================================");
        int option = sc.nextInt();
        // terenary operator
        sc.close();
        Dishes dish1 = new Dishes(1, "Paneer001", dishType.VEG, 100, 100);
        Dishes dish2 = new Dishes(2, "Paneer002", dishType.VEG, 1000, 150);
        Dishes dish3 = new Dishes(3, "Paneer003", dishType.VEG, 150, 200);
        Dishes dish4 = new Dishes(4, "Paneer004", dishType.VEG, 1500, 300);
        Dishes dish5 = new Dishes(5, "Paneer005", dishType.VEG, 500, 500);
        Dishes dish6 = new Dishes(6, "Paneer006", dishType.VEG, 750, 850);
        Dishes dish7 = new Dishes(7, "Paneer007", dishType.VEG, 800, 250);
        Dishes dish8 = new Dishes(8, "Paneer008", dishType.VEG, 850, 350);
        Dishes dish9 = new Dishes(9, "Paneer009", dishType.VEG, 900, 950);

        /**
         * Creating ArrayList of Dishes
         */

        List<Dishes> dishes = new ArrayList<Dishes>();
        /**
         * Adding dishes to array list
         */
        dishes.add(dish1);
        dishes.add(dish2);
        dishes.add(dish3);
        dishes.add(dish4);
        dishes.add(dish5);
        dishes.add(dish6);
        dishes.add(dish7);
        dishes.add(dish8);
        dishes.add(dish9);

        // Printing elements
        dishes.forEach((user) -> user.displayDishes());

        if (option == 1) {
            /**
             * Sorting the Dishes Lists using calories
             */
            System.out.println(
                    "==========================Sorting by calories assending =================================");
            Collections.sort(dishes, new SortByCaloriesAssending());
            dishes.forEach((user) -> user.displayDishes());
        } else if (option == 2) {
            /**
             * Sorting the Dishes List using calories
             */
            System.out.println(
                    "=========================Sorting by calories desending ===================================");
            Collections.sort(dishes, new SortByCaloriesDesending());
            dishes.forEach((user) -> user.displayDishes());
        } else if (option == 3) {
            /**
             * Sorting the Dishes List using price Assending
             */
            System.out.println(
                    "==========================Sorting by prices asending =======================================");
            Collections.sort(dishes, new SortByPricesAssending());
            dishes.forEach((user) -> user.displayDishes());
        } else if (option == 4) {
            /**
             * Sorting the Dishes List using price Descending
             */
            System.out.println(
                    "==========================Sorting by prices asending =======================================");
            Collections.sort(dishes, new SortByPricesDesending());
            dishes.forEach((user) -> user.displayDishes());
        }

    }

}