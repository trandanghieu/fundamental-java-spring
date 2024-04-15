package stream;

import java.util.Arrays;
import java.util.List;

public class Ex08Reduce {
    public static void main(String[] args) {
        List<Integer> digits = Arrays.asList(1,2,3,4,5,6);

        int sum = digits.stream()
                .reduce(0, (x,y)-> (x+y), Integer::sum);
        System.out.println(sum);

        int sum = digits.stream()
                .reduce()


    }

}
