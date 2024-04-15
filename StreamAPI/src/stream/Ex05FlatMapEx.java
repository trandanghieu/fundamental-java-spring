package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex05FlatMapEx {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "world", "Java", "Stream");

        // Sử dụng flatMap để biến đổi danh sách các từ thành một luồng các ký tự duy nhất
        Stream<Character> characterStream = words.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c));

        // Thu thập các ký tự duy nhất vào một danh sách và in ra
        List<Character> uniqueCharacters = characterStream
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Các ký tự duy nhất từ danh sách các từ:");
        System.out.println(uniqueCharacters);
    }
}
