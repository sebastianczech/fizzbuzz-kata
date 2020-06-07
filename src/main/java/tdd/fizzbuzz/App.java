package tdd.fizzbuzz;

public class App {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String results = "";
        for (int i=1; i<=100; i++) {
            results += fizzBuzz.fizzBuzz(i) + ",";
        }
        System.out.println(results.substring(0, results.length() - 1));
    }

}
