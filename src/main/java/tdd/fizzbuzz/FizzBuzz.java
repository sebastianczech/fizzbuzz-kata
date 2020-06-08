package tdd.fizzbuzz;

public class FizzBuzz {

    public String fizzBuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0 || String.valueOf(i).contains("3")) {
            return "Fizz";
        } else if (i % 5 == 0 || String.valueOf(i).contains("5")) {
            return "Buzz";
        } else if (i % 7 == 0 || String.valueOf(i).contains("7")) {
            return "Bar";
        } else {
            return String.valueOf(i);
        }
    }
}
