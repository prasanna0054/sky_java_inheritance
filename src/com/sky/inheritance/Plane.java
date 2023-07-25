package com.sky.inheritance;

public class Plane extends Vehicles implements Fly {

    public void fly() {
        System.out.println("nyooom");
    }

    @Override
    public double calculateBill() {
        return 0;
    }
}
