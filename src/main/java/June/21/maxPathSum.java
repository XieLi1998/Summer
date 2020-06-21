/**
 * Created by xieli on 2020/6/21.
 */
public class maxPathSum {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }

    private int dfs(TreeNode root) {
        if (root == null)
            return 0;
        //负数直接取0
        int leftMax = Math.max(0, dfs(root.left));
        int rightMax = Math.max(0, dfs(root.right));
        max = Math.max(max, root.val + leftMax + rightMax);
        return root.val + Math.max(leftMax, rightMax);
    }

}
