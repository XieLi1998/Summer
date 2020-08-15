package August.Late;

/**
 * Created by xieli on 2020/8/15.
 */
public class Find {

    public boolean Find(int target, int[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            return false;
        }

        int rows = array.length - 1, cols = array[0].length - 1;
        int r = rows, c = 0;
        while (r >= 0 && c <= cols) {
            if (array[r][c] == target)
                return true;
            else if (array[r][c] > target)
                r--;
            else
                c++;
        }
        return false;
    }

}
