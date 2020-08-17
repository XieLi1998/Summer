package August.Late;

/**
 * Created by xieli on 2020/8/17.
 */
public class Clone {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null)
            return null;

        RandomListNode cur = pHead;
        while (cur != null) {
            RandomListNode clone = new RandomListNode(cur.label);
            clone.next = cur.next;
            cur.next = clone;
            cur = clone.next;
        }

        cur = pHead;
        while (cur != null) {
            RandomListNode clone = cur.next;
            clone.random = cur.random == null ? null : cur.random.next;
            cur = clone.next;
        }

        cur = pHead;
        RandomListNode res = pHead.next;
        while (cur != null) {
            RandomListNode clone = cur.next;
            cur.next = clone.next;
            clone.next = clone.next == null ? null : clone.next.next;
            cur = cur.next;
        }
        return res;
    }

}
