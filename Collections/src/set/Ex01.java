package set;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
    public static void main(String[] args) {
        Set<Integer> digits = new HashSet<>();
        digits.add(3);
        digits.add(2);
        digits.add(8);
        digits.add(4);
        digits.add(7);
        digits.add(2);
        System.out.println("Size: " + digits.size());

    }
}
