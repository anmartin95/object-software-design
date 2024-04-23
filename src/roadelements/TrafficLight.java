package roadelements;
import guimap.*;
import staticclasses.*;

public class TrafficLight extends RoadItem
{
    private int durationRed;
    private int durationYellow;
    private int durationGreen;
    private char currentColor;
    private int timeOnRed = 0;
    private int timeOnGreen = 0;
    private int timeOnYellow = 0;

    // constructor to initiliaze attributes
    public TrafficLight(int thisDurationRed, int thisDurationYellow, int thisDurationGreen, char thisCurrentColor, int thisMileMarker)
    {
        // call parent class constructor
        super(thisMileMarker);
        // initialize traffic-light specific attributes
        durationRed = thisDurationRed;
        durationYellow = thisDurationYellow;
        durationGreen = thisDurationGreen;
        currentColor = thisCurrentColor;
    }

    // override update method to change traffic light by incrementing by 1 second
    @Override public void Update(int timePassed)
    {
        switch (currentColor){
            case 'X': // if currently a red light
                timeOnRed += timePassed; // keep track of time passed while on red
                if (timeOnRed >= durationRed) 
                {
                    currentColor = 'O'; // change to green
                    timeOnRed = 0; // reset
                }
                break;
            case '-': // if currently a yellow light
                timeOnYellow += timePassed; // keep track of time passed while on yellow
                if (timeOnYellow >= durationYellow) 
                {
                    currentColor = 'X'; // change to red
                    timeOnYellow = 0; // reset
                }
                break;
            case 'O': // if currently a green light
                timeOnGreen += timePassed; // keep track of time passed while on green
                if (timeOnGreen >= durationGreen)
                {
                    currentColor = '-'; // change to yellow
                    timeOnGreen = 0; // reset
                }
                break;
            default:
                break;
        }
    }

    // return the current color (symbol) to print on map
    @Override public char PrintRoadItem()
    {
        return currentColor;
    }

}