package roadelements;
import guimap.*;
import staticclasses.*;

import java.util.ArrayList;
import java.util.List;

public class Road
{
    private List<RoadItem> roaditems;
    private String name;
    private double length;
    private double xlocation;
    private double ylocation;
    private Heading heading;
    public static int NumOfRoads = 0;

    public Road(String streetName, double locX, double locY, double len, Heading hdg)
    {
        roaditems = new ArrayList<>();
        name = streetName;
        length = len;
        heading = hdg;
        xlocation = locX;
        ylocation = locY;
        NumOfRoads++;
    }

    public double GetLength() { return length; }

    public double GetXLocation() { return xlocation; }

    public double GetYLocation() { return ylocation; }

    public Heading GetHeading() { return heading; }

    public String GetRoadName() { return name; }

    public void Print(IPrintDriver print, Object o)
    {
        print.PrintRoad(this, o);
    }

    public void AddRoadItem(RoadItem roaditem)
    {
        roaditems.add(roaditem);
    }

    public List<RoadItem> GetRoadItems()
    {
        return roaditems;
    }
    
}

