/**
 * Created by xieli on 2020/7/17.
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

//    int res, k;
//    public int kthLargest(TreeNode root, int k) {
//        this.k = k;
//        dfs(root);
//        return res;
//    }
//
//    private void dfs(TreeNode root) {
//        if (root == null)
//            return;
//        dfs(root.right);
//        if (--k == 0)
//            res = root.val;
//        dfs(root.left);
//    }

    TreeNode ans;
    int k, cnt = 0;
    TreeNode KthNode(TreeNode pRoot, int k) {
        this.k = k;
        dfs(pRoot);
        return ans;
    }

    private void dfs(TreeNode root) {
        if (root == null)
            return;
        dfs(root.left);
        if (++cnt == k)
            ans = new TreeNode(root.val);
        dfs(root.right);
    }
}
