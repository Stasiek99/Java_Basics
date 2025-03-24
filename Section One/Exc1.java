package Exc1;
import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Provide your surname: ");
        String surname = scanner.nextLine();

        String nameAndSurname = name +" " + surname;
        System.out.println("You are" + nameAndSurname);
    }
}
