import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    @Test
    void should_return_zero_score_is_zero() {
        BowlingGame bowlingGame = new BowlingGame();
        int[] numberOfDown = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int result = bowlingGame.countSource(numberOfDown);
        int expect = 0;
        assertEquals(expect, result);
    }

    @Test
    void should_return_sum_source_when_no_strike_or_spare() {
        BowlingGame bowlingGame = new BowlingGame();
        int[] numberOfDown = {1, 3, 4, 5, 5, 2, 1, 2, 4, 2, 3, 6, 4, 1, 2, 5, 3, 4, 2, 6};
        int result = bowlingGame.countSource(numberOfDown);
        int expect = Arrays.stream(numberOfDown).sum();
        assertEquals(expect, result);
    }

    @Test
    void should_return_add_right_first_source_when_have_spare_but_no_strike_and_10th_no_strike_and_no_spare() {
        BowlingGame bowlingGame = new BowlingGame();
        int[] numberOfDown = {1, 2, 5, 5, 1, 2, 3, 2, 4, 3, 2, 3, 1, 3, 2, 1, 3, 4, 2, 1};
        int result = bowlingGame.countSource(numberOfDown);
        int expect = 51;
        assertEquals(expect, result);
    }

    @Test
    void should_return_one_round_have_spare_and_10th_have_spare_but_no_strike() {
        BowlingGame bowlingGame = new BowlingGame();
        int[] numberOfDown = {1, 2, 5, 5, 1, 2, 3, 2, 4, 3, 2, 3, 1, 3, 2, 1, 3, 4, 7, 3, 1};
        int result = bowlingGame.countSource(numberOfDown);
        int expect = 59;
        assertEquals(expect, result);
    }

    @Test
    void should_return_have_strike_but_10th_not_strike() {
        BowlingGame bowlingGame = new BowlingGame();
        int[] numberOfDown = {1, 2, 10, 1, 2, 3, 2, 4, 3, 2, 3, 1, 3, 2, 1, 3, 4, 7, 1};
        int result = bowlingGame.countSource(numberOfDown);
        int expect = 58;
        assertEquals(expect, result);
    }

    @Test
    void should_return_when_have_one_more_strike() {
        BowlingGame bowlingGame = new BowlingGame();
        int[] numberOfDown = {1, 2, 10, 1, 2, 10, 4, 3, 2, 3, 1, 3, 2, 1, 3, 4, 4, 5};
        int result = bowlingGame.countSource(numberOfDown);
        int expect = 71;
        assertEquals(expect, result);
    }

    @Test
    void should_return_when_have_strike_and_10th_is_strike() {
        BowlingGame bowlingGame = new BowlingGame();
        int[] numberOfDown = {1, 2, 10, 1, 2, 3, 2, 4, 3, 2, 3, 1, 3, 2, 1, 3, 4, 10, 4, 5};
        int result = bowlingGame.countSource(numberOfDown);
        int expect = 69;
        assertEquals(expect, result);
    }
}
