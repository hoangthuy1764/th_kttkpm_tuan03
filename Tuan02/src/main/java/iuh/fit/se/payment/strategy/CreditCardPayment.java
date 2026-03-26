package iuh.fit.se.payment.strategy;

public class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Trả bằng thẻ: " + amount);
    }
}
