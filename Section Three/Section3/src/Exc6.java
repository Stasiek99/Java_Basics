import java.util.*;

public class Exc6 {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Pear", 5);
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 2);
        hashMap.put("Pineapple", 8);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());
        list.sort(Comparator.comparing(Map.Entry::getValue));

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
