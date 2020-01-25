package observers;

public class Customer implements WaitingCustomer {

    private String name;
    private String drinkOrdered;

    public Customer(String name, String drinkOrdered){
        this.name = name;
        this.drinkOrdered = drinkOrdered;
    }

    public String getName(){
        return name;
    }

    public String getDrinkOrdered(){
        return drinkOrdered;
    }

    @Override
    public void orderReady(String completedDrink){
        if (drinkOrdered.equals(completedDrink))
            exitStore();
    }

    private void exitStore() {
        System.out.println(name + ": Thank you, I've received my" +
                drinkOrdered  + " and I am leaving the store.");
    }
}
