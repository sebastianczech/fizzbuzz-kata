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

}
