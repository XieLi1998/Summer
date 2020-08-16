package August.Late;

/**
 * Created by xieli on 2020/8/16.
 */
public class deleteNode {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val)
            return head.next;
        ListNode pre = head, cur = head.next;
        while (cur != null && cur.val != val) {
            pre = cur;
            cur = cur.next;
        }
        if (cur != null)
            pre.next = cur.next;
        return head;
    }

    public ListNode deleteNode(ListNode head, ListNode val) {
        if (head == null || val == null)
            return null;

        if (val.next != null) {
            ListNode next = val.next;
            val.val = next.val;
            val.next = next.next;
        } else if (head == null) {
            head = null;
        } else {
            ListNode cur = head;
            while (cur.next != val) {
                cur = cur.next;
            }
            cur.next = null;
        }
        return head;
    }

}
