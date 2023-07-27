package com.sky.inheritance;

import java.util.*;
import java.util.Scanner;

public class Garage {

    public  Vehicles findById;
    private  List<Vehicles> myVehicles;
    private Scanner scanner;


    public Garage(List<Vehicles> myVehicles) {
        this.myVehicles = myVehicles;
        scanner = new Scanner(System.in);

    }

    public double totalBill(){
        double totalBill = 0;
        for(Vehicles v:myVehicles){
            totalBill= v.calculateBill()+ totalBill;

        }
        return totalBill;
    }




    public  Vehicles findById(int id) throws VehicleNotFoundException{

        for (Vehicles v:this.myVehicles){
            if (id == v.getId()){
                return v;
            }
        }
        throw new VehicleNotFoundException("Vehicle with ID" +id+ "doesn't exist");

    }


    public void addVehicle (){
        myVehicles.add();
    }
    public  void removeVehicle (int id) throws VehicleNotFoundException{
        for(Vehicles v:this.myVehicles){
            if (id == v.getId()) {
                myVehicles.remove(v);
                return;
            }

        }
        throw new VehicleNotFoundException("Vehicle with ID" +id+ "doesn't exist");
    }
    public void displayMenu() {
        System.out.println("\nGarage Menu:");
        System.out.println("1. Add Vehicle");
        System.out.println("2. Remove Vehicle");
        System.out.println("3. Calculate Bill");
        System.out.println("4. Exit");
    }

    public void processUserInput() throws VehicleNotFoundException {
        boolean exit = false;

        while (!exit) {
            displayMenu();
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline left by nextInt()

            switch (choice) {
                case 1:
                    addVehicle();
                    break;
                case 2:
                    removeVehicle(2);
                    break;
                case 3:
                    totalBill();
                    break;
                case 4:
                    System.out.println(myVehicles);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }



    public void closeScanner() {
        scanner.close();
    }

    @Override
    public String toString() {
        return "Garage{" +
                "myVehicles=" + myVehicles +
                '}';
    }
}

