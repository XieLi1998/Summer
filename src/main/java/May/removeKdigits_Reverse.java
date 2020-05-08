package May;

import java.util.Stack;

/**
 * Created by xieli on 2020/5/8.
 */
public class removeKdigits_Reverse {
    public static String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<Character>();

        for (char digit : num.toCharArray()) {
            while (stack.size() > 0 && k > 0 && stack.peek() < digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        for (int i = 0; i < k; i++) {
            stack.pop();
        }

        StringBuilder res = new StringBuilder();
//        boolean leadingZero = true;
        for (char digit : stack) {
//            if (leadingZero && digit == '0')
//                continue;
//            leadingZero = false;
            res.append(digit);
        }

//        if (res.length() == 0)
//            return "0";

        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeKdigits("1432219",3));
    }
}
