package iuh.fit.se.factory;

public class PaperBook extends Book {
    public PaperBook(String title, String author, String genre) {
        super(title, author, genre);
    }

    @Override
    public void display() {
        System.out.println("Paper Book: " + title);
    }
}
