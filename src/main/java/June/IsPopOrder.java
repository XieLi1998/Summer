package June;

import java.util.Stack;

/**
 * Created by xieli on 2020/6/16.
 */
public class IsPopOrder {

    public boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA.length == 0 || popA.length == 0)
            return false;

        Stack<Integer> stack = new Stack<>();
        int cur = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);

            while (!stack.isEmpty() && stack.peek() == popA[cur]) {
                stack.pop();
                cur++;
            }
        }

        return stack.isEmpty();
    }

}
