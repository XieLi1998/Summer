package June;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xieli on 2020/6/19.
 */
public class lengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int len = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for (int start = 0, end = 0; end < len; end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha))
                start = Math.max(map.get(alpha), start);
            res = Math.max(res, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return res;
    }

    //滑动窗口刷题框架
    public int lengthOfLongestSubstring_pro(String s) {
        int left = 0, right = 0;
        HashMap<Character, Integer> windows = new HashMap<>();
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
