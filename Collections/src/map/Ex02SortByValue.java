package map;

import java.util.*;

public class Ex02SortByValue {
    public static void main(String[] args) {
        Map<Integer, String> models = new TreeMap<>();
        models.put(1, "Apple");
        models.put(2, "Orange");
        models.put(3, "Banana");
        models.put(4, "Mango");
        models.put(null, "Mango");


        Map<Integer,String> sortedMap = sort(models);

        Set<Map.Entry<Integer, String>> entries = sortedMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            Integer code = entry.getKey();
            String name = entry.getValue();
            System.out.println(code + "=>" + name);
        }
    }
    public static Map<Integer,String> sort(Map<Integer,String> models){
        List<Map.Entry<Integer,String>> listEntry = new LinkedList<>(models.entrySet());
        listEntry.sort(Map.Entry.comparingByValue());

        Map<Integer,String> results = new LinkedHashMap<>();

        for(Map.Entry<Integer,String> entry: listEntry){
            results.put(entry.getKey(), entry.getValue());
        }
        return  results;
    }

}
