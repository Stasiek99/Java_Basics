package Exc1;

import java.util.Random;
import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Random generator = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = generator.nextInt(100) + 1;
        int draw;
        int counter = 0;
        System.out.println("Try to guess a random number in the range (1-100): ");
        do {
            draw = scanner.nextInt();
            counter++;
            if (draw < randomNumber) {
                System.out.println("Too low");
            } else if (draw > randomNumber) {
                System.out.println("Too high");
            }
        } while (draw != randomNumber);
        System.out.println("You guessed the number in " + counter + " tries");
    }
}
