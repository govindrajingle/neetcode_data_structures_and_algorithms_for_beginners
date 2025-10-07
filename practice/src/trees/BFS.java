package trees;

import java.util.ArrayDeque;
import java.util.Deque;

public class BFS {
    //    Level order traversal (O(n))
    public static void bfs(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        if (root != null) {
            queue.add(root);
        }
        int level = 0;
        while (!queue.isEmpty()) {
            System.out.println("Level " + level + ": ");
            int levelLength = queue.size();
            for (int i = 0; i < levelLength; i++) {
                TreeNode current = queue.removeFirst();
                System.out.println(current.val + " ");
                if (current.left != null)
                    queue.add(current.left);
                if (current.right != null)
                    queue.add(current.right);
            }
            level += 1;
            System.out.println();
        }
    }
}
