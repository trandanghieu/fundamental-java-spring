package set;

import bean.Item;

import java.util.HashSet;
import java.util.Set;

public class Ex02SetObject {
    public static void main(String[] args) {
        Set<Item> items = new HashSet<>();
        items.add(new Item(101,"Orange",40d,1));
        items.add(new Item(102,"Milk",41d,1));
        items.add(new Item(201,"Noddle",42d,2));
        items.add(new Item(202,"Coffee",39d,2));
        items.add(new Item(301,"Cream",38d,3));
        items.add(new Item(301,"Cream",38d,3));



        System.out.println("Size: " + items.size());
    }

}
