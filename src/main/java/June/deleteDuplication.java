package June;

import May.deleteNode;

/**
 * Created by xieli on 2020/6/1.
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
            while (node != null && node.val == pHead.val)
                node = node.next;
            //从第一个与当前结点不同的结点继续递归
            return deleteDuplication(node);
        } else {
            //保留当前节点，从下一个节点继续递归
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }
    }

    public ListNode deleteDuplication_pro(ListNode pHead) {
        if (pHead == null || pHead.next == null)
            return pHead;
        ListNode head = new ListNode(-1);
        ListNode tail = head;

        while (pHead != null) {
            ListNode node = pHead.next;
            boolean flag = false;
            while (node != null && node.val == pHead.val) {
                node = node.next;
                flag = true;
            }
            if (!flag) {
                tail.next = pHead;
                tail = tail.next;
            }
            pHead = node;
        }
        tail.next = null;
        return head.next;
    }
}
