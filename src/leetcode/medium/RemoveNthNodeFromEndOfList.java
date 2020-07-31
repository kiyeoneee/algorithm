package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class RemoveNthNodeFromEndOfList {
    // url : https://leetcode.com/problems/remove-nth-node-from-end-of-list/

    public class ListNode {
        int val;
        ListNode next;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }

        List<ListNode> list = new ArrayList<>();
        list.add(head);

        ListNode tmp = head;
        while (tmp.next != null) {
            list.add(tmp.next);
            tmp = tmp.next;
        }

        if (n >= list.size())
            return head.next;
        else if (n == 1)
            list.get(list.size() - n - 1).next = null;
        else
            list.get(list.size() - n - 1).next = list.get(list.size() - n + 1);

        return head;
    }
}
