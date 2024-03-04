package declaration;

import bean.Item;

public class Declare {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        String[] names = {"John", "Tom","Alice","Kaka"};
        String[] jobs = new String[]{"Student", "Police","Teacher"};
        Item[] items = {new Item(1,"Milk",80d),
                       new Item(2,"Chicken", 160d)
        };
        for(Item item:items){
            System.out.print(item.getName());
        }
    }
}
