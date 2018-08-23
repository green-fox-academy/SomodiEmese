import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
    Anagram anagram;

    @Before
    public void createWords() throws Exception {
        anagram = new Anagram();
    }

    @Test
    public void isAnagram() {
       String a = new String("tacocat");
       String b = new String ("cattaco");
       assertEquals(true, anagram.isAnagram(a,  b));

    }
}