package roadelements;
import guimap.*;
import staticclasses.*;

public class Car extends Vehicle
{
    @Override
    protected void Accelerate(int seconds) {
        setCurSpeed(getCurSpeed() + Constants.AccRate * seconds);
    }

    @Override
    protected void Decelerate(int seconds) {
        setCurSpeed(getCurSpeed() - Constants.DecRate * seconds);
    }
}