package June;

/**
 * Created by xieli on 2020/6/16.
 */
public class VerifySquenceOfBST {

    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0)
            return false;
        return VerifySquenceOfBST_Helper(sequence, 0, sequence.length - 1);
    }

    private boolean VerifySquenceOfBST_Helper(int[] sequence, int start, int root) {
        if (start >= root)
            return true;
        int i;

        //寻找左子树，右子树的分界点
        for (i = start; i < root; i++) {
            if (sequence[i] > sequence[root])
                break;
        }

        //判断右子树中是否有不满足条件的值
        for (int j = i; j < root; j++) {
            if (sequence[j] < sequence[root])
                return false;
        }

        return VerifySquenceOfBST_Helper(sequence, start, i - 1) &&
                VerifySquenceOfBST_Helper(sequence, i, root - 1);
    }

}
