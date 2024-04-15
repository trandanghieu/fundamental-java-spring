package stream;
/*
     flatMap: T -> Stream<R>
 */


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex04FlatMap {

    public static void main(String[] args) {
        List<String> s1 = Arrays.asList("a", "b", "c");
        List<String> s2 = Arrays.asList("I", "II", "III");
        List<String> s3 = Arrays.asList(".", "*", "^");

        List<List<String>> s = Arrays.asList(s1, s2, s3);
        System.out.println("=====Ex01======");
        // list->list.stream() <=> Collection::stream
        s.stream().flatMap(list -> list.stream())//
                .filter(item -> item.matches("[a-zA-Z]+"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("=====Ex02======");

        //Arrays.stream(array) <=> Arrays::stream
        int[][] a = {{1, 2, 5}, {4, 6, 7}, {2, 9, 8}};
        int[] data = Arrays.stream(a)// Stream<int[]>
                .flatMapToInt(array -> Arrays.stream(array))// intStream
                .filter(item -> item % 2 != 0).toArray();


    }


}
