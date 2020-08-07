package leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    // url : https://leetcode.com/problems/sort-list/

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode sortList(ListNode head) {
        List<Integer> values = new ArrayList<>();

        ListNode result = head;
        while (result != null) {
            values.add(result.val);
            result = result.next;
        }
        Collections.sort(values);

        result = new ListNode();
        head = result;
        for (int val : values) {
            result.next = new ListNode(val);
            result = result.next;
        }

        return head.next;
    }
}
