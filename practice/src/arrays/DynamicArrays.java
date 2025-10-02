package arrays;

import java.util.Arrays;

public class DynamicArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 45, 21};
        int[] ans = insertElement(arr, 99);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] insertElement(int[] arr, int element) {
        int[] arr2 = new int[arr.length * 2];
        if (arr.length == 4) {
            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            }
            arr2[arr.length] = element;
        }
        return arr2;
    }
}
