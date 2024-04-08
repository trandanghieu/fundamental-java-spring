package map;

import java.util.*;

/*
    HashMap: không theo thứ tự, accept a null key and many null value
    LinkedHashMap: giữ đúng vị trí của các phần tử đưa vào
    TreeMap:  tự động sắp xếp key từ nhỏ đến lớn, k thể chứa null key
    Iterate: keySet, value, entrySet, lambda expression + forEach
 */
public class Ex01 {

    public static void main(String[] args) {
        // model vehicle
        //Map<Integer, String> models = new TreeMap<>(Comparator.nullsFirst(Comparator.comparing(integer -> integer)));
        Map<Integer, String> models = new HashMap<>();

        models.put(92, "B Quảng Nam");
        models.put(76, "A Quảng Ngãi");
        models.put(77, "C KBình Định");
        //models.putIfAbsent(77, "Nghĩa Bình");
        models.put(75, "M Thừa Thiên Huế");
        //models.put(75, "Huế");
        //models.put(null, "Đà Nẵng");


        System.out.println("size: " + models.size());
        //System.out.println(models.get(77));
        //System.out.println(models.getOrDefault(76,"Default Value"));


        // keySet
        System.out.println("======iterate keySet=====");
        Set<Integer> keySet = models.keySet();
        for (Integer k : keySet) {
            System.out.println(k);
        }
        // value
        System.out.println("===iterate value====");
        Collection<String> values = models.values();
        for (String value : values) {
            System.out.println(value);
        }
        System.out.println("======== SORT=====");
        sort(models);
        //entrySet
        Set<Map.Entry<Integer, String>> entries = models.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            Integer code = entry.getKey();
            String name = entry.getValue();
            System.out.println(code + "=>" + name);
        }


    }
    //sort by key -> Tree Map -> comparator

    //sort by value
    public static Map<Integer,String> sort(Map<Integer,String> model){
        List<Map.Entry<Integer,String>> listEntry = new LinkedList<>(model.entrySet());
        listEntry.sort(Map.Entry.comparingByValue());

        Map<Integer,String> results = new LinkedHashMap<>();

        for(Map.Entry<Integer,String> entry: listEntry){
            results.put(entry.getKey(), entry.getValue());
        }
        return  results;
    }

}
