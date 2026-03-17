package tests;

import org.junit.jupiter.api.Test;
import payment.PaymentProcessor;
import payment.CreditCardPayment;

public class testCreditCard {
    @Test
    PaymentProcessor processor = new PaymentProcessor();
    processor.setStrategy(new CreditCardPayment());
    processor.processPayment(1200);
}
