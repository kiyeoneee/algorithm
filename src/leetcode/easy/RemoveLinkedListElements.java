package leetcode.easy;

public class RemoveLinkedListElements {
    // url : https://leetcode.com/problems/remove-linked-list-elements/

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;

        ListNode current = head;
        ListNode last = null;
        do {
            if (current.val == val) {
                if (current == head) {
                    head = current.next;
                } else {
                    last.next = current.next;
                }
            } else {
                last = current;
            }
            current = current.next;
        } while(current != null);

        return head;
    }
}
