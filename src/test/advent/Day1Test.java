package advent;

import org.junit.Test;

import static org.junit.Assert.*;

public class Day1Test {

    @Test
    public void getResult() {
        Day1 day1 = new Day1("1122");
        assertEquals(3, day1.getResult());
    }

    @Test
    public void getResult2() {
        Day1 day1 = new Day1("1111");
        assertEquals(4, day1.getResult());
    }

    @Test
    public void getResult3() {
        Day1 day1 = new Day1("91212129");
        assertEquals(9, day1.getResult());
    }

    @Test
    public void getCircularResult() {
        Day1 day1 = new Day1("1212");
        assertEquals(6, day1.getCircularResult());
    }

    @Test
    public void getCircularResult2() {
        Day1 day1 = new Day1("123425");
        assertEquals(4, day1.getCircularResult());
    }

    @Test
    public void getCircularResult3() {
        Day1 day1 = new Day1("123123");
        assertEquals(12, day1.getCircularResult());
    }
}