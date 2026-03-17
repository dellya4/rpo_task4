import payment.CreditCardPayment;
import payment.CryptoPayment;
import payment.PayPalPayment;
import payment.PaymentProcessor;

public class Main {
    public static void main(String[] args) {

        PaymentProcessor processor = new PaymentProcessor();

        processor.setStrategy(new CreditCardPayment());
        processor.processPayment(10000);

        processor.setStrategy(new CryptoPayment());
        processor.processPayment(50000);

        processor.setStrategy(new PayPalPayment());
        processor.processPayment(8000);
    }
}