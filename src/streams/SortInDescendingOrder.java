package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortInDescendingOrder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 11, 1, 3, 5, 6, 5);
        List<Integer> result = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder()).toList();

        System.out.println(result);
    }
}
