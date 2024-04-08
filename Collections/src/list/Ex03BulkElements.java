package list;

import utils.CollectionUtils;

import java.util.List;

public class Ex03BulkElements {
    //retainALl(remove hiệu),removeALl(remove giao),addAll(hợp)
    public static void main(String[] args) {
        List<Integer> listA = CollectionUtils.init(1,2,3,4,5);
        List<Integer> listB = CollectionUtils.init(5,6,7,8,9,10);

        //listA.addAll(listB);
        //CollectionUtils.printf(listA);// 1 2 3 4 5 5 6 7 8 9 10

        listA.removeAll(listB);
        CollectionUtils.printf(listA);
        CollectionUtils.printf(listB);

        //listA.removeAll(listB);
        //CollectionUtils.printf(listA);// 1 2 3 4

    }
}
