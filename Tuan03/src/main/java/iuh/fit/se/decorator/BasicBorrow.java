package iuh.fit.se.decorator;

public class BasicBorrow implements Borrow {

    @Override
    public void borrow() {
        System.out.println("Borrowing book");
    }
}
