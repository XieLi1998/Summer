package August.Late;

/**
 * Created by xieli on 2020/8/18.
 */
public class multiply {

    public int[] multiply(int[] A) {
        if (A.length == 0 || A == null) {
            return new int[0];
        }
        int[] b = new int[A.length];
        b[0] = 1;
        int temp = 1;

        for (int i = 1; i < A.length; i++) {
            b[i] = b[i - 1] * A[i - 1];
        }

        for (int i = A.length - 2; i >= 0; i--) {
            temp *= A[i + 1];
            b[i] *= temp;
        }
        return b;
    }

}
