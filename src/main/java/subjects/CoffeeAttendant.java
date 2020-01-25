package subjects;

import observers.Customer;
import observers.WaitingCustomer;

import java.util.ArrayList;
import java.util.List;

public class CoffeeAttendant {

    private List<Customer> customerList;
    private List<String> completedDrinks;

    public CoffeeAttendant(){
        customerList = new ArrayList<>();
        completedDrinks = new ArrayList<>();
    }

    public void takeOrder(Customer customer){
        customerList.add(customer);
        System.out.println("Coffee Attendant: '" + customer.getName()
        + ", I've started working on your " + customer.getDrinkOrdered() + ".'");
    }
    public void prepareDrink(String drinkToPrepare){
        double timeTaken = Math.random() * 10;
        try {
            Thread.sleep((long) (timeTaken) * 1000);
            completedDrinks.add(drinkToPrepare);
        } catch(InterruptedException e) {
            System.out.println("for some reason, the drink was not prepared...");
        }
        completedDrinks.add(drinkToPrepare);
    }
    public void callOutCompletedOrders(){
        for(String readyDrink : completedDrinks) {
            System.out.println("Order up: " + readyDrink);
            for(Customer customer : customerList) {
                customer.orderReady(readyDrink);
            }
        }
    }
}
