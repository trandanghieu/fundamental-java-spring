package sorting;

import bean.Item;
import data.Data;
import utils.ArrayUtils;

public class Ex02SortObject {
    public static void main(String[] args) {
        Item[] items = Data.getItems();
        sortByStoreId(items);
        ArrayUtils.printf(items);
    }
    //order by storeId -> Id
    public static void sortByStoreId(Item[] items) {
        for (int round = 0; round < items.length; round++) {
            for (int i = 0; i < items.length - round - 1; i++) {
                if (items[i].getStoreId() > items[i + 1].getStoreId()) {
                    ArrayUtils.swap(items, i, i + 1);
                    continue;
                }
                if (items[i].getStoreId() == items[i + 1].getStoreId() && items[i].getId() > items[i + 1].getId()) {
                    ArrayUtils.swap(items, i, i + 1);
                }
            }

        }
    }


    // order by name
    public static void sort(Item[] items) {
        for (int round = 0; round < items.length; round++) {
            for (int i = 0; i < items.length - round - 1; i++) {
                if (items[i].getName().compareTo(items[i + 1].getName()) > 0) {
                    ArrayUtils.swap(items, i, i + 1);
                }
            }

        }
    }
}
