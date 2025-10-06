package trees;

public class InsertNode {
    public static TreeNode insertNode(TreeNode root, int val) {
        if (root == null) {
//            return the new node with given value
            return new TreeNode(val);
        }
        if (val > root.val) {
            return root.right = insertNode(root.right, val);
        } else if (val < root.val) {
            return root.left = insertNode(root.right, val);
        }
        return root;
    }
}
