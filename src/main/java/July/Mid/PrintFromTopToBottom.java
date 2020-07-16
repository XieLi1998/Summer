import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by xieli on 2020/7/15.
 */
public class PrintFromTopToBottom {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null)
            return res;

        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            res.add(temp.val);
            if (temp.left != null)
                queue.offer(temp.left);
            if (temp.right != null)
                queue.offer(temp.right);
        }
        return res;
    }

}
