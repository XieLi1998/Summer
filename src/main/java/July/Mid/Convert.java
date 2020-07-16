/**
 * Created by xieli on 2020/7/16.
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
        help(pRootOfTree);
        return realHead;
    }

    private void help(TreeNode root) {
        if (root == null)
            return;

        help(root.left);
        if (head == null) {
            head = root;
            realHead = root;
        } else {
            head.right = root;
            root.left = head;
            head = root;
        }
        help(root.right);
    }

}
