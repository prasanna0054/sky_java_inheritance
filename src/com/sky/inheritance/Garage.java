package com.sky.inheritance;

import java.util.*;
public class Garage {

    private List<Vehicles> myVehicles;

    public Garage(List<Vehicles> myVehicles) {
        this.myVehicles = myVehicles;
    }

    public double totalBill(){
        double totalBill = 0;
        for(Vehicles v:myVehicles){
            totalBill= v.calculateBill()+ totalBill;

        }
        return totalBill;
    }

    public void addVehicle (Vehicles ve){
        myVehicles.add(ve);
    }
    public void removeVehicle (int id){
        for(Vehicles v:myVehicles){
            if (id == v.getId()) {
                myVehicles.remove(v);
                return;
            }

        }
    }


    @Override
    public String toString() {
        return "Garage{" +
                "myVehicles=" + myVehicles +
                '}';
    }
}

