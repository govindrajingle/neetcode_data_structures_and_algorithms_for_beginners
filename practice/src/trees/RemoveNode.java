package trees;

public class RemoveNode {
    //    1. Find the min Node first
    public static TreeNode minValNode(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode current = root;
        while (current != null && current.left != null) {
            current = current.left;
        }
        return current;
    }

//    2. Remove the node. There will be two conditions one is to remove the node which has 0 or 1 child and
//    other is node having 2 children. So for second case replace the removed node with minValueNode

    public static TreeNode remove(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (val > root.val) {
            root.right = remove(root.right, val);
        } else if (val < root.val) {
            root.left = remove(root.left, val);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                TreeNode minNode = minValNode(root.right);
                root.val = minNode.val;
                root.right = remove(root.right, minNode.val);
            }
        }
        return root;
    }

}
