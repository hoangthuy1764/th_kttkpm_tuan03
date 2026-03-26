package iuh.fit.se.order.state;

public interface OrderState {
    void handle(OrderContext context);
}
