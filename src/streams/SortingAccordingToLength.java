package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingAccordingToLength {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++",
                "COBOL", "C");

        List<String> result = stringList.stream()
                .sorted(Comparator.comparing(String::length)).toList();

        System.out.println(result);
    }
}
