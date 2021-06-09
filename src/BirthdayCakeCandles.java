import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {

//    public static void main(String[] args){
//
//        List<Integer> candles = new ArrayList<>();
//
//        candles.add(3);
//        candles.add(2);
//        candles.add(1);
//        candles.add(3);
//
//
//    }

    public int birthdayCakeCandles(List<Integer> candles){

        // 3, 2, 1, 3
        // Find the talles height of the candles
        // count the candles which has that height

//        int tallestCandleHeight = candles.get(0);
//        int tallestCandleCount = 0;
//
//        for(int i = 1; i < candles.size(); i++){
//
//            if ( tallestCandleHeight < candles.get(i)){
//                tallestCandleHeight = candles.get(i);
//            }
//        }
//
//        for(Integer candleHeight : candles){
//
//            if(candleHeight == tallestCandleHeight){
//                tallestCandleCount++;
//            }
//        }
//
//        return tallestCandleCount;

        System.out.println(Collections.frequency(candles, Collections.max(candles)));

        return Collections.frequency(candles, Collections.max(candles));

        // 4, 4, 1, 3

//        int tallestCandleHeight = candles.get(0);
//        int tallestCandleCount = 1;
//
//        for(int i = 1; i < candles.size(); i++){
//
//            if(tallestCandleHeight < candles.get(i)){
//                tallestCandleHeight = candles.get(i);
//                tallestCandleCount = 1;
//            } else if (tallestCandleHeight == candles.get(i)){
//                tallestCandleCount++;
//            }
//
//        }
//
//        return tallestCandleCount;
    }

}
