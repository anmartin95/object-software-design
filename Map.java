import java.util.ArrayList;
import java.util.List;

public class Map {
    private List<Road> roads;

    public Map() {
        roads = new ArrayList<>();
    }

    public void addRoad(Road road) {
        roads.add(road);
    }

    public void Print(IPrintDriver pd, Object o) {
        for (Road road : roads) {
            road.Print(pd, o);
        }
    }
}
