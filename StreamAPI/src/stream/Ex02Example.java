package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex02Example {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 1, 4, 2, 4, 5);

        numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);

        int[] ints = {1, 2, 3, 1, 2, 3, 4, 6, 5, 9};
        // Tìm những phần tử chỉ xuất hiện 1 lần
        //B1: convert int[] to List<Integer>
        List<Integer> nums = Arrays.stream(ints)
                .boxed()
                .collect(Collectors
                        .toList());
        //B2: Case 1:
        List<Integer> uniqueNumbers = nums.stream()
                .filter(nbr -> Collections.frequency(nums, nbr) == 1)
                .collect(Collectors.toList());
        System.out.println("==============================");
        //B2: Case 2
        nums.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey).collect(Collectors.toList())
                .forEach(System.out::println);

        //B2:Case 3
        Map<Integer, Long> countMap = Arrays.stream(ints)
                .boxed()  // Chuyển mảng int thành Stream<Integer>
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Lọc những phần tử chỉ xuất hiện 1 lần
        int[] uniqueElements = Arrays.stream(ints)
                .filter(num -> countMap.get(num) == 1)
                .toArray();
        System.out.println("....................");
        for(int i : uniqueElements){
            System.out.println(i);
        }

    }
}
