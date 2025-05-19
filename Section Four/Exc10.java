class Book {
    String name;
    int year;

    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() { return name + " (" + year + ")"; }
}

public class Exc10 {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book("Clean Code", 2008));
        list.add(new Book("The Bell Jar", 1963));
        list.add(new Book("Confessions of an Economic Hit Man", 2006));
        list.add(new Book("Being There", 1970));

        for (Book b : list) {
            if (b.year == 2000) {
                System.out.println(b);
            }
        }
    }
}