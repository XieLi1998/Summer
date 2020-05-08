package April;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xieli on 2020/4/30.
 */
public class merge {
    public static int[] merge(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<Integer>();
        int p1 = 0, p2 = 0;
        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] < nums2[p2]) {
                if (list.size() == 0 || list.get(list.size() - 1) != nums1[p1]) {
                    list.add(nums1[p1]);
                }
                p1++;
            } else {
                if (list.size() == 0 || list.get(list.size() - 1) != nums2[p2]) {
                    list.add(nums2[p2]);
                }
                p2++;
            }
        }

        while (p1 < nums1.length) {
            if (list.get(list.size() - 1) != nums1[p1]) {
                list.add(nums1[p1]);
            }
            p1++;
        }

        while (p2 < nums2.length) {
            if (list.get(list.size() - 1) != nums2[p2]) {
                list.add(nums2[p2]);
            }
            p2++;
        }

        int size = list.size();

        Integer[] array = list.toArray(new Integer[size]);
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = array[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 4, 5, 6, 98};
        int[] nums2 = {1, 2, 11, 52, 78, 82, 999};
        int[] res = merge(nums1, nums2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
