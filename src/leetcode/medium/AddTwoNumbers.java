package leetcode.medium;

public class AddTwoNumbers {
    // url : https://leetcode.com/problems/add-two-numbers/

    public class ListNode {
        int val;
        ListNode next;

        ListNode() { }
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean isCarry = false;

        ListNode result = new ListNode();
        ListNode nextResult = new ListNode();
        result.next = nextResult;

        int carry = 0;
        while (l1 != null || l2 != null) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;

            nextResult.next = new ListNode((carry + l1Val + l2Val) % 10);

            carry = l1Val + l2Val + carry >= 10 ? 1 : 0;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            nextResult = nextResult.next;
        }

        if (carry > 0) {
            nextResult.next = new ListNode(1);
        }

        return result.next.next;
    }
}
