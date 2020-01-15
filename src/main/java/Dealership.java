import java.util.ArrayList;
import java.util.Collection;

public class Dealership {

    String name;
    double till;
    ArrayList<IDrive> stock;

    public Dealership(String name) {
        this.name = name;
        this.till = 0.00;
        this.stock = new ArrayList<IDrive>();
    }


    public String getName() {
        return this.name;
    }

    public double getTill() {
        return this.till;
    }

    public ArrayList<IDrive> getVehicles() {
        return new ArrayList<IDrive>(this.stock);
    }
}
