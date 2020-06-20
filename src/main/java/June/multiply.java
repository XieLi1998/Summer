package June;

/**
 * Created by xieli on 2020/6/20.
 */
public class multiply {

    public int[] multiply(int[] A) {
        int n = A.length;
        int[] B = new int[n];
        for (int i = 0, left = 1; i < n; left *= A[i], i++) {
            B[i] = left;
        }
        for (int i = n - 1, right = 1; i >= 0; right *= A[i], i--) {
            B[i] *= right;
        }

        return B;
    }

}
