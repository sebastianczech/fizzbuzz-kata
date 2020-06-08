package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String BAR = "Bar";

    public String fizzBuzz(int number) {
        if (isDIvidableByNumOrContainsNum(number, 3)
                && isDIvidableByNumOrContainsNum(number, 5)) {
            return FIZZ + BUZZ;
        } else if (isDIvidableByNumOrContainsNum(number, 5)) {
            return FIZZ;
        } else if (isDIvidableByNumOrContainsNum(number, 7)) {
            return BUZZ;
        } else if (isDIvidableByNumOrContainsNum(number, 9)) {
            return BAR;
        } else {
            return String.valueOf(number);
        }
    }

    private boolean isDIvidableByNumOrContainsNum(int number, int divider) {
        return number % divider == 0 || String.valueOf(number).contains(String.valueOf(divider));
    }
}
