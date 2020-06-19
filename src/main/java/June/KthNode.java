package June;

import java.util.ArrayList;

/**
 * Created by xieli on 2020/6/19.
 */
public class KthNode {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    ArrayList<TreeNode> list = new ArrayList<>();

    TreeNode KthNode(TreeNode pRoot, int k) {
        addNode(pRoot);

        if (k >= 1 && list.size() >= k)
            return list.get(k - 1);
        return null;
    }

    void addNode(TreeNode root) {
        if (root != null) {
            addNode(root.left);
            list.add(root);
            addNode(root.right);
        }

    }

}
