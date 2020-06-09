package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AppTest {

    @Test
    void app_should_print_game_results_for_numbers_from_1_to_100() {
        App app = new App();

        String result = app.play();

        assertThat(result).isNotBlank();
        assertThat(result).startsWith("1,2,3,4,Fizz,6,Buzz,8,Bar");
    }

    @Test
    void app_should_print_game_results_for_numbers_from_1_to_9() {
        App app = new App();

        String result = app.play(1, 9);

        assertThat(result).isNotBlank();
        assertThat(result).isEqualTo("1,2,3,4,Fizz,6,Buzz,8,Bar");
    }

}
