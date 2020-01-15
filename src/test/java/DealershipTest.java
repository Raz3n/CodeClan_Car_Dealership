import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;


    @Before
    public void before() {
        dealership = new Dealership("Arnold Codeclan");

    }

    @Test
    public void dealershipHasName() {
        assertEquals("Arnold Codeclan", dealership.getName());
    }
    @Test
    public void dealshipTillStartsEmpty() {
        assertEquals(0, dealership.getTill(), 0.01);
    }
    @Test
    public void dealshipVehiclesStartEmpty() {
        assertEquals(0, dealership.getVehicles().size());
    }
}

