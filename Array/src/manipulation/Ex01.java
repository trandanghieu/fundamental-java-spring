package manipulation;

import functional.Predicate;
import utils.ArrayUtils;

import java.util.Arrays;
/*
    Using strategy pattern
 */
public class Ex01 {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 1, 2, 6, 7, 9, 8};
        // get odd elememts in digits


        Predicate predicate = new Predicate() {
            @Override
            public boolean test(int a) {
                return a % 2 == 0;
            }
        };


        int[] oddElements = getElements(numbers, x-> x %2 ==0);
        ArrayUtils.printf(oddElements);

    }


    private static int[] getElements(int[] numbers, Predicate predicate){
        int[] results = new int[numbers.length];
        int count =0;
        for(int number:numbers){
            if(predicate.test(number)){
                results[count++] = number;
            }
        }

        return Arrays.copyOfRange(results,0,count);
    }
}
