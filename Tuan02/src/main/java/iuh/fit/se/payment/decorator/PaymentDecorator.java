package iuh.fit.se.payment.decorator;

import iuh.fit.se.payment.strategy.PaymentStrategy;

public abstract class PaymentDecorator implements PaymentStrategy {

    protected PaymentStrategy payment;

    public PaymentDecorator(PaymentStrategy payment) {
        this.payment = payment;
    }

    @Override
    public void pay(int amount) {
        payment.pay(amount); // gọi hành vi gốc
    }
}