package sorting;

import bean.Item;
import data.Data;
import utils.ArrayUtils;

import java.util.Arrays;
import static java.util.Comparator.*;
import  java.util.Comparator;

import java.util.function.Function;

/*
    Arrays.sort(items) -> Item Class must implement Comparable -> overide hàm compareTo ở class Item
 */
public class Ex04ArraySortItem {
    public static void main(String[] args) {
        Item[] items = Data.getItemsNull();
        //Sort Comparable -> implement COmparable
        // Arrays.sort(items);
        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item item1, Item item2) {
                //handle null first
                if(item1 == null){
                    return -1;
                }
                if(item2 == null){
                    return 1;
                }
                // ASC with store id -> item id
                int storeId1 = item1.getStoreId();
                int storeId2 = item1.getStoreId();
                if(storeId1 != storeId2){
                    return storeId1 - storeId2;
                }

                int id1 = item1.getId();
                int id2 = item1.getId();
                return id2 -id1;

            }
        });
        // another version of comparator
        Comparator<Item> comparator = new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                //handle null first
                if(o1 == null){
                    return -1;
                }
                if(o2 == null){
                    return 1;
                }
                //ASC name
                return o1.getName().compareTo(o2.getName());
            }
        };
        // lambda

        Comparator<Item> c1 = (Item i1, Item i2) ->{
            return i1.getId() - i2.getId();
        };
        Comparator<Item> c2 = (i1,i2)->i1.getId() - i2.getId();

        Comparator<Item> c3 = Comparator.comparing(new Function<Item, Integer>() {
            @Override
            public Integer apply(Item item) {
                return item.getId();
            }
        });
        // import static comparator -> comparing -> then comparing -> reverse...
        Comparator<Item> c4 = comparing(i->i.getId());
        Arrays.sort(items, c4.thenComparing(i->i.getPrice(), reverseOrder()));
        ArrayUtils.printf(items);


    }
}
