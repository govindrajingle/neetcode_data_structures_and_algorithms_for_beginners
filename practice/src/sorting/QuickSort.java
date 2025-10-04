package sorting;

import java.util.Arrays;

public class QuickSort {
    public static int[] quickSort(int[] arr, int start, int end) {
        if (end - start + 1 <= 1) {
            return arr;
        }
        int pivot = arr[end];
        int left = start;
        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                int temp = arr[left];
                arr[left] = arr[i];
                arr[i] = temp;
                left += 1;
            }
        }
//        Move pivot to end
        arr[end] = arr[left];
        arr[left] = pivot;
        quickSort(arr, start, left - 1);
        quickSort(arr, left + 1, end);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 7, 2, 5, 3};
        System.out.println(Arrays.toString(quickSort(arr, 0, arr.length - 1)));
    }
}
