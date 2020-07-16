/**
 * Created by xieli on 2020/7/15.
 */
public class VerifySquenceOfBST {

    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0)
            return false;
        return judge(sequence, 0, sequence.length - 1);
    }

    private boolean judge(int[] sequence, int start, int root) {
        if (start >= root)
            return true;

        int i;
        for (i = start; i < root; i++) {
            if (sequence[i] > sequence[root])
                break;
        }

        for (int j = i; j < root; j++) {
            if (sequence[j] < sequence[root])
                return false;
        }

        return judge(sequence, start, i - 1) &&
                judge(sequence, i, root - 1);
    }

}
