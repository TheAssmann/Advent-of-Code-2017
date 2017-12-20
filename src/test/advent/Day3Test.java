package advent;

import org.junit.Test;

import static org.junit.Assert.*;

public class Day3Test {


    @Test
    public void getResultTest() {
        Day3 day3 = new Day3(1);
        assertEquals(0, day3.getResult());
    }

    @Test
    public void getResultTest2() {
        Day3 day3 = new Day3(12);
        assertEquals(3, day3.getResult());
    }

    @Test
    public void getResultTest3() {
        Day3 day3 = new Day3(23);
        assertEquals(2, day3.getResult());
    }

    @Test
    public void getResultTest4() {
        Day3 day3 = new Day3(1024);
        assertEquals(31, day3.getResult());
    }

    @Test
    public void getResultTest5() {
        Day3 day3 = new Day3(9);
        assertEquals(2, day3.getResult());
    }


}