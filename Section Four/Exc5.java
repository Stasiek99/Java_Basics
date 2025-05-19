class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    void greeting() {
        System.out.println("Hello, I'm " + name);
    }
}

public class Exc5 {
    public static void main(String[] args) {
        Person person = new Person("Julia");
        person.greeting();
    }
}