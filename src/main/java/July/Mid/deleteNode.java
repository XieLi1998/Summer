/**
 * Created by xieli on 2020/7/14.
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

    public ListNode deleteNodeV2(ListNode head, ListNode val) {
        if (head == null || val == null)
            return null;
        if (val.next != null) {     // 待删除节点不是尾节点
            ListNode next = val.next;
            val.val = next.val;
            val.next = next.next;
        } else if (head == val) {   // 待删除节点只有一个节点，此节点为头节点
            head = null;
        } else {                    // 待删除节点为尾节点
            ListNode cur = head;
            while (cur.next != val) {
                cur = cur.next;
            }
            cur.next = null;
        }
        return head;
    }
}
