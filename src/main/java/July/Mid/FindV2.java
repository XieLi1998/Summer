/**
 * Created by xieli on 2020/7/10.
 */
public class FindV2 {

    public boolean Find(int target, int[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0)
            return false;
        int rows = array.length, cols = array[0].length;
        int r = rows - 1, c = 0;
        while (r >= 0 && c <= cols - 1) {
            if (target == array[r][c])
                return true;
            else if (target > array[r][c])
                c++;
            else
                r--;
        }
        return false;
    }

}
