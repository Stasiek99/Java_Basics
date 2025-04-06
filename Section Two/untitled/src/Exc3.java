import java.util.Random;

public class Exc3 {
    public static void main(String[] args) {
        System.out.println("Fibonacci(5) = " + fibonacci(5));
        System.out.println("Fibonacci(10) = " + fibonacci(10));
        System.out.println("Fibonacci(random number) = " + fibonacci());
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) return 1;

        int a = 1;
        int b = 1;

        for (int i = 3; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static int fibonacci() {
        Random rand = new Random();
        int randomPosition = rand.nextInt(10) + 1;

        System.out.println("Random position: " + randomPosition);
        return fibonacci(randomPosition);
    }
}
