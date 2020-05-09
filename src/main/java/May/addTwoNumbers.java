package May;

/**
 * Created by xieli on 2020/5/9.
 */
public class addTwoNumbers {


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head = new ListNode(-1);
            ListNode p1 = l1, p2 = l2;
            ListNode cur = head;
            int carry = 0;
            while (p1 != null || p2 != null) {
                int x = p1 != null ? p1.val : 0;
                int y = p2 != null ? p2.val : 0;
                int sum = x + y + carry;
                carry = sum / 10;
                cur.next = new ListNode(sum % 10);
                cur = cur.next;
                if (p1 != null)
                    p1 = p1.next;
                if (p2 != null)
                    p2 = p2.next;
            }
            if (carry > 0) {
                cur.next = new ListNode(carry);
            }

            return head.next;
        }
    }
}
