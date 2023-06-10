package Litcode;

import java.util.Arrays;

public class MajorityElement169 {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1,1,1,1,2}));
    }
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
