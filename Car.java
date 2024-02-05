public class Car extends Vehicle
{
    @Override
    protected void Accelerate(int seconds) {
        setCurSpeed(getCurSpeed() + Constants.AccRate * seconds * Constants.MpsToMph);
    }

    @Override
    protected void Decelerate(int seconds) {
        setCurSpeed(getCurSpeed() - Constants.DecRate * seconds * Constants.MpsToMph);
    }
}