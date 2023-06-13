package Litcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber268 {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0, 1}));//2
        System.out.println(missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));//8
        System.out.println(missingNumber(new int[]{1}));//0
    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length;
        while (left < right) {
            int middle = (left + right) / 2;
            if (nums[middle] > middle) right = middle;
            else left = middle + 1;
        }
        return left;
    }
}
