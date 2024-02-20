public class ImperialGUI extends GUI
{
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