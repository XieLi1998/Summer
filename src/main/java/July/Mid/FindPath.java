import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by xieli on 2020/7/16.
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
        Collections.sort(res, ((o1, o2) -> o2.size() - o1.size()));
        return res;
    }

    private void helper(TreeNode root, int target, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> list) {
        if (root == null)
            return;

        list.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            //不重新new的话从始至终listAll中所有引用都指向了同一个一个list
            res.add(new ArrayList<>(list));
        } else {
            FindPath(root.left, target);
            FindPath(root.right, target);
        }
        //递归到叶子节点如果还没有找到路径，就要回退到父节点继续寻找
        list.remove(list.size() - 1);
    }

}
