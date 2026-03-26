package iuh.fit.se.factorymethod;

public class RoadLogistics extends Logistics {
    protected Transport createTransport() {
        return new Truck();
    }
}
