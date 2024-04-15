package strategypattern;

import bean.Apple;
import functionalinterface.Strategy;
import functionalinterface.Strategy;

import static utils.AppleUtils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex02FilterStrategyPattern {
    public static void main(String[] args) {
        List<Apple> appleList = getAppleData();

        printf( filter(appleList, (apple) -> apple.getWeight()>150));

    }
    // Strategy is a behavior parameterization
    private static List<Apple> filter(List<Apple> appleList, Strategy strategy){
        List<Apple> results = new ArrayList<>();
        for (Apple apple : appleList) {
            if (strategy.strategy(apple)) {
                results.add(apple);
            }
        }
        return results;
    }
}
