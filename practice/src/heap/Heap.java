package heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    static List<Integer> heap;

    public Heap() {
        heap = new ArrayList<>();
        heap.add(0);
    }

    public static void push(int val) {
//        Insert at end
        heap.add(val);
        int i = heap.size() - 1;
//        Bottom to top approach while maintaining the ordered property of parent node
//        Percolate up
        while (i > 1 && heap.get(i) < heap.get(i / 2)) {
            int temp = heap.get(i);
            heap.set(i, heap.get(i / 2));
            heap.set(i / 2, temp);
            i /= 2;
        }
    }

    public static int pop() {
        if (heap.size() == 1) {
            return -1;
        }
        if (heap.size() == 2) {
            return heap.remove(heap.size() - 1);
        }
//        For heap array representation we ignore the first (0th index) element
        int res = heap.get(1);
//        Move last value to root
        heap.set(1, heap.remove(heap.size() - 1));
        int i = 1;
//        Percolate down
        while (2 * i < heap.size()) {
            if (2 * i + 1 < heap.size() && heap.get(2 * i + 1) < heap.get(2 * i) && heap.get(i) > heap.get(2 * i + 1)) {
//                Swap right child
                int temp = heap.get(i);
                heap.set(i, heap.get(2 * i + 1));
                heap.set(2 * i + 1, temp);
                i = 2 * i + 1;
            } else if (heap.get(i) > heap.get(2 * i)) {
                int temp = heap.get(i);
                heap.set(i, heap.get(i));
                heap.set(i, heap.get(2 * i));
                heap.set(2 * i, temp);
                i = 2 * i;
            } else {
                break;
            }
        }
        return res;
    }
}
