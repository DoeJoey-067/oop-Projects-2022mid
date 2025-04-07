package main;

import model.*;
import Services.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Getting Driver Info
        System.out.print("Enter driver name: ");
        String driverName = scanner.nextLine();
        Driver driver = new Driver(driverName);

        // Get Truck ID
        System.out.print("Enter truck ID: ");
        String truckId = scanner.nextLine();
        Truck truck = new Truck(truckId, driver);

        // 3. Create Sensors with user input
        List<WasteBin> bins = new ArrayList<>();

        System.out.print("How many bins do you want to check? ");
        int binCount = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 1; i <= binCount; i++) {
            System.out.println("\n--- Bin " + i + " ---");

            System.out.print("Enter Bin ID: ");
            String binId = scanner.nextLine();

            System.out.print("Enter Latitude: ");
            double lat = scanner.nextDouble();
            System.out.print("Enter Longitude: ");
            double lon = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.print("Enter LevelSensor value (0–100): ");
            int levelVal = scanner.nextInt();

            System.out.print("Enter WeightSensor value (in kg): ");
            double weightVal = scanner.nextDouble();
            scanner.nextLine(); 

            SmartSensor levelSensor = new LevelSensor(levelVal);
            SmartSensor weightSensor = new WeightSensor(weightVal);

            Location location = new Location(lat, lon);
            WasteBin bin = new WasteBin(binId, location, Arrays.asList(levelSensor, weightSensor));

            bins.add(bin);
        }

        // Notifications
        NotificationService notificationService = new EmailNotification();
        for (WasteBin bin : bins) {
            if (bin.isFull()) {
                notificationService.sendNotification(
                        "Bin " + bin.getBinId() + " is full and needs collection.",
                        "admin@smartwaste.com"
                );
            }
        }

        // Assign bins to truck
        BinManager manager = new BinManager();
        manager.assignBinsToTruck(bins, truck);

        // Show Citizen```
        System.out.print("\nEnter Citizen ID: ");
        String citizenId = scanner.nextLine();
        System.out.print("Enter Citizen name: ");
        String citizenName = scanner.nextLine();

        User user = new Citizen(citizenId, citizenName);
        user.displayInfo();
    }
}
