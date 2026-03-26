package iuh.fit.se.factory;

public class EBook extends Book {
    public EBook(String title, String author, String genre) {
        super(title, author, genre);
    }

    @Override
    public void display() {
        System.out.println("EBook: " + title);
    }
}
