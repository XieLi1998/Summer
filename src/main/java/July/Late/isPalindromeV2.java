/**
 * Created by xieli on 2020/7/24.
 */
public class isPalindromeV2 {

    public boolean isPalindrome(int x) {
        String str = new StringBuilder(x + "").reverse().toString();
        return (x + "").equals(str);
    }

}
