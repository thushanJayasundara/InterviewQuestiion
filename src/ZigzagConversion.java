public class ZigzagConversion {

    public String convert(String s, int numRows) {
        // Handle the edge case where numRows is 1
        if (numRows == 1) return s;

        // Create a StringBuilder for each row
        StringBuilder[] rows = new StringBuilder[Math.min(numRows, s.length())];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new StringBuilder();
        }

        // Variables to track the current row and direction (up or down)
        int currentRow = 0;
        boolean goingDown = false;

        // Iterate over each character in the string and place it in the appropriate row
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);
            // Change direction when reaching the first or last row
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currentRow += goingDown ? 1 : -1;
        }

        // Combine all rows into one string
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        ZigzagConversion zigzag = new ZigzagConversion();

        // Test example 1
        String s1 = "PAYPALISHIRING";
        int numRows1 = 3;
        System.out.println("Example 1 Output: " + zigzag.convert(s1, numRows1)); // Expected: "PAHNAPLSIIGYIR"

        // Test example 2
        String s2 = "PAYPALISHIRING";
        int numRows2 = 4;
        System.out.println("Example 2 Output: " + zigzag.convert(s2, numRows2)); // Expected: "PINALSIGYAHRPI"

        // Test example 3
        String s3 = "A";
        int numRows3 = 1;
        System.out.println("Example 3 Output: " + zigzag.convert(s3, numRows3)); // Expected: "A"
    }
}
