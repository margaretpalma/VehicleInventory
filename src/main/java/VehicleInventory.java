import java.util.ArrayList;

public class VehicleInventory {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //array
        Vehicle[] vehicles = new vehicles;
        int vehicleCount = 6;

        vehicles[0] = new Vehicle(101121, "Ford Explorer","Red", 45000, 13500);
        vehicles[0] = new Vehicle(101122,"Toyota Camry","Blue",60000,11000);
        vehicles[0] = new Vehicle(101123,"Chevrolet Malibu","Black",50000,9700);
        vehicles[0] = new Vehicle(101124,"Honda Civic","White",70000,7500);
        vehicles[0] = new Vehicle(101125,"Subaru Outback","Green",55000,14500);
        vehicles[0] = new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000);

        while (true) {
            System.out.println("\nPick from Menu: ");
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make or model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Add a car");
            System.out.println("6 -Quit");
            System.out.println("Enter choice: ");

            int command = scanner.nextInt();




        }




    }


}
