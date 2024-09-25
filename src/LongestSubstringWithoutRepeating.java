import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {
        // Set to store unique characters in the current window
        Set<Character> uniqueChars = new HashSet<>();
        int left = 0, right = 0; // Pointers for the sliding window
        int maxLength = 0; // Variable to store the max length of the substring

        // Slide the right pointer through the string
        while (right < s.length()) {
            // If the character is not in the set, add it
            if (!uniqueChars.contains(s.charAt(right))) {
                uniqueChars.add(s.charAt(right));
                right++;
                maxLength = Math.max(maxLength, right - left); // Update max length
            } else {
                // If the character is already in the set, remove the left-most character
                uniqueChars.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength; // Return the maximum length found
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println("Input: " + s1 + " | Output: " + lengthOfLongestSubstring(s1)); // Output: 3
        System.out.println("Input: " + s2 + " | Output: " + lengthOfLongestSubstring(s2)); // Output: 1
        System.out.println("Input: " + s3 + " | Output: " + lengthOfLongestSubstring(s3)); // Output: 3
    }
}