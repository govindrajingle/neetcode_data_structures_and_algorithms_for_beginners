package backtracking;

import trees.TreeNode;

//Find the path from root to leaf node which has non zeroes values
public class TreeMaze {
    public boolean canReachLeaf(TreeNode root) {
//        Base condition
        if (root == null || root.val == 0) {
            return false;
        }
//        Reached leaf node
        if (root.left == null && root.right == null) {
            return true;
        }
//        Check left subtree
        if (canReachLeaf(root.left)) {
            return true;
        }
//        Check right subtree
        if (canReachLeaf(root.right)) {
            return true;
        }
        return false;
    }

}
