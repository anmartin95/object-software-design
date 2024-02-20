public class MetricGUI extends GUI
{
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