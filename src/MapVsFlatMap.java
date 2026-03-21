import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {
        //Map Demo

        List<String> words = Arrays.asList("Hello", "Everyone");

        List<String> upperCaseWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Using Map: " + upperCaseWords);

        //FlatMap Demo
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        List<Integer> flattenList = nestedList.stream()
                .flatMap(List::stream)
                .map(num -> num*3)
                .collect(Collectors.toList());

        System.out.println("Using FlatMap: " + flattenList);

 }
}
