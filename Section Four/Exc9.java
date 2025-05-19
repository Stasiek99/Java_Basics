class Bookk {
    String name;
    String author;
    int age;

    public Bookk(String name, String author, int age) {
        this.name = name;
        this.author = author;
        this.age = age;
    }

    boolean isEqual(Bookk other) {
        return this.name.equals(other.name) && this.author.equals(other.author) && this.age == other.age;
    }

    @Override
    public String toString() { return "\"" + name + "\" " + author + " (" + age + ")"; }
}

public class Exc9 {
    public static void main(String[] args) {
        Bookk b1 = new Bookk("Witcher", "Andrzej Sapkowski", 1993);
        Bookk b2 = new Bookk("Witcher", "Andrzej Sapkowski", 1993);
        Bookk b3 = new Bookk("Witcher", "A. Sapkowski", 1993);

        System.out.println(b1 + " vs " + b2 + " => " + b1.equals(b2));
        System.out.println(b1 + " vs " + b3 + " => " + b1.equals(b3));
    }
}