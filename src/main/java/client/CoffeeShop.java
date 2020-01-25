package client;

import observers.Customer;
import subjects.CoffeeAttendant;

public class CoffeeShop {
    public static void main(String[] args) {

        Customer ryan = new Customer("Ryan", "Chocolate Mocha");
        Customer andy = new Customer("Andy", "Fruity Pebbles");

        CoffeeAttendant coffeeAttendant = new CoffeeAttendant();
        coffeeAttendant.takeOrder(ryan);
        coffeeAttendant.takeOrder(andy);

        // prepare drink
        coffeeAttendant.prepareDrink("Chocolate Mocha");
        coffeeAttendant.prepareDrink("Fruity Pebbles");

        // order up
        coffeeAttendant.callOutCompletedOrders();
    }
}
