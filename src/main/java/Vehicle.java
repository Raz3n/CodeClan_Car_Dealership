import java.util.ArrayList;

public abstract class Vehicle implements IDrive {

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

    public Engine getEngine() {
        return engine;
    }

    public ArrayList<Tyre> getTyres() {
        return tyres;
    }

    public int getDoors() {
        return doors;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public void addTyres() {
        for (int i = 0; i < 4; i++) {
            tyres.add(new Tyre(TyreType.LARGE));
        }
    }
}
