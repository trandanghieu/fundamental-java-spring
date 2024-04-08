package data;

import bean.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {
    private Data(){

    }
    public static List<Item> getItems(){
        Item i1 = new Item(1,"Milk",4d,1);
        Item i2 = new Item(1,"Beef",5d,2);
        Item i3 = new Item(2,"Pork",9d,3);
        Item i4 = new Item(3,"Meat",7d,4);
        Item i5 = new Item(2,"Chicken",6d,2);
        Item i6 = new Item(3,"Orange",1d,1);

        // return Arrays.asList(i1,i2,i3,i4,i5,i6);
        List<Item> listItems = new ArrayList<>();
        listItems.add(i1);
        listItems.add(i2);
        listItems.add(i3);
        listItems.add(i4);
        listItems.add(i5);
        listItems.add(i6);

        return listItems;
    }

}
