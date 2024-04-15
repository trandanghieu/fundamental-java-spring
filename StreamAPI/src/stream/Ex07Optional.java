package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    isPresent, ifPrsent,
 */
public class Ex07Optional {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", null, "orange", null, "grape");

        // Chuyển đổi mỗi chuỗi thành Optional chứa độ dài của chuỗi đó
        List<Optional<Integer>> optionalLengths = strings.stream()
                .map(str -> (str == null) ? Optional.<Integer>empty() : Optional.of(str.length()))
                .collect(Collectors.toList());

        // Sử dụng flatMap để loại bỏ các Optional chứa null và thu thập các độ dài vào danh sách
        List<Integer> lengthsWithoutNulls = optionalLengths.stream()
                .flatMap(opt -> opt.map(Stream::of).orElseGet(Stream::empty))
                .collect(Collectors.toList());

        // In ra độ dài của các chuỗi không phải là null
        System.out.println("Độ dài của các chuỗi không phải là null:");
        System.out.println(lengthsWithoutNulls);
    }
}
