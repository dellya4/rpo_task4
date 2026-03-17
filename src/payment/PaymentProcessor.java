package payment;

public class PaymentProcessor {

    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy paymentStrategy) {
        this.strategy = paymentStrategy;
    }

    public void processPayment(int amount) {
        strategy.pay(amount);
    }
}
