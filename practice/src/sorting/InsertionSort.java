package sorting;

public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            while (j >= 0 && arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j -= 1;
            }
        }
        return arr;
    }
}

//the intuition is you have to sort the first element, then first two elements, then first three elements and so on
//but by default the first element will  always be sorted so start from second one