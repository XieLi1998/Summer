package June;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by xieli on 2020/6/16.
 */
public class Print {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        depth(pRoot, 1, ans);
        return ans;
    }

    private void depth(TreeNode root, int depth, ArrayList<ArrayList<Integer>> lists) {
        if (root == null)
            return;
        if (depth > lists.size())
            lists.add(new ArrayList<Integer>());
        lists.get(depth - 1).add(root.val);

        depth(root.left, depth + 1, lists);
        depth(root.right, depth + 1, lists);
    }

    ArrayList<ArrayList<Integer>> Print_02(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (pRoot == null)
            return ans;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(pRoot);
        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int size = queue.size();
            while (size > 0) {
                TreeNode cur = queue.poll();
                list.add(cur.val);
                if (cur.left != null)
                    queue.offer(cur.left);
                if (cur.right != null)
                    queue.offer(cur.right);
                size--;
            }
            ans.add(list);
        }
        return ans;
    }

}
