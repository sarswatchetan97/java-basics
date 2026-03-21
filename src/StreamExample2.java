import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 9, 10);

        //Intermediate Operations
        List<Integer> squaredIntegers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .distinct()
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println("Square of Even Number: " + squaredIntegers);

        //Terminal Operations
        long count = numbers.stream()
                .filter(n -> n > 5)
                .distinct()
                .count();

        System.out.println("Count of numbers: " + count);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of Numbers: " + sum);
    }
}
