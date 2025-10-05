package searching;

public class BinarySearch {
    public static int binarySearch(int[] arr, int n) {
        int low = 0, high = arr.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == n) {
                return mid;
            } else if (arr[mid] > n) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {23, 55, 67, 89, 99, 104};
        System.out.println(binarySearch(arr, 99));
    }
}
