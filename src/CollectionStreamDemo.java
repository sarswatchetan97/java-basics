import java.util.*;
import java.util.stream.Collectors;

public class CollectionStreamDemo {
    public static void main(String[] args) {
//        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
//        List<String> longNames = new ArrayList<>();
//        for (String name : names) {
//            if (name.length() > 3) {
//                longNames.add(name);
//            }
//        }
//        System.out.println(longNames);

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
        List<String> longNames = names.stream()
                .filter(name -> name.length() > 3)
                .collect(Collectors.toList());

        System.out.println(longNames);
    }
}
