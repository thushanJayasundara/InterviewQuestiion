import java.util.Arrays;

public class MaximumProductOfTwoNumbers {

    public static void main(String[] args) {
        int[] numbers = {7, 17, 13, 19, 5};
        int result = maximumProduct(numbers);
        System.out.println(result);
    }

    static int maximumProduct(int[] nums) {
       int length = nums.length;
       int max = Integer.MIN_VALUE;

       if (length < 2) {
           return max;
       }

        Arrays.sort(nums);
       int maxProduct = nums[length - 2] * nums[length - 1];
       int minProduct = nums[0] * nums[length - 1];

       if(maxProduct > minProduct){
           return maxProduct;
       }else {
           return minProduct;
       }

    }

}
