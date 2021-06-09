import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ResultTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void plusMinus() {

        List<Integer> integers = new ArrayList<>();
        integers.add(-1);
        integers.add(-2);
        integers.add(1);
        integers.add(-1);
        integers.add(0);

        assertEquals(0.500000, Result.plusMinus(integers));
    }

    @Test
    void print(){
        ProblemSolving ps = new ProblemSolving();
        ps.print(6);
        String expectedOutput = "     *\n    **\n   ***\n  ****\n *****\n******";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void minMaxSum(){
        MiniMaxSum miniMaxSum = new MiniMaxSum();

        List<Integer> arr = new ArrayList<>();
//        miniMaxSum.findMinMax(arr);

        String expectedOutput = "10 14";

        assertEquals(expectedOutput, outContent.toString());
    }

}