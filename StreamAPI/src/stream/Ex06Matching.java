package stream;

import java.util.Arrays;
import java.util.OptionalInt;

/*
    allMatch
    anyMatch
    noneMatch
    findFirst
    findAny
 */
public class Ex06Matching {
    public static void main(String[] args) {
        int[] digits = {1, 2, 1, 4, 5, 8, 10, 4, 12};
        // 1. is there any element that is devisible by 10

        boolean b1 = Arrays.stream(digits).anyMatch(e -> e % 10 == 0);
        System.out.println(b1);
        // 2. find the first element that is divisible
        OptionalInt b2 = Arrays.stream(digits).filter(i -> i % 4 == 0).findFirst();
        System.out.println(b2.getAsInt());

    }
}
