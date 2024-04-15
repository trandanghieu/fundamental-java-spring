package strategypattern;

import bean.Apple;
import bean.WeightType;

import static utils.AppleUtils.*;

import java.util.ArrayList;
import java.util.List;

public class Ex01AppleFilter {
    public static void main(String[] args) {
        List<Apple> listApples = getAppleData();
        // Apple which color is green
        printf(appleFilter(listApples, "Green"));
        // Apple which heavier than 150
        printf(appleFilter(listApples, 150d));
        // Apple which heavier than 150
        printf(appleFilter(listApples, 150d,WeightType.HEAVY));
        // Apple which lighter than 150
        printf(appleFilter(listApples, 150d,WeightType.LIGHT));
    }

    // Get all apple heavier or lighter than 150
    public static List<Apple> appleFilter(List<Apple> listApples, Double weight, WeightType type) {
        List<Apple> results = new ArrayList<>();
        switch (type) {
            case HEAVY:
                for (Apple apple : listApples) {
                    if (apple.getWeight() > weight) {
                        results.add(apple);
                    }
                }
            break;
            case LIGHT:
                for (Apple apple : listApples) {
                    if (apple.getWeight() < weight) {
                        results.add(apple);
                    }
                }
            break;
        }
        return results;
    }

    //Get all apple heavier than 150
    public static List<Apple> appleFilter(List<Apple> listApples, Double weight) {
        List<Apple> results = new ArrayList<>();
        for (Apple apple : listApples) {
            if (apple.getWeight() > weight) {
                results.add(apple);
            }
        }
        return results;
    }

    //Get all apples have color green
    public static List<Apple> appleFilter(List<Apple> listApples, String color) {
        List<Apple> results = new ArrayList<>();
        for (Apple apple : listApples) {
            if (color.equals(apple.getColor())) {
                results.add(apple);
            }
        }
        return results;
    }
}
