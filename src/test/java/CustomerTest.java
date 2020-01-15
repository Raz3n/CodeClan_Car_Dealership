import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Engine engine;
    Car car;


    @Before
    public void before() {
        customer = new Customer("Jim", 50000);
        engine = new Engine(EngineType.PETROL);
        car = new Car(engine, 2, 1000.50, "Blue");
    }

    @Test
    public void customerHasName() {
        assertEquals("Jim", customer.getName());
    }
    @Test
    public void customerHasMoney() {
        assertEquals(50000, customer.getMoney(), 0.01);
    }
    @Test
    public void customerVehiclesStartsEmpty() {
        assertEquals(0, customer.getVehicles().size());
    }
    @Test
    public void canAddVehicleToVehicles(){
        customer.addVehicle(car);
        assertEquals(1, customer.getVehicles().size());
    }

    @Test
    public void customerCanBuyVehicle() {
        customer.buyVehicle(car);
        assertEquals(48999.50, customer.getMoney(), 0.01);
    }
}
