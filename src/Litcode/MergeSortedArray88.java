package Litcode;

import java.util.Arrays;

public class MergeSortedArray88 {
    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);//[1, 2, 2, 3, 5, 6]
        merge(new int[]{0}, 0, new int[]{1}, 1);//[1]
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        System.arraycopy(nums2, 0, nums1, m, n);
//        Arrays.sort(nums1);

        int p1 = m - 1, p2 = n - 1, i = n + m - 1;
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i--] = nums1[p1--];
            } else {
                nums1[i--] = nums2[p2--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
