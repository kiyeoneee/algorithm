package leetcode.medium;

public class OddEvenLinkedList {
    // url : https://leetcode.com/problems/odd-even-linked-list/

    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode();
        ListNode even = new ListNode();

        ListNode evenTmp = new ListNode();
        ListNode oddTmp = new ListNode();
        odd.next = oddTmp;
        even.next = evenTmp;
        for (int i = 0; head != null; i++) {
            if (i % 2 == 0) {
                oddTmp.next = new ListNode(head.val);
                oddTmp = oddTmp.next;
            } else {
                evenTmp.next = new ListNode(head.val);
                evenTmp = evenTmp.next;
            }

            head = head.next;
        }
        oddTmp.next = even.next.next;

        return odd.next.next;
    }


    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
