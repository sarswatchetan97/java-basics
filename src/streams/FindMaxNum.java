package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxNum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 4, 41, 4);

        int maxNum = numbers.stream()
                .max(Comparator.naturalOrder()).orElse(0);

        System.out.println(maxNum);

        //2nd method
        int maximumNumber = numbers.stream().max((o1, o2) -> o1 - o2).orElse(0);
        System.out.println(maximumNumber);
    }
}
