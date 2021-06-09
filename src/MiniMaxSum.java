import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {

    public static void main(String[] args){

        List<Integer> arr = new ArrayList<>();
        arr.add(769082435);
        arr.add(210437958);
        arr.add(673982045);
        arr.add(375809214);
        arr.add(380564127);

        findMinMax(arr);
    }

    public static void findMinMax(List<Integer> arr) {

        // First Approach

        // Sort the array list
        // minSum = Sum of first four values
        // maxSum = Sum of last four values

//        Collections.sort(arr);
//
//        Long minSum = 0L, maxSum = 0L;
//
//        for(int i = 0; i < 4; i++){
//
//            minSum += arr.get(i);
//
//        }
//
//        for(int i = 4; i > 0; i--){
//
//            maxSum += arr.get(i);
//
//        }
//
//        System.out.println(minSum + " " + maxSum);

        // Second Approach

        // Get the minimum Value of the array
        // Get the maximum value of the array
        // Get the sum of the array
        // Result would be (Sum - maxValue) (Sum - minValue)

        // assign the first value of the array to the minValue variable
        // Then go through the array via a for loop.

        long minValueOfArray = (long)arr.get(0);
        long maxValueOfArray = (long)arr.get(0);
        long sumOfArray = (long)arr.get(0);

        for ( int i = 1; i < arr.size(); i++){

            sumOfArray += arr.get(i);

            if ( minValueOfArray > arr.get(i)){
                minValueOfArray = (long)arr.get(i);
            }

            if ( maxValueOfArray < arr.get(i)) {
                maxValueOfArray = (long)arr.get(i);
            }

        }

        System.out.println((sumOfArray - maxValueOfArray) + " " + (sumOfArray - minValueOfArray));

    }
}
