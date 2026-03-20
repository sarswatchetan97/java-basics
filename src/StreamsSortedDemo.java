import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamsSortedDemo {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 3, 6, 2, 7, 8, -1, 0);
        List<Integer> sortedNum = num.stream()
                                    .sorted(Comparator.reverseOrder())
                                    .toList();
        System.out.println(sortedNum);
    }
}
