import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Test
    public void canGetEngineType() {
        engine = new Engine(EngineType.DIESEL);
        assertEquals(EngineType.DIESEL, engine.getEngineType());
    }



}
