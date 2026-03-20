import java.util.Arrays;
import java.util.List;

public class TraditionalVsStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        int sumOfNumSquares = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                int square = num * num;
                sumOfNumSquares += square;
            }
        }

        System.out.println("Sum of square of numbers: " + sumOfNumSquares);

        int sum_OfNumSquares = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(num -> num * num)
                .sum();

        System.out.println("Sum of square of number: " + sum_OfNumSquares);
    }
}
