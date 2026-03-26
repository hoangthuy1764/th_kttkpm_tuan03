package iuh.fit.se.payment.decorator;

import iuh.fit.se.payment.strategy.PaymentStrategy;

public class FeeDecorator extends PaymentDecorator {

    public FeeDecorator(PaymentStrategy payment) {
        super(payment);
    }

    @Override
    public void pay(int amount) {
        int fee = 10; // phí cố định

        System.out.println("Phí xử lý: " + fee);

        // cộng phí vào số tiền
        super.pay(amount + fee);
    }
}