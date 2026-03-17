package tests;

import org.junit.jupiter.api.Test;
import payment.CryptoPayment;
import payment.PaymentProcessor;

public class testCryptoCard {

    @Test
    public void testCryptoCardPayment() {
        PaymentProcessor processor = new PaymentProcessor();
        processor.setStrategy(new CryptoPayment());
        processor.processPayment(2500);
    }
}
