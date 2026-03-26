package iuh.fit.se.decorator;

public class SpecialEdition extends BorrowDecorator {

    public SpecialEdition(Borrow borrow) {
        super(borrow);
    }

    @Override
    public void borrow() {
        super.borrow();
        System.out.println("Special Edition Book");
    }
}
