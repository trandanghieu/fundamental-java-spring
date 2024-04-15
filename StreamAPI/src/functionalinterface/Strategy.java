package functionalinterface;

import bean.Apple;

@FunctionalInterface
public interface Strategy {
    boolean strategy(Apple apple);
}
