package strategypattern;

import bean.Apple;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import static utils.AppleUtils.getAppleData;
import static utils.AppleUtils.printf;

/*
    Lambda expression: Có thể được hiểu như cách trình bày ngắn gọn của 1 anonymous function có thể pass around(truyền vào)
                        bất cứ nơi đâu, không có tên nhưng có tham số, body và return type


 */
public class Ex03LambdaExpression {
    public static void main(String[] args) {
        List<Apple> appleList = getAppleData();

        printf( filter(appleList, (apple) -> apple.getWeight()>150));
        System.out.println("=======Country========");
        printf(map(appleList, apple -> apple.getCountry()));
    }
    public static <T,R> Set<R> map(List<T> ts, Function<T,R> function){
        Set<R> set = new HashSet<>();
        for(T t: ts){
           set.add(function.apply(t));
        }
        return set;
    }


    public static List<Apple> filter(List<Apple> appleList, Predicate<Apple> predicate){
        List<Apple> results = new ArrayList<>();
        for (Apple apple : appleList) {
            if (predicate.test(apple)) {
                results.add(apple);
            }
        }
        return results;
    }
}
