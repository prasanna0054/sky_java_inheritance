package com.sky.inheritance;

public class Auto extends Vehicles {

    public Auto() {
        this(2, 50, 2022, "RE", 0);
    }

    public Auto(int id,int topSpeed, int yearOfMake, String makeName, int noOfPrevOwners) {
        super(id, topSpeed, yearOfMake, makeName, noOfPrevOwners, 3);
    }

    public double  calculateBill() {
        return this.getYearOfMake() * 0.2;
    }
}
