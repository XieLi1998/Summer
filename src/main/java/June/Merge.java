package June;

/**
 * Created by xieli on 2020/6/14.
 */
public class Merge {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        if (list1.val < list2.val) {
            list1.next = Merge(list1.next, list2);
            return list1;
        } else {
            list2.next = Merge(list1, list2.next);
            return list2;
        }
    }

    public ListNode Merge_02(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode root = head;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                head.next = list1;
                head = head.next;
                list1 = list1.next;
            } else {
                head.next = list2;
                head = head.next;
                list2 = list2.next;
            }
        }

        if (list1 != null)
            head.next = list1;
        if (list2 != null)
            head.next = list2;

        return root.next;
    }

}
