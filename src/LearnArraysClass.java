import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = Arrays.binarySearch(numbers, 4);
        System.out.println("The index of element 4 in the array is " + index);

        Integer[] nums = {10, 2, 32, 12, 15, 76, 17, 48, 79, 9 };

        //Arrays.sort(nums);
        Arrays.parallelSort(nums);

            // Print elements of sorted array
        for (int num: nums) {
            System.out.println(num);
        }

        Arrays.fill(nums, 12);
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
