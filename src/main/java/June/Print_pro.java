package June;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by xieli on 2020/6/16.
 */
public class Print_pro {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (pRoot == null)
            return ans;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);
        boolean reverse = false;

        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int size = queue.size();
            while (size > 0) {
                TreeNode cur = queue.poll();
                if (!reverse)
                    list.add(cur.val);
                else
                    list.add(0, cur.val);
                if (cur.left != null)
                    queue.offer(cur.left);
                if (cur.right != null)
                    queue.offer(cur.right);
                size--;
            }
            ans.add(list);
            reverse = !reverse;
        }
        return ans;
    }


}
