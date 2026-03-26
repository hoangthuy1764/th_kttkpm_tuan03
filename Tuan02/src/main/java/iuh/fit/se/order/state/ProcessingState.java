package iuh.fit.se.order.state;

public class ProcessingState implements OrderState {
    public void handle(OrderContext context) {
        System.out.println("Đang xử lý");
        context.setState(new DeliveredState());
    }
}