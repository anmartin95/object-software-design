import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("##.00");

        GUI gui;
        Map map = new Map();
        IPrintDriver cp = new ConsolePrint();

        /*Scanner scan = new Scanner(System.in);
        System.out.println("Enter 'M' for metric or 'I' for Imperial: ");
        String unit = scan.nextLine();
        if(unit.equals("M"))
        {
            System.out.println("Using metric");
            gui = new MetricGUI();
        }
        else
        {
            System.out.println("Using imperial");
            gui = new ImperialGUI();
        }
        System.out.println("Enter speed limit:");
        String newSpeed = scan.nextLine();
        double sp = Double.valueOf(newSpeed);

        Car car = new Car();
        gui.SetSpeedLimit(car, sp);

        Truck truck1 = new Truck(4);
        gui.SetSpeedLimit(truck1, sp);

        Truck truck2 = new Truck(8);
        gui.SetSpeedLimit(truck2, sp);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(truck1);
        vehicles.add(truck2);

        for (int i = 0; i < 11; i++) {
            for (Vehicle v : vehicles) {
                v.updateSpeed(1);
                String s = v.getClass().toString();
                System.out.println(s + " speed: " + f.format(gui.GetSpeed(v)));
            }
        }*/

        gui = new MetricGUI();
        Road Uptown = gui.CreateRoad("Uptown", 0.0, -0.09, .180, Heading.North);
        map.addRoad(Uptown);
        Road Crosstown = gui.CreateRoad("Crosstown", -0.09, 0.0, .180, Heading.East);
        map.addRoad(Crosstown);

        CharMatrix cm = new CharMatrix();
        map.Print(cp, cm);
        for(int i=0; i<Constants.CharMapSize; i++)
        {
            String s = new String(cm.map[i]);
            System.out.println(s);
        }
    }
}