package com.sky.inheritance;

public class Bird extends Vehicles implements Fly {

    @Override
    public void fly() {
        System.out.println("flap flap!");
    }

    @Override
    public double calculateBill() {
        return 0;
    }
}
