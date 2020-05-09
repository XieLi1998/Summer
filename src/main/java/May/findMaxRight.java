package May;

import java.util.Stack;

/**
 * Created by xieli on 2020/5/9.
 */
public class findMaxRight {


    public static int[] findMaxRight(int[] array) {
        int[] res = new int[array.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int index = 1;
        while (index < array.length) {
            if (!stack.isEmpty() && array[index] > array[stack.peek()]) {
                res[stack.pop()] = array[index];
            } else {
                stack.push(index++);
            }
        }
        while (!stack.isEmpty())
            res[stack.pop()]=-1;
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {8, 2, 5, 4, 3, 9, 7, 2, 5};
        int[] res = findMaxRight(nums);
        for (int val : res) {
            System.out.print(val + " ");
        }
    }

}
