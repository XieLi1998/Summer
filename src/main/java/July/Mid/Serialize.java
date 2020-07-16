import sun.security.krb5.internal.crypto.Des;

/**
 * Created by xieli on 2020/7/16.
 */
public class Serialize {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    String Serialize(TreeNode root) {
        if (root == null)
            return "#";
        return root.val + "," + Serialize(root.left) + "," + Serialize(root.right);
    }

    int index = -1;

    TreeNode Deserialize(String str) {
        String[] strings = str.split(",");
        index++;
        if (index >= strings.length)
            return null;

        TreeNode root = null;
        if (!strings[index].equals("#")) {
            root = new TreeNode(Integer.parseInt(strings[index]));
            root.left = Deserialize(str);
            root.right = Deserialize(str);
        }

        return root;
    }

}
