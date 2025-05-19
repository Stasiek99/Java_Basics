class Dog {
    String name;
    int age;

    void bark() {
        System.out.println(imie + " barks");
    }
}

public class Exc2 {
    public static void main(String[] args) {
        Dog junior = new Dog();
        junior.imie = "Junior";
        junior.wiek = 3;
        junior.bark();
    }
}