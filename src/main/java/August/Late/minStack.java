package August.Late;

import java.util.Stack;

/**
 * Created by xieli on 2020/8/17.
 */
public class minStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public void push(int node) {
        stack.push(node);
        if (min.isEmpty() || min.peek() > node) {
            min.push(node);
        } else {
            min.push(min.peek());
        }
    }

    public void pop() {
        if (!stack.isEmpty() && !min.isEmpty()) {
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
