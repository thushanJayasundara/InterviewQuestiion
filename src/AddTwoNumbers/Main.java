package AddTwoNumbers;

import static AddTwoNumbers.Util.createLinkedList;
import static AddTwoNumbers.Util.printLinkedList;

public class Main {

    public static void main(String[] args) {

        int[] l1Array = {2, 4, 3};
        int[] l2Array = {5, 6, 4};

        ListNode l1 = createLinkedList(l1Array);
        ListNode l2 = createLinkedList(l2Array);

        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2);

        System.out.print("Output: ");
        printLinkedList(result);  // Should print 7 -> 0 -> 8
    }

}
