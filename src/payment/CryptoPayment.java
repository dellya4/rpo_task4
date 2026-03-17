package payment;

public class CryptoPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Processing Crypto card payment of " + amount + " ₸ ");
    }
}
