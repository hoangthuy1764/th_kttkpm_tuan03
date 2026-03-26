package iuh.fit.se.order.state;

public class OrderContext {
    private OrderState state = new NewState();

    public void setState(OrderState state) {
        this.state = state;
    }

    public void process() {
        state.handle(this);
    }
}
