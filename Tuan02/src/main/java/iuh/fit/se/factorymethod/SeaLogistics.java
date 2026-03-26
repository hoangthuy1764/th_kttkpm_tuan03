package iuh.fit.se.factorymethod;

public class SeaLogistics extends Logistics {
    protected Transport createTransport() {
        return new Ship();
    }
}
