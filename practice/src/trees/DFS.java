package trees;

public class DFS {
    //    why name inorder ?
//    Because this representation shows element is sorted order
    public static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }

    //    why DFS ?
//    As name suggest we go to depth of current node
    public static void preorder(TreeNode root) {
        if (root == null) return;
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(TreeNode root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val);
    }
}
