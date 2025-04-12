import java.util.*;

public class Exc1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 1000000; i++) {
            list.add(i);
        }

        Set<Integer> set = new HashSet<>(list);

        System.out.println("Set: ");
        checkingAddingTime(set);
        System.out.println("List: ");
        checkingAddingTime(list);
    }

    private static void checkingAddingTime(Collection<Integer> list) {
        long l = System.nanoTime();
        long sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        l = System.nanoTime() - l;
        System.out.println("time: " + l);
    }
}
