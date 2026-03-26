package iuh.fit.se.tax.decorator;

import iuh.fit.se.tax.strategy.TaxStrategy;

public class ExtraTax implements TaxStrategy {

    private TaxStrategy tax;

    public ExtraTax(TaxStrategy tax) {
        this.tax = tax;
    }

    @Override
    public double calculate(double price) {
        // gọi thuế gốc + thêm phí
        return tax.calculate(price) + 5;
    }
}