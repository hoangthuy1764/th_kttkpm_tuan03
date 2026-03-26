package iuh.fit.se.strategy;

import iuh.fit.se.factory.Book;

import java.util.List;

public interface SearchStrategy {
    void search(List<Book> books, String keyword);
}
