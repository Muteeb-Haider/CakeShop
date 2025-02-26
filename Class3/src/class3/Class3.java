package class3;

import java.util.ArrayList;
import java.util.List;

public class Class3 {
    public static void main(String[] args) {
        // Creating cakes
        Cake cake1 = new Cake("Chocolate", "Brown", 1.5f, 20.0f);
        Cake cake2 = new Cake("Vanilla", "White", 1.0f, 15.0f);
        Cake cake3 = new Cake("Strawberry", "Pink", 2.0f, 25.0f);
        Cake cake4 = new Cake("Blueberry", "Blue", 1.2f, 18.0f);
        Cake cake5 = new Cake("Red Velvet", "Red", 1.8f, 22.0f);

        // Adding cakes to list
        List<Cake> cakeList = new ArrayList<>();
        cakeList.add(cake1);
        cakeList.add(cake2);
        cakeList.add(cake3);
        cakeList.add(cake4);
        cakeList.add(cake5);

        // Creating CakeShop
        CakeShop shop = new CakeShop(cakeList);

        // Testing methods
        System.out.println("First pink cake: " + shop.firstCake("Pink"));
        System.out.println("Largest cake: " + shop.largestCake());
        System.out.println("Cheapest cake: " + shop.cheapestCake());
        System.out.println("Count of white cakes: " + shop.count("White"));
        System.out.println("Total worth of all cakes: $" + shop.totalWorth());

        // Adding a new cake
        Cake newCake = new Cake("Lemon", "Yellow", 1.6f, 19.0f);
        shop.addCake(newCake);
        System.out.println("Added new cake: " + newCake);

        // Selling a cake
        shop.sellCake(cake1);
        System.out.println("Sold cake: " + cake1);

        // Total cakes sold
        System.out.println("Total sold cakes: " + shop.totalSoldCakes(cake1));
    }
}
