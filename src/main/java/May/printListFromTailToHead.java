package May;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by xieli on 2020/5/21.
 */
public class printListFromTailToHead {


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        ArrayList<Integer> res = new ArrayList<>();
        while (!stack.isEmpty())
            res.add(stack.pop());
        return res;
    }

}
