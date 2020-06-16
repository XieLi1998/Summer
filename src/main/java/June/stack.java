package June;

import java.util.Stack;

/**
 * Created by xieli on 2020/6/16.
 */
public class stack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public void push(int node) {
        stack.push(node);
        if (min.size() == 0 || node < min.peek()) {
            min.push(node);
        } else {
            min.push(min.peek());
        }
    }

    public void pop() {
        if (stack.size() > 0 && min.size() > 0) {
            stack.pop();
            min.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min.peek();
    }

}
