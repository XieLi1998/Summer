import java.util.Stack;

/**
 * Created by xieli on 2020/7/15.
 */
public class IsPopOrder {

    public boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA.length == 0 || popA.length == 0)
            return false;

        int cur = 0;
        Stack<Integer> stack = new Stack<>();
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
