package guimap;
import roadelements.*;
import staticclasses.*;

public class MetricGUI extends GUI
{
   @Override
   public Road CreateRoad(String name, double locx, double locy, double len, Heading hdg)
   {
      return new Road(name, locx / Constants.MetersToKm, locy / Constants.MetersToKm, len / Constants.MetersToKm, hdg);
   }

   @Override
   public double GetSpeed(Vehicle v)
   {
      return v.getCurSpeed() * Constants.MpsToKph;
   }

   @Override
   public void SetSpeedLimit(Vehicle v, double s) 
   { 
      v.setGoalSpeed(s/Constants.MpsToKph);
   }
}