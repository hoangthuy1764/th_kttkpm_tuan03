package iuh.fit.se;

import iuh.fit.se.factorymethod.*;
import iuh.fit.se.abstractfactory.*;
import iuh.fit.se.abstractfactory.modern.*;

import iuh.fit.se.order.state.*;
import iuh.fit.se.order.decorator.*;

import iuh.fit.se.tax.strategy.TaxStrategy;
import iuh.fit.se.tax.strategy.VATTax;
import iuh.fit.se.tax.decorator.*;

import iuh.fit.se.payment.strategy.PaymentStrategy;   // ✅ FIX Ở ĐÂY
import iuh.fit.se.payment.strategy.CreditCardPayment;
import iuh.fit.se.payment.decorator.*;

public class Main {

    public static void main(String[] args) {

        // ===== FACTORY METHOD =====
        System.out.println("=== FACTORY METHOD ===");
        Logistics road = new RoadLogistics();
        road.planDelivery();

        Logistics sea = new SeaLogistics();
        sea.planDelivery();


        // ===== ABSTRACT FACTORY =====
        System.out.println("\n=== ABSTRACT FACTORY ===");
        FurnitureFactory factory = new ModernFactory();
        factory.createChair().sitOn();
        factory.createSofa().lieOn();
        factory.createCoffeeTable().putCoffee();


        // ===== STATE =====
        System.out.println("\n=== STATE ===");
        OrderContext order = new OrderContext();
        order.process();
        order.process();


        // ===== DECORATOR ORDER =====
        System.out.println("\n=== DECORATOR ORDER ===");
        OrderService service = new InsuranceDecorator(new BasicOrder());
        service.process();


        // ===== TAX =====
        System.out.println("\n=== TAX ===");
        TaxStrategy tax = new ExtraTax(new VATTax());
        System.out.println("Thuế: " + tax.calculate(100));


        // ===== PAYMENT =====
        System.out.println("\n=== PAYMENT ===");
        // System.out.println(new CreditCardPayment());
        PaymentStrategy payment =
                new FeeDecorator(new CreditCardPayment());
        payment.pay(100);
    }
}