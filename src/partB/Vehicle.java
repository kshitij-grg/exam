package partB;

public class Vehicle {
    private String name;
    private Owner owner;

    public Vehicle(String name, Owner owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public Owner getOwner() {
        return owner;
    }
}
