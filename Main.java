import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("##.00");

        Car car = new Car();
        car.setGoalSpeed(65.0);

        Truck truck1 = new Truck(4);
        truck1.setGoalSpeed(55.0);

        Truck truck2 = new Truck(8);
        truck2.setGoalSpeed(50.0);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(truck1);
        vehicles.add(truck2);

        for (int i = 0; i < 11; i++) {
            for (Vehicle v : vehicles) {
                v.updateSpeed(1);
                String s = v.getClass().toString();
                System.out.println(s + " speed: " + f.format(v.getCurSpeed()) + " mph");
            }
        }
    }
}