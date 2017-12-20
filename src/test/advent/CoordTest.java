package advent;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoordTest {

    @Test
    public void up() {
        Coord coord = new Coord(3,5);
        coord.up(2);
        assertEquals(3, coord.getY());
        coord.up(3);
        assertEquals(0, coord.getY());
        coord.up(2);
        assertEquals(-2, coord.getY());
    }

    @Test
    public void down() {
        Coord coord = new Coord(3,5);
        coord.down(2);
        assertEquals(7, coord.getY());
        coord.down(3);
        assertEquals(10, coord.getY());
        coord.down(2);
        assertEquals(12, coord.getY());
    }

    @Test
    public void left() {
        Coord coord = new Coord(3,5);
        coord.left(2);
        assertEquals(1, coord.getX());
        coord.left(3);
        assertEquals(-2, coord.getX());
        coord.left(2);
        assertEquals(-4, coord.getX());
    }

    @Test
    public void right() {
        Coord coord = new Coord(3,5);
        coord.right(2);
        assertEquals(5, coord.getX());
        coord.right(3);
        assertEquals(8, coord.getX());
        coord.right(2);
        assertEquals(10, coord.getX());
    }

    @Test
    public void getDistance() {
        Coord coord = new Coord(3,5);
        assertEquals(8, coord.getDistance());
        coord = new Coord(-2,7);
        assertEquals(9, coord.getDistance());
        coord = new Coord(15,-6);
        assertEquals(21, coord.getDistance());
        coord = new Coord(-3,-3);
        assertEquals(6, coord.getDistance());
    }
}