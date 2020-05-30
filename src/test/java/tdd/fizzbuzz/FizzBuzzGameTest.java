package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class FizzBuzzGameTest {

    @Test
    void should_return_empty_string_for_zero() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

        String result = fizzBuzzGame.play(0);

        assertThat(result).isEqualTo("");
    }

    @Test
    void should_return_fizzBuzz_result() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

        String result = fizzBuzzGame.play(1);

        assertThat(result).isEqualTo("1");
    }

    @Test
    void should_return_fizzBuzz_result_for_many_numbers() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

        String result = fizzBuzzGame.play(3);

        assertThat(result).isEqualTo("1,2,Fizz");
    }
}
