package com.sky.inheritance;

public class Car extends Vehicles {

    public Car() {
        this( 1, 100, 2008, "Nissan", 2);
    }

    public Car(int id, int topSpeed, int yearOfMake, String makeName, int noOfPrevOwners) {
        super(id, topSpeed, yearOfMake, makeName, noOfPrevOwners, 4);
    }

//    @Override
    public double  calculateBill() {
        return this.getYearOfMake() * 0.2;
    }
}
