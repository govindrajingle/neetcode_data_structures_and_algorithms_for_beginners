package linkedlist;

public class Queue {
    ListNode left, right;

    public Queue() {
        this.left = null;
        this.right = null;
    }

    public void enqueue(int val) {
        ListNode newNode = new ListNode(val);
        if (this.right != null) {
            this.right.next = newNode;
            this.right = this.right.next;
        } else {
            this.left = newNode;
            this.right = newNode;
        }
    }

    public int dequeue() {
        if (this.left == null) {
            System.exit(0);
        }
        int val = this.left.val;
        this.left = this.left.next;
        return val;
    }

    public void print() {
        ListNode curr = this.left;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
