package AddTwoNumbers;

public class Solution {

    // Method to add two numbers represented by linked lists
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);  // Dummy node to hold the result
        ListNode current = dummy;
        int carry = 0;

        // Traverse both linked lists
        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;  // Get value from l1 or 0 if null
            int val2 = (l2 != null) ? l2.val : 0;  // Get value from l2 or 0 if null

            int sum = val1 + val2 + carry;  // Sum of two digits + carry
            carry = sum / 10;  // Calculate carry for next digit
            int newVal = sum % 10;  // Current digit

            // Create new node for the sum and move the current pointer
            current.next = new ListNode(newVal);
            current = current.next;

            // Move to the next nodes in the lists if available
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;  // Return the next node after dummy (head of result list)
    }


}