import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class FibonacciTest {
    Fibonacci example;

    @Test
    public void fibonacci() {
        example = new Fibonacci();

        assertEquals(13, example.fibonacci(7));
    }
}