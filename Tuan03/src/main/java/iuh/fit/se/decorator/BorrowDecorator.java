package iuh.fit.se.decorator;

public abstract class BorrowDecorator implements Borrow {

    protected Borrow borrow;

    public BorrowDecorator(Borrow borrow) {
        this.borrow = borrow;
    }

    public void borrow() {
        borrow.borrow();
    }
}
