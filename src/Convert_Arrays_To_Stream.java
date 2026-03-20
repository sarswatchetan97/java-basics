import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Convert_Arrays_To_Stream {
    public static void main(String[] args) {

        // Primitive Type Array
        int[] arrayInt = {1,2,3,4,5};
        IntStream streamObj = Arrays.stream(arrayInt);
        streamObj.forEach(System.out::print);
        System.out.println();

        // Object Type Array
        Integer[] arrayInteger = {7,8,9};
        Stream<Integer> objStream = Stream.of(arrayInteger);
        objStream.forEach(System.out::print);
    }
}
