package tests;

import org.junit.jupiter.api.Test;
import payment.PayPalPayment;
import payment.PaymentProcessor;

public class testPayPalCard {

    @Test
    public void testPayPalCardPayment() {
        PaymentProcessor processor = new PaymentProcessor();
        processor.setStrategy(new PayPalPayment());
        processor.processPayment(10000);
    }
}
