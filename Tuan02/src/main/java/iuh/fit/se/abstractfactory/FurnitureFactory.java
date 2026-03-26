package iuh.fit.se.abstractfactory;

import iuh.fit.se.abstractfactory.products.Chair;
import iuh.fit.se.abstractfactory.products.CoffeeTable;
import iuh.fit.se.abstractfactory.products.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}
