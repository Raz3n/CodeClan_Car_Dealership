public class Car extends Vehicle {

    public Car(Engine engine, int doors, double price, String colour) {
        super(engine, doors, price, colour);
    }


    public String drive() {
        return "Broom broom";
    }
}
