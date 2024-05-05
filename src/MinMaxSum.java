import java.util.Arrays;

public class MinMaxSum {

    public static void main(String[] args) {

        int[] integers = {1, 6, 5, 8, 2};
        long[] result = findMinMaxSum(integers);
        System.out.println(result[0] + " " + result[1]);

    }

    public static long[] findMinMaxSum(int[] arr) {
        // Sort the array
        Arrays.sort(arr);

        // Calculate the minimum sum
        long minSum = 0;
        for (int i = 0; i < 4; i++) {
            minSum += arr[i];
        }

        // Calculate the maximum sum
        long maxSum = 0;
        for (int i = 1; i < 5; i++) {
            maxSum += arr[i];
        }

        return new long[]{minSum, maxSum};
    }
}