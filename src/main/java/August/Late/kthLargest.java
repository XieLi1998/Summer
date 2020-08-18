package August.Late;

/**
 * Created by xieli on 2020/8/17.
 */
public class kthLargest {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int k, cnt = 0;
    TreeNode res;

    TreeNode KthNode(TreeNode pRoot, int k) {
        this.k = k;
        dfs(pRoot);
        return res;
    }

    private void dfs(TreeNode root) {
        if (root == null)
            return;
        dfs(root.left);
        if (++cnt == k)
            res = new TreeNode(root.val);
        dfs(root.right);
    }

}
