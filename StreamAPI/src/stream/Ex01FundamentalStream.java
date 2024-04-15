package stream;
import bean.Dish;
import utils.DishUtils;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    Strategy & Builder pattern
    Lambda expression
    Method reference
    Constructor referenece
    Collections, Arrays, Genneric
    Stream is "sequence of elements" from source that helps manipulate collection of data
    Stream có 3 phần chính:
            + SOURCE
            + INTERMEDIATE OPERATIONS
            + TERMINAL OPERATIONS
    Steps: menu-source -> stream -> intermediate operations(hàm gọi xong vẫn trả về stream filter map limit...). -> stream -> terminal operation -> non-stream type
    Feature:
        + Traversable once only(Duyệt 1 lần)
        + Stream & Collections:
            * Same: Can store and manipulate with data
            + Diff: Collection focus on store data
                    Stream focus on manipulate data
        + Inermediate operations will do nothing until a teminal operation invoked
        + Internal iteration(Duyệt bên trong)


 */
public class Ex01FundamentalStream {
    public static void main(String[] args) {
        List<Dish> dishList = DishUtils.getAllDish();
        Stream<Dish> stream = dishList.stream();
        stream.filter(dish -> dish.getName().startsWith("S"))
                .filter(dish -> dish.isVegetarian())
                .map(dish-> Map.entry(dish.getName(), dish.getCalories()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
                .forEach((name,calo) -> System.out.println(name + ": " + calo + " kal"));

    }
}
