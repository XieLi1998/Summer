import java.util.HashSet;
import java.util.Set;

/**
 * Created by xieli on 2020/6/26.
 */
public class removeDuplicateNodes {


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeDuplicateNodes_01(ListNode head) {
        if (head == null)
            return null;
        Set<Integer> set = new HashSet<>();
        set.add(head.val);
        ListNode pre = head;
        while (pre.next != null) {
            ListNode cur = pre.next;
            if (set.add(cur.val))
                pre = pre.next;
            else
                pre.next = pre.next.next;
        }
        pre.next = null;
        return head;
    }

    public ListNode removeDuplicateNodes(ListNode head) {
        return removeDuplicateNodesHelper(head, new HashSet<>());
    }


    private ListNode removeDuplicateNodesHelper(ListNode head, Set<Integer> set) {
        if (head == null)
            return head;
        if (set.contains(head.val))
            return removeDuplicateNodesHelper(head.next, set);
        set.add(head.val);
        head.next = removeDuplicateNodesHelper(head.next, set);
        return head;
    }

    public static void main(String[] args) {

//        Integer i1 = 100;
//        Integer i2 = 100;
//        Integer i3 = 200;
//        Integer i4 = 200;
//
//        System.out.println(i1==i2);
//        System.out.println(i3==i4);

        Double i1 = 100.0;
        Double i2 = 100.0;
        Double i3 = 200.0;
        Double i4 = 200.0;

        System.out.println(i1==i2);
        System.out.println(i3==i4);
    }
}
