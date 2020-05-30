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
    public void should_return_number_when_not_dividable_by_3_and_5() {
        String fizzBuzzResult = fizzBuzz.fizzBuzz(1);

        assertThat(fizzBuzzResult).isEqualTo("1");
    }

    @Test
    void should_return_Fizz_when_dividable_by_3() {
        String result = fizzBuzz.fizzBuzz(3);

        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void should_return_Buzz_when_dividable_by_5() {
        String result = fizzBuzz.fizzBuzz(5);

        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    void should_return_FizzBuzz_when_dividable_by_3_and_5() {
        String result = fizzBuzz.fizzBuzz(15);

        assertThat(result).isEqualTo("FizzBuzz");
    }


}
