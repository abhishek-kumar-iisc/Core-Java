
/**
 * Class Name : Restaurant Class Main Function which will act as Client
 * Functionallity: 1.the Restaurant class prints the Items/Dishes avaliable in
 * the Restaurant. 2. Prompt the users to select a dish from the available
 * dishes. 3. Displays the dish selected by the user. 4. Ask/Prompt the user to
 * pay the price of the dish. 5. Check for Invalid amount exceptions by the user
 */

// import com.week4.resturant.model.*;

public class Restaurant {

    public static void main(String args[]) {

        System.out.println("============================Please select the Dish Id and Hit Enter===================");
        System.out.println(" Dish Id:5, name: Neer-Dosa, Price: 50.0, Calories: 100 ");
        System.out.println(" Dish Id:2, name: Idli-Vada, Price: 40.00  Calories: 200 ");
        System.out.println(" Dish Id:4, name: Roti-Curry, Price: 100.00  Calories: 250 ");
        System.out.println(" Dish Id:1, name: Dosa, Price: 50.00  Calories: 300 ");
        System.out.println(" Dish Id:3, name: Pulav, Price: 80.00  Calories: 330 ");

        DishType myveg = DishType.VEG;
        Dishes dish0 = new Dishes(0, "name", myveg, 10, 10);
        Dishes dish1 = new Dishes(1, "Dosa", myveg, 300, 50);
        Dishes dish2 = new Dishes(2, "Idli-Vada", myveg, 200, 40);
        Dishes dish3 = new Dishes(3, "Pulav", myveg, 330, 80);
        Dishes dish4 = new Dishes(4, "Roti-Curry", myveg, 250, 100);
        Dishes dish5 = new Dishes(5, "Neer-Dosa", myveg, 100, 50);

    }

}