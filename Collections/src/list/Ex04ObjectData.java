package list;

import bean.Item;
import data.Data;
import utils.CollectionUtils;

import static  java.util.Comparator.*;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Ex04ObjectData {
    public static void main(String[] args) {
        List<Item> listItems = Data.getItems();
        Item i = new Item(9, "Book", 2d, 1);
        Comparator<Item> comparator = Comparator.nullsFirst(Comparator.comparing(item -> item.getStoreId()));


       listItems.sort(comparator.thenComparing(item -> item.getPrice()));
        System.out.println(listItems.contains(i));
        CollectionUtils.printf(listItems);

    }
}
