import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {
        private Sharpie sharpie01;
        private Sharpie sharpie02;

    @Before
    public void setUp() throws Exception {
        sharpie01 = new Sharpie("Black", 100);
        sharpie01.use();
    }

    @Test
    public void use() {

        assertEquals(80, sharpie01.inkAmount);
    }
}