import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {
    CountLetters counting;

    @Test
    public void countLetters() {
        counting = new CountLetters();
        String word = "hello";
        String word2 = "hello";
        assertEquals(counting.countLetters(word2) , counting.countLetters(word));
    }
}