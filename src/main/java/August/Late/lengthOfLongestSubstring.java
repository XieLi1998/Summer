package August.Late;

import java.util.HashMap;

/**
 * Created by xieli on 2020/8/17.
 */
public class lengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        HashMap<Character, Integer> windows = new HashMap<Character, Integer>();
        int res = 0;

        while (right < s.length()) {
            char c1 = s.charAt(right);
            windows.put(c1, windows.getOrDefault(c1, 0) + 1);
            right++;

            while (windows.get(c1) > 1) {
                char c2 = s.charAt(left);
                windows.put(c2, windows.get(c2) - 1);
                left++;
            }
            res = Math.max(res, right - left);
        }
        return res;
    }

}
