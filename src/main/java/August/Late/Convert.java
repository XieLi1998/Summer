package August.Late;

/**
 * Created by xieli on 2020/8/17.
 */
public class Convert {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    TreeNode head = null;
    TreeNode realHead = null;

    public TreeNode Convert(TreeNode pRootOfTree) {
        helper(pRootOfTree);
        return realHead;
    }

    private void helper(TreeNode root) {
        if (root == null) {
            return;
        }

        helper(root.left);
        if (head == null) {
            head = root;
            realHead = root;
        } else {
            head.right = root;
            root.left = head;
            head = root;
        }
        helper(root.right);
    }

}
