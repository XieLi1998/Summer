import java.util.HashMap;
import java.util.Map;

/**
 * Created by xieli on 2020/7/28.
 */
public class twosum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]))
                return new int[]{map.get(target - nums[i]), i};
            map.put(nums[i], i);
        }
        return null;
    }

}
