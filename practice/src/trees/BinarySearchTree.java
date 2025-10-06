package trees;

//there are some properties to be followed by
//the value of left child would be always less than the parent node and value of right child is always be greater than the parent node.
//this is recursive condition for every node
//duplicates does not exist in normal case
//if sorted arrays are already present why create a tree?
//the answer is for the log n time for the insertion of new element
public class BinarySearchTree {
    public static boolean search(TreeNode root, int target) {
        if (root == null) {
            return false;
        }
        if (target == root.val) {
            return true;
        } else if (target > root.val) {
            search(root.right, target);
        } else {
            search(root.left, target);
        }
        return false;
    }
}
