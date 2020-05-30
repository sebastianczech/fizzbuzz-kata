package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String fizzBuzz(int number) {
        if(isDividableByThree(number) && isDividableByFive(number)){
            return FIZZ + BUZZ;
        }
        if (isDividableByThree(number)) {
            return FIZZ;
        }
        if (isDividableByFive(number)) {
            return BUZZ;
        }
        return String.valueOf(number);
    }

    private boolean isDividableByFive(int number) {
        return isDividableBy(number, 5);
    }

    private boolean isDividableByThree(int number) {
        return isDividableBy(number, 3);
    }

    private boolean isDividableBy(int number, int dividedBy) {
        return number % dividedBy == 0;
    }
}
