import java.util.Arrays;

public class Exc6 {
    public static void main(String[] args) {
        calculateStatistics(1, 2, 3, 4, 5, 6, 7, 8, 9);
        calculateStatistics(10.5, 2.6, 8.4, 4.2);
        calculateStatistics();
    }

    public static void calculateStatistics(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No data for calculations");
            return;
        }

        double sum = Arrays.stream(numbers).sum();
        double average = sum / numbers.length;

        Arrays.sort(numbers);
        double median;
        int n = numbers.length;
        if (n % 2 == 0) {
            median = (numbers[n / 2 - 1] + numbers[n / 2]) / 2.0;
        } else {
            median = numbers[n / 2];
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Median: " + median);
    }
}
