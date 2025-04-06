import java.util.Scanner;

public class Exc5 {
    public static class Calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Select operation (+, -, *, /): ");
            char operation = scanner.next().charAt(0);

            double result;
            boolean correctOperation = true;

            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero!");
                        scanner.close();
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Error: Invalid operation!");
                    correctOperation = false;
                    result = 0;
            }

            if (correctOperation) {
                System.out.println("Result: " + result);
            }
            scanner.close();
        }
    }
}
