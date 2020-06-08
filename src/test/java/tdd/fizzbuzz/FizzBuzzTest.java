package tdd.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_return_number_when_input_is_1() {
        String fizzBuzzResult = fizzBuzz.fizzBuzz(1);

        assertThat(fizzBuzzResult).isEqualTo("1");
    }

    @Test
    public void should_return_number_when_input_is_2() {
        String fizzBuzzResult = fizzBuzz.fizzBuzz(2);

        assertThat(fizzBuzzResult).isEqualTo("2");
    }

    @Test
    public void should_return_fizz_when_input_is_3() {
        String fizzBuzzResult = fizzBuzz.fizzBuzz(3);

        assertThat(fizzBuzzResult).isEqualTo("Fizz");
    }

    @Test
    public void should_return_fizz_when_input_contains_3() {
        String fizzBuzzResult = fizzBuzz.fizzBuzz(3);

        assertThat(fizzBuzzResult).isEqualTo("Fizz");
    }

    @Test
    public void should_return_number_when_input_is_4() {
        String fizzBuzzResult = fizzBuzz.fizzBuzz(4);

        assertThat(fizzBuzzResult).isEqualTo("4");
    }

    @Test
    public void should_return_buzz_when_input_is_5() {
        String fizzBuzzResult = fizzBuzz.fizzBuzz(5);

        assertThat(fizzBuzzResult).isEqualTo("Buzz");
    }

    @Test
    public void should_return_buzz_when_input_contains_5() {
        String fizzBuzzResult = fizzBuzz.fizzBuzz(56);

        assertThat(fizzBuzzResult).isEqualTo("Buzz");
    }

    @Test
    public void should_return_bar_when_input_is_7() {
        String fizzBuzzResult = fizzBuzz.fizzBuzz(7);

        assertThat(fizzBuzzResult).isEqualTo("Bar");
    }

    @Test
    public void should_return_fizzbuzz_when_input_is_15() {
        String fizzBuzzResult = fizzBuzz.fizzBuzz(15);

        assertThat(fizzBuzzResult).isEqualTo("FizzBuzz");
    }

    @Test
    public void should_return_fizzbuzz_when_input_is_30() {
        String fizzBuzzResult = fizzBuzz.fizzBuzz(30);

        assertThat(fizzBuzzResult).isEqualTo("FizzBuzz");
    }

}
