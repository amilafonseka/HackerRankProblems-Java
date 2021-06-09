import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static String plusMinus(List<Integer> arr) {
        // Write your code here
        List<Integer> positiveIntegerList = new ArrayList<>();
        List<Integer> negativeIntegerList = new ArrayList<>();
        List<Integer> zeroIntegerList = new ArrayList<>();

        for (Integer integerValue : arr){
            if(integerValue > 0){
                positiveIntegerList.add(integerValue);
            } else if ( integerValue < 0 ){
                negativeIntegerList.add(integerValue);
            } else {
                zeroIntegerList.add(integerValue);
            }
        }

//        System.out.println(String.format("%.6f",(double)(positiveIntegerList.size())/(double)arr.size()));
//        System.out.println(String.format("%.6f",(double)negativeIntegerList.size()/(double)arr.size()));
//        System.out.println(String.format("%.6f",(double)zeroIntegerList.size()/(double)arr.size()));

        return String.format("%.6f", (double)(positiveIntegerList.size()) / (double)arr.size());
    }

}

public class Solution {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(-1);
        arr.add(-1);

        Result.plusMinus(arr);
    }
}
