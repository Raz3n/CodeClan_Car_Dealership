import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Engine engine;

    @Before
    public void before() {
        engine = new Engine(EngineType.PETROL);
        car = new Car(engine , 4, 20000.50, "red");
    }

    @Test
    public void carStartWithFourTyres() {
        assertEquals(4, car.getTyres().size());
    }

    @Test
    public void canGetPrice() {
        assertEquals(20000.50, car.getPrice(), 0.01);
    }

    @Test
    public void canGetEngine() {
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void canGetColour() {
        assertEquals("red", car.getColour());
    }

    @Test
    public void canGetDoors() {
        assertEquals(4, car.getDoors());
    }

    @Test
    public void canGetTyres() {
        assertEquals(4, car.getTyres().size());
    }

    @Test
    public void carCanDrive() {
        assertEquals("Broom broom", car.drive());
    }
}
