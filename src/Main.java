package com.company;

import java.util.ArrayList;

public class Main
{


    public static void main(String[] args)
    {
        ArrayList<Vehicle> in = new ArrayList<Vehicle>();
        Vehicle a = new Car("Renault Kwid", 2016, true, 10000, 24, true);
        in.add(a);
        Vehicle b = new Car("Ford EcoSport", 2014, false, 14000, 19, false);
        in.add(b);
        Vehicle c = new Truck("Tata Indigo", 2015, true, 15000, 17, false, 2);
        in.add(c);
        for(Vehicle V: in)
        {
            V.printVehicle();
        }
    }

}
