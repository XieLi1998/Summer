package June;

/**
 * Created by xieli on 2020/6/15.
 */
public class Mirror {

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

    }

    public void Mirror(TreeNode root) {
        if (root == null)
            return;
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        Mirror(root.left);
        Mirror(root.right);
    }

}
