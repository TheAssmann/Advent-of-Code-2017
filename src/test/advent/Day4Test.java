package advent;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Day4Test {

    @Test
    public void getResult() {
        Day4 day4= new Day4("aa bb cc dd ee");
        assertEquals(1, day4.getResult());
    }

    @Test
    public void getResult2() {
        Day4 day4= new Day4("aa bb cc dd aa");
        assertEquals(0, day4.getResult());
    }

    @Test
    public void getResult3() {
        Day4 day4= new Day4("aa bb cc dd aaa");
        assertEquals(1, day4.getResult());
    }

    @Test
    public void getResult4() {
        Day4 day4= new Day4("aa bb cc dd aaa\n" +
                "aa bb cc dd aa");
        assertEquals(1, day4.getResult());
    }

    @Test
    public void getResult5() {
        Day4 day4= new Day4("aa bb cc dd aaa\n" +
                "aa bb cc dd ee");
        assertEquals(2, day4.getResult());
    }

    @Test
    public void getAnagramCheck() {
        Day4 day4= new Day4("abcde fghij");
        assertEquals(1, day4.getAnagramCheck());
    }

    @Test
    public void getAnagramCheck2() {
        Day4 day4= new Day4("abcde xyz ecdab");
        assertEquals(0, day4.getAnagramCheck());
    }

    @Test
    public void getAnagramCheck3() {
        Day4 day4= new Day4("oiii ooii oooi oooo");
        assertEquals(1, day4.getAnagramCheck());
    }

    @Test
    public void getAnagramCheck4() {
        Day4 day4= new Day4("oiii ioii iioi iiio");
        assertEquals(0, day4.getAnagramCheck());
    }

    @Test
    public void createAllAnagrams() {
        Day4 day4 = new Day4("");
        List<String> result = day4.createAllAnagrams("abc");

        assertTrue(result.contains("acb"));
        assertTrue(result.contains("abc"));
        assertTrue(result.contains("bac"));
        assertTrue(result.contains("bca"));
        assertTrue(result.contains("cab"));
        assertTrue(result.contains("cba"));
    }
}