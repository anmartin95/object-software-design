package guimap;
import roadelements.*;
import staticclasses.*;

import java.util.concurrent.TimeUnit;

public class Timer
{
    public static Simulation sim;

    public Timer(Simulation thisSim)
    {
        sim = thisSim;
    }
    
    public void UpdateConsole(Map map, CharMatrix cm, IPrintDriver cp, int time)
    {
        try{
            // run simulation for time seconds
            for(int n = 0; n<time; n++)
            {
                // pause program running for 1 second before each update
                TimeUnit.SECONDS.sleep(1);

                // java clear screen:
                System.out.print("\033[H\033[2J");  
                System.out.flush();

                // print map
                map.Print(cp, cm);
                for(int i=0; i<Constants.CharMapSize; i++)
                {
                    String s = new String(cm.map[i]);
                    System.out.println(s);
                }
                // call update sim
                sim.UpdateSim(1);
            }
        } catch(Exception e)
        {
            System.out.print(e);
        }
    }
}