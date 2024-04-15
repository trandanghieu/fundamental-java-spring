package utils;

import bean.Dish;

import java.util.Arrays;
import java.util.List;

public class DishUtils {
    private DishUtils(){
    }
    public static List<Dish> getAllDish(){
        return Arrays.asList(
                new Dish("1","Noodle",300d, Dish.Kind.FISH, false),
                new Dish("2","Hamburger",200d, Dish.Kind.MEAT, true),
                new Dish("3","Ramen",400d, Dish.Kind.MEAT, true),
                new Dish("4","Sashimi",700d, Dish.Kind.FISH, false),
                new Dish("5","Sausages",600d, Dish.Kind.MEAT, true),
                new Dish("6","Grilled",600d, Dish.Kind.FISH, false)
        );
    }


}
