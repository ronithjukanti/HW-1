package com.company;
public class Car extends Vehicle
{
    private boolean convertible;
    public Car(String make, int year, boolean fourWheel,
               int retailPrice, int mpg, boolean convert)
    {
        super(make, year, fourWheel,
                retailPrice, mpg);
        this.setConvertible(convert);
    }
    public void printVehicle()
    {
        System.out.println("");
        System.out.println("CAR:");
        System.out.println(this.getModelYear());
        System.out.println(this.getMakeAndModel());
        if(this.isFourWheelDrive()) System.out.println("4 Wheel Drive");
        else System.out.println("2 Wheel Drive");
        System.out.println("$"+this.getRetailPrice());
        System.out.println(this.getMilesPerGallon()+"MPG");
        if(this.isConvertible()) System.out.println("Convertible");
        else System.out.println("Not convertible");
    }
    public boolean isConvertible()
    {
        return convertible;
    }
    public void setConvertible(boolean convertible)
    {
        this.convertible = convertible;
    }
}
