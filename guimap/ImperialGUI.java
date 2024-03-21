package guimap;
import roadelements.*;
import staticclasses.*;

public class ImperialGUI extends GUI
{
    @Override
    public Road CreateRoad(string name, double locx, double locy, double len, Heading hdg)
    {
        return new Road(name, locx / Constants.MetersToMiles, locy / Constants.MetersToMiles, len / Constants.MetersToMiles, hdg);
    }
    @Override
    public double GetSpeed(Vehicle v)
    {
       return v.getCurSpeed() * Constants.MpsToMph;
    }

    @Override
    public void SetSpeedLimit(Vehicle v, double s) 
    { 
        v.setGoalSpeed(s/Constants.MpsToMph);
    }
}