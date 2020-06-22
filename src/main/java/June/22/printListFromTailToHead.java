import java.util.ArrayList;

/**
 * Created by xieli on 2020/6/22.
 */
public class printListFromTailToHead {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }


    ArrayList<Integer> res = new ArrayList<>();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode != null) {
            printListFromTailToHead(listNode.next);
            res.add(listNode.val);
        }
        return res;
    }

}
