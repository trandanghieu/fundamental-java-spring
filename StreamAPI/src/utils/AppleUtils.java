package utils;

import bean.Apple;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class AppleUtils {
    private AppleUtils(){

    }
    public static List<Apple> getAppleData(){
        return Arrays.asList(
                new Apple(1,"Green",200,"VietNam"),
                new Apple(2,"Yellow",400,"Japan"),
                new Apple(3,"Blue",150,"America"),
                new Apple(4,"Green",250,"Thailand"),
                new Apple(5,"Red",100,"England"),
                new Apple(6,"Violet",50,"China")
                );
    }
    public static void printf(List<Apple> appleList){
        for (Apple a: appleList) {
            System.out.println(a);
        }
    }
    public static void printf(Set<String> elements){
        for (String e: elements) {
            System.out.println(e);
        }
    }
    public static <T,R> Set<R> map(List<T> ts, Function<T,R> function){
        Set<R> set = new HashSet<>();
        for(T t: ts){
            set.add(function.apply(t));
        }
        return set;
    }
}
