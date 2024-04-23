package roadelements;
import guimap.*;
import staticclasses.*;

public class RoadItem 
{
    private int mileMarker;

    // base constructor 
    public RoadItem(int thisMileMarker)
    {
        mileMarker = thisMileMarker;
    }

    public int GetMileMarker()
    {
        return mileMarker;
    }

    public void SetMileMarker(int thisMileMarker)
    {
        mileMarker = thisMileMarker;
    }

    // base method to override
    public char PrintRoadItem() { return ' '; }

    // base method to override
    public void Update(int timePassed) { }

}