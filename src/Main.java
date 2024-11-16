import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("LADA", "Black", 2024);
        Car car2 = new Car("LADA", "White", 2024);
        Car car3 = new Car("LADA", "Red", 2024);
        Car car4 = new Car("LADA", "Gray", 2023);
        Car car5 = new Car("Volga", "Black", 2024);
        Car car6 = new Car("Volga", "White", 2023);
        Car car7 = new Car("Volga", "Red", 2022);
        Car car8 = new Car("Audi", "Red", 2020);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);

        for(Car car : cars){
            System.out.println(car);
        }
        Collections.sort(cars);
        System.out.println();
        for(Car car : cars) {
            System.out.println(car);
        }
    }
}