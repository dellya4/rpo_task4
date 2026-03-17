**Software developer fundamentals: Task 4**

**Interface:** 
- PaymentStrategy 

**Implements**: 
- CreditCardPayment 
- CryptoPayment 
- PayPalPayment

**Processor:**
- PaymentProcessor

**Test**:
- testCreditCard
- testCryptoCard
- testPayPalCard
- testStrategy

**Explanation:**

1. Why is Strategy better than if/else?
Strategy removes large conditional blocks and makes code easier to extend.
2. What if we add Apple Pay?
We will create a new class ApplePayPayment, which will implements PaymentStrategy.
`ApplePayPayment implements PaymentStrategy`
The basic codes aren't change.
3. Which SOLID principle does this pattern support?
Open/Closed Principle.
4. What would change if we removed the Strategy Pattern?
PaymentProcessor would have many if/else statement, the code would be harder to maintain.