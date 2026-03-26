package iuh.fit.se.factory;

public class AudioBook extends Book {
    public AudioBook(String title, String author, String genre) {
        super(title, author, genre);
    }

    @Override
    public void display() {
        System.out.println("AudioBook: " + title);
    }
}
