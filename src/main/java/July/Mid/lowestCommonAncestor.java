/**
 * Created by xieli on 2020/7/19.
 */
public class lowestCommonAncestor {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        while (root != null) {
//            if (root.val < p.val && root.val < q.val)
//                root = root.right;
//            else if (root.val > p.val && root.val > q.val)
//                root = root.left;
//            else
//                break;
//        }
//        return root;
//    }
//
//    public TreeNode lowestCommonAncestorV2(TreeNode root, TreeNode p, TreeNode q) {
//
//        if (root.val < p.val && root.val < q.val)
//            return lowestCommonAncestor(root.right, p, q);
//        if (root.val > p.val && root.val > q.val)
//            return lowestCommonAncestor(root.left, p, q);
//        return root;
//    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q)
            return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null)
            return right;
        if (right == null)
            return left;
        return root;
    }

}
