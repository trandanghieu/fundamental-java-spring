package sort_algorithism;

import static utils.ArrayUtils.*;

import java.lang.reflect.Array;

/*
    Bubble sort with Integer Array
 */
public class BubbleSort {
    private BubbleSort(){

    }

    public static void bubbleSort(int[] elements) {
        for (int round = 0; round < elements.length - 1; round++) {
            for (int i = 0; i < elements.length - round - 1; i++) {
                if (elements[i] > elements[i + 1]) {
                    swap(elements, i, i + 1);
                }
            }
        }
    }


}
