import org.junit.jupiter.api.Test;

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
}
