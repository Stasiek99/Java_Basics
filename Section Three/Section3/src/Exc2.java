import java.util.*;

public class Exc2 {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> list = new ArrayList<>();

        for (int i1 = 0; i1 < 1000000; i1++) {
            int i = random.nextInt(10) + 1;
            list.add(i);
        }

        Set<Integer> set = new HashSet<>();

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

        l = (System.nanoTime() - l);
        System.out.println("Time: " + sum);
    }
}
