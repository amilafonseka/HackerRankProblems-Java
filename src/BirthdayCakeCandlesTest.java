import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BirthdayCakeCandlesTest {


    @Test
    void testBirthdayCakeCandles(){

        BirthdayCakeCandles birthdayCakeCandles = new BirthdayCakeCandles();

        List<Integer> candles = new ArrayList<>();

        candles.add(4);
        candles.add(4);
        candles.add(1);
        candles.add(3);

        int result = birthdayCakeCandles.birthdayCakeCandles(candles);
        assertEquals(2, result);
    }
}