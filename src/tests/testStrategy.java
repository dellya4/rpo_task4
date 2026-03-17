package tests;

import org.junit.jupiter.api.Test;
import payment.CreditCardPayment;
import payment.PaymentProcessor;

public class testStrategy {

    @Test
    public void testStrategySwitch() {
        PaymentProcessor processor = new PaymentProcessor();

        processor.setStrategy(new CreditCardPayment());
        processor.processPayment(400);

        processor.setStrategy(new CreditCardPayment());
        processor.processPayment(800);
    }
}
