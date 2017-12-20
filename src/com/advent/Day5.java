package advent;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Day5 {
    private String input;
    private List<Integer> instructions;
    private int pos;

    public Day5(String input) {
        this.input = input;
    }

    public int getResult() {
        parseInstructions();
        int steps = 0;
        pos = 0;

        while (pos >= 0 && pos < instructions.size()) {
            int oldPos = pos;
            int instruction = instructions.get(pos);
            pos += instruction++;
            instructions.set(oldPos, instruction);
            steps++;
        }

        return steps;
    }

    public int getResultWithDecrease() {
        parseInstructions();
        int steps = 0;
        pos = 0;

        while (pos >= 0 && pos < instructions.size()) {
            int oldPos = pos;
            int instruction = instructions.get(pos);
            pos += instruction;
            instruction = instruction >= 3 ? instruction-1 : instruction+1;
            instructions.set(oldPos, instruction);
            steps++;
        }

        return steps;
    }

    private void parseInstructions() {
        instructions = new ArrayList<>();

        String[] lines = input.split("\n");
        for(String line: lines) {
            instructions.add(Integer.valueOf(line));
        }
    }
}
