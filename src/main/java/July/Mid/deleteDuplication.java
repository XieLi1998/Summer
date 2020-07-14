/**
 * Created by xieli on 2020/7/14.
 */
public class deleteDuplication {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null)
            return pHead;

        if (pHead.val == pHead.next.val) {
            ListNode node = pHead.next;
            while (node != null && node.val == pHead.val) {
                node = node.next;
            }
            return deleteDuplication(node);
        } else {
            pHead.next=deleteDuplication(pHead.next);
            return pHead;
        }
    }
}
