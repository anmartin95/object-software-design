import guimap.*;
import roadelements.*;
import staticclasses.*;

import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        DecimalFormat f = new DecimalFormat("##.00");
        Scanner scan = new Scanner(System.in);
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
        }
        */
        // create objects
        GUI gui;
        Map map = new Map();
        IPrintDriver cp = new ConsolePrint();
        gui = new MetricGUI();

        // create/add roads and road items to map
        Road Uptown = gui.CreateRoad("Uptown", 0.0, -0.09, .180, Heading.North);
        // add two traffic lights to the road, 1/3 and 2/3 way through
        RoadItem light1 = new TrafficLight(5, 4, 5, 'O', 12);
        RoadItem light2 = new TrafficLight(6, 3, 5, 'X', 24);
        Uptown.AddRoadItem(light1);
        Uptown.AddRoadItem(light2);
        map.addRoad(Uptown);
        //Road Crosstown = gui.CreateRoad("Crosstown", -0.09, 0.0, .180, Heading.East);
        //map.addRoad(Crosstown);

        // create objects for printing console
        CharMatrix cm = new CharMatrix();
        List<Road> allRoads = map.getRoads();
        List<RoadItem> allRoadItems = new ArrayList<>();
        for(Road road: allRoads)
        { 
            for (RoadItem roaditem: road.GetRoadItems())
            {
                allRoadItems.add(roaditem);
            }
        }
        Simulation simulation = new Simulation(allRoadItems);
        Timer timer = new Timer(simulation);

        // run timer for 50 seconds, updating and printing every second
        timer.UpdateConsole(map, cm, cp, 50);
    }
}