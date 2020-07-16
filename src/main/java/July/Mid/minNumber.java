import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by xieli on 2020/7/16.
 */
public class minNumber {

    public String minNumber(int[] nums) {
        if (nums == null || nums.length == 0)
            return "";

        String res = "";
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(String.valueOf(nums[i]));
        }

        Collections.sort(list, ((o1, o2) -> (o1 + o2).compareTo(o2 + o1)));

        for (String val : list)
            res += val;

        return res;
    }

    public String minNumberV2(int[] nums) {
        if (nums == null || nums.length == 0)
            return "";

        String res = "";
        String[] list = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
           list[i]=String.valueOf(nums[i]);
        }

        Arrays.sort(list, ((o1, o2) -> (o1 + o2).compareTo(o2 + o1)));

        for (String val : list)
            res += val;

        return res;
    }

}
