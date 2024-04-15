package strategypattern;
import bean.Apple;
import utils.AppleUtils;
import java.util.List;
/*
    Method reference có thể giúp mình tái sử dụng các phương thức co sẵn và pass them same lambda
    Method reference giúp cta dễ đọc hơn và dễ hiểu hơn biểu thức lambda
    Method reference cũng là một instance của funtional interface(behavior)
    *    instance -> ClassA.[ClassB].method(instance) <=> ClassA.[ClassB]::Method
    *    (Class instance) -> instance.ClassA#method   <=> ClassA::method
    *    (String s) -> s.length()                     <=> String::length
    *     s->Integer.parseInt(s)    <=> Integer::parseInt
 */
public class Ex05MethodReference {
    public static void main(String[] args) {
        List<Apple> listApples = AppleUtils.getAppleData();

        listApples.forEach(apple -> System.out.println(apple));
        listApples.forEach(System.out::println);

        AppleUtils.map(listApples, apple -> apple.getCountry());
        AppleUtils.map(listApples, Apple::getCountry);




    }
}
