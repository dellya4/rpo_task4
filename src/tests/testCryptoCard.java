package tests;

import payment.CryptoPayment;
import payment.PaymentProcessor;

public class testCryptoCard {

    public void testCryptoCardPayment() {
        PaymentProcessor processor = new PaymentProcessor();
        processor.setStrategy(new CryptoPayment());
        processor.processPayment(2500);
    }
}
