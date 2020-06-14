package June;

import java.util.Stack;

/**
 * Created by xieli on 2020/6/14.
 */
public class FindKthToTail {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k <= 0)
            return null;

        ListNode fast = head, slow = head;

        for (int i = 0; i < k; i++) {
            if (fast == null)
                return null;
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }

    public ListNode FindKthToTail_02(ListNode head, int k) {
        if (head == null || k <= 0)
            return null;

        Stack<ListNode> stack = new Stack<>();
        int count = 0;

        while (head != null) {
            stack.push(head);
            head = head.next;
            count++;
        }

        if (count < k)
            return null;

        ListNode ans = null;

        for (int i = 0; i < k; i++) {
            ans = stack.pop();
        }

        return ans;
    }

}
