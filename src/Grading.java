import java.util.ArrayList;
import java.util.List;

public class Grading {

    public List<Integer> gradingStudents(List<Integer> gradings) {

        List<Integer> output = new ArrayList<>();

        for(Integer grading : gradings){

            int modifiedGrading = 0;

            int nearestMultiple5 = (int)(Math.ceil(grading / 5.0) * 5);

            if(grading >= 38 && nearestMultiple5 - grading < 3){
                output.add(nearestMultiple5);
                continue;
            }
            output.add(grading);
        }

        return output;
    }
}
