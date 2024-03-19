public abstract class GUI implements ISimInput, ISimOutput
{
    //Map[] Maps;
    //Simulation simulation = new Simulation();
    //Timer timer = new Timer(); 
    public abstract Road CreateRoad(String name, double locx, double locy, double len, Heading hdg);
    public abstract double GetSpeed(Vehicle v);
    public abstract void SetSpeedLimit(Vehicle v, double s);
}