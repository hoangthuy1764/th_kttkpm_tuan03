package iuh.fit.se.order.strategy;

public class EconomyShipping implements ShippingStrategy {

    @Override
    public void ship() {
        System.out.println("Giao hàng tiết kiệm (3-5 ngày)");
    }
}