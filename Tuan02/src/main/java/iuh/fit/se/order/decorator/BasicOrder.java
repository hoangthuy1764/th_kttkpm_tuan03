package iuh.fit.se.order.decorator;

public class BasicOrder implements OrderService {
    public void process() {
        System.out.println("Xử lý cơ bản");
    }
}
