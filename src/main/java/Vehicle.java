import java.util.ArrayList;

public abstract class Vehicle {

    Engine engine;
    ArrayList<Tyre> tyres;
    int doors;
    double price;
    String colour;

    public Vehicle(Engine engine, int doors, double price, String colour) {
        this.engine = engine;
        this.doors = doors;
        this.price = price;
        this.colour = colour;
        this.tyres = new ArrayList<Tyre>();
        addTyres();
    }




}
