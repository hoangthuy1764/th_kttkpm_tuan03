package iuh.fit.se;

//import iuh.fit.se.composite.*;
import iuh.fit.se.decorator.BasicBorrow;
import iuh.fit.se.decorator.Borrow;
import iuh.fit.se.decorator.ExtendedBorrow;
import iuh.fit.se.decorator.SpecialEdition;
import iuh.fit.se.factory.Book;
import iuh.fit.se.factory.BookFactory;
import iuh.fit.se.observer.NotificationService;
import iuh.fit.se.observer.Observer;
import iuh.fit.se.observer.User;
import iuh.fit.se.singleton.Library;
import iuh.fit.se.strategy.SearchByAuthor;
import iuh.fit.se.strategy.SearchByGenre;
import iuh.fit.se.strategy.SearchByTitle;
import iuh.fit.se.strategy.SearchStrategy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Library library = Library.getInstance();
        NotificationService service = new NotificationService();

        Observer user = new User("Admin");
        service.addObserver(user);

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== LIBRARY SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Show Books");
            System.out.println("3. Search Book");
            System.out.println("4. Borrow Book");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addBook(scanner, library, service);
                    break;

                case 2:
                    showBooks(library);
                    break;

                case 3:
                    searchBook(scanner, library);
                    break;

                case 4:
                    borrowBook();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void addBook(Scanner scanner,
                                Library library,
                                NotificationService service) {

        System.out.print("Type (paper/ebook/audio): ");
        String type = scanner.nextLine();

        System.out.print("Title: ");
        String title = scanner.nextLine();

        System.out.print("Author: ");
        String author = scanner.nextLine();

        System.out.print("Genre: ");
        String genre = scanner.nextLine();

        Book book = BookFactory.createBook(type, title, author, genre);

        library.addBook(book);

        service.notifyObservers("New book added: " + title);
    }

    private static void showBooks(Library library) {

        for (Book b : library.getBooks()) {
            b.display();
        }
    }

    private static void searchBook(Scanner scanner, Library library) {

        System.out.println("1. Search by Title");
        System.out.println("2. Search by Author");
        System.out.println("3. Search by Genre");

        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Keyword: ");
        String keyword = scanner.nextLine();

        SearchStrategy strategy = null;

        switch (choice) {

            case 1:
                strategy = new SearchByTitle();
                break;

            case 2:
                strategy = new SearchByAuthor();
                break;

            case 3:
                strategy = new SearchByGenre();
                break;
        }

        strategy.search(library.getBooks(), keyword);
    }

    private static void borrowBook() {

        Borrow borrow = new BasicBorrow();

        borrow = new ExtendedBorrow(borrow);
        borrow = new SpecialEdition(borrow);

        borrow.borrow();
    }
}