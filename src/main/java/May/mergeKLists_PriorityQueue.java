package May;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by xieli on 2020/5/9.
 */
public class mergeKLists_PriorityQueue {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;
        //创建一个堆，并设置元素的排序方式
        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            public int compare(ListNode o1, ListNode o2) {
                return (o1.val - o2.val);
            }
        });
//        for each 只会将每个链表的第一个元素放入堆中
//        for (ListNode node : lists) {
//            if (node != null)
//                queue.add(node);
//        }
        for (int i = 0; i < lists.length; i++) {
            while (lists[i]!=null){
                queue.add(lists[i]);
                lists[i]=lists[i].next;
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        while (!queue.isEmpty()) {
            dummy.next = queue.poll();
            dummy = dummy.next;
        }
        dummy.next = null;
        return head.next;
    }
}
