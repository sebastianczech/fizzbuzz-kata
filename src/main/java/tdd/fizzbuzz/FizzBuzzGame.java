package tdd.fizzbuzz;

public class FizzBuzzGame {

    public static void main(String[] args) {
        System.out.println("Lets play" + new FizzBuzzGame().play(20));
    }

    public String play(int number) {
        String result = "";

        for (int i = 1; i <= number; i++) {
            result += new FizzBuzz().fizzBuzz(i);
            result += addComma(number, i);
        }

        return result;
    }

    private String addComma(int number, int i) {
        return i != number ? "," : "";
    }
}
