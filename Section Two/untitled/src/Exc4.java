public class Exc4 {
    public static void main(String[] args) {
        OddNumbers.printOddNumbers(3, 15);
        OddNumbers.printOddNumbers(15, 3);
    }

    public class OddNumbers {
        public static void printOddNumbers(int a, int b) {
            if (a < b) {
                for (int i = a; i <= b; i++) {
                    if (i % 2 != 0) {
                        System.out.print(i + " ");
                    }
                }
            } else {
                for (int i = a; i >= b; i--) {
                    if (i % 2 != 0) {
                        System.out.print(i + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
