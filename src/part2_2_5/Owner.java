package part2_2_5;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    private String name;
    private List<Vehicle> vehicleList;

    public Owner(String name) {
        this.name = name;
        vehicleList = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public String getName() {
        return name;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }
}
