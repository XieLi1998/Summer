package June;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by xieli on 2020/6/16.
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

    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        helper(root, target, ans, list);

        Collections.sort(ans, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                if (o2.size() > o1.size())
                    return 1;
                else
                    return -1;
            }
        });

        return ans;
    }

    private void helper(TreeNode root, int target, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> list) {
        if (root == null)
            return;

        list.add(root.val);
        target = target - root.val;

        if (target == 0 && root.left == null && root.right == null) {
            ans.add(new ArrayList<>(list));
        } else {
            FindPath(root.left, target);
            FindPath(root.right, target);
        }

        list.remove(list.size() - 1);
    }

}
