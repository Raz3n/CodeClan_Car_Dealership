import java.util.ArrayList;

public class Customer {

    private String name;
    private double money;
    private ArrayList<IDrive> vehicles;

    public Customer(String name, double money) {
        this.name = name;
        this.money = money;
        this.vehicles = new ArrayList<IDrive>();
    }

    public String getName() {
        return this.name;
    }

    public double getMoney() {
        return this.money;
    }

    public ArrayList<IDrive> getVehicles() {
        return new ArrayList<IDrive>(this.vehicles);
    }
}
