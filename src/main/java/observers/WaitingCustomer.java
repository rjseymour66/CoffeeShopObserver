package observers;

public interface WaitingCustomer {

    public void orderReady(String preparedDrink);
    public String getName();
    public String getDrinkOrdered();
}
