package iuh.fit.se.order.decorator;

public class InsuranceDecorator extends OrderDecorator {
    public InsuranceDecorator(OrderService s) {
        super(s);
    }

    public void process() {
        service.process();
        System.out.println("Thêm bảo hiểm");
    }
}
