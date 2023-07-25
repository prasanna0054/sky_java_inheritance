    package com.sky.inheritance;
    import java.util.*;
    public class Runner {
        public static void main(String[] args) {
    //        Bike b = new Bike();
    //        Car c = new Car();
    //        Auto a = new Auto();
    //
    //        List<Vehicles> myVehicles = new ArrayList<>();
    //
    //        Garage g = new Garage(myVehicles);
    //
    //
    //        System.out.println(g);

            List<Fly> myFlyables = new ArrayList<>();

            Bird b = new Bird();
            Plane p = new Plane();

            myFlyables.add(b);
            myFlyables.add(p);

            for(Fly f:myFlyables){
                f.fly();

            }



        }
    }