import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exc5 {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Pear", 5);
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 2);
        hashMap.put("Pineapple", 8);

        Map<String, Integer> sortedMap = new TreeMap<>(hashMap);
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // We pass the HashMap to the TreeMap constructor, which automatically sorts the elements by key
}
