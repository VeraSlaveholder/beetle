package Litcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 3};
        int target = 6;
        System.out.println(Arrays.toString(Solution.twoSum(arr, target)));
    }

    class Solution {
        public static int[] twoSum(int[] nums, int target) {
            int[] arr = Arrays.copyOf(nums, nums.length);
            Arrays.sort(arr);
            int a = 0, b = 0;
            int start = 0, end = nums.length - 1;
            while (start < end) {
                int sum = arr[start] + arr[end];
                if (sum < target) {
                    start++;
                } else if (sum > target) {
                    end--;
                } else {
                    a = arr[start];
                    b = arr[end];
                    break;
                }

            }
            int[] res = new int[2];
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == a) {
                    res[0] = i;
                    break;
                }
            }
            if (a != b) {
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == b) {
                        res[1] = i;
                        break;
                    }
                }
            } else {
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == b && i != res[0]) {
                        res[1] = i;
                        break;
                    }
                }
            }
            return res;
        }
//            int[] a = new int[nums.length];
//            System.arraycopy( nums, 0, a, 0, nums.length );
//            Arrays.sort(a);
//            for (int i = 0; i < a.length; i++) {
//                for (int j = a.length-1; j >= 0; j--) {
//                    if ((a[i] + a[j]) == target) {
//                        for (int k = 0; k < nums.length; k++) {
//                            if (nums[k] == a[i]) {
//                                for (int h = nums.length-1; h >=0; h--) {
//                                    if (nums[h] == a[j]) {
//                                        return new int[]{k, h};
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }


    }
}
