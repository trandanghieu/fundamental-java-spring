package sorting;

import bean.Item;
import data.Data;
import utils.ArrayUtils;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;

/*
    import java.util.Arrays;
    compare > 0 swap
 */
public class Ex03JavaQuickSort {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 1, 2, 6, 7, 9, 8};
        String[] squences = {null,"Ronaldo",null,"Messi","Marcelo",null,"Alvez","Nani"} ;
        Arrays.sort(squences, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //null first
                if(o1!=null && o2 == null){
                    return 1;
                }
                if(o1 == null){
                    return -1;
                }
                //o1 > o2 -> 1 auto asc
                return o1.compareTo(o2) ;
            }
        });
        ArrayUtils.printf(squences);

        Item[] items = Data.getItems();
        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return o2.getStoreId() - o1.getStoreId();
            }
        });


        ArrayUtils.printf(items);

    }

}
