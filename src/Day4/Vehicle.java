package Day4;
//Martin
public class Vehicle
{
    private static final double DEFAULT_FUEL_CONSUMPTION = 1.25;
    double fuelConsumption;
    double fuel;
    int horsePower;

    public final double getDefaultFuelConsumption()
    {
        return DEFAULT_FUEL_CONSUMPTION;
}
    public double getFuelConsumption()
    {
        return fuelConsumption;
    }
    public double setFuelConsumption(int num){
        if(num <= 0){
            throw new IllegalArgumentException("Wrong value !");
        }
        return num;
    }
    public double getFuel(){
        return fuel;
    }
    public void setFuel(double fuel){
        if(fuel <= 0){
            throw new IllegalArgumentException("Wrong value !");
        }
       this.fuel = fuel;
    }
    public int getHorsePower(){
        return horsePower;
    }
    public void setHorsePower(int hp){
        if(hp <= 0){
            throw new IllegalArgumentException("Wrong value !");
        }
        horsePower = hp;
    }
    public Vehicle(double fuel, int hp)
    {
     setFuel(fuel);
     setHorsePower(hp);
     fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }
    public void drive(double km)
    {
        fuel -= fuelConsumption * km;
        if(fuel < 0){
            System.out.println("No more fuel" );
        }else{
            System.out.println("Available fuel: " + fuel);
        }

    }
}
