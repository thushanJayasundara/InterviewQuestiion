public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure that nums1 is the smaller array for the binary search to be more efficient.
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int low = 0, high = m;

        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (m + n + 1) / 2 - partitionX;

            int maxX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];

            int maxY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];

            // Check if we found the correct partition
            if (maxX <= minY && maxY <= minX) {
                // If the total length is even
                if ((m + n) % 2 == 0) {
                    return ((double) Math.max(maxX, maxY) + Math.min(minX, minY)) / 2;
                } 
                // If the total length is odd
                else {
                    return (double) Math.max(maxX, maxY);
                }
            } 
            // Adjust the binary search
            else if (maxX > minY) {
                high = partitionX - 1; // Move partitionX left
            } else {
                low = partitionX + 1; // Move partitionX right
            }
        }
        
        // If input is invalid
        throw new IllegalArgumentException("Input arrays are not sorted.");
    }

    public static void main(String[] args) {
        MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double median = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println("The median is: " + median);  // Output: 2.0
    }
}
