package May;

import java.util.Stack;

/**
 * Created by xieli on 2020/5/9.
 */
public class stackSort {

    public static void StackSort(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            while (!temp.isEmpty() && temp.peek() < cur) {
                stack.push(temp.pop());
            }
            temp.push(cur);
        }

        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
    }
}
