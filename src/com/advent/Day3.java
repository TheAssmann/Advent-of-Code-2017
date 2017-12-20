package advent;

public class Day3 {

    private int target;

    public Day3(int target) {
        this.target = target;
    }

    /**
     * Gets the Manhattan Distance for a target value in a spiral memory.
     * Next
     * @return
     */
    public int getResult() {
        /**
         * Example:
         *
         * Spiral
         * . .. .. .. ..
         * .  5  4  3 12
         * .  6  1  2 11
         * .  7  8  9 10 <-
         * . .. .. .. 25
         *
         * Looking for the position of 10.
         * rootSize (lowest full square root): 3
         * squareSize (edgesize for the square around root square): 5      (#10-25)
         */
        int rootSize = getOddRoot(target);
        int dist = Math.abs(rootSize/2);
        Coord pos = new Coord(dist,dist);
        if (target == rootSize * rootSize)
            return pos.getDistance();
        // Align to starting position
        pos.right(1);

        int squareSize = rootSize + 1;
        int currentVal = rootSize * rootSize + 1;

        //Follow the spiral (I know... not very pretty...)
        //TODO Make it nice...
        // UP
        if (target > (currentVal + squareSize-1)) {
            pos.up(squareSize-1);
            currentVal += (squareSize-1);
        }
        else {
            if (target < currentVal + squareSize-1) {
                pos.up(target - currentVal);
                return pos.getDistance();
            }
        }

        // LEFT
        if (target > (currentVal + squareSize)) {
            pos.left(squareSize);
            currentVal += squareSize;
        }
        else {
            if (target < currentVal + squareSize) {
                pos.left(target - currentVal);
                return pos.getDistance();
            }
        }

        // DOWN
        if (target > (currentVal + squareSize)) {
            pos.down(squareSize);
            currentVal += squareSize;
        }
        else {
            if (target < currentVal + squareSize) {
                pos.down(target - currentVal);
                return pos.getDistance();
            }
        }

        // RIGHT
        if (target < currentVal + squareSize) {
                pos.right(target - currentVal);
                return pos.getDistance();
        }

        return 0;
    }

    /**
     * Computes the next root value for a given target that fills a square.
     * Example: 16 => sqrt(16) = 4
     *                getOddRoot(16) will return 3
     *                because it is the highest root to fit in 16 that fills a full square.
     * @param target Value for which the root shall be computed
     * @return closest odd Root value
     */
    private int getOddRoot(int target) {
        int root = ((int) Math.floor(Math.sqrt(target)));
        return root % 2 == 0? root-1 : root;
    }
}

class Coord {

    int x;
    int y;

    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void up(int steps) {
        this.y -= steps;
    }

    public void down(int steps) {
        this.y += steps;
    }

    public void left(int steps) {
        this.x -= steps;
    }

    public void right(int steps) {
        this.x += steps;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /**
     * Calculates the Manhattan Distance from 0/0 to itself
     * @return Manhattan Distance
     */
    public int getDistance() {
        return Math.abs(x) + Math.abs(y);
    }

    @Override
    public String toString() {
        return "(" + x + "/" + y + ")";
    }
}
