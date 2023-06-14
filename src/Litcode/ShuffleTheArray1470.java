package Litcode;

import java.util.Arrays;

public class ShuffleTheArray1470 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{1, 2, 3, 4, 5, 6}, 3)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int leftSub = 0;
        int rightSub = n;
        for (int i = 1; i < nums.length; i += 2) {
            result[i - 1] = nums[leftSub++];
            result[i] = nums[rightSub++];
        }
        return result;
    }
}
