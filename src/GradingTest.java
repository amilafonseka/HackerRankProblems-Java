import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GradingTest {

    @Test
    void testGradingStudents(){
        Grading grading = new Grading();

        List<Integer> gradings = Arrays.asList(73, 67, 38, 33);
        List<Integer> expected = Arrays.asList(75, 67, 40, 33);

        List<Integer> output = grading.gradingStudents(gradings);

        Assertions.assertIterableEquals(expected, output);
    }
}