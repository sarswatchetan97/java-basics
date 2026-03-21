import java.util.Arrays;

public class ParallelDemo {
    public static void main(String[] args) {

        int[] intArr = new int[1000000];
        Arrays.fill(intArr, 2);

//        Calculate sum of squares using sequential stream
        long startTime = System.currentTimeMillis();

        long sum = Arrays.stream(intArr)
                .mapToLong(num -> num * num)
                .sum();

        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);

//        Calculate sum of squares using parallel stream
        long startTimeP = System.currentTimeMillis();

        long sumP = Arrays.stream(intArr)
                .parallel()
                .mapToLong(num -> num * num)
                .sum();

        long endTimeP = System.currentTimeMillis();

        System.out.println(endTimeP - startTimeP);
    }
}
