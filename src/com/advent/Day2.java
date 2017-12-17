package advent;

import java.util.ArrayList;

public class Day2 {

    String input;
    ArrayList<ArrayList<Integer>> intMatrix;

    public Day2(String input) {
        this.input = input;
        intMatrix = new ArrayList<>();
        String[] stringRows = input.split("\n");

        for (String row: stringRows) {
            String[] singleValues = row.split("\t");
            ArrayList<Integer> intValues = new ArrayList<>();

            for (String value: singleValues) {
                intValues.add(Integer.valueOf(value));
            }

            intMatrix.add(intValues);
        }

    }

    public int getResult() {
        int sum = 0;

        for (ArrayList<Integer> row: intMatrix) {
            int lowest = Integer.MAX_VALUE;
            int highest =0;

            for (Integer value : row) {
                if (value > highest)
                    highest = value;
                if (value < lowest)
                    lowest = value;
            }

            sum += (highest - lowest);
        }

        return sum;
    }

    public int getEvenlyDividedResult() {
        int sum = 0;
        for (ArrayList<Integer> row: intMatrix) {
            for (int i=0; i < row.size(); i++) {
                for (int j=i+1; j < row.size(); j++ ) {
                    if (row.get(i) % row.get(j) == 0) {
                        sum += row.get(i) / row.get(j);
                        break;
                    }
                    else if (row.get(j) % row.get(i) == 0) {
                        sum += row.get(j) / row.get(i);
                        break;
                    }
                }
            }
        }
        return sum;
    }
}
