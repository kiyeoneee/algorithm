package leetcode.easy;

import leetcode.common.ListNode;

public class ReverseLinkedList {
    /*
     * url : https://leetcode.com/problems/reverse-linked-list/
     *
     * LinkedList
     * 단순히 링크드 리스트의 개념을 묻는 문제
     *
     * Runtime : faster than 100.00% of Java online submissions
     * Memory Usage : less than 97.58% of Java online submissions
     * Time complexity : O(n)
     * Space complexity : O(1)
     */
    public ListNode reverseList(ListNode head) {
        ListNode current = new ListNode();
        ListNode prev = new ListNode();

        while (head != null) {
            current.val = head.val;
            prev.next = current;
            current = prev;
            prev = new ListNode();

            head = head.next;
        }

        return current.next;
    }
}
