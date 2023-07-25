package com.sky.inheritance;

public class Vehicles extends Object {



    private int topSpeed;

    private int id;

    private int yearOfMake;

    private String makeName;

    private int noOfPrevOwners;

    private int noOfWheels;

    public Vehicles( ){
        super();
    }



    public Vehicles(int id, int topSpeed, int yearOfMake,  String makeName, int noOfPrevOwners, int noOfWheels) {
        this.id = id;
        this.topSpeed = topSpeed;
        this.yearOfMake = yearOfMake;
        this.makeName = makeName;
        this.noOfPrevOwners = noOfPrevOwners;
        this.noOfWheels = noOfWheels;
    }
 public double calculateBill(){
        return 10;
 }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getYearOfMake() {
        return yearOfMake;
    }

    public void setYearOfMake(int yearOfMake) {
        this.yearOfMake = yearOfMake;
    }


    public String getMakeName() {
        return makeName;
    }

    public void setMakeName(String makeName) {
        this.makeName = makeName;
    }

    public int getNoOfPrevOwners() {
        return noOfPrevOwners;
    }

    public void setNoOfPrevOwners(int noOfPrevOwners) {
        this.noOfPrevOwners = noOfPrevOwners;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    @Override
    public String toString() {
        return "Id of the vehicle is :" +id+  "This vehicle has: "+noOfPrevOwners +" Previous Owners, "
                + " This vehicle is made in :" +yearOfMake +","
                + " This vehicle has: " +noOfWheels +","+
                " This Vehicle has: " +topSpeed +","+
                " This vehicle is: " +makeName
                ;

    }



}
