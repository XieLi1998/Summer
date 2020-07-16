import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by xieli on 2020/7/15.
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

    ArrayList<ArrayList<Integer>> Print(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null)
            return res;

        queue.offer(root);

        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int size = queue.size();
            while (size > 0) {
                TreeNode temp = queue.poll();
                list.add(temp.val);
                if (temp.left != null)
                    queue.offer(temp.left);
                if (temp.right != null)
                    queue.offer(temp.right);
                size--;
            }
            res.add(list);
        }
        return res;
    }

    public ArrayList<ArrayList<Integer>> PrintV2(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null)
            return res;

        queue.offer(root);
        boolean reverse = false;

        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int size = queue.size();
            while (size > 0) {
                TreeNode temp = queue.poll();

                if (!reverse) {
                    list.add(temp.val);
                } else {
                    list.add(0, temp.val);
                }

                if (temp.left != null)
                    queue.offer(temp.left);
                if (temp.right != null)
                    queue.offer(temp.right);
                size--;
            }
            res.add(list);
            reverse = !reverse;
        }
        return res;
    }

}
