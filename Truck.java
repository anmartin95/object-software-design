public class Truck extends Vehicle
{
    private int loadWeight; // int, weight in tons

    Truck(int weight)
    {
        loadWeight = weight;
    }
    public void SetLoadWeight(int weight){
        loadWeight = weight;
    }

    @Override protected void Accelerate(int seconds) {
        if (loadWeight <= 5)
            setCurSpeed(getCurSpeed() + Constants.AccRateEmpty * seconds);
        else
            setCurSpeed(getCurSpeed() + Constants.AccRateFull * seconds);
    }

    @Override protected void Decelerate(int seconds) {
        if (loadWeight <= 5)
            setCurSpeed(getCurSpeed() - Constants.DecRateEmpty * seconds);
        else
            setCurSpeed(getCurSpeed() - Constants.DecRateFull * seconds);
    }
}