import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

    @Test
    public void getApples() {
        Apples apple1 = new Apples("apple");
        apple1.getApples();
        assertEquals("apple", apple1.getApples());
    }
    @Test
    public void getApples2() {
        Apples apple2 = new Apples("apple");
        apple2.getApples();
        assertEquals("aple", apple2.getApples());
    }
}