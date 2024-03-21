package roadelements;
import guimap.*;
import staticclasses.*;

public abstract class Vehicle extends DynamicRoadItem
{
    private double curSpeed = 0.0;
    private double goalSpeed;
    private String curDirection;
    private String curLocation;

    protected abstract void Accelerate(int seconds);

    protected abstract void Decelerate(int seconds);

    public double getCurSpeed() 
    {
        return curSpeed;
    }

    public void setCurSpeed(double speed)
    {
        if (curSpeed <= speed){
            if (speed > goalSpeed){
                curSpeed = goalSpeed;
            } else{
                curSpeed = speed;
            }
        } else{ // if breaking
            if (speed < goalSpeed){
                curSpeed = goalSpeed;
            } else{
                curSpeed = speed;
            }
        }
    }

    public void setGoalSpeed(double speed)
    {
        goalSpeed = speed;
    }

    public void updateSpeed(int seconds) 
    {
        if (curSpeed > goalSpeed){
            Decelerate(seconds);
        }
        else if (curSpeed < goalSpeed) {
            Accelerate(seconds);
        }
    }

    public void Turn(String direction, double degrees){}
}
