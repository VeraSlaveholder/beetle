package Litcode;

import java.util.*;

public class RemoveDuplicatesFromSortedArray26 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 2, 2}));// 2, nums = [1,2,_]
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));//5, nums = [0,1,2,3,4,_,_,_,_,_]
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i == 0 || n > nums[i - 1])
                nums[i++] = n;
        System.out.println(Arrays.toString(nums));
        return i;
    }
}
