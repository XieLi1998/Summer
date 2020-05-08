package May;

import java.util.ArrayList;

/**
 * Created by xieli on 2020/5/8.
 */
public class findPalindrome {

    public static ArrayList<String> findPalindrome(String s) {
        ArrayList<String> list = new ArrayList<String>();
        if (s == null || s.length() == 0)
            return list;
        for (int i = 0; i < s.length(); i++) {
            findPalindromeHelper(s, i, i, list);
            findPalindromeHelper(s, i, i + 1, list);
        }
        return list;
    }

    private static void findPalindromeHelper(String s, int start, int end, ArrayList<String> list) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            String subString = s.substring(start, end + 1);
            if (!list.contains(subString))
                list.add(subString);
            start--;
            end++;
        }
    }

    public static void main(String[] args) {
        String s = "a";
        System.out.println(findPalindrome(s));
    }
}
