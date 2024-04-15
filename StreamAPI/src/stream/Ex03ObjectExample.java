package stream;

import bean.Dish;
import utils.DishUtils;

import java.security.Permission;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex03ObjectExample {
    public static void main(String[] args) {
        List<Dish> dishList = DishUtils.getAllDish();
        // Lấy ra những món ăn cos calories duy nhất không trùng calories

        Map<Double, Long> mapCalories = dishList
                .stream()
                .collect(Collectors.groupingBy(Dish::getCalories, Collectors.counting()));

        mapCalories.forEach((calories, count) ->
                System.out.println("Calories: " + calories + ", Count: " + count));

        List<Dish> uniqueCalorieDishes = dishList.stream()
                .filter(dish -> mapCalories.get(dish.getCalories()) == 1)
                .collect(Collectors.toList());

        System.out.println(uniqueCalorieDishes);

        System.out.println("======Distinct By=====");

        System.out.println("======Unique By=====");
       List<Dish> uniqueDishByCalories =  uniqueBy(dishList, Dish::getCalories);
        System.out.println(uniqueDishByCalories);



    }

    // solve by create function with another case
    public static <T, R> List<T> distinctBy(List<T> list, Function<T, R> function) {
        Set<R> storage = new HashSet<>();
        return list.stream()
                    .filter(item -> storage.add(function.apply(item)))
                    .collect(Collectors.toList());
    }
    public static <T,R> List<T> uniqueBy (List<T> list, Function<T,R> function){
        Map<R, List<T>> map = list.stream().collect(Collectors.groupingBy(function)); // groupingBy return [x, a b c d e f ]

        return map.entrySet().stream().filter(e->e.getValue().size()==1)
                .map((e->e.getValue().get(0))).collect(Collectors.toList());
    }

}
