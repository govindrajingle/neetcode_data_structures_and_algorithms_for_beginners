package linkedlist;

public class SinglyLinkedList {
    ListNode head;
    ListNode tail;

    public SinglyLinkedList() {
        head = new ListNode(-1);
        tail = head;
    }

    public void insertEnd(int val) {
        tail.next = new ListNode(val);
        tail = tail.next;
    }

    public void remove(int index) {
        int i = 0;
        ListNode curr = head;
        while (i < index && curr != null) {
            i += 1;
            curr = curr.next;
        }
        if (curr != null) {
            curr.next = curr.next.next;
        }
    }

    public void print() {
        ListNode curr = head.next;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println();
    }
}
