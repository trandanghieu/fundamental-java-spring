package sorting;

import utils.ArrayUtils;

import java.util.Arrays;

import static utils.ArrayUtils.swap;

/*
    Bubble sort with String
    Null value
    acending decending
 */
public class Ex01SortSequence {
    public static void main(String[] args) {
        String[] sequences = { "Alex", null, null, "Terry", "Rivaldo", null, "Blue", "Zill" };
        sortHandleNullLast(sequences);
        System.out.println(Arrays.toString(sequences));

    }

    //bubble sort  null last
    private static void sortHandleNullLast(String[] source) {
        for (int round = 0; round < source.length; round++) {
            for (int i = 0; i < source.length - round - 1; i++) {
                // B1: Xử lý null last
                if (source[i] == null && source[i + 1] != null) {
                    ArrayUtils.swap(source, i, i + 1);
                    continue;
                }
                // pre != null
                if (source[i + 1] == null) {
                    continue;
                }
                // pre != null, next != null
                // B2: Sắp xếp tăng dân cho những phần tử khác null
                if (source[i].compareTo(source[i + 1]) > 0) {
                    ArrayUtils.swap(source, i, i + 1);
                }
            }
        }
    }

}
