package advent;

public class Day1 {

    private String input;

    Day1(String input) {
        this.input = input;
    }

    public int getResult () {
        int sum = 0;
        for (int i=0; i < input.length(); i++) {
            int thisDigit = getDigitAt(i);
            int nextDigit = getDigitAt(i + 1);
            if (thisDigit == nextDigit)
                sum += thisDigit;
        }

        return sum;
    }

    public int getCircularResult() {
        int sum = 0;
        for (int i=0; i < input.length(); i++) {
            int thisDigit = getDigitAt(i);
            int nextDigit = getDigitAt(i + (input.length()/2));
            if (thisDigit == nextDigit)
                sum += thisDigit;
        }

        return sum;
    }

    private int getDigitAt(int pos) {
        int actualPos = pos % input.length();
        return Integer.valueOf(input.substring(actualPos, actualPos + 1));
    }

}
