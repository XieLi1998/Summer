package August.Late;

import java.util.ArrayList;

/**
 * Created by xieli on 2020/8/17.
 */
public class FindPath {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        helper(root, target, res, list);
        return res;
    }

    private void helper(TreeNode root, int target, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> list) {
        if (root == null)
            return;

        list.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            res.add(new ArrayList<>(list));
        } else {
            FindPath(root.left, target);
            FindPath(root.right, target);
        }
        list.remove(list.size() - 1);
    }

}
