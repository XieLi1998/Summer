package May;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by xieli on 2020/5/9.
 */
public class intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }

        Set<Integer> parentSet = new HashSet<>();
        Set<Integer> childSet = new HashSet<>();
        for (int num : nums1) {
            parentSet.add(num);
        }

        for (int num : nums2) {
            if (parentSet.contains(num)) {
                childSet.add(num);
            }
        }
        int[] result = new int[childSet.size()];
        int index = 0;
        for (int value : childSet) {
            result[index++] = value;
        }
        return result;
    }
}
