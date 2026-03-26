package iuh.fit.se.strategy;

import iuh.fit.se.factory.Book;

import java.util.List;

public class SearchByAuthor implements SearchStrategy {

    @Override
    public void search(List<Book> books, String keyword) {

        for (Book b : books) {
            if (b.getAuthor().contains(keyword))
                b.display();
        }
    }
}