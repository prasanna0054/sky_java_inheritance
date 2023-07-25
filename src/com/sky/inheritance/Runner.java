package com.sky.inheritance;
import java.util.*;
public class Runner {
    public static void main(String[] args) {
        Bike b = new Bike();
        Car c = new Car();
        Auto a = new Auto();

        List<Vehicles> myVehicles = new ArrayList<>();

        Garage g = new Garage(myVehicles);

//        g.addVehicle(b);
        g.removeVehicle(a.getId());
        System.out.println(g);
    }
}