package data;

import bean.Item;

public class Data {
    private Data(){

    }
    public static Item[] getItems(){
        return new Item[]{
            new Item(1,11,"Ice",133d),
                new Item(1,11,"Ice",63d),
                new Item(2,21,"Milk",43d),
                new Item(3,31,"Juice",23d),
                new Item(2,22,"Water",13d),
                new Item(3,32,"Beer",33d),
                new Item(1,12,"Car",933d),

        };
    }
    public static Item[] getItemsNull(){
        return new Item[]{
                null,null,
                new Item(1,11,"Ice",133d),
                new Item(1,11,"Ice",63d),
                new Item(2,21,"Milk",43d),
                new Item(3,31,"Juice",23d),
                null,
                new Item(2,22,"Water",13d),
                null,
                new Item(3,32,"Beer",33d),
                new Item(1,12,"Car",933d),

        };
    }
}
