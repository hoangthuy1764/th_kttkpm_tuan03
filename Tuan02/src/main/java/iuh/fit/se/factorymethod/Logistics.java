package iuh.fit.se.factorymethod;

public abstract class Logistics {
    public void planDelivery() {
        Transport t = createTransport();
        t.deliver();
    }

    protected abstract Transport createTransport();
}
