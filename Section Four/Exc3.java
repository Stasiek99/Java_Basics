class Matematics {
    int number = 5;

    static int statisticalNumber = 10;

    void show() {
        System.out.println("Usual method");
    }

    static void showStatistical() {
        System.out.println("Statistical method");
    }
}

public class Exc3 {
    public static void main(String[] args) {
        Matematics object = new Matematics();
        object.show();
        Matematics.showStatistical();
        System.out.println(Matematics.statisticalNumber);
    }
}