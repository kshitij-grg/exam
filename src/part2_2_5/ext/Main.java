package part2_2_5.ext;

import part2_2_5.Owner;
import part2_2_5.Vehicle;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Kshitij");
        Vehicle vehicle1 = new Vehicle("Tesla", owner);
        Vehicle vehicle2 = new Vehicle("Toyota", owner);

        owner.addVehicle(vehicle1);
        owner.addVehicle(vehicle2);

        // For the Third condition:
        // Here if I print this owner's vehicles then it won't have any vehicles
        Owner owner1 = new Owner("Luffy");

        Vehicle vehicle = new Vehicle("Mustang", owner1);
        // For the Second condition:
        // Even if we add this vehicle to the second owner, it will still
        // print out its owner as the first owner which is Kshitij
        owner1.addVehicle(vehicle1);

        // When we add the different owner on its initialization then we can see the second
        // owner attached to it
        owner1.addVehicle(vehicle);

        // For the First condition:
        // Tracking all vehicles owned by Owner and identifying owner of each vehicle
        for (Vehicle v : owner.getVehicleList()) {
            System.out.println("Vehicle Name: " + v.getName() + " and Owner name: " + v.getOwner().getName());
        }
        System.out.println();
        for (Vehicle v : owner1.getVehicleList()) {
            System.out.println("Vehicle Name: " + v.getName() + " and Owner name: " + v.getOwner().getName());
        }

    }
}
