package backtracking;

import trees.TreeNode;

import java.util.ArrayList;

public class TreeMazePath {
    public boolean leafPath(TreeNode root, ArrayList<Integer> path) {
        if (root == null || root.val == 0) {
            return false;
        }
        path.add(root.val);
        if (root.left == null && root.right == null) {
            return true;
        }
        if (leafPath(root.left, path)) {
            return true;
        }
        if (leafPath(root.right, path)) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }
}
