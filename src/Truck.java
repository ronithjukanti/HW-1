package com.company;

public class Truck extends Vehicle
{
    private boolean sideStep;
    private int towCapacity;
    public Truck(String make, int year, boolean fourWheel,
                 int retailPrice, int mpg, boolean side, int tow)
    {
        super(make, year, fourWheel,retailPrice, mpg);
        this.setSideStep(side);
        this.setTowCapacity(tow);
    }
    public void printVehicle()
    {
        System.out.println("");
        System.out.println("TRUCK:");
        System.out.println(this.getModelYear());
        System.out.println(this.getMakeAndModel());
        if(this.isFourWheelDrive()) System.out.println("4 Wheel Drive");
        else System.out.println("2 Wheel Drive");
        System.out.println("$"+this.getRetailPrice());
        System.out.println(this.getMilesPerGallon()+"MPG");
        if(this.isSideStep()) System.out.println("Side Step is present");
        else System.out.println("Step is not present");
        System.out.println("Can tow upto "+this.getTowCapacity()+" tons");
    }
    public boolean isSideStep()
    {
        return sideStep;
    }
    public void setSideStep(boolean sideStep)
    {
        this.sideStep = sideStep;
    }
    public int getTowCapacity()
    {
        return towCapacity;
    }
    public void setTowCapacity(int towCapacity)
    {
        this.towCapacity = towCapacity;
    }
}
