package leetcode.easy;

public class MergeTwoSortedLists {
    // url : https://leetcode.com/problems/merge-two-sorted-lists
    // TODO: 2020/09/17 메모리 고려해서 다시 풀기 

    /**
     * Linked List
     * 기본적인 링크드 리스트 문제
     * 다만 메모리를 효율적으로 쓸 수 있는 방법에 대해 다시 고민해봐야 함
     *
     * Time complexity : O(nlogn)
     * Space complexity : O(1)
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode next = new ListNode();
        ListNode head = next;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                next.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                next.next = new ListNode(l2.val);
                l2 = l2.next;
            }

            next = next.next;
        }

        if (l1 != null) {
            next.next = l1;
        } else {
            next.next = l2;
        }

        return head.next;
    }

     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
