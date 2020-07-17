import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by xieli on 2020/7/17.
 */
public class maxDepth {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

//    public int maxDepth(TreeNode root) {
//        if (root == null)
//            return 0;
//        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
//    }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int res = 0;

        while (!queue.isEmpty()) {
            res++;

            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode temp = queue.poll();
                if (temp.left != null)
                    queue.offer(temp.left);
                if (temp.right != null)
                    queue.offer(temp.right);
            }
        }
        return res;
    }
}
