import java.util.Arrays;

public class BowlingGame {
    public int countSource(int[] numberOfDown) {

        return Arrays.stream(numberOfDown).sum();
    }
}
