package sorting;

import utils.ArrayUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import static java.util.Comparator.*;

/*
    compare(o1,o2)>0 -> swap
 */
public class Ex05SortStringComparator {
    public static void main(String[] args) {
        String[] squences = {null, "Ronaldo", null, "Messi", "Marcelo", null, "Alvez", "Nani"};
        Comparator<String> c1 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //handle null first
                if(o1==null){
                    return -1;
                }
                if(o2 == null){
                    return 1;
                }
                return o1.compareTo(o2);
            }
        };
        //same
        Comparator<String> c2 = (s1,s2) -> {
            if(s1==null){
                return -1;
            }
            if(s2 == null){
                return 1;
            }
            return s1.compareTo(s2);
        };
        Comparator<String> comparator = Comparator.nullsLast(Comparator.comparing(Function.identity()));


        //same
        Arrays.sort(squences, comparator);

        //Arrays.sort(squences, c2);
        ArrayUtils.printf(squences);
    }
}
