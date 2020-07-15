import java.util.HashMap;

/**
 * Created by xieli on 2020/7/15.
 */
public class HasSubtree {


    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public boolean HasSubtree(TreeNode A, TreeNode B) {
        if (A == null || B == null)
            return false;

        //此处注意，A的子结构需要遍历A的所有结点
        return isSubtreeWithRoot(A, B) || HasSubtree(A.left, B) ||
                HasSubtree(A.right, B);
    }

    private boolean isSubtreeWithRoot(TreeNode root1, TreeNode root2) {
        if (root2 == null)
            return true;
        if (root1 == null)
            return false;
        if (root1.val != root2.val)
            return false;
        return isSubtreeWithRoot(root1.left, root2.left)
                && isSubtreeWithRoot(root1.right, root2.right);
    }
}
