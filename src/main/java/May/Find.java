package May;

/**
 * Created by xieli on 2020/5/21.
 */
public class Find {
    public boolean Find(int target, int[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0)
            return false;
        int rows = array.length, cols = array[0].length;
        int r = 0, c = cols - 1;
        while (r <= rows - 1 && c >= 0) {
            if (target == array[r][c])
                return true;
            else if (target > array[r][c])
                r++;
            else
                c--;
        }
        return false;
    }
}
