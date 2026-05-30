package streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckIfEven {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2, 4, 6, 8, 10);

        boolean isEven = number.stream()
                .allMatch(num -> num % 2 == 0);

        System.out.println(isEven);

        //Display all even numbers

        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 11, 12, 13, 14, 15, 20, 21, 26, 24);

        List<Integer> evenList = numberList.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenList);
    }
}
