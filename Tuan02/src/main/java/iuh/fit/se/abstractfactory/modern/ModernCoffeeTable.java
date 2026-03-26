package iuh.fit.se.abstractfactory.modern;

import iuh.fit.se.abstractfactory.products.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {
    public void putCoffee() {
        System.out.println("Modern Table");
    }
}