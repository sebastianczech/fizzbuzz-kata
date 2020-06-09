package tdd.fizzbuzz;

public class App {

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.play());
    }

    public String play() {
        return play(1, 100);
    }

    public String play(int start, int end) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String results = "";
        for (int i = start; i<=end; i++) {
            results += fizzBuzz.fizzBuzz(i) + ",";
        }

        return results.substring(0, results.length() - 1);
    }

}
