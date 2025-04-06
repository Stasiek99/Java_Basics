public class Exc2 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialRecursively(5));
        System.out.println(factorial(15));
        System.out.println(factorialRecursively(15));
        System.out.println(factorial(1));
        System.out.println(factorialRecursively(1));
    }

    public static long factorial(long x) {
        long result = 1;
        for (long i = 2; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public static long factorialRecursively(long x) {
        if (x == 0 || x == 1) {
            return 1;
        }
        return x * factorialRecursively(x - 1);
    }
}
