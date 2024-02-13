public class MetricOutput implements ISimOutput
{
   public double GetSpeed(Vehicle v)
    {
       return v.getCurSpeed() * 1.6;
    }
}