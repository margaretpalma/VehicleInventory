package com.pluralsight;
import java.util.Scanner;

public class Main {
    private static Vehicle[] Inventory = new Vehicle[20];
    private static int vehicleQuantity;


    public static void main(String[] args) {

        //vehicles
        Inventory[0] = new Vehicle(301101, "Nissan GT-R", "Silver", 15000, 11500);
        Inventory[1] = new Vehicle(301102, "Toyota Supra", "Red", 22000, 63000);
        Inventory[2] = new Vehicle(301103, "Honda NSX", "Black", 10500, 157000);
        Inventory[3] = new Vehicle(301104, "Mazda RX-7", "Green", 35000, 22000);
        Inventory[4] = new Vehicle(301105, "Subaru WRX STI", "Mint Green", 28000, 41000);
        Inventory[5] = new Vehicle(301106, "Mitsubishi Lancer Evo", "White", 26500, 52000);
        vehicleQuantity = 6;

        int command;
        //while loop
        while (true) {

            System.out.println("What do you want to do?");
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by Price Range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Add a vehicle");
            System.out.println("6 - Quit");


            command = ConsoleHelper.promptForInt("Enter command");

            switch (command) {
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    findVehiclesByMakeModel();
                    break;
                case 3:
                    findVehicleByPrice();
                    break;
                case 5:
                    addAVehicle();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid Command - Select option from list");
                    break;
            }
        }
    }

    private static void findVehiclesByMakeModel() {
        //prompt the user for the make/model to search for.
        String makeModelToSearchFor = ConsoleHelper.promptForString("Please enter a make/model to search for");


        //loop through inventory and add any matching value to result
        for(Vehicle v : Inventory){
            if(v == null) {
                continue;
            }
            if (v.getMakeModel().toLowerCase().contains(makeModelToSearchFor.toLowerCase())) {
                displayVehicle(v);
            }

        }

    }
//display
    private static void displayVehicle(Vehicle v){

        System.out.println(v);

    }

//list
//table makes it look better
    private static void listAllVehicles(){
        System.out.println("Listing out vehicles....");
        System.out.println(Vehicle.getTableHeader());
        for(Vehicle v : Inventory){             //for vehicle v in inventory
            if(v == null) {                     //moves to next vehicle
                continue;
            }
            displayVehicle(v);
        }

    }

    private static void findVehicleByPrice() {

    }

    private static void addAVehicle() {
        //uses consolehelper

        long vehicleId = ConsoleHelper.promptForLong("What is the vehicle ID");
        String makeModel = ConsoleHelper.promptForString("Please enter the make/mode");
        String color = ConsoleHelper.promptForString("Please enter the color");
        int odometerReading = ConsoleHelper.promptForInt("Please enter the mileage");
        float price = ConsoleHelper.promptForFloat("What is the cost of the vehicle");

        Vehicle newVehicle = new Vehicle(vehicleId, makeModel, color, odometerReading, price);
        Inventory[vehicleQuantity] = newVehicle;
        vehicleQuantity++;

    }

}