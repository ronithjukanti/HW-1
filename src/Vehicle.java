package com.company;

public class Vehicle
{
    private String MakeAndModel;
    private int ModelYear;
    private boolean FourWheelDrive;
    private int RetailPrice;
    private int MilesPerGallon;
    public Vehicle(String make, int model, boolean FourWheel,
                   int RetailPrice, int mpg)
    {
        this.setMakeAndModel(make);
        this.setModelYear(model);
        this.setFourWheelDrive(FourWheel);
        this.setRetailPrice(RetailPrice);
        this.setMilesPerGallon(mpg);
    }
    public void printVehicle()
    {}
    public String getMakeAndModel()
    {
        return MakeAndModel;
    }
    public void setMakeAndModel(String MakeAndModel)
    {
        this.MakeAndModel = MakeAndModel;
    }
    public int getModelYear()
    {
        return ModelYear;
    }
    public int setModelYear(int ModelYear)
    {
        this.ModelYear = ModelYear;
        return ModelYear;
    }
    public boolean isFourWheelDrive()
    {
        return FourWheelDrive;
    }
    public void setFourWheelDrive(boolean FourWheelDrive)
    {
        this.FourWheelDrive = FourWheelDrive;
    }
    public int getRetailPrice()
    {
        return RetailPrice;
    }
    public void setRetailPrice(int RetailPrice)
    {
        this.RetailPrice = RetailPrice;
    }
    public int getMilesPerGallon()
    {
        return MilesPerGallon;
    }
    public void setMilesPerGallon(int MilesPerGallon)
    { this.MilesPerGallon = MilesPerGallon;}
}
