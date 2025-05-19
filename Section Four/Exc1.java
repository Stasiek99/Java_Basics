class Car {
    String brand;
    int productionYear;

    void start() {
        System.out.println(brand + " starts!");
    }
}

public class Exc1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.productionYear = 2018;
        car.start();
    }
}