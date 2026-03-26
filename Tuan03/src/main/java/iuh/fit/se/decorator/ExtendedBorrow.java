package iuh.fit.se.decorator;

public class ExtendedBorrow extends BorrowDecorator {

    public ExtendedBorrow(Borrow borrow) {
        super(borrow);
    }

    @Override
    public void borrow() {
        super.borrow();
        System.out.println("Extended borrowing time");
    }
}