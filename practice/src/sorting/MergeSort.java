package sorting;

public class MergeSort {
    public static int[] mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
        return arr;
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int length1 = m - l + 1;
        int length2 = r - m;
//        create empty arrays to store the divided elements
        int[] left = new int[length1];
        int[] right = new int[length2];
//        fill the elements to array
        for (int i = 0; i < length1; i++) {
            left[i] = arr[l + i];
        }
        for (int j = 0; j < length2; j++) {
            right[j] = arr[m + 1 + j];
        }
//        two pointer approach to combine arrays by comparing
        int i = 0;  // left index
        int j = 0;  // right index
        int k = l;  // initial index of merged array

        while (i < length1 && j < length2) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i += 1;
            } else {
                arr[k] = right[j];
                j += 1;
            }
            k += 1;
        }
        while (i < length1) {
            arr[k] = left[i];
            k += 1;
            i += 1;
        }
        while (j < length2) {
            arr[k] = right[j];
            k += 1;
            j += 1;
        }
    }
}
