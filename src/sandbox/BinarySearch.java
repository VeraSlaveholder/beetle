package sandbox;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4,4,4,4, 5, 6, 7, 8, 9};
        System.out.println(search(a, 7));
    }

    public static int search(int[] arr, int item) {
        int index = 0;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + high;
            if (arr[mid] < item) {
                low = mid + 1;
            } else if (arr[mid] > item) {
                high = mid - 1;
            } else if (arr[mid] == item) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
