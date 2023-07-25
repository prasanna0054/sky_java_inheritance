package com.sky.inheritance;

public class Bike extends Vehicles {

    public Bike() {
        this(3,168, 2020, "Yamaha", 1);
    }

    public Bike(int id,int topSpeed, int yearOfMake, String makeName, int noOfPrevOwners) {
        super(id, topSpeed, yearOfMake, makeName, noOfPrevOwners, 2);
    }

    public double  calculateBill() {
        return this.getYearOfMake() * 0.2;
    }
}
