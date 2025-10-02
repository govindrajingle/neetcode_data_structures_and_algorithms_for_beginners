package arrays;

import java.util.*;

public class StaticArrays {

    public static void removeIth(int[] arr, int index) {
        int n = arr.length - 1;
        for (int i = index - 1; i < n; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n] = -1;
    }

    public static void insertIth(int[] arr, int i, int ele, int length) {
        int pos = i - 1;
        int temp = arr[pos];
        arr[pos] = ele;
        while (length > pos + 1) {
            arr[length] = arr[length - 1];
            length--;
        }
        arr[length] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 7, 9, 10};
        int i = 2, len = arr.length - 1;
//        insertIth(arr, i, 18, len);
        removeIth(arr, i);
        System.out.println(Arrays.toString(arr));
    }

}
