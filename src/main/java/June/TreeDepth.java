package June;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by xieli on 2020/6/19.
 */
public class TreeDepth {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    //递归
    public int TreeDepth(TreeNode root) {
        if (root == null)
            return 0;

        int leftDepth = TreeDepth(root.left);
        int rightDepth = TreeDepth(root.right);
        int result = 1 + Math.max(leftDepth, rightDepth);

        return result;
    }

    //非递归，队列
    public int TreeDepth_02(TreeNode root) {
        if (root == null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0, count = 0, nextCount = 1;

        while (queue.size() != 0) {
            TreeNode top = queue.poll();
            count++;
            if (top.left != null)
                queue.offer(top.left);
            if (top.right != null)
                queue.offer(top.right);
            if (count == nextCount) {
                nextCount = queue.size();
                count = 0;
                depth++;
            }
        }
        return depth;
    }

}
