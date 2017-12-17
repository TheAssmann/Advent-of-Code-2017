package advent;

import org.junit.Test;

import static org.junit.Assert.*;

public class Day2Test {

    @Test
    public void getResultTest() {
        Day2 day2 = new Day2("5\t1\t9\t5\n" +
                             "7\t5\t3\n" +
                             "2\t4\t6\t8");
        assertEquals(18, day2.getResult());

    }


    @Test
    public void getEvenlyDividedResultTest() {
        Day2 day2 = new Day2("5\t9\t2\t8\n" +
                                "9\t4\t7\t3\n" +
                                "3\t8\t6\t5");
        assertEquals(9, day2.getEvenlyDividedResult());

    }

}