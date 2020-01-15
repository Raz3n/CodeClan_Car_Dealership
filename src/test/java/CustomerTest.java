import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before() {
        customer = new Customer("Jim", 50000);
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
}
