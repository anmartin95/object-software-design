package guimap;
import roadelements.*;
import staticclasses.*;

import java.util.ArrayList;
import java.util.List;

public class Simulation
{
    private List<RoadItem> RoadItems;

    public Simulation(List<RoadItem> roaditems)
    { 
        RoadItems = roaditems;
    }

    public void UpdateSim(int timePassed)
    {
        // call update function for all dynamic road items 
        for (RoadItem ri: RoadItems)
        {
            ri.Update(timePassed);
        }
    }
    
}