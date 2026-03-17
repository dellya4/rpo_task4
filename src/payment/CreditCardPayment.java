package payment;

public class CreditCardPayment implements PaymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("Processing Credit card payment of " + amount + " ₸");
    }
}
