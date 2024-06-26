package guimap;
import roadelements.*;
import staticclasses.*;

import java.util.ArrayList;
import java.util.List;

public class ConsolePrint implements IPrintDriver {

    public void PrintRoad(Road road, Object o) {
        CharMatrix cm = (CharMatrix) o;
        int x, y;
        int CCx = Conversions.WCpointToCCpoint(road.GetXLocation());
        int CCy = Conversions.WCpointToCCpoint(-road.GetYLocation());
        int distance = 0;
        int CCRoadLength = Conversions.WClengthToCClength(road.GetLength());
        List<RoadItem> items = road.GetRoadItems();
        switch (road.GetHeading()) {
            case North:
                x = (int) CCx;
                if (x >= 0 && x < Constants.CharMapSize) {
                    while (distance < CCRoadLength) {
                        y = (int) (CCy - distance);
                        if (y >= 0 && y < Constants.CharMapSize) {
                            cm.map[y][x] = '|';
                            cm.map[y][x + 2] = '|';
                            cm.map[y][x + 4] = '|';
                            for (RoadItem ri: items)
                            {
                                if (y == ri.GetMileMarker())
                                {
                                    cm.map[y][x + 6] = ri.PrintRoadItem();
                                }
                            }
                        }
                        distance += 1;
                    }
                }
                break;
            case South:
                break;
            case East:
                y = (int) CCy;
                if (y >= 0 && y < Constants.CharMapSize) {
                    while (distance < CCRoadLength) {
                        x = (int) (CCx + distance);
                        if (x >= 0 && x < Constants.CharMapSize) {
                            cm.map[y][x] = '-';
                            cm.map[y + 2][x] = '-';
                            cm.map[y + 4][x] = '-';
                        }
                        distance += 1;
                    }
                }
                break;
            case West:
                break;
            default:
                break;
        }
    }

    public void PrintCar(Car car, Object o) {

    }
}
