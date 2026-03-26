package iuh.fit.se.order.state;

public class NewState implements OrderState {
    public void handle(OrderContext context) {
        System.out.println("Đơn mới");
        context.setState(new ProcessingState());
    }
}