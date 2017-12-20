package advent;

import org.junit.Test;

import static org.junit.Assert.*;

public class Day5Test {

    @Test
    public void getResult() {
        Day5 day5 = new Day5("0\n" +
                "3\n" +
                "0\n" +
                "1\n" +
                "-3");
        assertEquals(5, day5.getResult());
    }

    @Test
    public void getResultWithDecrease() {
        Day5 day5 = new Day5("0\n" +
                "3\n" +
                "0\n" +
                "1\n" +
                "-3");
        assertEquals(10, day5.getResultWithDecrease());
    }
}