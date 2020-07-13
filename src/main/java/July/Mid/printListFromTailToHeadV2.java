import java.util.ArrayList;

/**
 * Created by xieli on 2020/7/13.
 */
public class printListFromTailToHeadV2 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            ArrayList<Integer> res = new ArrayList<>();
            while (listNode != null) {
                res.add(0, listNode.val);
                listNode = listNode.next;
            }
            return res;
        }
    }
}
