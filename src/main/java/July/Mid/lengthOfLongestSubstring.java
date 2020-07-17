import java.util.HashMap;

/**
 * Created by xieli on 2020/7/17.
 */
public class lengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        HashMap<Character, Integer> windows = new HashMap<>();
        int res = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            windows.put(c, windows.getOrDefault(c, 0) + 1);
            right++;

            while (windows.get(c) > 1) {
                char c1 = s.charAt(left);
                windows.put(c1, windows.get(c1) - 1);
                left++;
            }

            res = Math.max(res, right - left);

        }
        return res;
    }

}
