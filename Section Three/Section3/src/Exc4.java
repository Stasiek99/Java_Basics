import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title");
        String text = scanner.nextLine();
        scanner.close();

        String[] words = text.toLowerCase().split("\\W+");
        Map<String, Integer> map = new TreeMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
