import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Test
    public void canGetTyreType() {
        tyre = new Tyre(TyreType.LARGE);
        assertEquals(TyreType.LARGE, tyre.getTyreType());
    }
}
