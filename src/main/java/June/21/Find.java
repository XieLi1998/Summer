/**
 * Created by xieli on 2020/6/21.
 */
public class Find {
    public boolean Find(int target, int[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0)
            return false;
        int rows = array.length - 1, cols = array[0].length - 1;
        int r = rows, c = 0;
        while (r >= 0 && c <= cols) {
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
