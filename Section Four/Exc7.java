import java.time.LocalDate;

class Bookkk {
    String title;
    int releaseYear;

    public Bookkk(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    int age() { return LocalDate.now().getYear() - releaseYear; }
}

public class Exc7 {
    public static void main(String[] args) {
        Bookkk book = new Bookkk("Hopscotch", 1963);
        System.out.println("Book age: " + book.age());
    }
}