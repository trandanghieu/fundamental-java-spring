package list;

import bean.Item;
import data.Data;
import utils.CollectionUtils;

import java.util.*;

public class Ex02DataManipulation {
    public static void main(String[] args) {
        List<String> elements = Arrays.asList("A", "B", "C", "D");
        List<String> sequences = new ArrayList<>();




        System.out.println(elements.contains("G"));
        Collections.reverse(elements);
        Collections.shuffle(elements);
        CollectionUtils.printf(elements);
        System.out.println("\n======");
        sequences.addAll(elements);
        CollectionUtils.printf(sequences);


    }
}
