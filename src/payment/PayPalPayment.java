package payment;

public class PayPalPayment implements PaymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("Processing PayPal card payment of " + amount + "₸");
    }
}
