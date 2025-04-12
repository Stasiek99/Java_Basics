import java.util.*;

class Book {
    String title;
    Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return author + ", " + title;
    }
}

class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

public class Exc3 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Author author1 = new Author("John", "Doe");
        Author author2 = new Author("Jacob", "Smith");

        books.add(new Book("In Desert and Wilderness", author1));
        books.add(new Book("In Desert and Janko the Musician", author2));
        books.add(new Book("In Search of Lost Time", author1));
        books.add(new Book("The Peasants", author1));
        books.add(new Book("Books AA", author1));
        books.add(new Book("Books AA", author2));

        books.sort((b1, b2) -> b2.title.compareTo(b1.title));

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
