package heap;

import java.util.ArrayList;
import java.util.List;

public class Heapify {
    List<Integer> heap;

    public Heapify() {
        heap = new ArrayList<Integer>();
        heap.add(0);
    }

    public void heapfiy(ArrayList<Integer> arr) {
//        Move 0th position to end
        arr.add(arr.get(0));
        heap = arr;
        int current = (heap.size() - 1) / 2;
        while (current > 0) {
//            Percolate down
            int i = current;
            while (2 * i < heap.size()) {
                if (2 + i + 1 < heap.size() && heap.get(2 + i + 1) < heap.get(2 * i) && heap.get(i) > heap.get(2 * i + 1)) {
//                    Swap right child
                    int temp = heap.get(i);
                    heap.set(i, heap.get(2 * i + 1));
                    heap.set(2 * i + 1, temp);
                    i = 2 * i + 1;
                } else if (heap.get(i) > heap.get(2 * i)) {
//                    Swap left child
                    int temp = heap.get(i);
                    heap.set(i, heap.get(2 * i));
                    heap.set(2 * i, temp);
                    i = 2 * i;
                } else {
                    break;
                }
            }
            current -= 1;
        }
        return;
    }
}
