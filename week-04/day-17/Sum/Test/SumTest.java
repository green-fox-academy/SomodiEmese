import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {
    List<Integer> test;
    Sum sum;

    @Test
    public void sumNumbers() {
        test = new ArrayList<Integer>();
        test.add(1);
        test.add(2);
        sum = new Sum();
        assertEquals(3, sum.sumNumbers(test));
    }

    @Test
    public void sumNumbers1() {
        test = new ArrayList<Integer>();
        sum = new Sum();
        assertEquals(0, sum.sumNumbers(test));
    }

    @Test
    public void sumNumbers2() {
        test = new ArrayList<Integer>();
        test.add(1);
        sum = new Sum();
        assertEquals(1, sum.sumNumbers(test));
    }
    @Test
    public void sumNumbers3() {
        test = new ArrayList<Integer>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        sum = new Sum();
        assertEquals(9, sum.sumNumbers(test));
    }

    @Test(expected = Exception.class)
    public void sumNumbers4() {
        test = new ArrayList<Integer>(null);
        sum = new Sum();
        assertEquals(null, sum.sumNumbers(test));
    }
}