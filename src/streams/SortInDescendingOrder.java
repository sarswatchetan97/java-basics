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

        List<Double> doubleList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98,
                21.12);

        List<Double> doubleResult = doubleList.stream()
                .sorted(Comparator.reverseOrder()).toList();

        System.out.println(doubleResult);
    }
}
