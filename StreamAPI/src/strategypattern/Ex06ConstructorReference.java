package strategypattern;

import bean.Apple;
import functionalinterface.BuFunction;

import java.util.function.Supplier;

/* Constructor reference là một cách sử dụng của method reference trong Java để tạo một đối tượng bằng cách sử dụng một constructor của lớp.
    Constructor reference:
        + when use:

 */
public class Ex06ConstructorReference {
    public static void main(String[] args) {
        // Example 1 with empty constructor
        Supplier<Apple> s = new Supplier<Apple>() {
            @Override
            public Apple get() {
                return new Apple();
            }
        };

        Supplier<Apple> s1 = () -> new Apple();
        Supplier<Apple> s2 = Apple::new;

        Apple apple = s.get();
        System.out.println("A apple instance has created with in heap with address: " + System.identityHashCode(apple));
        // Example 2 using constructor have full parameter
        BuFunction<Apple, Integer, String, Double, String> s3 = new BuFunction<Apple, Integer, String, Double, String>() {
            @Override
            public Apple get(Integer id, String color, Double weight, String country) {
                return new Apple(id, color, weight, country);
            }
        };
        BuFunction<Apple, Integer, String, Double, String> s4 = (id,color,weight,country) -> new Apple(id,color,weight,country);
        BuFunction<Apple, Integer, String, Double, String> s5 = Apple::new;


        System.out.println("New apple" + s5.get(11,"Red", 100d,"Korea"));


    }
}
