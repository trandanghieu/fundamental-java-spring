package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionUtils {

    private CollectionUtils() {
    }
    public static List<Integer> init(Integer ... elements){
        List<Integer> result = new ArrayList<>();
        result.addAll(Arrays.asList(elements));
        return  result;
    }
    public static <E> void printf(List<E> sequences){
        Iterator<E> each = sequences.iterator();
        while (each.hasNext()){
            E temp = each.next();
            System.out.print(temp + " ");
        }
        System.out.println();

    }
}
