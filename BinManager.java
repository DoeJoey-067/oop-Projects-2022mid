package Services;

import model.WasteBin;
import model.Truck;
import java.util.List;

public class BinManager {

    public void assignBinsToTruck(List<WasteBin> bins, Truck truck) {
        System.out.println("Truck " + truck.getTruckId() + " with driver " + truck.getDriver().getName() + " assigned to full bins:");
        for (WasteBin bin : bins) {
            if (bin.isFull()) {
                System.out.println("- Bin ID: " + bin.getBinId() + " at (" + bin.getLocation().getLatitude() + ", " + bin.getLocation().getLongitude() + ")");
            }
        }
    }
}
