package June;

/**
 * Created by xieli on 2020/6/18.
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
        else
            return root.val + "," + Serialize(root.left) + "," + Serialize(root.right);
    }

    int index = -1;

    TreeNode Deserialize(String str) {
        String[] strings = str.split(",");
        index++;
        int len = strings.length;
        if (index >= len)
            return null;
        TreeNode treeNode = null;
        if (!strings[index].equals("#")) {
            treeNode = new TreeNode(Integer.parseInt(strings[index]));
            treeNode.left = Deserialize(str);
            treeNode.right = Deserialize(str);
        }
        return treeNode;
    }

}
