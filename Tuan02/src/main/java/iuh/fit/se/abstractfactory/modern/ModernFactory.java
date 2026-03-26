package iuh.fit.se.abstractfactory.modern;

import iuh.fit.se.abstractfactory.FurnitureFactory;
import iuh.fit.se.abstractfactory.products.Chair;
import iuh.fit.se.abstractfactory.products.CoffeeTable;
import iuh.fit.se.abstractfactory.products.Sofa;

public class ModernFactory implements FurnitureFactory {
    public Chair createChair() { return new ModernChair(); }
    public Sofa createSofa() { return new ModernSofa(); }
    public CoffeeTable createCoffeeTable() { return new ModernCoffeeTable(); }
}
