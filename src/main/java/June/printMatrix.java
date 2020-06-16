package June;

import java.util.ArrayList;

/**
 * Created by xieli on 2020/6/15.
 */
public class printMatrix {

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return null;

        ArrayList<Integer> pdd = new ArrayList<>();
        int up = 0, down = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (true) {
            for (int col = left; col <= right; col++)
                pdd.add(matrix[up][col]);

            up++;
            if (up > down)
                break;

            for (int row = up; row <= down; row++)
                pdd.add(matrix[row][right]);

            right--;
            if (left > right)
                break;

            for (int col = right; col >= left; col--)
                pdd.add(matrix[down][col]);

            down--;
            if (up > down)
                break;

            for (int row = down; row >= up; row--)
                pdd.add(matrix[row][left]);

            left++;
            if (left > right)
                break;
        }
        return pdd;
    }

}
